/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.menus;

import citbyui.cit260.sarahjanis.memory.interfaces.DisplayInfo;
import citbyui.cit260.sarahjanis.memory.interfaces.EnterInfo;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;
import memory.MemoryError;
import citbyui.cit260.sarahjanis.memory.models.Player;

/**
 *
  * @author Sarawr
*/
public class EndMenuView implements DisplayInfo {//doesn't implement Menu or implement EnterInfo because getInput() has different parameters
    public static final String PLAY_AGAIN = "PLAY_AGAIN";
    public static final String MAIN_MENU = "MAIN_MENU";
    
    
    private final static String[][] menuItems = {
        {"P", "Play Again"},
        {"M", "Main Menu"},
        {"Q", "Quit Game"}
    };
     EndMenuControl endMenuControl = new EndMenuControl();
    
    // display the help menu and get the end users input selection
    public void getInput(Player player1, Player player2) throws IOException {
             
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "P":
                    this.endMenuControl.playAgain(player1, player2);
                    break;
                case "M":
                    this.endMenuControl.displayMainMenu();
                    break;
                case "Q":
                    break;
                default:
                    new MemoryError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));
        
         System.out.println(
                "\t-----This Set of Games is Over----"
              + "\n\t-----All Totals Will Be Reset-----"
                );
    }

        // displays the help menu
    @Override
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following:");

        for (int i = 0; i < EndMenuView.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

}