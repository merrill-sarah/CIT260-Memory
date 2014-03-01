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
public class EndMenuView {
    private final static String[][] menuItems = {
        {"P", "Play Again"},
        {"M", "Main Menu"},
        {"Q", "Quit Game"}
    };
     EndMenuControl endMenuControl = new EndMenuControl();
    
    // display the help menu and get the end users input selection
    void getInput(Player player1, Player player2) throws IOException {
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get command entered
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
                "\t-----Game Over----"
                );
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following:");

        for (int i = 0; i < EndMenuView.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

}