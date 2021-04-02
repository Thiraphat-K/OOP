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
public class Circle_08_3 extends Geometric_08_3 implements Comparable<Circle_08_3>{
    
    private double radius;

    public Circle_08_3() {
    }
    
    public Circle_08_3(String name, String color, boolean Fill,double radius) {
        super(name,color,Fill);
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public int compareTo(Circle_08_3 o) {
        if(getArea()>o.getArea()){ return 1;}
        else if(getArea() == o.getArea()){ return 0;}
        else if(getArea() < o.getArea()){ return -1;}
        return 0;
    }

    @Override
    public String getColor() {
        return super.color;
    }
    
    public String Max(Circle_08_3 o){
        if(compareTo(o)==1)
        {
            return toString();
        }
        else if (compareTo(o)==0)
        {
            return "Equal";
        }
        else{
            return o.toString();
        }
    }

    @Override
    public String getName() {
        return super.name;
    }
    
    public boolean equals(Circle_08_3 o){
        if(compareTo(o)==0)
        {
            return true;
        }
        return false;
    }
    
}
