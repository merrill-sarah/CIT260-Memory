/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
