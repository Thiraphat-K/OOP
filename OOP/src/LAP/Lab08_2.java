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
import java.util.ArrayList;
public class Lab08_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Geometric> geometrics = new ArrayList<Geometric>();
        boolean Bl = true;
        while(Bl){
            System.out.println("Add Type Area : (1)Triangle (2)Rectangle (3)Circle (4)SumArea");
            System.out.print("Put Your Choice : ");
            int ime = input.nextInt();
            switch(ime){
                case 1: System.out.println("Triangle");
                        System.out.println("Put Three Co-ordinate");
                        System.out.print("x1 y1 : ");
                        double x1 = input.nextDouble();
                        double y1 = input.nextDouble();
                        System.out.print("x2 y2 : ");
                        double x2 = input.nextDouble();
                        double y2 = input.nextDouble();
                        System.out.print("x3 y3 : ");
                        double x3 = input.nextDouble();
                        double y3 = input.nextDouble();
                        Geometric Triang1 = new TriangleN(x1, y1, x2, y2, x3, y3);
                        geometrics.add(Triang1);
                        System.out.println("");
                        break;
                case 2: System.out.println("Rectangle");
                        System.out.print("Put width : ");
                        double width = input.nextDouble();
                        System.out.print("Put hight : ");
                        double hight = input.nextDouble();
                        Geometric Rect = new Rectangle(width,hight);
                        geometrics.add(Rect);
                        System.out.println("");
                        break;
                case 3: System.out.println("Circle");
                        System.out.print("Put radius : ");
                        double radius = input.nextDouble();
                        Geometric Circ = new Circle(radius);
                        geometrics.add(Circ);
                        System.out.println("");
                        break;
                case 4: System.out.println("Sum Area : "+String.format("%.6s", SumArea(geometrics)));
                        Bl = false;
                        break;
            }
        } 
    }
    
    public static double SumArea(ArrayList<Geometric> Ob){
        double sa = 0;
        for(int i=0; i < Ob.size();i++){
            if(Ob.get(i) instanceof TriangleN){
                sa += Ob.get(i).getArea();
            }
            else if(Ob.get(i) instanceof Rectangle){
                sa += Ob.get(i).getArea();
            }
            else if(Ob.get(i) instanceof Circle){
                sa += Ob.get(i).getArea();
            }
        }
        return sa;
    }
}
