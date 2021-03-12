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
public class Person {
    private String name;
    private String address;
    private String phone_number;
    private String email;
    
    Person(){
        
    }
    
    Person(String name, String address, String phone_number, String email){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{" + "Name : " + this.name + ", Address : " + this.address + ", Phone : " + this.phone_number + ", E-mail : " + this.email + '}';
    }

}