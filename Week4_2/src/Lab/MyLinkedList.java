package Lab;

/**
 * @author VJT
 */
public class MyLinkedList<E> {

    class Node<E> {

        E element;
        Node<E> next;

        public Node() {
        }

        public Node(E element) {
            this.element = element;
        }

    }
    int size = 0;
    Node<E> head = null;
    Node<E> tail = null;

    public MyLinkedList() {
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        if (size == 0) {
            head = tail = newNode;
            newNode.next = null;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }

    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (tail == null) {
            head = tail = newNode; size++;
        } else {
            
            tail.next = newNode;
            tail = tail.next;
            size++;
        }
    }

    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index < 0 || index >= size) {
            System.out.println("Index out of bound.");
        } else if (index == 0) {
            addFirst(e);
        } else if (index == size - 1) {
            addLast(e);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = newNode;
            newNode.next = temp;
            size++;
        }
        //if (head.next==null) head.next = newNode;
    }

    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head.next == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    public E removeLast() {
        switch (size) {
            case 0:
                return null;
            case 1:
                removeFirst();
                break;
            default:
                Node<E> current = head;
                while ((current.next).next != null) {
                    current = current.next;
                }
                Node<E> temp = current.next;
                tail = current;
                tail.next = null;
                size--;
                return temp.element;
        }
        return null;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bound.");
            return null;
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = temp.next;
            size--;
            return temp.element;
        }
        return null;
    }

    public boolean contains(E e) {
        if (size == 0) {
            return false;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size; i++) {
                if (current == e) {
                    break;
                }
                current = current.next;
            }
        }
        return true;
    }

    public E getFirst() {
        return head.element;
    }

    public E getLast() {
        return tail.element;
    }

    public E get(int index) {
        if (index == 0) {
            getFirst();
        } else if (index == size - 1) {
            getLast();
        } else {
            Node<E> pointer = head;
            for (int i = 1; i < index; i++) {
                pointer = pointer.next;
            }
            return pointer.next.element;
        }
        return null;
    }

    public int indexOf(E e) {
        Node<E> pointer = head;
        int index = 0;
        while (pointer != null) {
            if (pointer.element == e) {
                break;
            }
            index++;
            pointer = pointer.next;
        }
        if (index == size - 1) {
            return -1;
        } else {
            return index;
        }
    }

    public int lastIndexOf(E e) {
        reverse();
        return indexOf(e);
    }

    public void print() {
        Node<E> current = head;

        for (int i = 0; i < size; i++) {
            System.out.print(current.element +"  ");
            current = current.next;
        }
        System.out.println(" ");
    }

    public E set(int index, E e) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bound.");
            return null;
        } else if (index == 0) {
            removeFirst();
            addFirst(e);
        } else if (index == size - 1) {
            removeLast();
            addLast(e);
        } else {
            remove(index);
            add(index, e);
        }
        return null;
    }

    public void clear() {
        while (head != null) {
            removeFirst();
        }
    }

    public void reverse() {
        Node<E> pointer = head;
        E[] array = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = pointer.element;
            pointer = pointer.next;
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + "  ");
        }
    }

    public E getMiddleValue() {
        return get((size - 1) / 2);
    }
    public int getSize(){
        return size;
    }
}
