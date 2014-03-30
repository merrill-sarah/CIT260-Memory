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
    
    public GetPlayerListView() {
        
    }
    
    public String[] getInputNames(int numPlayers) throws MemoryException{ 
        listOfPlayerNames = new String[numPlayers];
        int nameIndex =0;
        int playerNum =1;
       numPlayers =2; 
        boolean finished = false;
        MemoryError errorMsg = new MemoryError();
        Scanner inFile = new Scanner(System.in);
        
       while  (nameIndex < numPlayers && status != StatusType.QUIT){//finished){
            System.out.println("Player #" +(nameIndex+1)+ " please enter your name "
                    + "(or enter \"Q\" to quit}: ");
            String playersName;
            playersName = inFile.nextLine();
            playersName = playersName.trim();
            
            if (playersName.length() < 1){
                throw new MemoryException(ErrorType.ERROR104.getMessage());
                
                /*
              errorMsg.displayError("A name must be at least one character long."
                      + "Try again."
                      + "\n\t or enter \"Q\" to quit.");
              continue;*/
            }
            
            if ((playersName.equals("Computer"))||(playersName.equals("computer"))) {
                errorMsg.displayError("This is a reserved name. You can not use it."
                        + "\"Try again."
                        + "\n\t or enter \"Q\" to quit.");
                continue;
            }
            
            if (alreadyUsed(listOfPlayerNames, playersName)){
                errorMsg.displayError("This name was already entered"
                        + "\"Try again."
                        + "\n\t or enter \"Q\" to quit.");
                continue;
            }
            
            if (playersName.toUpperCase().equals("Q")) { // quit?
                status = StatusType.QUIT;// = true;
                break;
            } 
            
            //add names to player list of names
            this.listOfPlayerNames[nameIndex]= playersName ;
           nameIndex++;
           
        }
            
            String[] newPlayerList = new String[nameIndex];
            for (int i = 0; i< nameIndex;i++)
                newPlayerList[i]=this.listOfPlayerNames[i];
            
            
            sortFunction(newPlayerList);
            this.displayNameList(newPlayerList);
            
            
     return newPlayerList;      
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
    
    


    
