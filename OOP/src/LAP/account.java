/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAP;

import java.util.Date;

/**
 *
 * @author Thiraphat Ketsingnoi
 */
public class account {
    private int id;
    private double balance;
    static private double  annualInterestRate;
    private Date dateCreated;
    
    account(int id,double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }
    
    int getID(){
        return this.id;
    }
    
    int changeID(int newID){
        this.id = newID;
        return this.id;
    }
    
    double getBalance(){
        return this.balance;
    }
    
    double changeBalance(double newBalance)
    {
        this.balance = newBalance;
        return this.balance;
    }
    
    double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    
    double changeAnnualInterestRate(double newAnnualInterestRate){
        this.annualInterestRate = newAnnualInterestRate;
        return this.annualInterestRate;
    }
    
    Date getDate(){
        return this.dateCreated;
    }
    
    double getMonthlyInterestRate(){
        return annualInterestRate/(12*100);
    }
    
    double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    
    double withdraw(int money){
        if(money > 0 && money <= this.balance)
        {
            this.balance -= money;
        }
        else{
            System.out.println("ERROR");
        }
        return this.balance;
    }
    
    double deposit (int money){
        if(money>0){
        this.balance += money;
        }
        else{
            System.out.println("ERROR");
        }
        return this.balance;
    }
}
