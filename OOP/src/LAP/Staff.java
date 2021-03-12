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
public class Staff extends Employee{
    private String title;
    
    Staff(){
        
    }

    public Staff(String name, String address, String phone_number, String email, String office, int salary, Date date_hire, String title) {
        super(name, address, phone_number, email, office, salary, date_hire);
        this.title = title;
    }
    
    public String getTitle(){
        return this.title;
    }

    @Override
    public String toString() {
        return super.toString() + " Staff{" + "Title : " + this.title + '}';
    }
}
