/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Sarawr
 */
public class EndMenuControl implements Serializable{
    public void playAgain(Player player1, Player player2) throws IOException {
        Game anotherGame = new Game();
         anotherGame.playGame(player1, player2);
     }
 
     public void displayMainMenu() {
      
     }
    
}
