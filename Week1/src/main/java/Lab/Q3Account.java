/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import java.sql.Date;


/**
 *
 * @author user
 */
public class Q3Account {
    private int id =0;
    private double balance=0;
    private double annualInterestRate=0;
    private double monthlyInterestRate=0;
    private double monthlyInterest=0;
    private Date dateCreated;
    private long millis = System.currentTimeMillis();
    
    public Q3Account() {
        this.dateCreated = new java.sql.Date(millis);
    }

    public Q3Account(int id, double balance, double arate) {
        this.id = id;
        this.annualInterestRate = arate;
        this.balance = balance;
        this.dateCreated = new java.sql.Date(millis);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        this.monthlyInterestRate = this.annualInterestRate/12;
        return this.monthlyInterestRate;
    }
    
    public double getMonthlyInterest(){
        this.monthlyInterest = (this.monthlyInterestRate/100)*this.balance;
        return this.monthlyInterest;
    }
    
    public String withdraw(double withdraw){
        if (withdraw<=this.balance){
            this.balance = this.balance - withdraw;
            return "Successfull withdrawal of: " + String.valueOf(withdraw) +"\nBALANCE: " + this.balance;
        }
        else
            return "Insufficient balance, failed withdrawal...";
    }
    
    public String deposit(double deposit){
        this.balance = this.balance + deposit;
        return "Successful deposit. \nBALANCE: " + this.balance;
    }

    
    
}
