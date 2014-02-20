/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class OptionMenuView {
    private final static String[][] menuItems = {
        {"B", "Choose Board Size"},
        {"M", "Matching Difficulty"},
        {"N", "Number of Players"},
        {"P", "Player Names"},
        {"X", "Exit Option Menu"}
    };
    
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
                    this.optionsMenuControl.displayBoardOption();
                    break;
                case "M":
                    this.optionsMenuControl.displayMatchingOption();
                    break;
                case "N":
                    this.optionsMenuControl.displayNumPlayersOption();
                    break;                  
                case "P":
                    this.optionsMenuControl.displayPlayerNamesOption();
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

        for (int i = 0; i < OptionMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
}
