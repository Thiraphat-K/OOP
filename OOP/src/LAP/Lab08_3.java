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
public class Lab08_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu : (1)Triangle (2)Rectangle (3)Circle (4)Exit");
        System.out.print("<Enter num of menu> : ");
        String mn = input.nextLine();
        int imn = Integer.parseInt(mn);
        boolean cont = true;
            switch (imn) {
                case 1:
                    System.out.println("Triangle");
                    System.out.println("1st Triangle Co-ordinate : Name Color x1 y1 x2 y2 x3 y3");
                    System.out.print("Name : ");
                    String n1 = input.nextLine();
                    System.out.print("Put Color : ");
                    String c1 = input.nextLine();
                    System.out.print("Put Co-ordinate : ");
                    double x1 = input.nextDouble();
                    double y1 = input.nextDouble();
                    double x2 = input.nextDouble();
                    double y2 = input.nextDouble();
                    double x3 = input.nextDouble();
                    double y3 = input.nextDouble();
                    System.out.println("\n2nd Triangle Co-ordinate : Name Color x1 y1 x2 y2 x3 y3");
                    System.out.print("Name : ");
                    String n2 = input.nextLine();
                    n2 = input.nextLine();
                    System.out.print("Put Color : ");
                    String c2 = input.nextLine();
                    System.out.print("Put Co-ordinate : ");
                    double x1_2 = input.nextDouble();
                    double y1_2 = input.nextDouble();
                    double x2_2 = input.nextDouble();
                    double y2_2 = input.nextDouble();
                    double x3_2 = input.nextDouble();
                    double y3_2 = input.nextDouble();
                    Triangle_08_3 Tri_1 = new Triangle_08_3(n1, c1, cont, x1, y1, x2, y2, x3, y3);
                    Triangle_08_3 Tri_2 = new Triangle_08_3(n2, c2, cont, x1_2, y1_2, x2_2, y2_2, x3_2, y3_2);
                    System.out.println("\nEqual Triangles, if their area are the same : " + Tri_1.equals(Tri_2));
                    System.out.println("The larger object : " + Tri_1.Max(Tri_2));
                    break;
                case 2:
                    System.out.println("Rectangle");
                    System.out.println("1st Rectangle : Name Color width hight");
                    System.out.print("Name : ");
                    n1 = input.nextLine();
                    System.out.print("Put Color : ");
                    c1 = input.nextLine();
                    System.out.print("Put width and hight : ");
                    double w1 = input.nextDouble();
                    double h1 = input.nextDouble();
                    System.out.println("\n2nd Rectangle : Name Color width hight");
                    System.out.print("Name : ");
                     n2 = input.nextLine();
                    n2 = input.nextLine();
                    System.out.print("Put Color : ");
                    c2 = input.nextLine();
                    System.out.print("Put width and hight : ");
                    double w2 = input.nextDouble();
                    double h2 = input.nextDouble();
                    Rectangle_08_3 R_1 = new Rectangle_08_3(n1, c1, cont, w1,h1);
                    Rectangle_08_3 R_2 = new Rectangle_08_3(n2, c2, cont, w2,h2);
                    System.out.println("\nEqual Triangles, if their area are the same : " + R_1.equals(R_2));
                    System.out.println("The larger object : " + R_1.Max(R_2));
                    break;
                case 3:
                    System.out.println("Circle");
                    System.out.println("1st Circle : Name Color radius");
                    System.out.print("Name : ");
                    n1 = input.nextLine();
                    System.out.print("Put Color : ");
                    c1 = input.nextLine();
                    System.out.print("Put radius : ");
                    double r1 = input.nextDouble();
                    System.out.println("\n2nd Circle : Name Color radius");
                    System.out.print("Name : ");
                     n2 = input.nextLine();
                    n2 = input.nextLine();
                    System.out.print("Put Color : ");
                    c2 = input.nextLine();
                    System.out.print("Put radius : ");
                    double r2 = input.nextDouble();
                    Circle_08_3 C_1 = new Circle_08_3(n1, c1, cont, r1);
                    Circle_08_3 C_2 = new Circle_08_3(n2, c2, cont, r2);
                    System.out.println("\nEqual Triangles, if their area are the same : " + C_1.equals(C_2));
                    System.out.println("The larger object : " + C_1.Max(C_2));
                    break;
                case 4:
                    System.out.println("----" + " Good Bye " + "----");
                    break;
        }
    }
}
