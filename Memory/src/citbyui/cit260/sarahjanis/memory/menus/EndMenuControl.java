/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.menus;

import java.io.IOException;
import memory.Game;
import memory.Player;

/**
 *
 * @author Sarawr
 */
public class EndMenuControl {
    public void playAgain(Player player1, Player player2) throws IOException {
        Game anotherGame = new Game();
         anotherGame.playGame(player1, player2);
     }
 
     public void displayMainMenu() {
      
     }
    
}
