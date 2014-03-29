/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.views;

import citbyui.cit260.sarahjanis.memory.controls.EndMenuControl;
import citbyui.cit260.sarahjanis.memory.controls.Memory;
import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.enums.StatusType;
import citbyui.cit260.sarahjanis.memory.exceptions.BoardException;
import citbyui.cit260.sarahjanis.memory.exceptions.CardException;
import citbyui.cit260.sarahjanis.memory.exceptions.MemoryException;
import citbyui.cit260.sarahjanis.memory.exceptions.MenuException;
import citbyui.cit260.sarahjanis.memory.interfaces.DisplayInfo;
import java.io.IOException;
import java.util.Scanner;
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
     private StatusType gameStatus;
    
    // display the help menu and get the end users input selection
    public StatusType getInput(Player player1, Player player2) throws IOException, CardException, BoardException, MemoryException {
        
        do {
            try {
            this.display(); // display the menu
            
            String command = this.getCommand();
            
            switch (command) {
                case "P":
                    this.endMenuControl.playAgain(player1, player2);
                    break;
                case "M":
                    this.endMenuControl.displayMainMenu();
                    break;
                case "Q":
                    return StatusType.QUIT;
            }
            }
        catch(MenuException ex){
                       System.out.println(ErrorType.ERROR101.getMessage());
        }
        }
        while (gameStatus != StatusType.QUIT);  
        
         return gameStatus;
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
    private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
}