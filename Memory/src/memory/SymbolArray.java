/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;
import java.util.*;

/**
 *
 * @author Janis
 */
public class SymbolArray {
    BoardView boardview;
    float totalMatches;
    float numSymbols;
    public int numMatchingSymbols;

     public SymbolArray(){
       
   }
   public void matchDifficulty(Board board){
       totalMatches = board.totalCards/2;
       System.out.println("\nYou can change the difficulty by choosing whether there are 4 "
                + "of each kind of card, or 2 of each");
        
        
          Scanner matchChoice = new Scanner(System.in);
          
          System.out.println("Enter how many of each kind of card 2 or 4: ");
          numMatchingSymbols = matchChoice.nextInt();
          
         if (numMatchingSymbols == 2){
             numSymbols = totalMatches;
         }
         else if (numMatchingSymbols == 4){
             numSymbols = totalMatches/2;
         }
         else{
             System.out.println("\tInvalid entry. Please enter '2' or '4'");
             matchDifficulty(board);
         }
           
     }  
   public char[] createArray(Board board, char getSymbols[]){
      // int j = 0;
       
       char setSymbols[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'};
       
             
       for(int i = 0; i<numSymbols;i++){
           
            for(int c = 0;c<numMatchingSymbols;c++){
                getSymbols[i]=setSymbols[i];
              
            }
           }
       int j = 0;  //duplicates the symbols in getSymbols depending on whether the user chooses 2 or 4 matching cards.
       int grid = (board.columns * board.rows);
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
}
