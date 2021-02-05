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
import java.util.GregorianCalendar;
public class Test_GregorianCalendar {
        static void getCurrentDate(GregorianCalendar CD){
            System.out.println("Year is "+CD.get(GregorianCalendar.YEAR));
            System.out.println("Month is "+CD.get(GregorianCalendar.MONTH));
            System.out.println("Date is "+CD.get(GregorianCalendar.DATE));
            System.out.println("Day of week is "+CD.get(GregorianCalendar.DAY_OF_WEEK));
        }
     public static void main(String[] args) {
        GregorianCalendar CD = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
         getCurrentDate(CD);
         CD.setTimeInMillis(CD.getTimeInMillis()+86400000L);
         System.out.println("------------\n"+"After specified the elapsed time of one day after current day");
         getCurrentDate(CD);
         System.out.println(CD.getTime());
    }
}
