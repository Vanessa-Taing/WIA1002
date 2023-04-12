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
public class Q4Transaction{
    
        char type;
        Date transactionDate = new java.util.Date();
        double transactionAmount;
        double transactionBalance;
        String description;
        double balance = 100;
        
        
        public Q4Transaction(char type, double transactionAmount, String description) {
            this.type = type;
            this.transactionAmount = transactionAmount;
            this.description = description;
        }

        /*@Override
        public String toString() {
        return "Transaction{" + "type=" + type + ", transactionDate=" + transactionDate + ", transactionAmount=" + transactionAmount + ", transactionBalance=" + transactionBalance + ", description=" + description + '}';
        }*/
        
        public String transactionList(){
            switch (this.type){
                case 'w' -> {
                    if (this.balance>=this.transactionAmount){
                        this.balance = this.balance - this.transactionAmount;
                        return "Successful withdrawal of "+this.transactionAmount+". Balance: "+ this.balance+"\n"+"Description: "+this.description+"\n";
                        
                    }
                    else {
                        return "Failed withdrawal. Current balance: "+this.balance+"\n";
                        
                    }
                }
                case 'd' -> {
                    this.balance = this.balance + this.transactionAmount;
                    return "Successful deposit of "+this.transactionAmount+". Current balance: "+this.balance+"\n"+"Description: "+this.description+"\n";
                }
            }
            return "\nEnd of transaction history.\n";
        }
    
}
