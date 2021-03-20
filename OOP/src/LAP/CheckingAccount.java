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
public class CheckingAccount extends NewAccount {
    private double OverdraftLimit;

    public CheckingAccount() {
        
    }

    public CheckingAccount(String id, double balance, double OverdraftLimit) {
        super(id, balance);
        this.OverdraftLimit = OverdraftLimit;
    }

    public void setOverdraftLimit(double OverdraftLimit) {
        this.OverdraftLimit = OverdraftLimit;
    }

    public double getOverdraftLimit() {
        return OverdraftLimit;
    }

    public void setOverdandBal(double OverdraftLimit, double withdraw){
        if((super.getBalance()+ OverdraftLimit)-withdraw>=0){
            super.setPassWD(true);
            super.setWithdraw(withdraw);
            }
        else{
                System.out.println("Over Withdraw => Put Again");
            }
    }
    
    @Override
    public String toString() {
        return "Overdraft Limit :" + OverdraftLimit;
    }
    
    
}
