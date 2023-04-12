package Tutorial;

/**
 * @author VJT
 */
public class CashRegister {
    private double totalSales;
    
    public CashRegister() {
        this.totalSales = 0;
    }
    //cash in
    public void addMoney(double amount) {
        totalSales += amount;
    }
    //returns cash amount in cash register
    private double getTotalSales() {
        return totalSales;
    }
}
