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
public abstract class Geometric_08_3 {
    protected String name;
    protected double area;
    protected String color;
    protected boolean Fill;
    
    public Geometric_08_3() {
        this.color = "";
        this.Fill = false;
    }

    public Geometric_08_3(String name, String color, boolean Fill) {
        this.name = name;
        this.color = color;
        this.Fill = Fill;
    }
    
    abstract public double getArea();
    abstract public String getColor();
    abstract public String getName();

    @Override
    public String toString() {        
        return "name : " + this.name + ", area : " + String.format("%.6s", this.getArea()) + ", color : " + this.color; 
    }
    
}
