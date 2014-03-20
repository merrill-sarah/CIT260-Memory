/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;
import citbyui.cit260.sarahjanis.memory.interfaces.EnterInfo;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Janis
 */
public class SymbolArray implements Serializable, EnterInfo{
    private BoardView boardview;
    private float totalMatches;
    private float numSymbols;
    private int numMatchingSymbols;

     public SymbolArray(){
       
   }
    @Override
   public void getInput(){
       
       System.out.println("\nYou can change the difficulty by choosing whether there are 4 "
                + "of each kind of card, or 2 of each");
        
        
          Scanner matchChoice = new Scanner(System.in);
          
          System.out.println("Enter how many of each kind of card 2 or 4: ");
          setNumMatchingSymbols(matchChoice.nextInt());
   }
     
   public void matchDifficulty(Board board){
        setTotalMatches(board.getTotalCards()/2);
          
         if (getNumMatchingSymbols() == 2){
             setNumSymbols(getTotalMatches());
         }
         else if (getNumMatchingSymbols() == 4){
             setNumSymbols(getTotalMatches() / 2);
         }
         else{
             System.out.println("\tInvalid entry. Please enter '2' or '4'");
             matchDifficulty(board);
         }
           
     }  
   
   public char[] createArray(Board board, char getSymbols[]){
      // int j = 0;
       
       char setSymbols[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'};
       
             
       for(int i = 0; i<getNumSymbols();i++){
           
            for(int c = 0;c<getNumMatchingSymbols();c++){
                getSymbols[i]=setSymbols[i];
              
            }
           }
       int j = 0;  //duplicates the symbols in getSymbols depending on whether the user chooses 2 or 4 matching cards.
       int grid = (board.getColumns() * board.getRows());
       while (j<grid){
           for (int i = 0; i<getNumSymbols();i++,j++){
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
     * @return the boardview
     */
    public BoardView getBoardview() {
        return boardview;
    }

    /**
     * @param boardview the boardview to set
     */
    public void setBoardview(BoardView boardview) {
        this.boardview = boardview;
    }

    /**
     * @return the totalMatches
     */
    public float getTotalMatches() {
        return totalMatches;
    }

    /**
     * @param totalMatches the totalMatches to set
     */
    public void setTotalMatches(float totalMatches) {
        this.totalMatches = totalMatches;
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
