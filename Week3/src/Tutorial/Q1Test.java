package Tutorial;
import java.util.*;
/**
 *
 * @author VJT
 */
public class Q1Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CandyMachine candym = new CandyMachine();
        candym.displayItems();
        System.out.println("\n__________________\nSelect item and pay");
        candym.purchaseItem(sc.nextInt(), sc.nextDouble());
        
    }

}
