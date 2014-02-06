/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

/**
 *
 * @author Janis
 */
public class HelpMenuControl {
  public HelpMenuControl() {
        
    } 

    public void displayBoardHelp() /*Case B*/{
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\t*** Memory Game Board ***"
                + "\n\tIn the Option Menu select from the following board sizes: "
                + "\n\tsmall(12 cards), medium(24 cards), or large(48 cards)");
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp()/*Case H*/ {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\t*** How To Play ***"
                + "\n\tThe objective of the game is to make the most matches. "
                + "\n\tPlayers take turns choosing 2 cards at a time trying to make a match."
                + "\n\tThey score a point for each match they make.  "
                         + "\n\tPlay continues until all the cards have been matched. "
                ); 
        displayHelpBorder();
    }
            
                   
    public void displayCardChoiceHelp()/*Case C*/  {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\t*** Choosing Cards ***"
                + "\n\tClick a card to choose it, the card will flip over to reveal the symbol on the other side. "
                + "\n\tThen click the card that you think will match it, and it will flip over too."
                + "\n\tIf they match you will get a point, if they don't the "
                + "cards will turn back over."
                ); 
        displayHelpBorder();
    }
             
    public void displayOptionsHelp() /*Case O*/ {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\t*** Options Menu ***"
                       + "\n\tThe Options Menu lets you choose:"
                       + "\n"
                       + "\n\t\t~ Number of Players: 1 or 2."
                       + "\n"
                       + "\n\t\t~ Player Names."
                       + "\n"
                       + "\n\t\t~ Board Size: 12,24 or 48 Cards"
                       + "\n"
                       + "\n\t\t~ Matching Difficulty: 2 of each symbol or 4 of each symbol"
                ); 
        displayHelpBorder();
    }
                 
    public void displayPlayersHelp()/*Case P*/  {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\t*** Choosing Players ***"
                       + "\n\tIn the Option Menu you can choose how many players (1 or 2)"
                       + "\n\tand enter the player's names. "
                ); 
        displayHelpBorder();
    }
    
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    
}
