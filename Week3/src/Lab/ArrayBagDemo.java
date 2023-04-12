package Lab;

/**
 *
 * @author VJT
 */
public class ArrayBagDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create two empty ArrayBag objects
        BagInterface<String> bag1 = new ArrayBag<>();
        BagInterface<String> bag2 = new ArrayBag<>();
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};

        // Test the add method
        testAdd(bag1, contentsOfBag1);
        testAdd(bag2, contentsOfBag2);
        // Display the contents of bag1 and bag2
        System.out.println("Contents of bag1:");
        displayBag(bag1);
        System.out.println("\nContents of bag2:");
        displayBag(bag2);

        // Test the union method
        BagInterface<String> bag3 = bag1.union(bag2);
        System.out.println("\nContents of bag3 (union of bag1 and bag2):");
        displayBag(bag3);
        // Test the intersection method
        BagInterface<String> bag4 = bag1.intersection(bag2);
        System.out.println("\nContents of bag4 (intersection of bag1 and bag2):");
        displayBag(bag4);
        // Test the difference method
        BagInterface<String> bag5 = bag1.difference(bag2);
        System.out.println("\nContents of bag5 (difference of bag1 and bag2):");
        displayBag(bag5);
    }

    private static void testAdd(BagInterface<String> aBag, String[] content) {
        for (String item : content) {
            boolean success = aBag.add(item);
            if (success) {
                System.out.println(item + " was added to the bag.");
            } else {
                System.out.println("Unable to add " + item + " to the bag.");
            }
        }
    }

    private static void displayBag(BagInterface<String> aBag) {
        System.out.println("The bag contains the following items:");
        Object[] items = aBag.toArray();
        for (Object item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("The bag currently has " + aBag.getCurrentSize() + " item(s) in it.");
    }
}
