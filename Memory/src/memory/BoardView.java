/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class BoardView {
   Board board;
   Card cards[][];
   
   
   
   public BoardView(Board board,char getSymbols[]){
   this.board = board;
   
        int gridNums = 1;
       int rows= board.rows; 
       int columns=board.columns;
       
       if (!(rows==3 && columns==4) & !(rows==4 && columns==6) & !(rows==6 && columns==8)){
           System.out.println("\t***********************************************************************************"
                   + "\n\tERROR: please enter \"s\" for small, \"m\" for medium, or \"l\" for large board size"
                   +"\n\t**************************************************************************************");
                   board.gridSize();
                   } 
       
       this.cards = new Card [rows][columns]; 
              
        int i = 0;
        int j = 0;
        int k = 0;
        for ( i=0; i<rows; i++){
            for ( j=0; j<columns; j++){
             Card inPlay = new Card();
             inPlay.symbol = getSymbols[k];
             k++;
             cards[i][j]=inPlay;
            }
        
        }
   }
   
    public void displayBoard(Board board) {
       int rows= board.rows; 
       int columns=board.columns;
       
         System.out.print("\t|"); 
         this.horizontalLn();
        for (int y = 1; y<= (rows*columns); y++){
           
             if (y%columns!=0){
                System.out.print("\t|\t"+ y);
                 }
                 else{
                     System.out.print("\t|\t" +y + "\t|");
                     System.out.print("\n\t|");
                     this.horizontalLn();
                     
                 } 
               
             }  
        }    
         
    
                 
       public void horizontalLn(){  
           int columns=board.columns;
           for (int i=0; i<columns; i++){
                         System.out.print("---------------|");
           }
           System.out.print("\n");
       }

}
       

 
        
        
        
