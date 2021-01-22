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

public class Lap02_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines : ");
        int numberOfLines = input.nextInt();
        if (numberOfLines >= 1 && numberOfLines < 16) {
            for (int rows = 1; rows <= numberOfLines; rows++) {
                // Create spaces in each row
                for (int s = numberOfLines - rows; s >= 1; s--) {
                    System.out.print("  ");
                }

                for (int l = rows; l >= 2; l--) {
                    System.out.print(l + " ");
                }

                for (int r = 1; r <= rows; r++) {
                    System.out.print(r + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Try Again");
    }
}
