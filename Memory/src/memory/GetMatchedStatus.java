/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.io.IOException;
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
    String player1;
    
    
    
    
    public static void getMatchedStatus(int gridSize,String player1,String player2) throws IOException { 
        char response;
        String response2;
        boolean match = false;
        Scanner input = new Scanner(System.in);
        
       
        System.out.println(player1 +", "
                + "Enter 't' if you made a match, or 'f' if you didn't; ");
        response= (char)System.in.read();//input.next();
                        

        if (response == 't') {
           match = true;   } 
        
           else if(response == 'f'){
                 match = false;
                   }
           else {
               System.out.println("ERROR! Invalid Entry: please enter 't' or 'f' (without quotes)");
           }    
       
	
	int numCards = gridSize;	

	if (match){ 
		numCards -= 2;
        }
	System.out.println(
                "\n\tnumber of matches left is: " + numCards/2);
        
        
        
        System.out.println(player2 + ", "
                + "Enter 't' if you made a match, or 'f' if you didn't; ");
        response2= input.next();
                        

        if (response2.equals("t")) {
           match = true;   } 
        
           else if(response2.equals("f")){
                 match = false;
                   }
           else {
               System.out.println("ERROR! Invalid Entry: please enter 't' or 'f' (without quotes)");
           }    
       	

	if (match){ 
		numCards -= 2;
        }
	System.out.println(
                "\n\tnumber of matches left is: " + numCards/2);
        

	if (numCards == gridSize){ 
		System.out.println("0% of cards are matched");
        }
	else {
            percentDone=((float)(gridSize - numCards)/gridSize);
           
            percentDone =  (percentDone * 100); 
	    System.out.println(
                "\n\tnow " + (int)percentDone + "% of cards are matched.");
        }

    }	

    
}
