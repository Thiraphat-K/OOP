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
public class Test_Stock {
    public static void main(String[] args) {
        Stock OC = new Stock("OCRL","Oracle Coperation");
        System.out.println("Symbol : "+OC.symbol);
        System.out.println("Name : "+OC.name);
        System.out.println("Previous Closing Price : "+OC.previousClosingPrice);
        System.out.println("Current Price : "+OC.currentPrice);
        System.out.println("Price Change : "+OC.getChangePercent()+"%");
    }
}
