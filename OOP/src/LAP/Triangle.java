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
public class Triangle extends GeometricObject {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle() {
    }

    public Triangle( String color, boolean filled, double x1, double y1, double x2, double y2, double x3, double y3) {
        super(color,filled);
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
        //System.out.println(this.x1);
    }

    @Override
    public double getArea() {
        return ((Math.abs(((x1*y2)+(x2*y3)+(x3*y1))-((y1*x2)+(y2*x3)+(y3*x1))))/2);
    }

    @Override
    public double getParimeter() {
        return (Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)))+(Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2)))+(Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2)));
    }
    
    //public abstract double getParimeter(); dont override but Class must be abstract
    
    //GeometricObject[] geo = new GeometricObject[3];
}
