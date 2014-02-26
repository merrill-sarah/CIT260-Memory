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
    int numOfSymbols;
    
    
    public Game(){  
       
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
        board.matchDifficulty();
        SymbolArray symbols = new SymbolArray();
        char getSymbols [] = new char [board.totalCards];
        symbols.createArray(board, getSymbols);
        //numSymbolsNeeded(board.totalCards, board.matchDifficulty()); // calls the function and passes totalCards and matchDifficulty from board
        
        playersTurns(board, getSymbols, player1, player2);
        displayScore(player1, player2);
        System.out.println("");
        EndMenuView endMenuView = new EndMenuView();
        endMenuView.getInput(player1, player2);
        }
        
    
    public void welcomePlayers(String player1, String player2){
        
        System.out.println("\tWelcome to Memory!");
        
    }
    
      public void numSymbolsNeeded(int numCards, int matchingSymbols){
      //numOfSymbols;
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
     public void playersTurns(Board board, char getSymbols [], Player player1, Player player2) throws IOException{
        char response;
        boolean match = false;
        int totalMatchesMade = 0;
        numCards = board.totalCards;
        String name;
        int counter = 1;
        
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
                 selectCard(board, getSymbols, name);
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

    public void selectCard(Board board, char getSymbols[], String name) throws IOException{
        
        Scanner in = new Scanner(System.in);
      //  while (!done){
        
        int index = 0;
        int numOfHints = 0;
        System.out.println(name + ", please enter the card number, or for a hint enter 0(zero): ");
        int cardSelection = in.nextInt();
        
        /*while (cardSelection==0 ){
          numOfHints++;  
          char hintLetter;
         System.out.println("What letter would you like to find? ");  
          hintLetter = (char)System.in.read();
          hintLetter = Character.toUpperCase(hintLetter);
       
          
           while (hintLetter-65 > getSymbols.length){
              
             System.out.println("Sorry your letter was not found"
                     + "\nPlease enter a letter between "+ getSymbols[0]+" and "+ getSymbols[getSymbols.length-1]);
             hintLetter = (char)System.in.read();
             hintLetter = Character.toUpperCase(hintLetter);
             }      
          
          
            for (char x :getSymbols){
             if (x == hintLetter){
                 break;}
             else{
                 index++;}
            }  
            
             if (hintLetter == getSymbols[index]){
                int card= (index +1);
             System.out.println("Your letter is under card number: "+(card));
            }
                        
             index = 0;
             if (numOfHints >2){
                 System.out.print("You have used all your hints. Please enter a card number");
                 cardSelection = in.nextInt();
                 while (cardSelection == 0){
                     System.out.print("Sorry, You have used all your hints. Please enter a card number");
                     cardSelection = in.nextInt();
                 }
             
             }
                 
             else{
                 System.out.print("Enter card number (or if you want a hint enter 0(zero)): ");
                 cardSelection = in.nextInt();
             }
         
        /*    System.out.println("you selected: " +cardSelection+ ""
                    + "\n"
                    + "Continue program as originally written");
          */  
         
            
            
             
             /*System.out.print(x + " ");
             
            //System.out.println("The index for " + fillSymbols[index]+ " is "+ index );
             index++;*/
            // if (x == )
         
        /*}
        
      
        
        System.out.println("The symbol on your card is :" +(char)(getSymbols[cardSelection]-1));
                */
      
        
        if (cardSelection >= 1 && cardSelection <= board.totalCards){      

            System.out.println("The symbol on the card is " + getSymbols[cardSelection-1] + ".");
        }
        else {        
          System.out.println("Not a valid card selection.");
          selectCard(board, getSymbols, name);
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
                (int)percentDone + "% of cards are matched now.");
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
      
      public void createSymbolArray(){
                    
    
      }
}