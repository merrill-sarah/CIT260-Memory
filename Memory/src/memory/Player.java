/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author - Sarawr
 */
public class Player {
    private String name;
    private int matchedGame = 0; 
    private int totalWins = 0; 
    
    public Player(){
        
    }
    public void getName1() { 
        Scanner input = new Scanner(System.in);
        System.out.println("First Player, enter your name: ");
        this.setName(input.next());
    }
    public void getName2() { 
        Scanner input = new Scanner(System.in);
        System.out.println("Second Player, enter your name: ");
        this.setName(input.next());
    }
    public void displayScore(){
        System.out.println( getName() + ": " + getMatchedGame() );
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the matchedGame
     */
    public int getMatchedGame() {
        return matchedGame;
    }

    /**
     * @param matchedGame the matchedGame to set
     */
    public void setMatchedGame(int matchedGame) {
        this.matchedGame = matchedGame;
    }

    /**
     * @return the totalWins
     */
    public int getTotalWins() {
        return totalWins;
    }

    /**
     * @param totalWins the totalWins to set
     */
    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }
    
}
