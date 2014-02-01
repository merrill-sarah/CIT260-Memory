/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Janis
 */
public class Card {
    
    int number = 5; // for now to use until graphics can be added
    String shape = ""; // I'm unsure if these go here or in the constructor
    String color = "";
    boolean flipped = true; // indicates which side of the card is showing, True is face-up
    
    
    public Card(){
    
    }
    public void status(){
        if (flipped){
            System.out.println("Card display is " +number);
        }
    }
    
    public void symbolsNeeded(){
      int numSymbols;
      int numMatching;
      int numCards;
      
      Board board = new Board();
      numCards = board.getTotalCards();
      System.out.println("numCards is "+ numCards);
     
            
    }
}
