/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class GetPlayerListView {
    

    int numPlayers=2;
   
    
     public String[] listOfPlayerNames = new String[numPlayers];
    
    public GetPlayerListView() {
        
    }
    
    public String[] getInputNames(){
        int nameIndex =0;
        int numPlayers =2; // Change this to a variable if we add more players option
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
            this.listOfPlayerNames[nameIndex]=playersName;
           nameIndex++;
        }
            
            String[] newPlayerList = new String[nameIndex];
            for (int i = 0; i< nameIndex;i++)
                newPlayerList[i]=this.listOfPlayerNames[i];
            
            
            this.displayNameList(newPlayerList);
            
            
     return newPlayerList;   
    }
    
    public void displayNameList(String[] names){
        System.out.println("\tHere is the list of players in the game");
     
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                break;
            }
                
            int namePosition = i+1;
            System.out.println("\t   " + names[i] + " is Player"+ namePosition);
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
    }
    
    


    
