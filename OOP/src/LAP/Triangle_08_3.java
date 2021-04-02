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
public class Triangle_08_3 extends Geometric_08_3 implements Comparable<Triangle_08_3>{
    
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle_08_3() {
        
    }

    public Triangle_08_3(String name, String color, boolean Fill, double x1, double y1, double x2, double y2, double x3, double y3) {
        super(name,color,Fill);
        if(x1==x2 && x1==x3 && y1==y2 && y1==y3){
            System.out.println("ERROR");
        }
        else if(x2==x1 && x2==x3 && y2==y1 && y2==y3){
            System.out.println("ERROR");
        }
        else if(x3==x1 && x3==x2 && y3==y1 && y3==y2){
            System.out.println("ERROR");
        }
        else{
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
        }
    }

    @Override
    public double getArea() {
        return ((Math.abs(((x1*y2)+(x2*y3)+(x3*y1))-((y1*x2)+(y2*x3)+(y3*x1))))/2);
    }

    @Override
    public int compareTo(Triangle_08_3 o) {
        if(getArea()>o.getArea()){ return 1;}
        else if(getArea() == o.getArea()){ return 0;}
        else if(getArea() < o.getArea()){ return -1;}
        return 0;
    }

    @Override
    public String getColor() {
        return super.color;
    }
    
    public String Max(Triangle_08_3 o){
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
    
    public boolean equals(Triangle_08_3 o){
        if(compareTo(o)==0)
        {
            return true;
        }
        return false;
    }
}
