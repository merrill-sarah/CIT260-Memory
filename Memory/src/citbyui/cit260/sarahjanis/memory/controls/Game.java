/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.controls;

import citbyui.cit260.sarahjanis.memory.enums.StatusType;
import citbyui.cit260.sarahjanis.memory.exceptions.BoardException;
import citbyui.cit260.sarahjanis.memory.exceptions.CardException;
import citbyui.cit260.sarahjanis.memory.exceptions.MemoryException;
import citbyui.cit260.sarahjanis.memory.frames.BoardLargeFrame;
import citbyui.cit260.sarahjanis.memory.frames.BoardMediumFrame;
import citbyui.cit260.sarahjanis.memory.frames.BoardSmallFrame;
import citbyui.cit260.sarahjanis.memory.models.SymbolArray;
import citbyui.cit260.sarahjanis.memory.models.Player;
import citbyui.cit260.sarahjanis.memory.models.Card;
import citbyui.cit260.sarahjanis.memory.models.Board;
import citbyui.cit260.sarahjanis.memory.models.BioS;
import citbyui.cit260.sarahjanis.memory.models.BioJ;
import citbyui.cit260.sarahjanis.memory.models.MemoryError;

import java.io.IOException;
import java.io.Serializable;
import javax.swing.JButton;





/**
 *
 * @author Janis
 */
public class Game implements Serializable {
    private BoardSmallFrame boardSm;
    private BoardMediumFrame boardMd;
    private BoardLargeFrame boardLg;
    private int numCards;
    private char cardSymbol;
    private int cardSelection;
    private int numPlayers=2;
    private Card card = new Card();
 
    
    
    
    public Game(){  
      
    }
    public void startGame(Board board, Player player1, Player player2, SymbolArray symbols ) throws BoardException { 
      Game game = new Game();           
      
    board.setUp();
    char getSymbols [] = new char [board.getTotalCards()];
    getSymbols = symbols.createArray(board, getSymbols);
    MemoryError errorMsg = new MemoryError();
  
          switch (board.getSize()){
            case "s":
                 boardSm = new BoardSmallFrame(player1, player2, board, getSymbols);
                 boardSm.setVisible(true);
                 break;
            case "m":
                boardMd = new BoardMediumFrame(player1, player2, board, getSymbols);
                boardMd.setVisible(true);
                break;
            case "l":
                boardLg = new BoardLargeFrame(player1, player2, board, getSymbols);
                boardLg.setVisible(true);
                break;
          }     
    }
    
    public int getNumCards() {
        return numCards;
    }

    public void setNumCards(int numCards) {
        this.numCards = numCards;
    }

    public char getCardSymbol() {
        return cardSymbol;
    }

    public void setCardSymbol(char cardSymbol) {
        this.cardSymbol = cardSymbol;
    }

    public int getCardSelection() {
        return cardSelection;
    }

    public void setCardSelection(int cardSelection) {
        this.cardSelection = cardSelection;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

   
      } 
      
