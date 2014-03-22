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
public class Horses extends Mammals implements DoWork{
    
    public Horses(String type){
        super(type);
    }
    @Override
    public void coat(){
        System.out.print( "I don't have fur. My hair is course.\n");
    }
    @Override
    public void work(){
        System.out.print( "I pull a wagon for Young Adult activities.\n");
    }
}
