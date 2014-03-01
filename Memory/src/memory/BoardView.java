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
       
       this.deck = new Card [gridNums]; 
       
       
        for ( int i =0; i<gridNums; i++){
             Card card = new Card();
             card.symbol = getSymbols[i];
             card.cardNumber= i+1;
             card.matchString = " ";
             deck[i]=card;
            }
       /* ERROR CHECKING
        for(Card d: deck){
            System.out.print(" " +d.cardNumber);
        }
        for (int i = 0; i<deck.length; i++){
            if (deck[i].flipped){
            System.out.print(deck[i].symbol);}
            else{
            System.out.print("-ha-");
            }
        }*/
        
     
   }  //end of constructor: BoardView(Board board,char getSymbols[]
   
    public void displayBoard(Board board,char getSymbols[], Card deck[]) {
       int rows= board.rows; 
       int columns=board.columns;
       
         System.out.print("\t|"); 
         horizontalLn();
         int i = 0;
        for (int y = 1; y<= (rows*columns); y++){ 
            if (y%columns!=0){
                System.out.print("\t|\t");
                if (deck[i].flipped){
                    System.out.print(deck[i].symbol);
                }
                else if (deck[i].matched){
                    System.out.print(deck[i].matchString);
                }
                else{ 
                    System.out.print(deck[i].cardNumber);
                    
                }
                i++;}
            else{
                 System.out.print("\t|\t");// +getSymbols[i] +
                 if (deck[i].flipped){
                    System.out.print(deck[i].symbol);
                }
                else if (deck[i].matched){
                    System.out.print(deck[i].matchString);
                }
                else{ 
                    System.out.print(deck[i].cardNumber);
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
       

 
        
        
        
