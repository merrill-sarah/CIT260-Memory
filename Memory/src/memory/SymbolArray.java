/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;
import java.util.*;

/**
 *
 * @author Janis
 */
public class SymbolArray {

     public SymbolArray(){
       
   }
   
   public void createArray(Board board, char getSymbols[]){
       int j = 0;
       
       char setSymbols[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'};
       for(int i = 0; i<board.numSymbols;i++){
           
            for(int c = 0;c<board.numMatchingSymbols;c++){
                getSymbols[j]=setSymbols[i];
                j++;
            }
           }
       shuffleArray(getSymbols);
     
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
