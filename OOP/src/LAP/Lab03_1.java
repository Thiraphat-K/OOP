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
public class Lab03_1 {
    static boolean primeCheck(int num){
        boolean isPrime = true;
            for(int i = 2; i< num; i++){
                if(num%i==0) isPrime = false;
            }
            if(num == 0 || num == 1) isPrime = false;
            return isPrime;        
    }
    static boolean palindomeCheck(String num){
        boolean isParindome = true;
        for(int i = 0;i< num.length();i++ ){
            if(num.charAt(0+i) != num.charAt(num.length()-(1+i))) isParindome = false;
        }
        return isParindome;
    }
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; count < 100 ; i++){
            if(primeCheck(i) && palindomeCheck(Integer.toString(i)) ){
                System.out.print(i+ " ");
                count++;
                if(count % 10 == 0) System.out.println("");
            }
        }
    }
}
