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
 * @authors Sarah M and Janis F
 */
public class Memory {
          
     String instructions = " Welcome to a game of Memory!"
            + "\n\tYou may play against the computer or"
             + " another player."
            + "\n\tBegin by choosing the options menu where "
             + "you will choose number of players and the level of difficulty"
             + "\n\tSelect Play, the game will begin, and you may select two cards."
            + "\n\tThe object of the game is to make the most matches."
             +"\n\tHave Fun!!"
             + "\n";
    
    public static void main(String[] args) throws IOException {
        Memory myGame = new Memory();
        myGame.displayHelp();
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.getInput();
        
    }
    
    public void displayHelp(){
       System.out.println(this.instructions);        
    }
}