/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    float totalMatches;
    
    public Board(){
    }        
    
    public void gridSize(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the letter associated with the size board "
                + "you would like to play: "
                + "\n\"s\" for small, \"m\" for medium, or \"l\" for large:");
        this.size= input.next();
        
         if(size.equals("s")){
            rows = 4;// 3;
            columns = 6;//4;
        }
        else if(size.equals("m")){
            rows = 4;
            columns = 6;
        }
        else if(size.equals("l")){
             rows = 4;//6;
             columns = 6;//8;
                    }
        else {
             System.out.println("Invalid entry. Please enter: "
                     + "\"s\" \"m\" or \"l\" (without quotes):");
                    }
        
        totalCards = rows * columns;
        totalMatches = /*(float)*/totalCards/2;
        
        System.out.println("\nThe board is " + rows + " by " + columns + ". "
                + "There are a total of " + (int)totalMatches + " matches to find.");
        }
    
    
    
    public int matchDifficulty(){
        int numMatchingSymbols;
        System.out.println("\n\tYou can change the difficulty by choosing whether there are 4 "
                + "of each kind of card, or 2 of each");
        
        
          Scanner matchChoice = new Scanner(System.in);
          
          System.out.println("\n\tEnter how many of each kind of card 2 or 4: ");
         
          numMatchingSymbols = matchChoice.nextInt();
          
          return numMatchingSymbols;
     }  
}