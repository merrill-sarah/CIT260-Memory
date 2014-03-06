/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Sarawr
 */
public class Board {
    int rows;
    int columns;
    String size;
    public int totalCards;
    float totalMatches;//?  game or symbolsArray?
    float numSymbols; // symbolsArray?
    public int numMatchingSymbols;// symbolsArray?
    
    public Board(){
    }        
    
    public void gridSize(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the letter associated with the size board "
                + "you would like to play: "
                + "\n\"s\" for small, \"m\" for medium, or \"l\" for large:");
        this.size= input.next();
        
         if(size.equals("s")){
            rows = 3;
            columns = 4;
        }
        else if(size.equals("m")){
            rows = 4;
            columns = 6;
        }
        else if(size.equals("l")){
             rows = 6;
             columns = 8;
                    }
        else {
             System.out.println("Invalid entry. Please enter: "
                     + "\"s\" \"m\" or \"l\" (without quotes):");
             gridSize();
                    }
        
        totalCards = rows * columns;
        totalMatches = totalCards/2;
        }
    
    
    public void displayGridInfo(){
        System.out.println("\n\tThe board is " + rows + " by " + columns + "."
                + " There are a total of " + totalMatches + " matches to find.");
        
    }
    public void matchDifficulty(){//this..should it be in the options menu?
        System.out.println("\nYou can change the difficulty by choosing whether there are 4 "
                + "of each kind of card, or 2 of each");
        
        
          Scanner matchChoice = new Scanner(System.in);
          
          System.out.println("Enter how many of each kind of card 2 or 4: ");
          numMatchingSymbols = matchChoice.nextInt();
          
         if (numMatchingSymbols == 2){
             numSymbols = totalMatches;
         }
         else if (numMatchingSymbols == 4){
             numSymbols = totalMatches/2;
         }
         else{
             System.out.println("\tInvalid entry. Please enter '2' or '4'");
             matchDifficulty();
         }
           
     }  
}