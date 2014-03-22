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
public class HouseCats extends Mammals implements GoIndoors, CatchFood {
    
    public HouseCats(String type){
        super(type);
    }
    @Override
    public void spoiled(){
        System.out.print("I sleep all day on a soft cushion, but my gentle purr makes me worth it.\n");
    }
    
    @Override
    public void stalk(){
        System.out.print("I also catch a lot of what I eat.\n");
    }
}
