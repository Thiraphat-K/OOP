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
import java.util.Scanner;
import java.util.Date;
public class Lab07_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Select Menu\n 1.Person 2.Student 3.Employee 4.Falculty 5.Staff\n Answer : ");
        int menu = input.nextInt();
        if (menu > 0) {
            switch (menu) {
                case 1:
                    System.out.println("Person");
                    String name_ = input.nextLine();
                    System.out.print("Name : ");
                    name_ = input.nextLine();
                    System.out.print("Address : ");
                    String address = input.nextLine();
                    System.out.print("Phone : ");
                    String phone = input.nextLine();
                    System.out.print("E-mail : ");
                    String email = input.nextLine();
                    Person ps = new Person(name_, address, phone, email);
                    System.out.println(ps.toString());
                    break;
                case 2:
                    System.out.println("Student");
                    name_ = input.nextLine();
                    System.out.print("Name : ");
                    name_ = input.nextLine();
                    System.out.print("Address : ");
                    address = input.nextLine();
                    System.out.print("Phone : ");
                    phone = input.nextLine();
                    System.out.print("E-mail : ");
                    email = input.nextLine();
                    System.out.print("Status : ");
                    String status = input.nextLine();
                    Student std = new Student(name_, address, phone, email, status);
                    System.out.println(std.toString());
                    break;
                case 3:
                    System.out.println("Employee");
                    name_ = input.nextLine();
                    System.out.print("Name : ");
                    name_ = input.nextLine();
                    System.out.print("Address : ");
                    address = input.nextLine();
                    System.out.print("Phone : ");
                    phone = input.nextLine();
                    System.out.print("E-mail : ");
                    email = input.nextLine();
                    System.out.print("Office : ");
                    String office = input.nextLine();
                    System.out.print("Salary : ");
                    int slr = input.nextInt();
                    System.out.print("Date hire : ");
                    Date DH = new Date();
                    System.out.println(DH);
                    Employee epy = new Employee(name_, address, phone, email, office, slr, DH);
                    System.out.println(epy.toString());
                    break;
                case 4:
                    System.out.println("Faculty");
                    name_ = input.nextLine();
                    System.out.print("Name : ");
                    name_ = input.nextLine();
                    System.out.print("Address : ");
                    address = input.nextLine();
                    System.out.print("Phone : ");
                    phone = input.nextLine();
                    System.out.print("E-mail : ");
                    email = input.nextLine();
                    System.out.print("Office : ");
                    office = input.nextLine();
                    System.out.print("Salary : ");
                    slr = input.nextInt();
                    System.out.print("Date hire : ");
                    DH = new Date();
                    System.out.println(DH);
                    System.out.print("Office Hour : ");
                    String office_h = input.nextLine();
                    office_h = input.nextLine();
                    System.out.print("Rank : ");
                    String R = input.nextLine();
                    Faculty fct = new Faculty(name_, address, phone, email, office, slr, DH, office_h, R);
                    System.out.println(fct.toString());
                    break;
                case 5:
                    System.out.println("Staff");
                    name_ = input.nextLine();
                    System.out.print("Name : ");
                    name_ = input.nextLine();
                    System.out.print("Address : ");
                    address = input.nextLine();
                    System.out.print("Phone : ");
                    phone = input.nextLine();
                    System.out.print("E-mail : ");
                    email = input.nextLine();
                    System.out.print("Office : ");
                    office = input.nextLine();
                    System.out.print("Salary : ");
                    slr = input.nextInt();
                    System.out.print("Date hire : ");
                    DH = new Date();
                    System.out.println(DH);
                    System.out.print("Title : ");
                    String TT = input.nextLine();
                    TT = input.nextLine();
                    Staff stff = new Staff(name_, address, phone, email, office, slr, DH, TT);
                    System.out.println(stff.toString());
                    break;
            }
        } 
        else {
            System.out.println("Error");
        }
    }
}
