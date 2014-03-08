/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class OptionMenuView implements Serializable {
    private final static String[][] menuItems = {
        {"B", "Choose Board Size"},
        {"M", "Matching Difficulty"},
        {"N", "Number of Players"},
        
        {"X", "Exit Option Menu"}
    };

    /**
     * @return the menuItems
     */
    public static String[][] getMenuItems() {
        return menuItems;
    }
    
    // Create instance of the OptionsMenuControl (action) class
    private OptionsMenuControl optionsMenuControl = new OptionsMenuControl();
    
    // default constructor
    public OptionMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "B":
                    this.getOptionsMenuControl().displayBoardOption();
                    break;
                case "M":
                    this.getOptionsMenuControl().displayMatchingOption();
                    break;
                case "N":
                    this.getOptionsMenuControl().displayNumPlayersOption();
                    break;                  
               
                case "X": 
                    break;
                default: 
                    new MemoryError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("X"));  
        
         return;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\t*** OPTIONS MENU **************************************"
                + "\n\tEnter the letter to change one of the following options:");

        for (int i = 0; i < OptionMenuView.getMenuItems().length; i++) {
            System.out.println("\t   " + getMenuItems()[i][0] + "\t" + getMenuItems()[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    /**
     * @return the optionsMenuControl
     */
    public OptionsMenuControl getOptionsMenuControl() {
        return optionsMenuControl;
    }

    /**
     * @param optionsMenuControl the optionsMenuControl to set
     */
    public void setOptionsMenuControl(OptionsMenuControl optionsMenuControl) {
        this.optionsMenuControl = optionsMenuControl;
    }
    
}
