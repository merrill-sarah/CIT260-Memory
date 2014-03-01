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
public class MemoryError {
    public Object displayError(Object object) {
        String message = (String) object;
        System.out.println("\t#######################################################################");
        System.out.println("\t ERROR: " + message);
        System.out.println("\t#######################################################################\n");
        return null;
    }
    
}
