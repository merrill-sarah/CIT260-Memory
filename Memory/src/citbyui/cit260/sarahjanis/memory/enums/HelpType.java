/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sarahjanis.memory.enums;

/**
 *
 * @author Sarawr
 */
public enum HelpType {
    INSTRUCTIONS ("\nThe objective of the game is to make the most matches. "
                + "\n\nPlayers take turns choosing 2 cards at a time trying to make a match."
                + " When a player makes a match they get to go again, When no match is made "
                + "it becomes the other player's turn."
                + "\n\nThe players score a point for each match they make.  "
                + "Play continues until all the cards have been matched."
                + " If you choose Play Again, another game will start using the same players"
                + " and continue to tally their stats.  \n\nQuit will take you back to the Main Menu."),
    
    DIFFICULTY (""
            + "\n\nYou have different options that help you adjust the difficulty of the game."
            + "\n\nThere are 3 grid sizes: small is 12 cards, medium is 24 cards,"
            + "and large is 24 cards."
            + "\n\nYou can also choose whether to have 2 or 4 or each kind of card."),
    
    CHOOSE_CARDS (""
                + "\n\nClick a card to choose it, the card will flip over to reveal a symbol. "
                + "Then click another card that you think will match the first one."
                + "\n\nIf they match you will get a match point, and they will be removed from the board."
                + "\n\nIf they don't match the cards will turn back over to display their number, "
                + "and it will be the other player's turn."),
    
    BOARD ("BOARD"),
    CARDS ("CARDS"),
    HOW_TO ("HOW_TO"),
    OPTIONS ("OPTIONS");
    
     String helpText;

    private HelpType(String helpText) {
        this.helpText = helpText;
    }

    public String getHelpText() {
        return helpText;
    }
    /*
    String message;
    
    HelpTypeOriginal(String message){
        this.message = message;
    }*/
}
