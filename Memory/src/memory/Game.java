/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class Game {
    Player player1 = new Player();
    Player player2 = new Player();
    
    public Game(){
  
        int score; 
   
        String leader; // will be determined through score comparison
   // Board board;  Still needs to be created
    }
    public void startGame() throws IOException{       
        player1.getName1();
        player2.getName2();
        
        welcomePlayers(player1.name, player2.name);
        Board board = new Board();
        board.gridSize();
        numSymbolsNeeded(board.totalCards, board.matchDifficulty()); // calls the function and passes totalCards and matchDifficulty from board
                                    
        BoardView boardView = new BoardView();
        boardView.displayBoard(board);
        selectCard(board);
        
        getMatchedStatus(board.totalCards, player1.name, player2.name);
        board.displayGrid();
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
        
        OptionMenuView optionMenuView = new OptionMenuView();
        optionMenuView.getInput();
    }
    
    public void displayMatchesMade(){
        System.out.println(
             "\n\t*******************************************************************"
           + "\n\t" + player1 + "made " + player1.matchedGame+ " matches in this game."
           + "\n\t" + player2 + "made " + player2.matchedGame+ " matches in this game."
           + "\n\t" + player1 + "made " + player1.matchedOverall+ " matches in all."
           + "\n\t" + player2 + "made " + player2.matchedOverall+ " matches in all."
           + "\n\t*******************************************************************");
    }
   
    
    public void displayLeader(){
        System.out.println(
        "\n\t*******************************************************************"
       +"\n\tleader is in first place! Congratulations"  // will replace "leader" with leader variable
       +"\n\t*******************************************************************");
    }
    public void welcomePlayers(String player1, String player2){
        System.out.println("\nHello " + player1 + " and " + 
                player2 + "! Welcome to Memory!");
        
    }

     // ************** FUNCTION FOR INDIVIDUAL ASSIGNMENT L03 *****************
    
      public void numSymbolsNeeded(int numCards, int matchingSymbols){
      int numOfSymbols;
      String errorMessage;
      
      errorMessage = ("\n\tError. Please choose grid size and number of matching cards again.");
     
      // ******** error checking of parameters***********
        if ((numCards != 12) & (numCards != 24) & (numCards != 48)){
            System.out.println("\n\tInvalid entry. Please enter board size again");
           // board.gridSize(); for re-entering choice
           }   

       // using short-circuit operators
        if ((numCards % matchingSymbols !=0) ||(matchingSymbols % 3==0)) {
            System.out.println(errorMessage);
                // use function for repeating choices here
        }
            
      numOfSymbols = numCards / matchingSymbols;
      
      System.out.println( "\n\tYou need a total of " + numOfSymbols + " different symbols.");
      
     
      }
             
    public void selectCard(Board board){
        int cardSymbol;
        int cardRow;
        int cardColumn; 
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of your card selection: ");
        int cardSelection = in.nextInt();
      
        
       int gridNums = 1;
       int rows= board.rows; //  pass these values in
       int columns=board.columns ;//  pass these values in
       int nums [][] = new int [rows][columns]; 
        
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++)
             nums[i][j] = gridNums++;
        } 
        
        if (cardSelection < 1 || cardSelection > board.totalCards){
            System.out.println("Not a valid card selection.");
        }
        else {
        cardRow = cardSelection/board.rows;
        cardColumn = (cardSelection - 1)%board.columns;
        
        cardSymbol = nums[cardRow][cardColumn];        

        System.out.println("The symbol on the card is " + cardSymbol + ".");
        }
} 
      public static void getMatchedStatus(int gridSize,String player1,String player2) throws IOException { 
        float percentDone;
        char response;
        String response2;
        boolean match = false;
        Scanner input = new Scanner(System.in);
        
       
        System.out.println(player1 +", "
                + "Enter 't' if you made a match, or 'f' if you didn't; ");
        response= (char)System.in.read();//input.next();
                        
        /**** change if else if else to switch?*****/
        if (response == 't') {
           match = true;   } 
        
           else if(response == 'f'){
                 match = false;
                   }
           else {
               System.out.println("ERROR! Invalid Entry: please enter 't' or 'f' (without quotes)");
           }    
       
	
	int numCards = gridSize;	

	if (match){ 
		numCards -= 2;
        }
	System.out.println(
                "\n\tnumber of matches left is: " + numCards/2);
        
        
        
        System.out.println(player2 + ", "
                + "Enter 't' if you made a match, or 'f' if you didn't; ");
        response2= input.next();
                        
        /**** change if else if else to switch?*****/
        if (response2.equals("t")) {
           match = true;   } 
        
           else if(response2.equals("f")){
                 match = false;
                   }
           else {
               System.out.println("ERROR! Invalid Entry: please enter 't' or 'f' (without quotes)");
           }    
       	

	if (match){ 
		numCards -= 2;
        }
	System.out.println(
                "\n\tnumber of matches left is: " + numCards/2);
        

	if (numCards == gridSize){ 
		System.out.println("0% of cards are matched");
        }
	else {
            percentDone=((float)(gridSize - numCards)/gridSize);
           
            percentDone =  (percentDone * 100); 
	    System.out.println(
                "\n\tnow " + (int)percentDone + "% of cards are matched.");
        }
        
    }
      
}
