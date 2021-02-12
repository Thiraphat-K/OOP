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
public class Lab05_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the your ID : ");
        int my_id = input.nextInt();
        System.out.print("Enter the your Balance : ");
        double my_balance = input.nextDouble();
        account newac = new account(my_id, my_balance);
        newac.changeAnnualInterestRate(4.5);
        System.out.print("Enter the withdraw : ");
        int New_withdraw = input.nextInt();
        newac.withdraw(New_withdraw);
        System.out.println("The Balance : $" + newac.getBalance());
        System.out.print("Enter the deposit : ");
        int New_deposit = input.nextInt();
        newac.deposit(New_deposit);
        System.out.println("The Balance : $" + newac.getBalance());
        System.out.println("The Monthly Interest : $ " + newac.getMonthlyInterest());
        System.out.println("The Date when this account was created : " + newac.getDate());
    }
}
