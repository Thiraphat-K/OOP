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
public class Lab07_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name : ");
        String name = input.nextLine();
        System.out.print("Account ID : ");
        String id = input.nextLine();
        System.out.print("Annual interest rate : ");
        double annualInter = input.nextDouble();
        System.out.print("Balance : ");
        double balance = input.nextDouble();
        NewAccountT tst = new NewAccountT(name, id, balance);
        tst.setAnnualInterestRate(annualInter);
        boolean l = true;
        while(l){
        System.out.println("Menu : (1)Deposit  (2)Withdrawal  (3)Print");
        System.out.print("Put Your Choice : ");
        int ii = input.nextInt();
        switch(ii){
            case 1: System.out.print("Deposit : ");
                    double dps = input.nextDouble();
                    tst.setDeposit(dps);
                    break;
            case 2: System.out.print("WithDraw : ");
                    double wd = input.nextDouble();
                    tst.setWithdraw(wd);
                    break;
            case 3: System.out.println("Name : " + tst.getName());
                    System.out.println("Account ID : " + tst.getId());
                    System.out.println("Annual interest rate : " + tst.getAnnualInterestRate());
                    System.out.println("Balance : " + tst.getBalance());
                    int list = tst.getTransactionSize();
                    System.out.println("Date" + "\t\t\t\t\t" + "Type" + "\t\t" + "Amount" + "\t\t" + "Balance");
                    for(int i = 0; i< list ;i++){
                        System.out.println(((tst.getTransactions()).get(i).getDate())+ "\t\t"+((tst.getTransactions()).get(i).getType()) + "\t\t" + ((tst.getTransactions()).get(i).getAmount()) + "\t\t" + ((tst.getTransactions()).get(i).getBalance()));
                    }
                    l = false;
                    break;
                }
            }
    }
}
