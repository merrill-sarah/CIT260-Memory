/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.io.Serializable;

/**
 *
 * @author Sarawr
 */
public class Person extends Player implements Serializable {
    private String name;
    private int matchedGame = 0; 
    private int totalWins = 0;

    public Person(String n, int matches, int wins) {
        super(n, matches, wins);
        String name = n;
        
    }
    
  public void showPersonStats(){
      System.out.print(name + " currently has " + matchedGame + " matches this "
              + "game and has won a total of " + totalWins + "wins.");
  } 
    
}
