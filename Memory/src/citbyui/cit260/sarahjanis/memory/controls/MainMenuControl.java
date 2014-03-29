/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.controls;

import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.exceptions.BoardException;
import citbyui.cit260.sarahjanis.memory.exceptions.CardException;
import citbyui.cit260.sarahjanis.memory.exceptions.MemoryException;
import citbyui.cit260.sarahjanis.memory.views.HelpMenuView;
import citbyui.cit260.sarahjanis.memory.views.OptionMenuView;
import java.io.IOException;

/**
 *
 * @author Sarawr
 */
public class MainMenuControl {
    public MainMenuControl() {
        
    } 

    public void startGame() throws IOException, CardException, BoardException, MemoryException /*Case S*/{
      try{  Game newGame = new Game();
        newGame.startGame();}
        catch (NumberFormatException ex){
                throw new NumberFormatException(ErrorType.ERROR106.getMessage());
                }
    }
    
    public void displayOptionMenu()/*Case O*/ {
        OptionMenuView optionMenuView = new OptionMenuView();
        optionMenuView.getInput(null);
    }
    public void displayHelpMenu()/*Case H*/ {     
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput(this);
    }
                            
}
