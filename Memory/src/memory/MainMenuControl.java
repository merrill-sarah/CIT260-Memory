/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Sarawr
 */
public class MainMenuControl implements Serializable{
    public MainMenuControl() {
        
    } 

    public void startGame() throws IOException /*Case S*/{
        Game newGame = new Game();
        newGame.startGame();
    }
    
    public void displayOptionMenu()/*Case O*/ {
        OptionMenuView optionMenuView = new OptionMenuView();
        optionMenuView.getInput();
    }
    public void displayHelpMenu()/*Case H*/ {     
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
    }
                            
}
