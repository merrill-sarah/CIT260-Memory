/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sarawr
 */
public class MainMenuView extends Menu{
    private final static String[][] menuItems = {
        {"N", "New Game"},
        {"O", "Options Menu"}, 
        {"H", "Help Menu"},
        {"Q", "Quit Game"}
    };
    
    // Create instance of the MainMenuControl (action) class
    private MainMenuControl mainMenuControl = new MainMenuControl();
    
    // default constructor
    public MainMenuView() {
        super(MainMenuView.menuItems);
    } 
    
    // display the help menu and get the end users input selection
    public void getInput() throws IOException {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get command entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "N":
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
            }
        } while (!command.equals("Q"));  
        
         System.out.println( 
                "\t-----Game Over----"
                ); 
    }

       
}
