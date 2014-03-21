/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.menus; 

import citbyui.cit260.sarahjanis.memory.models.Board;
import citbyui.cit260.sarahjanis.memory.models.SymbolArray;


/**
 *
 * @author Janis
 */
public class OptionsMenuControl {
    Board board = new Board();
    SymbolArray symbolArr = new SymbolArray();
    
    
    public OptionsMenuControl(){
        
    }
    
    public void displayBoardOption()/*Case B*/{
          System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                  + "\n\t~ You have a choice of three board sizes. ~"
                  + "\n\t~     Small has 12 cards ( 6 matches)     ~"
                  + "\n\t~    Medium has 24 cards (12 matches)     ~"
                  + "\n\t~     Large has 48 cards (24 matches)     ~"
                  + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");        
        //this.board.gridSize();
    }
    
    public void displayMatchingOption()/*Case M*/{
        System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n\t~ You can change the difficulty of the game ~"
                + "\n\t~      by choosing whether there are        ~"
                + "\n\t~       2 or 4 of each kind of card.        ~"
                + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
       // this.symbolArr.matchDifficulty(board);
    }   
        
    public void displayNumPlayersOption()/*Case N*/{
      //  System.out.println("You will get to choose 2 players, or to play against the computer."
      //          + "\nThis method is still under construction."
      //          + "\nBut THE MENU WORKS!!");
                     
    }   
    
    public void displayPlayerNamesOption()/*Case P*/{
       
    }   
}
