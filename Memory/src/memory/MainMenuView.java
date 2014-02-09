/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sarawr
 */
public class MainMenuView {
    private final static String[][] menuItems = {
        {"S", "Start Game"},
        {"O", "Options Menu"}, 
        {"H", "Help Menu"},
        {"Q", "Quit"}
    };
    
    // Create instance of the HelpMenuControl (action) class
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
    // default constructor
    public MainMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public void getInput() throws IOException {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "S":
                    this.mainMenuControl.startGame();
                    break;
                case "O":
                    this.mainMenuControl.displayOptionMenu();
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();
                    break;
                case "Q": 
                    break;
                default: 
                    new MemoryError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("Q"));  
        
         System.out.println( 
                "\t-----Quits Game----"
                ); 
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
