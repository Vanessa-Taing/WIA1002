/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab;
/**
 *
 * @author user
 */
public class Q4Test{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q4Account1 acca = new Q4Account1("George",1122,1000,1.5);
        Q4Transaction transactions[] = new Q4Transaction[6];
        
        transactions[0] = new Q4Transaction('d',30,"Some money in!");
        /*transactions[1] = new Q4Transaction('d',40,"More money!");
        transactions[2] = new Q4Transaction('d',50,"I'm getting rich!");
        transactions[3] = new Q4Transaction('w',5,"Buying a pen.");
        transactions[4] = new Q4Transaction('w',4,"Buying another pen.");
        transactions[5] = new Q4Transaction('w',2,"One last pen!");
        for (int i=0;i<6;i++){
        System.out.println(transactions[i].transactionList());
        }*/
        
    }
    
}
