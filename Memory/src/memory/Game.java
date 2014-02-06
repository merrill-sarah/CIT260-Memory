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
    
    Player player1;  //use until 'official' Player class is created
    Player player2;
    GetMatchedStatus matchStatus;
    
    public Game(){
  
    this.player1 = new Player();
    this.player1.name = "Player 1"; //default until new name is chosen
    this.player2 = new Player();
    this.player2.name = "Player 2";//default until new name is chosen
//>>>>>>> origin/master
  
        int score; 
   
        String leader; // will be determined through score comparison
   // Board board;  Still needs to be created
    }
 
    
    public void getStatus(){
        Board board = new Board();
       int rows = board.getRows();
       
        }

    public void displayMatchesMade(){
        System.out.println(
             "\n\t*******************************************************************"
           + "\n\t" + this.player1 + "made " +this.player1.matchedGame+ " matches in this game."
           + "\n\t" + this.player2 + "made " +this.player2.matchedGame+ " matches in this game."
           + "\n\t" + this.player1 + "made " +this.player1.matchedOverall+ " matches in all."
           + "\n\t" + this.player2 + "made " +this.player2.matchedOverall+ " matches in all."
           + "\n\t*******************************************************************");
    }
   
    
    public void displayLeader(){
        System.out.println(
        "\n\t*******************************************************************"
       +"\n\tleader is in first place! Congratulations"  // will replace "leader" with leader variable
       +"\n\t*******************************************************************");
    }
    public void startGame() throws IOException{
        Player player1 = new Player();
        Player player2 = new Player();
        
        player1.getName1();
        player2.getName2();
        
        welcomePlayers(player1.name, player2.name);
        Board board = new Board();
        board.gridSize();
        numSymbolsNeeded(board.totalCards, board.matchDifficulty()); // calls the function and passes totalCards and matchDifficulty from board
                                    
       GetMatchedStatus matchedstatus = new GetMatchedStatus();
       matchedstatus.getMatchedStatus(board.totalCards, player1.name, player2.name);
        
        board.displayGrid();
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
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
   /* ************* moving this function here to remove unneeded Class -- in progress *********
      public static void getMatchedStatus(int gridSize,String player1,String player2) {
          String response; // player inputs whether a match or not using 't' or 'f'
          int numCards=gridSize;
          boolean match;
          double percentDone;
          
          
          Scanner input = new Scanner(System.in);
        
       
        System.out.println(player1 +", "
                + "Enter 't' if you made a match, or 'f' if you didn't; ");
        response= input.next();
          
       **** change if else if else to switch?*****   
          
      }*/
     
}
