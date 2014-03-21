/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sarahjanis.memory.models;

import citbyui.cit260.sarahjanis.memory.models.Author;

/**
 *
 * @author Janis
 */
public class BioJ extends Author{
    
    public BioJ(String fN, String lN, String m, String l, String cLvl,
           String cr, String gSem, String gYr, String pn){
    super(fN, lN,  m, l, cLvl, cr,  gSem,  gYr,  pn);   
    
    }
    
    @Override
    public void getBio(){
    
        System.out.println("\n\t \"I hope you've enjoyed our game! "
                + "\n\tI had a lot of fun creating it with Sarah!\"");
       
        System.out.print("\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

}