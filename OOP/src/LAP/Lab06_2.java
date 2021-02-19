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
public class Lab06_2 {
    public static void main(String[] args) {
        Course new_course = new Course();
        int j = 0;
        System.out.print("Press 1 to add : Press 2 to drop : Press 3 to clear : Press 4 to end\n");
        while(j != 4){
            System.out.print("Enter menu : ");
            j = (int)getint(0,"its");
            if(j == 1){ new_course.add(getWord("Student number "+(new_course.getNumofStd()+1), new_course, false)); System.out.println("\n--Current Student--"); }
            if(j == 2){ new_course.drop(new_course.checkSameName(getWord("Student name to drop", new_course, true))); System.out.println("\n--Current Student--");}
            if(j == 3){ new_course.clear();}
            
            for(int i = 0;i<new_course.getNumofStd();i++){
                System.out.println(" "+(i+1)+") "+new_course.getStudent(i));
            }
            System.out.println("");
        }
    }
    static String getWord(String text, Course name, boolean drop){
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert "+text+" : ");
        String temp = input.nextLine();
        while(name.check_sameName(temp) && !drop){
            System.out.print("This student already exist Enter name agian : ");
            temp = input.nextLine();
        }
        while(name.check_sameName(temp) && !drop || temp.matches("\\d+")){
            System.out.print("Wrong type, Enter name again : ");
            temp = input.nextLine();
        }
        return temp;
    }
    static double getint(int min,String text){
        Scanner input = new Scanner(System.in);
        String  i = "A";
        while(!i.matches("\\d+") || Integer.parseInt(i)<=min || Integer.parseInt(i) >= 5){        //this loop for check if input is integer
            i = input.nextLine();
            if(!i.matches("\\d+")|| Integer.parseInt(i)<=min || Integer.parseInt(i) >= 5){
                System.out.print("Wrong type, Enter "+text+" again : ");
            }
        }
        return Integer.parseInt(i);
    }
}
