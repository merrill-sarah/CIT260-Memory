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
public class MemoryError {
    public Object displayError(Object object) {
        String message = (String) object;
        System.out.println("\t#######################################################################");
        System.out.println("\t ERROR: " + message);
        System.out.println("\t#######################################################################\n");
        return null;
    }
    
}
