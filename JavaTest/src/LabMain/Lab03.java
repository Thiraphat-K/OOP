/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabMain;

/**
 *
 * @author Thiraphat Ketsingnoi
 */
import java.util.Scanner;
public class Lab03 {
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
        int a,b,c,answer;
        System.out.print("Enter a number between 0 and 1000 : ");
        int n = x.nextInt();
      if(n>0 && n< 1000)
      {
          a = n%10;
          b = (n/10)%10;
          c = (n/100)%10;
          answer = a+b+c;
          System.out.println("The sum of the digits is "+answer);
      }
      else
      {
          System.out.println("Error");
      }
    }
}
