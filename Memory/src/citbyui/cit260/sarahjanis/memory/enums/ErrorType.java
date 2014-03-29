/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sarahjanis.memory.enums;

/**
 *
 * @author Janis
 */
public enum ErrorType {
    ERROR101 ("You entered an invalid letter"
            + "\nPlease enter one of the letters in the menu."),
    
    ERROR102 ("Your entry is invalid."
            + "\nPlease enter \"s\" for small, \"m\" for medium, or \"l\" for large board size"),
    
    ERROR103 ("Your entry is not valid."
           // + "\nPlease enter a card number or 0 for a hint."
            + "\n *** ERROR 103 *** "),
    
    ERROR104("A name must be at least one character long"
            + "\nPlease enter your name again."),
    ERROR105("That name was already entered."
            + "\nPlease enter another name"),
    ERROR106("Your entry is invalid"
            + "\nPlease try again."),
    
    ERROR107("You must start a new game first."
            + "\nPlease try again."),
   
    
    ERROR201 ("That card was already selected"
            + "\nPlease enter another card number or 0 for a hint."),
    
    ERROR203 ("That card has already been matched. "
              + "\nPlease enter another card number or 0 for a hint."),
    
    ERROR204 ("Enter a non-blank character for the player's marker."),
    
    ERROR205 ("Both players can not use the same character for a marker."),
    
    ERROR206 ("There is no active game. You must start a new game before "
              + "you can take a turn"), 
    
    ERROR207 ("The number of rows must be between 3 - 9 and the "
              + "number of columns must be between 3 - 9 "),
    
    ERROR209 ("GameCommands - takeTurn: invalidPlayerTYpe");

    
    String message;
    
    ErrorType(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }

    
    
    public Object displayError(Object object) {
        message = (String) object;
        System.out.println("\t#######################################################################");
        System.out.println("\t ERROR: " + message);
        System.out.println("\t#######################################################################\n");
        return null;
    }
       
}
