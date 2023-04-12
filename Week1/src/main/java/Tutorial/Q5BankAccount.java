/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial;

/**
 *
 * @author user
 */
public class Q5BankAccount implements Q5Account{
    private int balance;

    public Q5BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public int deposit(int deposit) {
        System.out.println("Deposit: ");
        this.balance = this.balance+deposit;
        return this.balance;
    }

    @Override
    public boolean withdraw(int withdraw) {
        System.out.println("Withdrawal: ");
        if (withdraw<=this.balance){
            this.balance = this.balance - withdraw;
            return true;
        }
        else
            return false;
        
    }

    public int getBalance() {
        return balance;
    }
    
    
}
