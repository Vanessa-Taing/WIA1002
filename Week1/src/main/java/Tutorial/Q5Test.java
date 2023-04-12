/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tutorial;

/**
 *
 * @author user
 */
public class Q5Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int initialBalance = 2000;
        int depositAmount =2000;
        int withdrawAmount = 1000;
        Q5BankAccount account1 = new Q5BankAccount(initialBalance);
        account1.deposit(depositAmount);
        System.out.println(account1.getBalance());
        if(account1.withdraw(withdrawAmount)==true){
            System.out.println("Successful withdrawal...");
            System.out.println(account1.getBalance());
        }
        else
            System.out.println("Not enough balance...");
    }
    
}
