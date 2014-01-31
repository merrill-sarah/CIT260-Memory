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
public class GetMatchedStatus {
    String inputMatch;
    boolean match;
    int numCards;
    float percentDone;
    
    /* This is so I have an entry example****************
     public void getName1() {// 
        Scanner input = new Scanner(System.in);
        System.out.println("First Player, Enter your name: ");
        this.name= input.next();
     }*/
    
    getMatchedStatus(gridSize) { 
        String response;
        Scanner input = new Scanner(System.in);
        System.out.println("First Player, "
                + "Enter enter 't' if you made a match, or 'f' if you didn't; ");
        response= input.next();

        if (response != "t" & response != "f")
               
        
	if(response == "t"){
            match = true;
        }
//Get input from user: match = t or f;
        

	if (match != True & match != False) then
	display “Invalid Entry: please enter t or f”
		return -1	
	
	numCards = gridSize;	

	if (match) 
		numCards -= 2;
	
	display “number of matches left is: numCards/2

	if (numCards == gridSize; 
		display “0% of cards are matched”

	else 
		percent = (gridSize – numCards) / gridSize
	
	percent = (int) (percent * 100)
	
	display “.” + percent + “% of cards are matched”.

}	

    
}
