/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sarawr
 */
public class MainMenuView extends Menu{
    
    public static final String NEW_GAME = "NEW_GAME";
    public static final String OPTIONS = "OPTIONS" ;
    public static final String HELP = "HELP";
      
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
    
     @Override
    public String executeCommands(Object object){
         Game game = new Game();     
        String command = "";
        Scanner inFile = new Scanner(System.in);
        
        do {
            try {
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
                        System.out.println( 
                            "\t-----Game Over----"
                         +"\n\tThank you for Playing!"
                         + "\n\t-----Game Over----"
                            ); 
                        game.rollCredits();   
                        break;
                    default:
                        new MemoryError().displayError("Invalid command. Please enter a valid command.");
                }
            } catch (IOException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (!command.equals("Q")); 
         
         return "";
    }

       
}
