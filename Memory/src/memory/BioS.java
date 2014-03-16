/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Sarawr
 */
public class BioS extends Author{

    public BioS(String fN, String lN, String m, String l, String cLvl, String cr, String gSem, String gYr, String pn) {
        super(fN, lN, m, l, cLvl, cr, gSem, gYr, pn);
        fN = "Sarah";
        lN = "Merrill";
        m = "Web Design and Development";
        l = "";
        cLvl = "Junior";
        cr = "";
        gSem = "";
        gYr = "";
        pn = "She";
        
    }
    
    @Override
    public void getBio(){
    
        System.out.println("\n\t \"I hope you had fun playing Memory!  "
                + "\n\tI know I had a lot of fun creating it with Janis!\"");
       
        System.out.print("\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
    
}
