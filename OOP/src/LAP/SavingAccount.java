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
public class SavingAccount extends NewAccount {
    private double annualInterestRate;
    private double monthlyInter;
    private double monthlyRate;
    
    public SavingAccount() {
    }

    public SavingAccount(String id, double balance, double annualInterestRate) {
        super(id, balance);
        this.annualInterestRate = annualInterestRate;
    }
    
     public void setAnnualInterestRate(double annualInterestRate) {
        if(annualInterestRate>0){
        this.annualInterestRate = annualInterestRate;
        }
        else{
            System.out.println("ERROR");
        }
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setMonthlyInter(double monthlyInter) {
        this.monthlyInter = super.getBalance()*this.monthlyRate;
    }

    public double getMonthlyInter() {
        return monthlyInter;
    }

    public void setMonthlyRate(double annualInterestRate) {
        this.monthlyRate = annualInterestRate/(12*100);
    }

    public double getMonthlyRate() {
        return monthlyRate;
    }
}
