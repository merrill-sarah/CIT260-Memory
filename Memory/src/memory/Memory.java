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
    
     String name;
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
        myGame.getName();
        myGame.displayHelp();
        
        Board board = new Board();
        board.displayGrid() // will need to rename after pulling board class
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    public void displayHelp(){
       System.out.println("\nWelcome " + this.name + "\n");
       System.out.println(this.instructions);        
    }
   
}
