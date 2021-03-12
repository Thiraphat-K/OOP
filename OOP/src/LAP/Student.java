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
public class Student extends Person{
    private String status;
    
    Student(){
        
    }
    
    Student(String status){
        this.status = status;
    } 

    public Student(String name, String address, String phone_number, String email, String status) {
        super(name, address, phone_number, email);
        this.status = status;
    }
    
    public String getStudent(){
        return this.status;
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" + "Status : " + this.status + '}';
    }
}
