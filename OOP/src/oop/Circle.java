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
public class Circle {
    double r = 1.0;
    Circle(){
    }
    Circle(double newR){
        r = newR;
    }
    double getArea(){
        return Math.PI*r*r;
    }
}
