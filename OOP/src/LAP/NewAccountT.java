/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAP;

/**
 *
 * @author Thiraphat Ketsingnoi
 */
import java.util.Date;
import java.util.ArrayList;
public class NewAccountT {
    private String id;
    private double balance;
    private double withdraw;
    private double deposit;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions;
    private double annualInterestRate;

    public NewAccountT() {
        transactions = new ArrayList<Transaction>();
    }
    
    public NewAccountT(String name, String id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        transactions = new ArrayList<Transaction>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate(){
        return this.annualInterestRate/(12*100);
    }
    
    public double getMonthlyInterest(){
        return this.balance*getMonthlyInterestRate();
    }
    
    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double amount) {
        if(amount > 0 && amount <= this.balance){
            this.withdraw = amount;
            this.balance = this.balance - this.withdraw;
            transactions.add(new Transaction('W', amount, this.balance, "Withdrawal"));
        }
        else{
            System.out.println("ERROR");
        }
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double amount) {
        if(amount > 0){
            this.deposit = amount;
            this.balance = this.balance + this.deposit;
            transactions.add(new Transaction('D', amount, this.balance, "Deposit"));
        }
        else{
            System.out.println("ERROR");
        }
    }
    
    public int getTransactionSize(){
        return getTransactions().size();
    }
}
