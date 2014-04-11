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
import javax.swing.JButton;

/**
 *
 * @author Sarawr
 */
public class Board implements Serializable {
    private String size;
    private int totalCards;
    private SymbolArray symbolArr;
    private Card deck[];
    private int totalMatches;
    
    public Board(){

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
        totalMatches=totalCards/2;
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
    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
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