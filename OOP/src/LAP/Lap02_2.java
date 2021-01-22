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

public class Lap02_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = 0;
        while (user >= 0 && user <= 2) {
            // Generate a random integer 0, 1, or 2
            int com = (int) (Math.random() * 3);
            // Prompt the user to enter a number 0, 1, or 2
            System.out.print("scissor (0), rock (1), paper (2): ");
            user = input.nextInt();
            if (user >= 0 && user <= 2) {
                System.out.print("The computer is ");
                switch (com) {
                    case 0:
                        System.out.print("scissor.");
                        break;
                    case 1:
                        System.out.print("rock.");
                        break;
                    case 2:
                        System.out.print("paper.");
                }

                System.out.print(" You are ");
                switch (user) {
                    case 0:
                        System.out.print("scissor");
                        break;
                    case 1:
                        System.out.print("rock");
                        break;
                    case 2:
                        System.out.print("paper ");
                }

                // Display result
                if (com == user) {
                    System.out.println(" too. It is a draw");
                } else {
                    boolean win = (user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1);
                    if (win) {
                        System.out.println(". You won");
                    } else {
                        System.out.println(". You lose");
                    }
                }
            } else {
                System.out.println("ERROR");
            }
            System.out.println("");
        }
    }
}
