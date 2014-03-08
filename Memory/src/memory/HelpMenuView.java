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
public class HelpMenuView implements Serializable {
 
  private final static String[][] menuItems = {
        {"B", "The Board"},
        {"C", "Choosing Cards"}, 
        {"H", "How to Play"},
        {"O", "Options"},
        {"P", "Choosing Players"},        
        {"X", "Exit Help Menu"}        
    };

    /**
     * @return the menuItems
     */
    public static String[][] getMenuItems() {
        return menuItems;
    }
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
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
                    this.getHelpMenuControl().displayBoardHelp();
                    break;
                case "C":
                    this.getHelpMenuControl().displayCardChoiceHelp();
                    break;
                case "H":
                    this.getHelpMenuControl().displayGameHelp();
                    break;                  
                case "O":
                    this.getHelpMenuControl().displayOptionsHelp();
                    break;
                 case "P":
                     this.getHelpMenuControl().displayPlayersHelp();
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
        System.out.println("\tEnter the letter associated with one of the following Help Menus:");

        for (int i = 0; i < HelpMenuView.getMenuItems().length; i++) {
            System.out.println("\t   " + getMenuItems()[i][0] + "\t" + getMenuItems()[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    /**
     * @return the helpMenuControl
     */
    public HelpMenuControl getHelpMenuControl() {
        return helpMenuControl;
    }

    /**
     * @param helpMenuControl the helpMenuControl to set
     */
    public void setHelpMenuControl(HelpMenuControl helpMenuControl) {
        this.helpMenuControl = helpMenuControl;
    }
    
}
