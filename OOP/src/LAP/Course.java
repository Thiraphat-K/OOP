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
public class Course {
    private int num_std = 0; 
    private String[] student = new String[0];
    Course(){}
    public void add(String newStudent){
        String[] temp = new String[num_std];
        for(int i = 0;i< num_std;i++){
            temp[i]=this.student[i];
        }
        this.student = new String[num_std+1];
        for(int i = 0;i< num_std;i++){
            this.student[i]=temp[i];
        }
        this.student[num_std] = newStudent;
        this.num_std++;
    }
    public void drop(int studentToDrop){
        if(studentToDrop < num_std && studentToDrop>=0){
            String[] temp = new String[num_std-1];
            for(int i = 0;i < studentToDrop;i++){
                temp[i]=this.student[i];
            }
            for(int i = studentToDrop;i < num_std-1;i++){
                temp[i]=this.student[i+1];
            }
            this.student = new String[num_std-1];
            for(int i = 0;i< num_std-1;i++){
                this.student[i]=temp[i];
            }
            this.num_std--;
        }
    }
    public void clear(){
        System.out.println("Clear!");
        this.num_std = 0;
        this.student = new String[0];
    }
    String getStudent(int i){
        return this.student[i];
    }
    int getNumofStd(){
        return this.num_std;
    }
    int checkSameName(String tempName){
        for(int i=0;i<num_std;i++){
            if(tempName.equals(student[i]))  return i;
        }
        System.out.println("Nobody have that name");
        return -1;
    }
    
    boolean check_sameName(String tempName){
        for(int i=0;i<num_std;i++){
            if(tempName.equals(student[i]))  return true;
        }
        return false;
    }
}
