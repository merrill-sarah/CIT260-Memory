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
    ERROR100 ("Unexpected Error"),
    
    ERROR101(   "    * * * Error * * * "
                + "\n Please enter the players' names. "
                + "\n A name must be at least one "
                + "\n character long."
    ),
    
    ERROR103 ("    * * * Error * * * \n Please select a grid size."
            + "\n small       = 3 rows, 4 columns"
            + "\n medium  = 4 rows, 6 columns"
            + "\n large       = 6 rows, 8 columns"),
    
     ERROR204 ("    * * * Error * * *"
             + "\n Please choose if you\n"
            + " want 2 or 4 of each kind of card.");

    
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
