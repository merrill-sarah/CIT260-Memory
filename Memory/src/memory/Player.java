/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author - official version will be created by Sarah - this is just to make mine run
 */
// add score here?
public class Player {
    String name;
    int matchedGame = 0; 
    int totalWins = 0; 
    
    public Player(){
        
    }
    public void getName1() { 
        Scanner input = new Scanner(System.in);
        System.out.println("First Player, enter your name: ");
        this.name= input.next();
    }
    public void getName2() { 
        Scanner input = new Scanner(System.in);
        System.out.println("Second Player, enter your name: ");
        this.name= input.next();
    }
    public void displayScore(){
        System.out.println( name + ": " + matchedGame );
    }
    
}
