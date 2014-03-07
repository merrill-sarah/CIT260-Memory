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
    // does this belong here? in Board? in Game?
  // 
   
   
   public BoardView(Board board,char getSymbols[]){  
   this.board = board;
   
        //int gridNums = 1;
       int rows= board.rows; 
       int columns=board.columns;
       int gridNums = (board.rows * board.columns);
       
       if (!(rows==3 && columns==4) & !(rows==4 && columns==6) & !(rows==6 && columns==8)){
           System.out.println("\t***********************************************************************************"
                   + "\n\tERROR: please enter \"s\" for small, \"m\" for medium, or \"l\" for large board size"
                   +"\n\t**************************************************************************************");
                   board.gridSize();
                   } 
       
       board.deck = new Card [gridNums]; 
       
       
        for ( int i =0; i<gridNums; i++){
             Card card = new Card();
             card.symbol = getSymbols[i];
             card.cardNumber= i+1;
            // card.matchString = " ";
             board.deck[i]=card;
            }
     
   }  //end of constructor: BoardView(Board board,char getSymbols[]
   
    public void displayBoard(Board board,char getSymbols[]) {
       int rows= board.rows; 
       int columns=board.columns;
       
         System.out.print("\t|"); 
         horizontalLn();
         int i = 0;
        for (int y = 1; y<= (rows*columns); y++){ 
            if (y%columns!=0){
                System.out.print("\t|\t");
                if (board.deck[i].flipped){
                    System.out.print(board.deck[i].symbol);
                }
                else if (board.deck[i].matched){
                    System.out.print(" ");//(deck[i].matchString);
                }
                else{ 
                    System.out.print(board.deck[i].cardNumber);
                    
                }
                i++;}
            else{
                 System.out.print("\t|\t");// +getSymbols[i] +
                 if (board.deck[i].flipped){
                    System.out.print(board.deck[i].symbol);
                }
                else if (board.deck[i].matched){
                    System.out.print(" ");//(deck[i].matchString);
                }
                else{ 
                    System.out.print(board.deck[i].cardNumber);
                }
                 System.out.print("\t|");
                 i++;
                 System.out.print("\n\t|");
                 horizontalLn();
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


       

 
        
        
        
