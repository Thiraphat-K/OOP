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
public class Lab04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Weight,Height,pound,inche;
        System.out.print("Weight in pound = ");
        pound = input.nextDouble();
        System.out.print("Height in inche = ");
        inche = input.nextDouble();
        Weight = pound*0.45359237;
        Height = inche*0.0254;
        double BMI = Weight/(Height*Height);
        System.out.printf("BMI = %.4f\n", BMI);
    }
}
