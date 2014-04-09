/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.models;

import java.io.Serializable;

/**
 *
 * @author - Sarawr
 */
public class Player implements Serializable {
    private String name;
    private int matches = 0; 
    private int totalWins = 0; 
    
    
    public Player() {      
        
    }
    
    
    //return the name
    public String getName() {
        return name;
    }
    
    //receives the name to set
    public void setName(String name) {
        this.name = name;
    }
    //returns when a matched is made
    public int getMatches() {
        return matches;
    }
    //sets that a match was made
    public void setMatches(int matches) {
        this.matches = matches;
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
