/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.views;

import citbyui.cit260.sarahjanis.memory.controls.Memory;
import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.exceptions.MenuException;
import citbyui.cit260.sarahjanis.memory.interfaces.DisplayInfo;
import citbyui.cit260.sarahjanis.memory.interfaces.EnterInfo;
import java.util.Scanner;

/**
 *
 * @author Janis
 */
public abstract class Menu implements DisplayInfo, EnterInfo {

    private String[][] menuItems = null;

    public Menu() {
    }
    
    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
    
     public String[][] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }
    
    @Override
   public abstract Object getInput(Object object); 
   
    
    @Override
    public void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
    private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    public final String getCommand() throws MenuException {

        Scanner inFile = Memory.getInputFile();
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                throw new MenuException(ErrorType.ERROR101.getMessage());//   
            }
            return command;
                
        } while (!valid);
    }

    
}
