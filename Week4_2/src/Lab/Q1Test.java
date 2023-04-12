package Lab;

/**
 *
 * @author VJT
 */
public class Q1Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.setSize(5);
        list.addFirst('a');
        list.addLast('b');list.addLast('c');list.addLast('d');list.addLast('e');
        list.print();
        list.reverse();
        System.out.println("Size: " +list.getSize());
        System.out.println("First: " +list.getFirst());
        System.out.println("Last: " +list.getLast());
        list.remove(2);
        System.out.println("Index of b: "+list.indexOf('b'));
        System.out.println("Index of c: "+list.indexOf('c'));
        System.out.println("Contains 'c': " + list.contains('c'));
        list.clear();
        list.addFirst('j');
        list.addLast('a');
        list.addLast('v');
        list.addLast('a');
        list.print();
    }

}
