/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.models;

import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.exceptions.BoardException;
import citbyui.cit260.sarahjanis.memory.frames.BoardLargeFrame;
import citbyui.cit260.sarahjanis.memory.frames.BoardMediumFrame;
import citbyui.cit260.sarahjanis.memory.frames.BoardSmallFrame;
import citbyui.cit260.sarahjanis.memory.interfaces.DisplayInfo;
import java.io.Serializable;

/**
 *
 * @author Sarawr
 */
public class Board implements Serializable, DisplayInfo {
    private int rows;
    private int columns;
    private String size;
    private int totalCards;
    private SymbolArray symbolArr;
    private Card deck[];
    
    public Board(){
        symbolArr = new SymbolArray();
    }        
    
  
   public void setUp() {
        MemoryError errorMsg = new MemoryError();
       
          switch (size){
            case "s":
                 setTotalCards(12);
                 break;
            case "m":
                setTotalCards(24);
                break;
            case "l":
                setTotalCards(48); 
                break;
            default: 
                errorMsg.displayError(ErrorType.ERROR102.getMessage());
            
                    }
        
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