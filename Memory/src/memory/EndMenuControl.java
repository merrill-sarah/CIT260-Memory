/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



 package memory;
 
 import java.io.IOException;

 
 public class EndMenuControl {
     
     public void playAgain(Player player1, Player player2) throws IOException{
        Game anotherGame = new Game();
         anotherGame.playGame(player1, player2);
     }
 
     void displayMainMenu() {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
 
 }
    

