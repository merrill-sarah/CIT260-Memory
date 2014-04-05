/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.views;

import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.enums.StatusType;
import citbyui.cit260.sarahjanis.memory.exceptions.MemoryException;
import citbyui.cit260.sarahjanis.memory.models.MemoryError;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class GetPlayerListView implements Serializable{
    private String[] listOfPlayerNames; 
    private StatusType status;
    public boolean validName;

    
    
    public GetPlayerListView() {
        
    }
    
    public boolean nameCheck(String name) throws MemoryException{ 
     
        MemoryError errorMsg = new MemoryError();
        
       //finished){
            
            name = name.trim();
            
            if (name.length() < 1){
              errorMsg.displayError("A name must be at least one character long."
                      + "Try again.");
              return false;
            }
            
            if ((name.equals("Computer"))||(name.equals("computer"))) {
                errorMsg.displayError("This is a reserved name. You can not use it."
                        + "\"Try again.");
               return false; 
            }
            
           /* if (alreadyUsed(listOfPlayerNames, name)){
                errorMsg.displayError("This name was already entered"
                        + "\"Try again.");
                
            }*/
            else
                return true;
                   
        }
                 
 
    
    public void displayNameList(String[] names){
        System.out.println();//"\tHere is an alphabetized list of players in the game");
     
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                break;
            }
            
            System.out.println("\tHello, " + names[i]);
        }
    }
        
   private boolean alreadyUsed(String[] list, String newID) {
        for (String alreadyInList : list) {
            if (newID.equals(alreadyInList)) {
                return true;
            }           
        }
        return false;
    }
    private static void sortFunction( String x[ ] ){
        int i, j;
        String temp;

            for ( i = 0;  i < x.length - 1;  i++ )
            {
                for ( j = i + 1;  j < x.length;  j++ )
                {  
                         if ( x [ i ].compareToIgnoreCase( x [ j ] ) > 0 )
                          {                                             // ascending sort
                                      temp = x [ i ];
                                      x [ i ] = x [ j ];    // swapping
                                      x [ j ] = temp; 
                           } 
                   } 
            } 
      } 

 //getter and setter function
    
    
    public String[] getListOfPlayerNames() {
        return listOfPlayerNames;
    }

    public void setListOfPlayerNames(String[] listOfPlayerNames) {
        this.listOfPlayerNames = listOfPlayerNames;
    }
 
    }
    
    


    
