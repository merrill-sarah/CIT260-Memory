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
public class BoardException extends Exception{
    public BoardException() {
    }

    public BoardException(String message) {
        super(message);
    }

    public BoardException(String message, Throwable cause){
        super(message, cause);
    }

    public BoardException(Throwable cause){
        super(cause);
    }
    
   
}
