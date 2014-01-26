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
  
        int score;
   
        String leader; // will be determined through score comparison
   // Board board;  Still needs to be created
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
}
