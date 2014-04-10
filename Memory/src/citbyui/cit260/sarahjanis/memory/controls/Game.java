/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.controls;

import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.enums.StatusType;
import citbyui.cit260.sarahjanis.memory.exceptions.BoardException;
import citbyui.cit260.sarahjanis.memory.exceptions.CardException;
import citbyui.cit260.sarahjanis.memory.exceptions.MemoryException;
import citbyui.cit260.sarahjanis.memory.frames.BoardLargeFrame;
import citbyui.cit260.sarahjanis.memory.frames.BoardMediumFrame;
import citbyui.cit260.sarahjanis.memory.frames.BoardSmallFrame;
import citbyui.cit260.sarahjanis.memory.frames.OptionFrame;
import citbyui.cit260.sarahjanis.memory.models.SymbolArray;
import citbyui.cit260.sarahjanis.memory.models.Player;
import citbyui.cit260.sarahjanis.memory.models.Card;
import citbyui.cit260.sarahjanis.memory.models.Board;
import citbyui.cit260.sarahjanis.memory.models.BioS;
import citbyui.cit260.sarahjanis.memory.models.BioJ;
import citbyui.cit260.sarahjanis.memory.models.MemoryError;
//import citbyui.cit260.sarahjanis.memory.views.EndMenuView;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
//import citbyui.cit260.sarahjanis.memory.views.BoardView;
//import citbyui.cit260.sarahjanis.memory.views.GetPlayerListView;




/**
 *
 * @author Janis
 */
public class Game implements Serializable {
  //  private GetPlayerListView playerList= new GetPlayerListView();
    private Player player1 = new Player();
    private Player player2 = new Player();
    BoardSmallFrame boardSm;
    BoardMediumFrame boardMd;
    BoardLargeFrame boardLg;
    private int numCards;
    private char cardSymbol;
    private int cardSelection;
    private int dupCheck;
    private int numPlayers=2;
    private StatusType status;
 
    
    
    
    public Game(){  
      
    }
    public void startGame(Board board, Player player1, Player player2, SymbolArray symbols ) throws IOException, CardException, BoardException, MemoryException{ 
                 
      
    board.setUp();
    char getSymbols [] = new char [board.getTotalCards()];
    getSymbols = symbols.createArray(board, getSymbols);
    MemoryError errorMsg = new MemoryError();
       
          switch (board.getSize()){
            case "s":
                 boardSm = new BoardSmallFrame(player1, player2, board, getSymbols);
                 boardSm.setVisible(true);
                 break;
            case "m":
                boardMd = new BoardMediumFrame(player1, player2, board, getSymbols);
                boardMd.setVisible(true);
                break;
            case "l":
                boardLg = new BoardLargeFrame(player1, player2, board, getSymbols);
                boardLg.setVisible(true);
                break;
            default: 
                errorMsg.displayError(ErrorType.ERROR102.getMessage());
            
                    }
        
    
    
    
        /*public void playGame(Player player1, Player player2, Board board) throws IOException, CardException, BoardException, MemoryException{
        
        SymbolArray symbols = new SymbolArray();
        //symbols.getInput();
        symbols.matchDifficulty(board);
        

        
         //create foundation array
        //symbols.createArray(board, getSymbols); //'sends' getSymbols changed by Reference
        
        
        
        //playersTurns(board, symbols, getSymbols, player1, player2);
        displayScore(player1, player2);
        System.out.println("");
        EndMenuView endMenuView = new EndMenuView();
        endMenuView.getInput(player1, player2);
       
        }
        
        
        
    
    private void welcomePlayers(String player1, String player2){
        
        System.out.println("\tWelcome to Memory!");
        
    }*/
    }
       
        public boolean cardStatus(char getSymbols[]){
            Card card = new Card();
            char []symbols = getSymbols;
            //char symbol1;
          //  char symbol2;
            char [] matchCk = new char [2];
            //int c = 0;
            int y = 0;
           while(y<2){
            for (int i = 0; i<card.getCardArray().length; i++)
                if(card.getCardArray()[i]== true){
                 matchCk[y] = symbols[i]; 
                 y++;
                }
           }
            if (matchCk[0] == matchCk[1]){
                return true;
            }
            else
                return false;
            
        }
            

        
        
        
        
        
       
        
   
        
                
                
      
        /*public void playersTurns(Board board, SymbolArray symbols, char getSymbols [], Player player1, Player player2) throws IOException, CardException, BoardException, MemoryException{
        
            
            
            
        boolean match = false;
        int totalMatchesMade = 0;
        numCards = board.getTotalCards();
        String name;
        int counter = 1;
        Card card1;
        Card card2;
        BoardView boardView = new BoardView(board, getSymbols);
        player1.setMatchedGame(0);
        player2.setMatchedGame(0);
       
        if (this.getStatus() != StatusType.START &&
                this.getStatus() != StatusType.PLAYING){
            throw new MemoryException(ErrorType.ERROR107.getMessage());
        }
        
      
        
         while (totalMatchesMade < symbols.getTotalMatches()){
           
             boardView.displayBoard(board, getSymbols);
           
             //determine player1 or player2
             if (counter % 2 != 0){
                 name = player1.getName();
             }
             else {
                 name = player2.getName();
             }
             
             //have player select two cards
             selectCard(board, getSymbols, name);//just picks the card GUI replaces
                card1=board.getDeck()[cardSelection-1];
                card1.setFlipped(true);
                
               
        boardView.displayBoard(board, getSymbols);       
       
        selectCard(board, getSymbols, name);
                card2 = board.getDeck()[cardSelection-1];
                card2.setFlipped(true);
            
             /*determine if a match was made and distribute point to player1 or 
                     player2 based on who's turn it is */   
            /* if (card1.getSymbol() == card2.getSymbol()){//should be using player1 and player 2 here as objects... not as evaluated values
                 match = true;
                 card1.setMatched(true);
                 card2.setMatched(true);
                 totalMatchesMade += 1;
                 System.out.println("You made a match!");
                 if (counter%2 !=0){
                     player1.setMatchedGame(player1.getMatchedGame() + 1);                     
                 }
                 else{
                 player2.setMatchedGame(player2.getMatchedGame() + 1);
             }
             }
             else{
                 match = false;
                 counter += 1;
                 System.out.println("Sorry, not a match.");
             }
             boardView.displayBoard(board, getSymbols);
            getMatchedStatus(board.getTotalCards(), match);
            card1.setFlipped(false);
            card2.setFlipped(false);
           
             
         }
      }  
        */


