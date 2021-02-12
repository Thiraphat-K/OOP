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
public class Lab05_2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Choose The Menu\n1.no-arg constructor\n2.Put Number And Length\n3.Put Number, Length, x-coordinate and y-coordinate\n");
    System.out.print("Answer : ");
    int menu = input.nextInt();
    switch(menu){
        case 1 :
            RegularPolygon FirstPolygon = new RegularPolygon();
            System.out.println("\nFirstPolygon Perimeter : " + FirstPolygon.getPerimeter());
            System.out.println("FirstPolygon Area : " + FirstPolygon.getArea()+ "\n");
            break;
        case 2 :
            System.out.print("\nPut Number : ");
            int number = input.nextInt();
            if(number > 0){
            System.out.print("Put Length : ");
            double side = input.nextDouble();
            if(side > 0){
            RegularPolygon SecondPolygon = new RegularPolygon(number,side);
            System.out.println("SecondPolygon Perimeter : " + SecondPolygon.getPerimeter());
            System.out.println("SecondPolygon Area : " + SecondPolygon.getArea()+ "\n");
            }
            else{
                System.out.println("ERROR");
            }
            }
            else{
                System.out.println("ERROR");
            }
            break;
        case 3 :
            System.out.print("\nPut Number : ");
            int number_th = input.nextInt();
            if(number_th > 0){
            System.out.print("Put Length : ");
            double side_th = input.nextDouble();
            if(side_th > 0){
            System.out.print("Put x-coordinate : ");
            double x = input.nextDouble();
            System.out.print("Put y-coordinate : ");
            double y = input.nextDouble();
            RegularPolygon ThirdPolygon = new RegularPolygon(number_th, side_th, x, y);
            System.out.println("ThirdPolygon Perimeter : " + ThirdPolygon.getPerimeter());
            System.out.println("ThirdPolygon Area : " + ThirdPolygon.getArea()+ "\n");
            }
            else{
                System.out.println("ERROR");
            }
            }
            else{
                System.out.println("ERROR");
            }
            break;
    }
    }
}
