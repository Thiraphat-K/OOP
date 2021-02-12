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
public class RegularPolygon {
    private int n=3;
    private double side=1;
    private double x;
    private double y;
    
    RegularPolygon(){
        
    }

    RegularPolygon(int number, double length) {
        this.n = number;
        this.side = length;
        this.x = 0;
        this.y = 0;
    }

    RegularPolygon(int number, double length, double x, double y) {
        this.n = number;
        this.side = length;
        this.x = x;
        this.y = y;
    }
    
    int getNumofSide(){
        return this.n;
    }
    
    int changeNumofSide(int newNum){
        this.n = newNum;
        return this.n;
    }
    
    double getLengthofSide(){
        return this.side;
    }
    
    double changeLengthofSide(double newLength){
        this.side = newLength;
        return this.side;
    }
    
    double getX(){
        return this.x;
    }
    
    double changeX(double newX){
        this.x = newX;
        return this.x;
    }
    
    double getY(){
        return this.y;
    }
    
    double changeY(double newY){
        this.y = newY;
        return this.y;
    }
    
    double getPerimeter(){
        return this.n*this.side;
    }
    
    double getArea(){
        double Area = (this.n*Math.pow(this.side, 2))/(4*Math.tan(Math.PI/this.n));
        return Area;
    }
}
