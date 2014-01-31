/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;



/**
 *
 * @author Sarah M and Janis F
 */
public class Memory {
    
     Player player1;
     Player player2;        
     
     String instructions = " Welcome to a game of Memory!"
            + "\n\tYou may play against the computer or"
             + " another player."
            + "\n\tBegin by choosing the options menu where "
             + "you will choose number of players and the level of difficulty"
             + "\n\tSelect Play, the game will begin, and you may select two cards."
            + "\n\tThe object of the game is to make the most matches."
             +"\n\tHave Fun!!"
             + "\n";
    
    public static void main(String[] args) {
        Memory myGame = new Memory();
        myGame.displayHelp();
        
        Player player1 = new Player();
        Player player2 = new Player();
        
        player1.getName1();
        player2.getName2();
        
        player1.welcomePlayer1();  
        player2.welcomePlayer2();
        
       GetMatchedStatus matchedstatus = new GetMatchedStatus();
       matchedstatus.getMatchedStatus(36);
        
        //myGame.scoreHeading();
        //player1.displayScore();
        //player2.displayScore();
        
        Board board = new Board();
        board.displayGrid();
        
        Card card1 = new Card();
        card1.status();
    }
    
              
    
    public void displayHelp(){
       System.out.println(this.instructions);        
    }
    public void scoreHeading(){
        System.out.println("\n\tCurrent Score:" );
    }
}
