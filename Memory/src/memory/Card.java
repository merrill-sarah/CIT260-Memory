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
    
    int number; //to use until graphics can be added
    String shape = ""; // I'm unsure if these go here or in the constructor
    String color = "";
    boolean flipped = false; // indicates which side of the card is showing, True is face-up
    
    
    public Card(){
    
    }
}
