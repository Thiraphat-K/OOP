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
public class Lap02_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter todays date: ");
        int date = input.nextInt();
        if(date >=0 && date < 7)
        {   
            System.out.print("Enter the number of days elapsed since today: ");
            int elapsed = input.nextInt();
            int future_date = (date + elapsed) % 7;
            String sevenDay = "";
            switch(date){
                case 0: sevenDay = "Sunday";
                        break;
                case 1: sevenDay = "Monday";
                        break; 
                case 2: sevenDay = "Tuesday";
                        break;
                case 3: sevenDay = "Wednesday";
                        break;
                case 4: sevenDay = "Thursday";
                        break;
                case 5: sevenDay = "Friday";
                        break;
                case 6: sevenDay = "Saturday";
                        break;
            }
            if (future_date == 0){
            System.out.printf("Todays is %s and the future day is Sunday\n", sevenDay);
            }
            else if(future_date == 1){
                System.out.printf("Todays is %s and the future day is Monday\n", sevenDay);
            }
            else if(future_date == 2){
                System.out.printf("Todays is %s and the future day is Tuesday\n", sevenDay);
            }
            else if(future_date == 3){
                System.out.printf("Todays is %s and the future day is Wednesday\n", sevenDay);
            }
            else if(future_date == 4){
                System.out.printf("Todays is %s and the future day is Thursday\n", sevenDay);
            }
            else if(future_date == 5){
                System.out.printf("Todays is %s and the future day is Friday\n", sevenDay);
            }
            else if(future_date == 6){
                System.out.printf("Todays is %s and the future day is Saturday\n", sevenDay);
            }
        }
        else
            System.out.println("Try Again");
    }
}