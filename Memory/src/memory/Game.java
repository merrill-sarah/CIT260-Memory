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
    Player player1;
    Player player2;
  
    int score;
    int matchedPairs1 = 0;
    int matchedPairs2 = 0;
    int matchedPairsTotal1 = 0;
    int matchedPairsTotal2 = 0;
    String leader;
    Board board;
    
    public void displayPlayers(){
        System.out.println("");
    }

    public void displayMatchesMade(){
        System.out.println(
             "\n\t*******************************************************************"
           + "\n\t" + this.player1 + "made " +matchedPairs1+ " matches in this game."
           + "\n\t" + this.player2 + "made " +matchedPairs2+ " matches in this game."
           + "\n\t" + this.player1 + "made " +matchedPairsTotal1+ " matches in all."
           + "\n\t" + this.player2 + "made " +matchedPairsTotal2+ " matches in all."
           + "\n\t*******************************************************************");
    }
   
    
    public void displayLeader(){
        System.out.println(
        "\n\t*******************************************************************"
       +"\n\t" + leader + " is in first place! Congratulations"
       +"\n\t*******************************************************************");
    }
}