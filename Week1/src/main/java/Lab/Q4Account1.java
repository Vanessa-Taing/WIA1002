/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import java.util.Date;

/**
 *
 * @author user
 */
public class Q4Account1 extends Q3Account{
    private String name;
    private int id;
    protected double balance=0;
    private double annualInterestRate=0;
    private double monthlyInterestRate=0;

    public Q4Account1(String name, int id, double balance, double arate) {
        this.name = name;
        this.balance = balance;
        this.annualInterestRate = arate;
        this.monthlyInterestRate = arate/12;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    /*public String withdraw(double withdraw){
    if (withdraw<=this.balance){
    this.balance = this.balance - withdraw;
    return "Successfull withdrawal of: " + String.valueOf(withdraw) +"\nBALANCE: " + this.balance;
    }
    else
    return "Insufficient balance, failed withdrawal...";
    }*/
    
    /*class Transaction extends Q4Account1 {
    char type;
    Date transactionDate = new java.util.Date();
    double transactionAmount;
    double transactionBalance;
    String description;
    
    public Transaction(char type, double transactionAmount, String description) {
    this.type = type;
    this.transactionAmount = transactionAmount;
    this.description = description;
    }
    
    @Override
    public String toString() {
    return "Transaction{" + "type=" + type + ", transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount + ", transactionBalance=" + transactionBalance + ", description=" + description + '}';
    }
    
    public String transaction(char type, double amount){
    switch (type){
    case 'w':
    if (this.balance>=amount){
    this.balance = this.balance - amount;
    return "Successful withdrawal of "+amount+". Balance: "+ this.balance+"\n";
    
    }
    else {
    return "Failed withdrawal. Current balance: "+this.balance+"\n";
    
    }
    case 'd':
    this.balance = this.balance + amount;
    return "Successful deposit of "+amount+". Current balance: "+this.balance+"\n";
    }
    return "\nEnd of transaction history.\n";
    }
    }*/
}
