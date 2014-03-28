/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.models;

import citbyui.cit260.sarahjanis.memory.exceptions.BoardException;
import citbyui.cit260.sarahjanis.memory.interfaces.DisplayInfo;
//import citbyui.cit260.sarahjanis.memory.interfaces.EnterInfo;
import java.util.Scanner;
import java.io.Serializable;

/**
 *
 * @author Sarawr
 */
public class Board implements Serializable, DisplayInfo{
    private int rows;
    private int columns;
    private String size;
    private int totalCards;
    private SymbolArray symbolArr;
    private Card deck[];
    
    public Board(){
        symbolArr = new SymbolArray();
    }        
    
  
    public void getInput() throws BoardException{
        boolean valid = false;
        while (!valid){
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the letter associated with the size board "
                + "you would like to play: "
                + "\n\"s\" for small, \"m\" for medium, or \"l\" for large:");
        this.size= input.next();
        size = size.trim().toLowerCase();
        int size1 = Integer.parseInt(size);
        valid = true;
        
    }
        catch(NumberFormatException e){
            throw new BoardException("please enter \"s\" \"m\" or \"l\""); 
        }
        
        }
    }

    public void gridSize() throws BoardException{
          switch (size){
            case "s":
                 rows = 3;
                 columns = 4;
                 break;
            case "m":
                rows = 4;
                columns = 6;
                break;
            case "l":
               rows = 6;
               columns = 8; 
                break;
            default: 
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