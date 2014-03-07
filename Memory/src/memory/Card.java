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
    
   
    String shape = ""; 
    String color = "";
   boolean flipped;
   boolean matched;
  // String matchString;
   char symbol;
   int cardNumber;
   BoardView boardview; 
    
    public Card(){
     flipped = false; // indicates which side of the card is showing, True is face-up
     matched = false;
    }
    
    public Card(char symbol ){
   flipped = false; 
   matched = false;
   this.symbol = symbol;
    }
   

}
