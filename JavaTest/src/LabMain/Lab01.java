/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabMain;

/**
 *
 * @author Thiraphat Ketsingnoi
 */
public class Lab01 {
    public static void main(String[] args) {
        int DAY = 24*60*60;//sec
        int BIRTH_TIME = 0;
        int DEAD_TIME = 0;
        int IMMI_TIME = 0;
        int PP = 312032486;
        for(int i=0;i<=5;i++)
        {
            int YEAR = 365*DAY*i;
            int BIRTH_COUNT = YEAR/7;
            int DEAD_COUNT = YEAR/13;
            int IMMI_COUNT = YEAR/45;
            System.out.println("Year "+i+" = "+(PP+BIRTH_COUNT-DEAD_COUNT+IMMI_COUNT));
        }  
    }
}