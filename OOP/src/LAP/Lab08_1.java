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
public class Lab08_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Triangle");
        System.out.print("Put First Co-ordinate(x1,y1) : \nx1 = ");
        double x1 = input.nextDouble();
        System.out.print("y1 = ");
        double y1 = input.nextDouble();
        System.out.print("Put Second Co-ordinate(x2,y2) : \nx2 = ");
        double x2 = input.nextDouble();
        System.out.print("y2 = ");
        double y2 = input.nextDouble();
        System.out.print("Put Third Co-ordinate(x3,y3) : \nx3 = ");
        double x3 = input.nextDouble();
        System.out.print("y3 = ");
        double y3 = input.nextDouble();
        System.out.print("Color : ");
        String cl = input.nextLine();
        cl = input.nextLine();
        if(cl==""){
            System.out.println("Not filled");
        }
        else{
            Triangle Triang = new Triangle(cl, true,x1, y1, x2, y2, x3, y3);
            System.out.println("Area : " + Triang.getArea());
            System.out.println("Parimeter : " + String.format("%.4s",Triang.getParimeter()));
            System.out.println("Has filled");
            System.out.println(Triang.getDateCreated());
        }
    }
}
