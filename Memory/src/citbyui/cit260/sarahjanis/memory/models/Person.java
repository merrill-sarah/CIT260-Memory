/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sarahjanis.memory.models;

import citbyui.cit260.sarahjanis.memory.models.Player;
import java.io.Serializable;

/**
 *
 * @author Sarawr
 */
public class Person extends Player implements Serializable {

    public Person(String n, int matches, int wins) {
        super(n, matches, wins);
        String name = n;
        
    }
   
    
}
