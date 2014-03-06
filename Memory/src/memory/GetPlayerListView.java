/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

import java.util.Scanner;
//import java.util.Arrays;

/**
 *
 * @author Janis
 */
public class GetPlayerListView {
    

    int numPlayers=2;//player or game
   
    
     public String[] listOfPlayerNames = new String[numPlayers];
    
    public GetPlayerListView() {
        
    }
    
    public String[] getInputNames(){ // player?
        int nameIndex =0;
        int playerNum =1;
       /* int */numPlayers =2; // Change this to a variable if we add more players option
        boolean finished = false;
        MemoryError errorMsg = new MemoryError();
        Scanner inFile = new Scanner(System.in);
        
        while  (nameIndex < numPlayers && !finished){
            System.out.println("Player #" +(nameIndex+1)+ " please enter your name "
                    + "(or enter \"Q\" to quit}: ");
            String playersName;
            playersName = inFile.nextLine();
            playersName = playersName.trim();
            
            if (playersName.length() < 1){
              errorMsg.displayError("A name must be at least one character long."
                      + "Try again."
                      + "\n\t or enter \"Q\" to quit.");
              continue;
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
                finished = true;
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
 public static void sortFunction( String x[ ] ){
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
    }
    
    


    
