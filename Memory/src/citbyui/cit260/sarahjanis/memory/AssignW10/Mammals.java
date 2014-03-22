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
public class Mammals {
    private String run;
    private String type;
    
    public Mammals(String type){
    run = "I run fast!";
    
    }
    public void coat(){
        System.out.print( "My fur is soft.\n");
    }
    
    public void eat(){
        System.out.print( "I eat what my owner feeds me.\n");
    }

    /**
     * @return the run
     */
    public String getRun() {
        return run;
    }

    /**
     * @param run the run to set
     */
    public void setRun(String run) {
        this.run = run;
    }

    /**
     * @return the type
     */
    public String getType(String type) {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
            
            
            
            
    
}
