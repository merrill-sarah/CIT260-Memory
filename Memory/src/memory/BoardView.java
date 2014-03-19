/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;



/**
 *
 * @author Janis
 */
public class BoardView {
   
   public BoardView(Board board,char getSymbols[]){    
   
       
       int rows= board.getRows(); 
       int columns=board.getColumns();
       int gridNums = (rows * columns);
       
       if (!(rows==3 && columns==4) & !(rows==4 && columns==6) & !(rows==6 && columns==8)){
           System.out.println("\t***********************************************************************************"
                   + "\n\tERROR: please enter \"s\" for small, \"m\" for medium, or \"l\" for large board size"
                   +"\n\t**************************************************************************************");
                   board.getInput();
                   board.gridSize();
                   } 
       
       board.setDeck(new Card [gridNums]); 
       
       
        for ( int i =0; i<gridNums; i++){
             Card card = new Card();
             card.setSymbol(getSymbols[i]);
             card.setCardNumber(i+1);
             board.getDeck()[i]=card;
            }
     
   }  //end of constructor: BoardView(Board board,char getSymbols[]
   
    public void displayBoard(Board board,char getSymbols[]) {
       int rows= board.getRows(); 
       int columns=board.getColumns();
       
         System.out.print("\t|"); 
         horizontalLn(board);
         int i = 0;
        for (int y = 1; y<= (rows*columns); y++){ 
            if (y%columns!=0){
                System.out.print("\t|\t");
                if (board.getDeck()[i].isFlipped()){
                    System.out.print(board.getDeck()[i].getSymbol());
                }
                else if (board.getDeck()[i].isMatched()){
                    System.out.print(" ");//(deck[i].matchString);
                }
                else{ 
                    System.out.print(board.getDeck()[i].getCardNumber());
                    
                }
                i++;}
            else{
                 System.out.print("\t|\t");// +getSymbols[i] +
                 if (board.getDeck()[i].isFlipped()){
                    System.out.print(board.getDeck()[i].getSymbol());
                }
                else if (board.getDeck()[i].isMatched()){
                    System.out.print(" ");//(deck[i].matchString);
                }
                else{ 
                    System.out.print(board.getDeck()[i].getCardNumber());
                }
                 System.out.print("\t|");
                 i++;
                 System.out.print("\n\t|");
                 horizontalLn(board);
                 } 
             }  
        }    
         
    
                 
       private void horizontalLn(Board board){  
           int columns=board.getColumns();
           for (int i=0; i<columns; i++){
                         System.out.print("---------------|");
           }
           System.out.print("\n");
       }
                    
       }


       

 
        
        
        
