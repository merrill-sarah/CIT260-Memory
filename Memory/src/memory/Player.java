/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

import java.io.Serializable;

/**
 *
 * @author - Sarawr
 */
public  abstract class Player implements Serializable {
    private String name;
    private int matchedGame = 0; 
    private int totalWins = 0; 
    
    
    public Player(String n, int matches, int wins) {
        name = n;
        matchedGame = matches;
        totalWins = wins;
        
        
    }
    
    public abstract void showPersonStats();
    
    //return the name
    public String getName() {
        return name;
    }
    
    //receives the name to set
    public void setName(String name) {
        this.name = name;
    }
    //returns when a matched is made
    public int getMatchedGame() {
        return matchedGame;
    }
    //sets that a match was made
    public void setMatchedGame(int matchedGame) {
        this.matchedGame = matchedGame;
    }
    //returns totalWins
    public int getTotalWins() {
        return totalWins;
    }
    //sets for the player that won the game
    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }
    
}
