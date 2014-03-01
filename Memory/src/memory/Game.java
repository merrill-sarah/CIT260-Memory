/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
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
    char cardSymbol;
    int cardSelection;
    int dupCheck = -1;
 //   BoardView boardview;
    
    
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
        board.displayGridInfo();
        board.matchDifficulty();
        SymbolArray symbols = new SymbolArray();
        
        char getSymbols [] = new char [board.totalCards]; //create foundation array
        symbols.createArray(board, getSymbols); //'sends' getSymbols changed by Reference
        
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
        boolean match = false;
        int totalMatchesMade = 0;
        numCards = board.totalCards;
        String name;
        int counter = 1;
        Card card1;
        Card card2;
        BoardView boardView = new BoardView(board, getSymbols);
      
        
         while (totalMatchesMade < board.totalMatches){
           //  Card[] deck = new Card[board.totalCards];
             boardView.displayBoard(board, getSymbols);
           //  System.out.println("trying to print deck[1]"/* + deck[1]*/);
            // boardView.deck
             //determine player1 or player2
             if (counter % 2 != 0){
                 name = player1.name;
             }
             else {
                 name = player2.name;
             }
             
             //have player select two cards
             selectCard(board, getSymbols, name);
                card1=boardView.deck[cardSelection-1];
                card1.flipped = true;
                
                //*****************************************************
       
        boardView.displayBoard(board, getSymbols);       

        
                //******************************************************
             selectCard(board, getSymbols, name);
                card2 = boardView.deck[cardSelection-1];
                card2.flipped = true;
            
             /*determine if a match was made and distribute point to player1 or 
                     player2 based on who's turn it is */   
             if (card1.symbol == card2.symbol && counter % 2 != 0){
                 match = true;
                 card1.matched=true;
                 card2.matched=true;
                 totalMatchesMade += 1;
                 player1.matchedGame += 1;
                 System.out.println("You made a match!");
             } 
             else if (card1.symbol == card2.symbol && counter % 2 == 0){
                 match = true;
                 card1.matched=true;
                 card2.matched=true;
                 totalMatchesMade += 1;
                 player2.matchedGame += 1;
                 System.out.println("You made a match!");
             }
             else{
                 match = false;
                 counter += 1;
                 System.out.println("Sorry, not a match.");
             }
             boardView.displayBoard(board, getSymbols);
            getMatchedStatus(board.totalCards, match);
            card1.flipped=false;
            card2.flipped=false;
             
         }
      }  

    public void selectCard(Board board, char getSymbols[], String name) throws IOException{
        Scanner in = new Scanner(System.in);
        
       
        boolean notDup = false;
      
        
        int index = 0;
        int numOfHints = 0;
        System.out.println(name + ", please enter the card number, or for a hint enter 0(zero): ");
        cardSelection = in.nextInt();
        
      /*  while(!notDup)                 //Checks for card number duplication
        if (cardSelection== dupCheck){
            System.out.println("ERROR: card number duplication");
            System.out.println(name + ", please enter the card number, or for a hint enter 0(zero): ");
            cardSelection = in.nextInt();
        }
        else{
        notDup=true;
        }
        dupCheck = cardSelection;*/
        
        if (cardSelection >= 1 && cardSelection <= board.totalCards){ 
            cardSymbol = getSymbols[cardSelection-1];
             System.out.println("The symbol on the card is " + cardSymbol + ".");
        }
        else if (cardSelection==0){
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
            System.out.println("numOfHints = " + numOfHints);
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
            selectCard(board, getSymbols, name);
             }
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
          int numPlayers=2; //until we add option to have more than 2 players
          int index=0;
          int[] numWins = new int[numPlayers];
          
          //displays who made how many matched in the game
            System.out.println("\n" + player1.name + " made a total of " + player1.matchedGame + " matches."
                    + "\n" + player2.name + " made a total of " + player2.matchedGame + " matches.");
            
          //displays the winner and adds one to their running total of wins
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
         
          //sets up array to hold the number of wins for each player
          while (index<numPlayers){
              if (index==0){
                  numWins[index]=player1.totalWins;
                  index++;
              }
              else if (index==1){
                  numWins[index]=player2.totalWins;
                  index++;
              }
              
          }
          
          //displays numWins array
          System.out.println("\nTotal Wins:");
          int j = 1;
          String name ="";
          for(int x: numWins){
              if(j==1){
                  name = player1.name;
              }
              else if (j==2){
                  name = player2.name;
              }
              System.out.println(name + ": " + x);
              j++;
              }
          
          //find min and max of the array
          int min, max;
          
          min = max = numWins[0];
          for(int x: numWins){
              if(x<min) min = x;
              if(x>max) max = x;
          }
          System.out.println("\nThe player with the most wins has " + max +
                  "\nThe player with the least amount of wins has " + min);
          }
   
      } 
      