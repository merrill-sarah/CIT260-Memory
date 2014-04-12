/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sarahjanis.memory.controls;

import citbyui.cit260.sarahjanis.memory.models.Board;
import citbyui.cit260.sarahjanis.memory.models.MemoryError;
import citbyui.cit260.sarahjanis.memory.models.Player;
import citbyui.cit260.sarahjanis.memory.models.SymbolArray;

/**
 *
 * @author Janis
 */
public class OptionsMenuControl {
        
    public OptionsMenuControl(){
        
    }
    
public int inputCheck(SymbolArray symbols, Player player1, Player player2, Board board) {
    
    boolean namecheck = nameCheck(player1.getName());
    boolean namecheck2 = nameCheck(player2.getName());
    boolean boardSizeCheck = boardSizeCheck(board);
    boolean matchSymCheck = matchSymCheck(symbols);
    if(namecheck == false || namecheck2 == false){
        return 1;
    }
    if (matchSymCheck == false){
        return 2;
    }
    if (boardSizeCheck == false){
        return 3;
    }
     return 0;
}
    
private boolean nameCheck(String name){
        MemoryError errorMsg = new MemoryError();
        
            name = name.trim();
            
            if (name.length() < 1){
              return false;
            }
            else
                return true;
        }

private boolean boardSizeCheck(Board board){
     MemoryError errorMsg = new MemoryError();
    if (!"s".equals(board.getSize()) && !"m".equals(board.getSize()) && !"l".equals(board.getSize())){
       
        return false;
    }
    else
        return true;
}
private boolean matchSymCheck(SymbolArray symbols){
    MemoryError errorMsg = new MemoryError();
    if (symbols.getNumMatchingSymbols() != 2 && symbols.getNumMatchingSymbols() != 4) {
        
        return false;
    }
    else
        return true;
} 
    
}
