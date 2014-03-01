/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

/**
 *
 * @author Janis
 */
public class Card {
    
   // int number = 5; // for now to use until graphics can be added
    String shape = ""; 
    String color = "";
   boolean flipped;
   boolean matched;
   char symbol;
   int cardNumber;
   BoardView boardview; 
    
    public Card(){
    boolean flipped = false; // indicates which side of the card is showing, True is face-up
    boolean matched = false;
    }
    
    public Card(char symbol ){
   flipped = false; // indicates which side of the card is showing, True is face-up
   matched = false;
   this.symbol = symbol;
    }
    
    public void status(){
        if (flipped){
           // System.out.println("Card display is " +number);
        }
    }
    
    public void symbolsNeeded(){
      int numSymbols;
      int numMatching;
      int numCards;
            
    }
}
