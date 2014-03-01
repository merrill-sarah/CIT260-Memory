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

     public SymbolArray(){
       
   }
   
   public char[] createArray(Board board, char getSymbols[]){
      // int j = 0;
       
       char setSymbols[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'};
       
      // System.out.println("boardview.grid =  " +boardview.grid);
      // System.out.println("numSymbols is "+board.numSymbols+ "and numMatchingSymbols is" +board.numMatchingSymbols);
       
       for(int i = 0; i<board.numSymbols;i++){
           
            for(int c = 0;c<board.numMatchingSymbols;c++){
                getSymbols[i]=setSymbols[i];
              
            }
           }
       int j = 0;
       int grid = (board.columns * board.rows);
       while (j<grid){
           for (int i = 0; i<board.numSymbols;i++,j++){
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