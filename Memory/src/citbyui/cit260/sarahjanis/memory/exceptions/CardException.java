/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sarahjanis.memory.exceptions;

/**
 *
 * @author Janis
 */
public class CardException extends Exception{
    public CardException() {
    }

    public CardException(String message) {
        super(message);
    }

    public CardException(String message, Throwable cause){
        super(message, cause);
    }

    public CardException(Throwable cause){
        super(cause);
    }
    
}
