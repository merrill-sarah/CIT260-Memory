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
        int nameIndex;
        
        Scanner inFile = new Scanner(System.in);
        
        for  ( nameIndex=0; nameIndex < numPlayers; nameIndex++){
            System.out.println("Player #" +(nameIndex+1)+ " please enter your name: ");
            String playersName;
            playersName = inFile.nextLine();
            playersName = playersName.trim();
            
            //add names to player list of names
            this.listOfPlayerNames[nameIndex]=playersName;
           
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
    
    


    
}
