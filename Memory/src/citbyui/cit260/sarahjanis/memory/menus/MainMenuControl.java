/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.menus;

import citbyui.cit260.sarahjanis.memory.menus.HelpMenuView;
import java.io.IOException;
import memory.Game;

/**
 *
 * @author Sarawr
 */
public class MainMenuControl {
    public MainMenuControl() {
        
    } 

    public void startGame() throws IOException /*Case S*/{
        Game newGame = new Game();
        newGame.startGame();
    }
    
    public void displayOptionMenu()/*Case O*/ {
        OptionMenuView optionMenuView = new OptionMenuView();
        optionMenuView.executeCommands(null);
    }
    public void displayHelpMenu()/*Case H*/ {     
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.executeCommands(null);
    }
                            
}
