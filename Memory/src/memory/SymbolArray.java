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
public class SymbolArray {
    
     public SymbolArray(){
       
   }
   
   public void createArray(char getSymbols[]){
       
       char setSymbols[] = {'A','B','C','D','E','F','G','H','I','J','K','L','A','B','C','D','E','F','G','H','I','J','K','L'};
       for(int i=0; i<getSymbols.length;i++ ){
        getSymbols[i]= setSymbols[i];
       }
       
       System.out.println();
   }
    
} // end SymbolArray class
