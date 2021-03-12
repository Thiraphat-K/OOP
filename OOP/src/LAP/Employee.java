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
import java.util.Date;
public class Employee extends Person{
    private String office;
    private int salary;
    private Date date_hire;
    
    Employee(){
        
    }

    public Employee(String name, String address, String phone_number, String email, String office, int salary, Date date_hire) {
        super(name, address, phone_number, email);
        this.office = office;
        this.salary = salary;
        this.date_hire = date_hire;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDate_hire(Date date_hire) {
        this.date_hire = date_hire;
    }
    

    public String getOffice() {
        return this.office;
    }

    public int getSalary() {
        return this.salary;
    }

    public Date getDate_hire() {
        return this.date_hire;
    }

    @Override
    public String toString() {
        return super.toString() + " Employee{" + "Office : " + this.office + ", Salary : " + this.salary + ", Date hire : " + this.date_hire + '}';
    }

}
