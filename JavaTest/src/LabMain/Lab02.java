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
public class Lab02 {
    public static void main(String[] args) {
       double a,b,c,d,x,y;
       a = (44.5*0.55)-(50.2*5.9);//ed-bf
       b = (3.4*0.55) - (50.2*2.1);//ad-bc
       c = (3.4*5.9) - (44.5*2.1);//af-ec
       System.out.println("3.4x + 50.2y = 44.5");
       System.out.println("2.1x + 0.55y = 5.9");
        if( b == 0)
        {
            System.out.println("Error");
        }
        else
        {
            x = a/b;
            y = c/b;
            System.out.printf("x = %.6f\n",x);
            System.out.printf("y = %.6f\n",y);
        }
    }
}
