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
public class Lab06_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name : ");
        String n = input.nextLine();
        System.out.print("Age(year) : ");
        int age_ = input.nextInt();
        if (age_ > 0) {
            System.out.print("Weight(pound) : ");
            double weight_ = input.nextDouble();
            if (weight_ > 0) {
                System.out.print("Height(inche) : ");
                double height_ = input.nextDouble();
                if (height_ > 0) {
                    BMI aBMI_ = new BMI(n, age_, weight_, height_, 0.0254);
                    System.out.println("BMI : " + aBMI_.getABIT());
                    switch (aBMI_.getCase()) {
                        case 1:
                            System.out.println("Interpretation : Underweight");
                            break;
                        case 2:
                            System.out.println("Interpretation : Normal");
                            break;
                        case 3:
                            System.out.println("Interpretation : Overweight");
                            break;
                        case 4:
                            System.out.println("Interpretation : Obese");
                            break;
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
