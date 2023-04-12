package Tutorial;

/**
 * @author VJT
 */
public class Dispenser {
    //private attributes of the dispenser object
    private String itemName;
    private double itemPrice;
    private int itemCount;
    //constructor with fixed stock amount
    public Dispenser(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = 10;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public double getItemPrice() {
        return itemPrice;
    }
    
    public int getItemCount() {
        return itemCount;
    }
    //reduces amount after dispensing
    public void releaseItem() {
        if(itemCount > 0) {
            itemCount--;
        } else {
            System.out.println("Out of stock.");
        }
    }
}
