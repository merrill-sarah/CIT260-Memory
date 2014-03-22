/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sarahjanis.memory.AssignW10;

/**
 *
 * @author Janis
 */
public class Dogs extends Mammals implements DoWork {
    
    public Dogs(String type){
        super(type);
    }
    public void work(){
        System.out.print("I work with the police, I help the disabled, and I can be a good hunting companion.");
    }
    
}
