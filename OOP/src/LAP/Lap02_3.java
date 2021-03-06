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

public class Lap02_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        if (year > 0) {
            System.out.print("Enter month: 1-12: ");
            int month = input.nextInt();
            if (month > 0 && month < 13) {
                System.out.print("Enter the day of the month: 1-31: ");
                int dayOfMonth = input.nextInt();
                if (dayOfMonth > 0 && dayOfMonth <= 31) {
                    // Convert January and February to months 13 and 14 of the previous year
                    if (month == 1 || month == 2) {
                        month = (month == 1) ? 13 : 14;
                        year--;
                    }
                    // Calculate day of the week
                    int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100)
                            + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;
                    // Display reslut
                    System.out.print("Day of the week is ");
                    switch (dayOfWeek) {
                        case 0:
                            System.out.println("Saturday");
                            break;
                        case 1:
                            System.out.println("Sunday");
                            break;
                        case 2:
                            System.out.println("Monday");
                            break;
                        case 3:
                            System.out.println("Tuesday");
                            break;
                        case 4:
                            System.out.println("Wednesday");
                            break;
                        case 5:
                            System.out.println("Thursday");
                            break;
                        case 6:
                            System.out.println("Friday");
                    }
                } else {
                    System.out.println("ERROR");
                }
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
