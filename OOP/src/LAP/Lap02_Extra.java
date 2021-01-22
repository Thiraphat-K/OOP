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
public class Lap02_Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter element : ");
        int num = input.nextInt();
        int sum = 0;
        int sum2 = 0;
        int[] result = new int[50];
        for(int i=1; i<=num; i+=2){
            result[i]   = 1 + sum2;
            result[i+1] = 3 + sum;
            sum  += 3;
            sum2 += (i+1);
        }
        for(int i=1; i<=num; i++){
            if(i!=1)
                System.out.print(", "+result[i]);
            else
                System.out.print(result[i]);
        }
        System.out.println("");
    }
}
