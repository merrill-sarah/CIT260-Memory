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
public class MemoryException extends Exception{
    public MemoryException() {
    }

    public MemoryException(String message) {
        super(message);
    }

    public MemoryException(String message, Throwable cause){
        super(message, cause);
    }

    public MemoryException(Throwable cause){
        super(cause);
    }
}
