/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Thiraphat Ketsingnoi
 */
import java.util.Scanner;
import java.util.Random;

public class Exam1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Random characters are : ");
        String a = "123456789";
        String b = "abcdefghij";
        StringBuilder d = new StringBuilder();
        StringBuilder e = new StringBuilder();
        StringBuilder f = new StringBuilder();
        int lenght = 5;
        for (int i = 0; i < lenght; i++) {
            int index = rand.nextInt(a.length());
            char randChar = a.charAt(index);
            d.append(randChar);
        }
        for (int i = 0; i < lenght; i++) {
            int index = rand.nextInt(b.length());
            char randChar = b.charAt(index);
            e.append(randChar);
        }
        String randStringA = d.toString();
        String randStringB = e.toString();
        int lenghtAB = 10;
        for (int i = 0; i < lenghtAB; i++) {
            for (int j = 0; j < i - 5; j++) {
                if (randStringA.charAt(0) == a.charAt(0)) {
                    String S = randStringA.charAt(j) + " " + randStringB.charAt(j);
                    char randS = S.charAt(i);
                    f.append(randS);
                } else if (randStringB.charAt(0) == b.charAt(0)) {
                    String S = randStringB.charAt(j) + " " + randStringA.charAt(j);
                    char randS = S.charAt(i);
                    f.append(randS);
                }
            }
        }
        System.out.println(f.toString());
    }
}
