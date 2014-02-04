/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Janis
 */
public class Game {
    
    Player player1;  //use until 'official' Player class is created
    Player player2;
    GetMatchedStatus matchStatus;
    
    public Game(){
   /*     // HEAD
        this.player1 = new PlayerTemp();
        this.player1.name = "Player 1"; //default until new name is chosen
        this.player2 = new PlayerTemp();
        this.player2.name = "Player 2";//default until new name is chosen
=======*/
    this.player1 = new Player();
    this.player1.name = "Player 1"; //default until new name is chosen
    this.player2 = new Player();
    this.player2.name = "Player 2";//default until new name is chosen
//>>>>>>> origin/master
  
        int score; // this may be better coming from a class instead?
   
        String leader; // will be determined through score comparison
   // Board board;  Still needs to be created
    }
 
    
    public void getStatus(){
        Board board = new Board();
       int rows = board.getRows();
       
       
    //to change number of rows
        
     /*  
     Commented this stuff out because I did it in the board class and something
       in here was giving me an error because of it
       
        int column = board.getColumns();
        int cardTotal;  // should this go in the Board class?
      
      cardTotal = rows*column;
      
      GetMatchedStatus.getMatchedStatus(cardTotal);
      */
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
    public void startGame(){
        Player player1 = new Player();
        Player player2 = new Player();
        
        player1.getName1();
        player2.getName2();
        
        welcomePlayers(player1.name, player2.name);
        Board board = new Board();
        board.gridSize();
        numSymbolsNeeded(board.totalCards, board.matchDifficulty()); // calls the function and gets totalCards from Board board
                                    
       GetMatchedStatus matchedstatus = new GetMatchedStatus();
       matchedstatus.getMatchedStatus(board.totalCards, player1.name, player2.name);
        
        board.displayGrid();
    }
    public void welcomePlayers(String player1, String player2){
        System.out.println("\nHello " + player1 + " and " + 
                player2 + "! Welcome to Memory!");
    }
     // ************** FUNCTION FOR INDIVIDUAL ASSIGNMENT L03 *****************
      public void numSymbolsNeeded(int numCards, int matchingSymbols){
      int numOfSymbols;
     
      // ******** error checking ***********
        if ((numCards != 12) & (numCards != 24) & (numCards != 48)){
            System.out.println("Invalid entry. Please enter board size again");
           // board.gridSize();
           }   

        if (matchingSymbols != 2 & matchingSymbols != 4){
             System.out.println("Invalid entry. Please enter number of matching cards again");
             // board.matchDifficulty();
        }

        if (numCards % matchingSymbols !=4){
            System.out.println("Error. Please choose grid size and number of matching cards again");
                // function for repeating choices here
        }
            
      numOfSymbols = numCards / matchingSymbols;
      
      System.out.println( "\n\tYou need a total of " + numOfSymbols + " different symbols.");
      
      //matchingSymbols(board.matchDifficulty();
            
      //System.out.println( "numSymbolsNeeded Function - accessed!"); //to test function is working
      }
     
}
