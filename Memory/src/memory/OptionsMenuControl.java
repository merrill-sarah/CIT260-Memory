/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

/**
 *
 * @author Janis
 */
public class OptionsMenuControl {
    Board board = new Board();
    Player player = new Player();
    SymbolArray symbolArr = new SymbolArray();
    
    
    public OptionsMenuControl(){
        
    }
    
    public void displayBoardOption()/*Case B*/{
                  
        this.board.gridSize();
    }
    
    public void displayMatchingOption()/*Case M*/{
        this.symbolArr.matchDifficulty(board);
    }   
        
    public void displayNumPlayersOption()/*Case N*/{
      //  System.out.println("You will get to choose 2 players, or to play against the computer."
      //          + "\nThis method is still under construction."
      //          + "\nBut THE MENU WORKS!!");
                     
    }   
    
    public void displayPlayerNamesOption()/*Case P*/{
       
    }   
}
