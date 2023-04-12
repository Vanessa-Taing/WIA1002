/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab;

/**
 *
 * @author user
 */
public class Q3Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q3Account acc1 = new Q3Account(1122,20000,4.5);
        System.out.println(acc1.withdraw(2500));
        System.out.println(acc1.deposit(3000));
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getMonthlyInterest());
        System.out.println(acc1.getMonthlyInterestRate());
        System.out.println(acc1.getDateCreated());
        
        
    }
    
}
