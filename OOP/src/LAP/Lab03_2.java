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
import java.util.Arrays;
public class Lab03_2 {
    public static int[] merge(int[] list1, int[] list2)
    {                           
                int first = list1.length;       
                int second = list2.length;  
                int[] merged = new int [first + second];
                      
                System.arraycopy(list1, 0, merged, 0, first);
                System.arraycopy(list2, 0, merged, first, second);  
              
                Arrays.sort(merged);
               System.out.print("The merged list is "); 
               for(int i=0;i<merged.length;i++)
               {
                System.out.print(merged[i]+" ");
               }
             
                return merged ;
    }
    
    public static void main(String[] args) 
    {         
        Scanner abc =  new Scanner(System.in);
        
        System.out.print("Enter list1 : ");
          String data1 =  abc.nextLine(); 
          String[] numberSeper1 = data1.split(" ");
          int[] StrToInt1 = new int[numberSeper1.length];

            for ( int i = 0; i < numberSeper1.length; i++ )
        {
             StrToInt1[i] = Integer.parseInt( numberSeper1[i] );
        }     
          
        System.out.print("Enter list2 : ");
          String data2 =  abc.nextLine(); 
          String[] numberSeper2 = data2.split(" ");
          int[] StrToInt2 = new int[numberSeper2.length];

            for ( int i = 0; i < numberSeper2.length; i++ )
        {
            StrToInt2[i] = Integer.parseInt( numberSeper2[i] );
        }          
      
         merge(StrToInt1,StrToInt2);       
    }
}
