/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class BoardView {
   Board board;
   Card deck[];
   
   
   
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
       
       this.deck = new Card [rows *columns]; 
       
        for ( int i =0; i<rows; i++){
             Card card = new Card();
             card.symbol = getSymbols[i];
            card.cardNumber= i+1;
             deck[i]=card;
            }
               
   }
   
    public void displayBoard(Board board,char getSymbols[], Card deck[]) {
       int rows= board.rows; 
       int columns=board.columns;
       
         System.out.print("\t|"); 
         this.horizontalLn();
         int i = 0;
        for (int y = 1; y<= (rows*columns); y++){
          
             if (y%columns!=0){
                System.out.print("\t|\t"+ getSymbols[i]);
             /* if (deck[i].flipped){
                    System.out.print(deck[i].symbol);
                }
                else if (deck[i].matched){
                    System.out.print(" ");
                }
                else{ 
                    System.out.print(deck[i].cardNumber);
                }*/
                i++;
                 }
             else{
                 System.out.print("\t|\t" +getSymbols[i] + "\t|");
                 i++;
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
       

 
        
        
        
