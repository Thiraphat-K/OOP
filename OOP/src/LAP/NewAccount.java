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
public class NewAccount {
    private String id;
    private double balance;
    private double withdraw;
    private double deposit;
    private Date dateCreated;
    private boolean passWD = false;
    
    NewAccount(){
        
    }

    public NewAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }


    public Date getDateCreated() {
        return dateCreated;
    }


    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        if(withdraw > 0 && withdraw <= this.balance){
            this.withdraw = withdraw;
            this.balance = this.balance - this.withdraw;
        }
        else if(this.passWD == true){
            this.withdraw = withdraw;
            this.balance = this.balance - this.withdraw;
        }
        else{
            System.out.println("ERROR");
        }
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        if(deposit > 0){
            this.deposit = deposit;
            this.balance = this.balance + this.deposit;
        }
        else{
            System.out.println("ERROR");
        }
    }

    public void setPassWD(boolean passWD) {
        this.passWD = passWD;
    }

    public boolean isPassWD() {
        return passWD;
    }
    
    
}
