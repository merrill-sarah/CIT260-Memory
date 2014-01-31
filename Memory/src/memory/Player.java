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
    int matchedGame = 0; //default starts at zero
    int matchedOverall = 0; //default starts at zero
    
    public Player(){
        //counts matches in a game not exactly sure how to code. 
        //if(player get a match) {
        //matchedGame = matchedGame + 1;
        // }
        //
    }
    public void getName1() { 
        Scanner input = new Scanner(System.in);
        System.out.println("First Player, Enter your name: ");
        this.name= input.next();
    }
    public void getName2() { 
        Scanner input = new Scanner(System.in);
        System.out.println("Second Player, Enter your name: ");
        this.name= input.next();
    }
    public void welcomePlayer1(){
        System.out.println("\nHello " + name + "!");
    }
    public void welcomePlayer2(){
        System.out.println("And hello " + name +"!");
    }
    public void displayScore(){
        System.out.println( name + ": " + matchedGame );
    }
    
}
