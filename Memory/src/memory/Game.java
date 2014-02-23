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
    GetPlayerListView playerList= new GetPlayerListView();
    Player player1 = new Player();
    Player player2 = new Player();
    int numCards;
    
    
    public Game(){
  
        int score; 
   
        String leader; // will be determined through score comparison
   // Board board;  Still needs to be created
    }
    public void startGame() throws IOException{       
      
        playerList.getInputNames();
        
        player1.name=playerList.listOfPlayerNames[0];
        player2.name=playerList.listOfPlayerNames[1];
        
        welcomePlayers(player1.name, player2.name);
        playGame(player1,player2);
        
   }
    public void playGame(Player player1, Player player2) throws IOException{
        Board board = new Board();
        board.gridSize();
        numSymbolsNeeded(board.totalCards, board.matchDifficulty()); // calls the function and passes totalCards and matchDifficulty from board
        
        playersTurns(board, player1, player2);
        displayScore(player1, player2);
         System.out.println("");
        EndMenuView endMenuView = new EndMenuView();
        endMenuView.getInput(player1, player2);
        
        
    }
    
    public void welcomePlayers(String player1, String player2){
        System.out.println("\nHello " + player1 + " and " + 
                player2 + "! Welcome to Memory!");
        
    }

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
     public void playersTurns(Board board, Player player1, Player player2) throws IOException{
        char response;
        boolean match = false;
        int totalMatchesMade = 0;
        numCards = board.totalCards;
        String name;
        int counter = 1;
        player1.matchedGame = 0;
        player2.matchedGame = 0;
        
         while (totalMatchesMade < board.totalMatches){
             BoardView boardView = new BoardView();
             boardView.displayBoard(board);
             
             //determine player1 or player2
             if (counter % 2 != 0){
                 name = player1.name;
             }
             else {
                 name = player2.name;
             }
             
             //have player select two cards
             for (int i=0; i<2; i++){
                 selectCard(board, name);
                 }
             
             /*determine if a match was made and distribute point to player1 or 
                     player2 based on who's turn it is */
            System.out.println(name +", "
                + "Enter 't' if you made a match, or 'f' if you didn't; ");
            response = (char)System.in.read();
                                    
            if (response == 't' && counter % 2 != 0) {
                match = true;
                totalMatchesMade += 1;
                player1.matchedGame += 1;
            }
            else if (response == 't' && counter % 2 == 0){
                match = true;
                totalMatchesMade += 1;
                player2.matchedGame += 1;
            }
            else if(response == 'f'){
                    match = false;
                    counter += 1;
                   }
            else {
                    System.out.println("ERROR! Invalid Entry: please enter 't' or 'f' (without quotes)");
           }    
            getMatchedStatus(board.totalCards, match);
             
         }
      }  
     
    public void selectCard(Board board, String name){
        int cardSymbol;
        int cardRow;
        int cardColumn; 
        
        Scanner in = new Scanner(System.in);
        System.out.println(name + ", please enter the number of your card selection: ");
        int cardSelection = in.nextInt();
      
        
       int gridNums = 1;
       int rows= board.rows; //  pass these values in
       int columns=board.columns ;//  pass these values in
       int nums [][] = new int [rows][columns]; 
        
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++)
             nums[i][j] = gridNums++;
        } 
        
        if (cardSelection >= 1 && cardSelection <= board.totalCards){
            cardRow = (cardSelection-1)/board.columns;
            cardColumn = (cardSelection - 1)%board.columns;
        
            cardSymbol = nums[cardRow][cardColumn];        

            System.out.println("The symbol on the card is " + cardSymbol + ".");
        }
        else {        
            System.out.println("Not a valid card selection.");
        }
} 
      public void getMatchedStatus(int gridSize, boolean match) throws IOException { 
        float percentDone;	

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
      public void displayScore(Player player1, Player player2){
          
          System.out.println("\n" + player1.name + " made a total of " + player1.matchedGame + " matches."
                  + "\n" + player2.name + " made a total of " + player2.matchedGame + " matches.");
          
          if (player1.matchedGame < player2.matchedGame){
              player2.totalWins += 1;
              System.out.println("\n" + player2.name + " is the winner!");
              
          }
          else if (player1.matchedGame > player2.matchedGame){
              player1.totalWins +=1;
              System.out.println("\n" + player1.name + " is the winner!");
              
            }
          else {
              System.out.println("\n" + player1.name + " and " + player2.name + "tied!");
            }
         
          }
   
}