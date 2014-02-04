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
   
    public void displayGrid() {
        System.out.println("\n\tThe board is " + this.rows + " by " 
                           + this.columns + " in size.");
        //will eventually show actually grid, not text//
        }
    public void gridSize(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter what size board you would like to play: "
                + "\"small\" \"medium\" or \"large\":");
        this.size= input.next();
        
        if(size.equals("small")){
            rows = 3;
            columns = 4;
        }
        else if(size.equals("medium")){
            rows = 4;
            columns = 6;
        }
        else if(size.equals("large")){
             rows = 6;
             columns = 8;
                    }
        else {
             System.out.println("Invalid entry. Please enter: "
                     + "\"small\" \"medium\" or \"large\" (without quotes):");
                    }
        
        totalCards = rows * columns;
        totalMatches = (float)totalCards/2;
        
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
                 
        
    // these get and set functions for rows and columns were per Bro. Neville's instructions
    // I'm not sure how or if they'll be used
    public int getRows(){ 
        return rows;
    }
    public void setRows(int r){
        rows = r;
    }
    
    public int getColumns(){ // normally call getRows
        return columns;
    }
    public void setColumns(int c){
        columns = c;
    }
    
    // these get and set are based on the above example - Game calls getTotalCards
    // set... is there to follow the example - will have to watch and see if it is used
    
    public int getTotalCards(){
        return totalCards;
    }
    
    public void setTotalCards(int numCards){
        totalCards = numCards;
    }
}