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
    static float percentDone;
    
    /* This is so I have an entry example****************
     public void getName1() {// 
        Scanner input = new Scanner(System.in);
        System.out.println("First Player, Enter your name: ");
        this.name= input.next();
     }*/
    
    public static void getMatchedStatus(int gridSize) { 
        String response;
        boolean match = false;
        Scanner input = new Scanner(System.in);
        
        // player1 inputs whether or not they made a match
        System.out.println("First Player, "
                + "Enter enter 't' if you made a match, or 'f' if you didn't; ");
        response= input.next();
        
                 

        if (response.equals("t")) {
           match = true;   } 
        
           else if(response.equals("f")){
                 match = false;
                   }
           else 
               System.out.println("ERROR! Invalid Entry: please enter 't' or 'f' (without quotes)");
      
        /*  This was in the assignment example - don't know how to incorporate
	if (match != True & match != False) then
	display “Invalid Entry: please enter t or f”
		return -1	*/
	
	int numCards = gridSize;	

	if (match){ 
		numCards -= 2;
	
	System.out.println(
                "\n\tnumber of matches left is: " + numCards/2);
        }

	if (numCards == gridSize){ 
		System.out.println("0% of cards are matched");
        }
	else {
            percentDone=((gridSize - numCards)/gridSize);
            percentDone = (int) (percentDone * 100); //cast to an int to use before the percent sign in the printout
	    System.out.println(
                "\n\t." + percentDone + "% of cards are matched.");
        }

    }	

    
}
