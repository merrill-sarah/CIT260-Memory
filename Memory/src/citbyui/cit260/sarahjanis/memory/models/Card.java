/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.models;

import java.io.Serializable;
import citbyui.cit260.sarahjanis.memory.views.BoardView;

/**
 *
 * @author Janis
 */
public class Card implements Serializable{
    
   
     private String shape; 
     private String color;
     private boolean flipped;
     private boolean matched;
     private char symbol;
     private int cardNumber;
     private boolean [] cardArray;
  
    
    public Card(){
     flipped = false; // indicates which side of the card is showing, True is face-up
     matched = false;
     cardArray = new boolean[48];
     for (boolean b:cardArray){
         b = false;
     }
    }
    
    public Card(char symbol ){
   flipped = false; 
   matched = false;
   this.symbol = symbol;
   cardArray = new boolean [48];
   for (boolean b:cardArray){
         b = false;
    }
    }
    
    //public cardArray(){
   // }

    /**
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * @param shape the shape to set
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the flipped
     */
    public boolean isFlipped() {
        return flipped;
    }

    /**
     * @param flipped the flipped to set
     */
    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    /**
     * @return the matched
     */
    public boolean isMatched() {
        return matched;
    }

    /**
     * @param matched the matched to set
     */
    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    /**
     * @return the symbol
     */
    public char getSymbol() {
        return symbol;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    /**
     * @return the cardNumber
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
/*
    /**
     * @return the boardview
     *//*
    public BoardView getBoardview() {
        return boardview;
    }

    /**
     * @param boardview the boardview to set
     *//*
    public void setBoardview(BoardView boardview) {
        this.boardview = boardview;
    }
   */

    /**
     * @return the cardArray
     */
    public boolean[] getCardArray() {
        return cardArray;
    }

    /**
     * @param cardArray the cardArray to set
     */
    public void setCardArray(boolean[] cardArray) {
        this.cardArray = cardArray;
    }

}
