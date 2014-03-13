/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
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
                + "\n\tAt the start of a new game select from the following board sizes: "
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
                + "\n\tClick a card to choose it, the card will flip over to reveal a symbol. "
                + "\n\tThen click the card that you think will match it, and it will flip over."
                + "\n\tIf they match you will get a match point, and their places will be blank"
                + "\n\tif they don't match the cards will turn back over to show their number."
                ); 
        displayHelpBorder();
    }
             
    public void displayOptionsHelp() /*Case O*/ {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\t*** Options Menu ***"
                       + "\n\tThe Options Menu describes your choices:"
                       + "\n\t   Board Size"
                       + "\n\t   Difficulty Levels" ); 
        displayHelpBorder();
    }
                 
    public void displayPlayersHelp()/*Case P*/  {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\t*** Choosing Players ***"
                       + "\n\tAt the start of a new game you can choose how many players (1 or 2)"
                       + "\n\tand enter the player's names. "
                ); 
        displayHelpBorder();
    }
    
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    
}
