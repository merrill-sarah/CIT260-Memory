/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Janis
 */
public class OptionsMenuControl {
    Board board = new Board();
    public OptionsMenuControl(){
        
    }
    
    public void displayBoardOption()/*Case B*/{
                  
        this.board.gridSize();
    }
    
    public void displayMatchingOption()/*Case M*/{
        this.board.matchDifficulty();
    }   
        
    public void displayNumPlayersOption()/*Case N*/{
       // this.board.matchDifficulty();
    }   
    
    public void displayPlayerNamesOption()/*Case P*/{
       // this.board.matchDifficulty();
    }   
}
