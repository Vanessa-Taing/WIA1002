package SList;

/**
 *
 * @author VJT
 */
public class TestSList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SList<String> test = new SList<>();
        test.appendEnd("Linked list");
        test.appendEnd("is");
        test.appendEnd("easy");
        test.display();
        test.removeInitial();
        test.display();
        test.contains("difficult");
        
    }

}
