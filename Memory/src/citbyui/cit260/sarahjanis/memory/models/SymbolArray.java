/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.models;
import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.exceptions.BoardException;
import java.io.Serializable;
import java.util.*;
//import citbyui.cit260.sarahjanis.memory.views.BoardView;

/**
 *
 * @author Janis
 */
public class SymbolArray implements Serializable{
    private float numSymbols;
    private int numMatchingSymbols;

     public SymbolArray(){
       
   }
     
   public void matchDifficulty(Board board) throws BoardException{
          
           
     }  
   
   public char[] createArray(Board board, char getSymbols []) throws BoardException{
                  
         if (numMatchingSymbols == 2){
             numSymbols = board.getTotalMatches();
         }
         else if (numMatchingSymbols == 4){
             numSymbols = board.getTotalMatches()/2;
         }
         else{
           throw new BoardException(ErrorType.ERROR204.getMessage());
         }
       
       char setSymbols[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'};
       
             
       for(int i = 0; i<numSymbols;i++){
           
            for(int c = 0;c<numMatchingSymbols;c++){
                getSymbols[i]=setSymbols[i];
              
            }
           }
       int j = 0;  //duplicates the symbols in getSymbols depending on whether the user chooses 2 or 4 matching cards.
       int grid = (board.getTotalCards());
       while (j<grid){
           for (int i = 0; i<numSymbols;i++,j++){
               getSymbols[j]=getSymbols[i];
           }
       }
       
       shuffleArray(getSymbols);
       
       return getSymbols;
     
   }
   
   public void shuffleArray(char getSymbols[]){
       Random rnd = new Random();
    for (int i = getSymbols.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      char a = getSymbols[index];
      getSymbols[index] = getSymbols[i];
      getSymbols[i] = a;
    }
    }

    

    /**
     * @return the numSymbols
     */
    public float getNumSymbols() {
        return numSymbols;
    }

    /**
     * @param numSymbols the numSymbols to set
     */
    public void setNumSymbols(float numSymbols) {
        this.numSymbols = numSymbols;
    }

    /**
     * @return the numMatchingSymbols
     */
    public int getNumMatchingSymbols() {
        return numMatchingSymbols;
    }

    /**
     * @param numMatchingSymbols the numMatchingSymbols to set
     */
    public void setNumMatchingSymbols(int numMatchingSymbols) {
        this.numMatchingSymbols = numMatchingSymbols;
    }
}
