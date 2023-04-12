package SList;

import java.util.NoSuchElementException;

/**
 * @author VJT
 */
public class SList<E> {

    private SNode<E> head;
    private SNode<E> tail;
    private int size;

    public SList() {
        size = 0;
        this.head = null;
        this.tail = null;
    }

    public void appendEnd(E e) {
        SNode<E> newNode = new SNode<>(e);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
        System.out.println("Added " + e);
    }

    public E removeInitial() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        SNode<E> tmp = head;
        head = head.next;
        head.previous = null;
        size--;
        System.out.println("Deleted " + tmp.element);
        return tmp.element;
    }

    public boolean contains(E e) {
        boolean contain = false;
        SNode<E> tmp = head;
        while (tmp != null) {
            if (tmp.element == e) {
                contain = true;
                break;
            }
            tmp = tmp.next;
        }
        if (contain == true) {
            System.out.println("\n"+e + " found in the list!");
        } else {
            System.out.println("\nNo such element found");
        }
        return contain;
    }

    public void clear() {
        SNode<E> tmp = head;
        while (head != null) {
            tmp = head.next;
            head.previous = null;
            head = tmp;
        }
        tmp = null;
        tail.previous = tail.next = null;
        size =0;
    }
    
    public void display(){
        SNode<E> tmp = head;
        System.out.println("Printing all elements in list...");
        while(tmp!=null){
            System.out.print(tmp.element+"  ");
            tmp = tmp.next;
        }
        System.out.println(" ");
    }

    class SNode<E> {

        E element;
        SNode<E> next;
        SNode<E> previous;

        public SNode(E element, SNode<E> next, SNode<E> previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }

        public SNode(E element) {
            this(element, null, null);
        }
    }

}
