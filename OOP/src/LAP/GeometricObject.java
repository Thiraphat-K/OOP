/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAP;

import java.util.Date;

/**
 *
 * @author Thiraphat Ketsingnoi
 */
public abstract class GeometricObject {
    protected String color;
    protected Date dateCreated;
    protected boolean filled = false;

    public GeometricObject() {
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    // subclass must implement
    public abstract double getArea();//nobody
    
    public abstract double getParimeter();//only signature and return type
    
}
