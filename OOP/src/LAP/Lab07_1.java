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
import java.util.Scanner;
import java.util.Date;
public class Lab07_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select type of Account\n(1)SavingAccount (2)CheckingAccount");
        System.out.print("Your Answer : ");
        String m = input.nextLine();
        int im = Integer.parseInt(m);
        switch(im){
            case 1:
                System.out.println("SavingAccount");
                System.out.print("Enter Your ID : ");
                String id = input.nextLine();
                System.out.print("Enter Your Balance : ");
                double balance = input.nextDouble();
                double Interest = 4.5;
                SavingAccount sav = new SavingAccount(id, balance, Interest);
                System.out.print("Enter Withdraw : ");
                double withdraw = input.nextDouble();
                sav.setWithdraw(withdraw);
                System.out.println("Your Balance : " + sav.getBalance());
                System.out.print("Enter Deposit : ");
                double deposit = input.nextDouble();
                sav.setDeposit(deposit);
                System.out.println("Your Balance : " + sav.getBalance());
                sav.setMonthlyRate(sav.getAnnualInterestRate());
                sav.setMonthlyInter(sav.getMonthlyRate());
                System.out.println("The Monthly Interest : " + sav.getMonthlyInter());
                System.out.print("This account was created at ");
                Date DC = new Date();
                System.out.println(DC);
                break;
            case 2:
                System.out.println("CheckingAccount");
                System.out.print("Enter Your ID : ");
                id = input.nextLine();
                System.out.print("Enter Your Balance : ");
                balance = input.nextDouble();
                System.out.print("Overdraft Limit : ");
                double Overdraft = input.nextDouble();
                CheckingAccount CA = new CheckingAccount(id, balance, Overdraft);
                System.out.print("Enter Withdraw : ");
                withdraw = input.nextDouble();
                CA.setOverdandBal(Overdraft, withdraw);
                System.out.println("Your Balance : " + CA.getBalance());
                System.out.print("Enter Deposit : ");
                deposit = input.nextDouble();
                CA.setDeposit(deposit);
                System.out.println("Your Balance : " + CA.getBalance());
                System.out.print("This account was created at ");
                DC = new Date();
                System.out.println(DC);
                break;
        }
    }
}
