/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

import citbyui.cit260.sarahjanis.memory.interfaces.DisplayInfo;
import citbyui.cit260.sarahjanis.memory.interfaces.EnterInfo;
import java.util.Scanner;
import java.io.Serializable;

/**
 *
 * @author Sarawr
 */
public class Board implements Serializable, DisplayInfo,EnterInfo {
    private int rows;
    private int columns;
    private String size;
    private int totalCards;
    private SymbolArray symbolArr;
    private Card deck[];
    
    public Board(){
        symbolArr = new SymbolArray();
    }        
    
    @Override
    public void getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the letter associated with the size board "
                + "you would like to play: "
                + "\n\"s\" for small, \"m\" for medium, or \"l\" for large:");
        this.size= input.next();
    }

    public void gridSize(){
         if(size.equals("s")){
            rows = 3;
            columns = 4;
        }
        else if(size.equals("m")){
            rows = 4;
            columns = 6;
        }
        else if(size.equals("l")){
             rows = 6;
             columns = 8;
                    }
        else {
             System.out.println("Invalid entry. Please enter: "
                     + "\"s\" \"m\" or \"l\" (without quotes):");
             getInput();
                    }
        
        totalCards = rows * columns;
        symbolArr.setTotalMatches(totalCards/2);
        }
    
    
    @Override
    public void display(){
        System.out.println("\n\tThe board is " + rows + " by " + columns + "."
                + " There are a total of " + (int)symbolArr.getTotalMatches() + " matches to find.");
        
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getTotalCards() {
        return totalCards;
    }

    public void setTotalCards(int totalCards) {
        this.totalCards = totalCards;
    }

    public SymbolArray getSymbolArr() {
        return symbolArr;
    }

    public void setSymbolArr(SymbolArray symbolArr) {
        this.symbolArr = symbolArr;
    }

    public Card[] getDeck() {
        return deck;
    }

    public void setDeck(Card[] deck) {
        this.deck = deck;
    }
    
    
}