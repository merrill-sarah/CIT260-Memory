/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.controls;

import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.exceptions.MenuException;
import citbyui.cit260.sarahjanis.memory.frames.MainFrame;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;



/**
 *
 * @authors Sarah M and Janis F
 */

public class Memory implements Serializable {
     public static MainFrame mainFrame = null;
          
 
    public static void main(String[] args) throws IOException, MenuException {
         Memory memory = null;
        try {  
            memory = new Memory();
            
              /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Memory.mainFrame = new MainFrame();
                    Memory.mainFrame.setVisible(true);
                }
            });
        } 

        catch (Throwable ex) {     
            ErrorType.ERROR100.getMessage();   
            ex.getStackTrace();         
        } 
        finally {
            if (Memory.mainFrame != null) {
                Memory.mainFrame.dispose();
            }
        }
        
    }
}






     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     /* Horses horsey = new Horses("horse");
      System.out.println("I am a "+horsey.getType("horse")+" and " +horsey.getRun());
       horsey.coat();
       horsey.eat();
       horsey.work();
       System.out.println();
       
       HouseCats kitty = new HouseCats("cat");
       System.out.println("I am a " +kitty.getType("cat")+ " and " +kitty.getRun());
       kitty.coat();       
       kitty.eat();
       kitty.stalk();
       kitty.spoiled();
       System.out.println();
       
       Dogs dog = new Dogs("dog");
       System.out.println("I am a " +dog.getType("dog")+ " and " +dog.getRun());
       dog.coat();
       dog.eat();
       dog.work();
       System.out.println();*/