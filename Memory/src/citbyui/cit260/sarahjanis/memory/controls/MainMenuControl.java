/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.controls;

import citbyui.cit260.sarahjanis.memory.exceptions.BoardException;
import citbyui.cit260.sarahjanis.memory.exceptions.CardException;
import citbyui.cit260.sarahjanis.memory.menus.HelpMenuView;
import citbyui.cit260.sarahjanis.memory.menus.HelpMenuView;
import citbyui.cit260.sarahjanis.memory.menus.OptionMenuView;
import java.io.IOException;

/**
 *
 * @author Sarawr
 */
public class MainMenuControl {
    public MainMenuControl() {
        
    } 

    public void startGame() throws IOException, CardException, BoardException /*Case S*/{
      try{  Game newGame = new Game();
        newGame.startGame();}
        catch (NumberFormatException ex){
                throw new NumberFormatException("please enter a number janis");
                }
    }
    
    public void displayOptionMenu()/*Case O*/ {
        OptionMenuView optionMenuView = new OptionMenuView();
        optionMenuView.getInput(null);
    }
    public void displayHelpMenu()/*Case H*/ {     
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput(null);
    }
                            
}
