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
public class Rectangle extends Geometric {
    private double width;
    private double hight;

    public Rectangle() {
        this(0,0);
    }

    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return width*hight;
    }

}
