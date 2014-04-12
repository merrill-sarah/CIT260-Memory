/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.controls;

import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.enums.HelpType;
import citbyui.cit260.sarahjanis.memory.exceptions.MemoryException;

/**
 *
 * @author Janis
 */
public class HelpMenuControl {
  public HelpMenuControl() {
    } 
  
   public String getHelpText(HelpType command) throws MemoryException {
        String helpText = "";
        
        switch (command){
            case INSTRUCTIONS:  
            case DIFFICULTY:
            case CHOOSE_CARDS:
               helpText = command.getHelpText();
                break;
            default:
                throw new MemoryException(ErrorType.ERROR100.getMessage());
        }
        return helpText;
   }
    
}