    private void selectCard(Board board, char getSymbols[], String name) throws IOException, CardException{
        Scanner in = new Scanner(System.in);
        boolean notDup = false;
      
        
        int index = 0;
        int numOfHints = 0;
        boolean validateInt = false;
        
        while (!validateInt){
            System.out.println();
            System.out.println(name +", Please enter the card number, or for a hint enter 0(zero): ");
      //      if (in.hasNextInt())
        try{
            String x =in.next();
            //cardSelection = in.nextInt();
            cardSelection = Integer.parseInt(x);
            
            
            validateInt = true;
        }
        catch (NumberFormatException e){ //to catch if a letter is entered instead of a number
            System.out.println();
            
            System.out.println(name +", "+ ErrorType.ERROR103.getMessage());
        }
            
          // ex.printStackTrace();
          /* System.out.println(ex.getMessage());
            //throw new CardException(ex.getMessage());
            System.out.println(ErrorType.ERROR103.getMessage());*/
        
           
/*
            else{
                in.nextLine();
                new MemoryError().displayError("Not a valid entry.");
            }*/
        } 
        
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
        
        if (cardSelection >= 1 && cardSelection <= board.getTotalCards()){ 
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
    
      private void getMatchedStatus(int gridSize, boolean match) throws IOException { 
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
      /*private void displayScore(Player player1, Player player2){ //move to Player class?
          numPlayers=2; //until we add option to have more than 2 players
          int index=0;
          int[] numWins = new int[numPlayers];
          
          //displays who made how many matched in the game
            System.out.println("\n" + player1.getName() + " made a total of " + player1.getMatchedGame() + " matches."
                    + "\n" + player2.getName() + " made a total of " + player2.getMatchedGame() + " matches.");
            
          //displays the winner and adds one to their running total of wins
            if (player1.getMatchedGame() < player2.getMatchedGame()){
                player2.setTotalWins(player2.getTotalWins() + 1);
                System.out.println("\n" + player2.getName() + " is the winner!");
              
            }
            else if (player1.getMatchedGame() > player2.getMatchedGame()){
                player1.setTotalWins(player1.getTotalWins() + 1);
                System.out.println("\n" + player1.getName() + " is the winner!");
              
              }
            else {
                System.out.println("\n" + player1.getName() + " and " + player2.getName() + " tied!");
              }
         
          //sets up array to hold the number of wins for each player
          while (index<numPlayers){
              if (index==0){
                  numWins[index]=player1.getTotalWins();
                  index++;
              }
              else if (index==1){
                  numWins[index]=player2.getTotalWins();
                  index++;
              }
              
          }
          
          //displays numWins array
          System.out.println("\nTotal Wins:");
          int j = 1;
          String name ="";
          for(int x: numWins){
              if(j==1){
                  name = player1.getName();
              }
              else if (j==2){
                  name = player2.getName();
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
      */
      //getter and setter functions
   // public GetPlayerListView getPlayerList() {
   //     return playerList;
   // }

   // public void setPlayerList(GetPlayerListView playerList) {
    //    this.playerList = playerList;
   // }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public int getNumCards() {
        return numCards;
    }

    public void setNumCards(int numCards) {
        this.numCards = numCards;
    }

    public char getCardSymbol() {
        return cardSymbol;
    }

    public void setCardSymbol(char cardSymbol) {
        this.cardSymbol = cardSymbol;
    }

    public int getCardSelection() {
        return cardSelection;
    }

    public void setCardSelection(int cardSelection) {
        this.cardSelection = cardSelection;
    }

    public int getDupCheck() {
        return dupCheck;
    }

    public void setDupCheck(int dupCheck) {
        this.dupCheck = dupCheck;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }
    
    public void rollCredits(){
    
    System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                 + "\n\t~~~~~~~~~~~~~~~CREDITS~~~~~~~~~~~~~~~~~~"
                 + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         
         BioJ janis = new BioJ("Janis", "Felsted", "Web Design and Development", "Online Bachelor's Degree",
         "Senior", "127", "FALL", "2016", "She" );
         janis.display();
         janis.getBio();
         BioS sarah = new BioS("Sarah", "Merrill", "Web Design and Development", "Bachelor's Degree",
         "Junior", "--", "FALL", "2015", "She" );
         sarah.display();
         sarah.getBio();
    
    }

    /**
     * @return the status
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusType status) {
        this.status = status;
    }
      
   
      } 
      
