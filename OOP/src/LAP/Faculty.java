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
public class Faculty extends Employee{
    private String office_hour;
    private String rank;
    
    Faculty(){
        
    }

    public Faculty(String name, String address, String phone_number, String email, String office, int salary, Date date_hire, String office_hour, String rank) {
        super(name, address, phone_number, email, office, salary, date_hire);
        this.office_hour = office_hour;
        this.rank = rank;
    }
    
    public void setRank(String rank){
        this.rank = rank;
    }

    public String getOffice_hour() {
        return office_hour;
    }

    public String getRank() {
        return rank;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Faculty{" + "Office : " + this.office_hour + ", Rank : " + this.rank + '}';
    }
}
