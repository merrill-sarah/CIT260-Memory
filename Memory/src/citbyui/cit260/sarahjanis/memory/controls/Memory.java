/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.controls;

import citbyui.cit260.sarahjanis.memory.AssignW10.Dogs;
import citbyui.cit260.sarahjanis.memory.AssignW10.Horses;
import citbyui.cit260.sarahjanis.memory.AssignW10.HouseCats;
import citbyui.cit260.sarahjanis.memory.menus.MainMenuView;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;



/**
 *
 * @authors Sarah M and Janis F
 */
public class Memory implements Serializable {
          
    private final static String instructions = " Welcome to a game of Memory!"
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
        mainMenuView.getInput(myGame);
        
      Horses horsey = new Horses("horse");
      System.out.println("I am a "+horsey.getType("horse")+" and " +horsey.getRun());
       horsey.coat();
       horsey.eat();
       horsey.work();
       System.out.println();
       
       HouseCats kitty = new HouseCats("cat");
       System.out.println("I am a " +kitty.getType("cat")+ " and " +kitty.getRun());
       kitty.coat();       
       kitty.eat();
       kitty.stalk();
       kitty.spoiled();
       System.out.println();
       
       Dogs dog = new Dogs("dog");
       System.out.println("I am a " +dog.getType("dog")+ " and " +dog.getRun());
       dog.coat();
       dog.eat();
       dog.work();
       System.out.println();
    }
    
    public void displayHelp(){
       System.out.println(Memory.instructions);        
    }
}