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
public class MenuException extends Exception{
    public MenuException() {
    }

    public MenuException(String message) {
        super(message);
    }

    public MenuException(String message, Throwable cause){
        super(message, cause);
    }

    public MenuException(Throwable cause){
        super(cause);
    }
}
