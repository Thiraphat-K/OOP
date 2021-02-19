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
public class Lab06_3 {
    public static void main(String[] args) {
        Queue queue = new Queue(8);
        int j = 0;
        System.out.print("Press 1 to Enqueue : Press 2 to Dequeue : Press 3 to end\n");
        while(j != 3){
            System.out.print("Enter menu : ");
            j = (int)getint(0,"menu");
           
            if(j == 1){ 
                System.out.print("Enter element number : ");
                queue.enqueue((int)getint(0,"element number"));
                System.out.println("--Current Queue--");
            }
            if(j == 2){ queue.dequeue(); System.out.println("--Current Queue--");}
            for(int i = 0;i<queue.getSize();i++){
                System.out.println("Queue now : "+queue.getQueue(i)+" " );
            }
            System.out.println("");
        }
    }
    static double getint(int min,String text){
        Scanner input = new Scanner(System.in);
        String  i = "A";
        while(!i.matches("\\d+")){                                              //this loop for check if input is integer
            i = input.nextLine();
            if(!i.matches("\\d+")){
                System.out.print("Wrong type, Enter "+text+" again : ");
            }
        }
        return Integer.parseInt(i);
    }
}
