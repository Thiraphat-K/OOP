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
public class BMI {
    String name;
    private int age,n_case;
    private double weight,feet,inches,Pound,aBMI;
    
    BMI(String name, int age, double weight, double feet, double inches)
    {
        this.age = age;
        this.weight = weight*0.45359237;
        this.feet = feet*inches;
        this.aBMI = this.weight/(this.feet*this.feet);
    }
    
    double getABIT(){
        return this.aBMI;
    }
    
    int getCase(){
        if(this.aBMI<18.5)
        {
            this.n_case = 1;
        }
        else if (this.aBMI >= 18.5 && this.aBMI < 25.0)
        {
            this.n_case = 2;
        }
        else if (this.aBMI >= 25.0 && this.aBMI < 30.0)
        {
            this.n_case = 3;
        }
        if(this.aBMI>=30.0)
        {
            this.n_case = 4;
        }
        return this.n_case;
    }
    
    String getName(String newName){
        this.name = newName;
        return this.name;
    }
    
    int getAge(){
        return this.age;
    }
    
    double getWeight(){
        return this.weight;
    }
    
    double getHeight(){
        return this.feet;
    }
}
