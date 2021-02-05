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
public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    double getPrevious(double newPrevious){
        previousClosingPrice = newPrevious;
        return previousClosingPrice;
    }
    double getCurrent(double newCurrent){
        currentPrice = newCurrent;
        return currentPrice;
    }
    Stock(String newSymbol,String newName){
        symbol = newSymbol;
        name = newName;
    }
    double getChangePercent(){
        return (100/previousClosingPrice)*(currentPrice-previousClosingPrice);
    }
}
