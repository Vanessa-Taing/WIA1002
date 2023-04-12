package Tutorial;

/**
 * @author VJT
 */
public class CandyMachine {
    //variables are instances of Dispenser class
    private Dispenser candyDispenser;
    private Dispenser chipsDispenser;
    private Dispenser gumDispenser;
    private Dispenser cookieDispenser;
    private CashRegister cashRegister;
    
    //constructing new Dispenser types and cashRegister
    public CandyMachine() {
        candyDispenser = new Dispenser("Candy", 0.50);
        chipsDispenser = new Dispenser("Chips", 0.75);
        gumDispenser = new Dispenser("Gum", 0.25);
        cookieDispenser = new Dispenser("Cookie", 1.00);
        cashRegister = new CashRegister();
    }
    //display available items and price
    public void displayItems() {
        System.out.println("Items available for purchase:");
        System.out.println("1. " + candyDispenser.getItemName() + " - $" + candyDispenser.getItemPrice());
        System.out.println("2. " + chipsDispenser.getItemName() + " - $" + chipsDispenser.getItemPrice());
        System.out.println("3. " + gumDispenser.getItemName() + " - $" + gumDispenser.getItemPrice());
        System.out.println("4. " + cookieDispenser.getItemName() + " - $" + cookieDispenser.getItemPrice());
    }
    //select item by number, make payment. Checks if payment is sufficient, then give changes.
    public void purchaseItem(int itemNum, double payment) {
        Dispenser selectedDispenser = null;
        switch(itemNum) {
            case 1:
                selectedDispenser = candyDispenser;
                break;
            case 2:
                selectedDispenser = chipsDispenser;
                break;
            case 3:
                selectedDispenser = gumDispenser;
                break;
            case 4:
                selectedDispenser = cookieDispenser;
                break;
            default:
                System.out.println("Invalid item selection.");
                return;
        }
        double price = selectedDispenser.getItemPrice();
        if(payment >= price) {
            cashRegister.addMoney(price);
            double change = payment - price;
            selectedDispenser.releaseItem();
            System.out.println("Thank you for your purchase! Your change is $" + change);
        } else {
            System.out.println("Insufficient payment.");
        }
    }
}

