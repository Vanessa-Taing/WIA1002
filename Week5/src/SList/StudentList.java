package SList;

/**
 * @author VJT
 */
public class StudentList<E> {

    public Node<E> head;
    private Node<E> tail;
    private int size;

    public StudentList() {
        size = 0;
        this.head = null;
        this.tail = null;
    }

    public void add(E e) {
        Node<E> newNode = new Node<E>(e);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }

    public int getIndex(E e) {
        int index = 0;
        if (contains(e)) {
            Node<E> tmp = head;
            while (tmp != null) {
                if (tmp.element == e) {
                    break;
                }
                tmp = tmp.next;
                index++;
            }
            return index;
        } else {
            return -1;
        }
    }

    public void removeElement(E e) {
        if (this.contains(e)) {
            Node<E> tmp = head;
            //Node<E> removed;
            int indexToRemove = getIndex(e);
            for (int i = 1; i < indexToRemove; i++) {
                tmp = tmp.next;
            }
            //removed = tmp.next;
            tmp.next = tmp.next.next;
            //removed = null;
            size--;
        } else {
            System.out.println("No such element in list.");
        }
    }

    public void printList() {
        Node<E> tmp = head;
        System.out.println(" ");
        while (tmp != null) {
            if (tmp.next == null) System.out.print(tmp.element+". ");
            else System.out.print(tmp.element + ", ");
            tmp = tmp.next;
        }
        System.out.print("(End of list)\n");
    }

    public int getSize() {
        return size;
    }

    public boolean contains(E e) {
        boolean flag = false;
        Node<E> tmp = this.head;
        while (tmp != null) {
            if (tmp.element == e) {
                flag = true;
                break;
            }
            tmp = tmp.next;
        }
        return flag;
    }

    public void replace(E e, E newE) {
        if (this.contains(e)) {
            int indexToReplace = getIndex(e);
            Node<E> tmp = head;
            Node<E> nodeReplaced;
            Node<E> newNode = new Node<>(newE);
            for (int i = 1; i < indexToReplace; i++) {
                tmp = tmp.next;
            }
            nodeReplaced = tmp.next;
            tmp.next = newNode;
            newNode.next = nodeReplaced.next;
        } else {
            System.out.println("No such element in list.");
        }
    }

    class Node<E> {

        E element;
        Node<E> next;

        public Node() {
        }

        public Node(E element) {
            this.element = element;
            this.next = null;
        }
    }
}
