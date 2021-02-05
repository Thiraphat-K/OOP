/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Thiraphat Ketsingnoi
 */
public class Test_Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.r);
        System.out.println(c1.getArea());
        Circle c2 = new Circle(5.4);
        System.out.println(c2.r);
        System.out.println(c2.getArea());
    }
}
