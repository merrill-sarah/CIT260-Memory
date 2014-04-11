/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.controls;

import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.enums.StatusType;
import citbyui.cit260.sarahjanis.memory.exceptions.BoardException;
import citbyui.cit260.sarahjanis.memory.exceptions.CardException;
import citbyui.cit260.sarahjanis.memory.exceptions.MemoryException;
import citbyui.cit260.sarahjanis.memory.frames.BoardLargeFrame;
import citbyui.cit260.sarahjanis.memory.frames.BoardMediumFrame;
import citbyui.cit260.sarahjanis.memory.frames.BoardSmallFrame;
import citbyui.cit260.sarahjanis.memory.frames.OptionFrame;
import citbyui.cit260.sarahjanis.memory.models.SymbolArray;
import citbyui.cit260.sarahjanis.memory.models.Player;
import citbyui.cit260.sarahjanis.memory.models.Card;
import citbyui.cit260.sarahjanis.memory.models.Board;
import citbyui.cit260.sarahjanis.memory.models.BioS;
import citbyui.cit260.sarahjanis.memory.models.BioJ;
import citbyui.cit260.sarahjanis.memory.models.MemoryError;
import javax.swing.*;
//import citbyui.cit260.sarahjanis.memory.views.EndMenuView;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
//import citbyui.cit260.sarahjanis.memory.views.BoardView;
//import citbyui.cit260.sarahjanis.memory.views.GetPlayerListView;




/**
 *
 * @author Janis
 */
public class Game implements Serializable {
  //  private GetPlayerListView playerList= new GetPlayerListView();
    private Player player1 = new Player();
    private Player player2 = new Player();
    BoardSmallFrame boardSm;
    BoardMediumFrame boardMd;
    BoardLargeFrame boardLg;
    private int numCards;
    private char cardSymbol;
    private int cardSelection;
    private int dupCheck;
    private int numPlayers=2;
    private StatusType status;
 
    
    
    
    public Game(){  
      
    }
    public void startGame(Board board, Player player1, Player player2, SymbolArray symbols ) throws IOException, CardException, BoardException, MemoryException{ 
                 
      
    board.setUp();
    char getSymbols [] = new char [board.getTotalCards()];
    getSymbols = symbols.createArray(board, getSymbols);
    MemoryError errorMsg = new MemoryError();
       try{
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
          }}
          catch (BoardException ex){
              board.setUp();
                  }
                    
    }
       
        public boolean cardStatus(char getSymbols[]){
            Card card = new Card();
            char []symbols = getSymbols;
            //char symbol1;
          //  char symbol2;
            char [] matchCk = new char [2];
            //int c = 0;
            int y = 0;
           while(y<2){
            for (int i = 0; i<card.getCardArray().length; i++)
                if(card.getCardArray()[i]== true){
                 matchCk[y] = symbols[i]; 
                 y++;
                }
           }
            if (matchCk[0] == matchCk[1]){
                return true;
            }
            else
                return false;
            
        }
            
    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
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

    public int getDupCheck() {
        return dupCheck;
    }

    public void setDupCheck(int dupCheck) {
        this.dupCheck = dupCheck;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }
    
  /*  public void rollCredits(){
    
    System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                 + "\n\t~~~~~~~~~~~~~~~CREDITS~~~~~~~~~~~~~~~~~~"
                 + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         
         BioJ janis = new BioJ("Janis", "Felsted", "Web Design and Development", "Online Bachelor's Degree",
         "Senior", "127", "FALL", "2016", "She" );
         janis.display();
         janis.getBio();
         BioS sarah = new BioS("Sarah", "Merrill", "Web Design and Development", "Bachelor's Degree",
         "Junior", "--", "FALL", "2015", "She" );
         sarah.display();
         sarah.getBio();
    
    }

    /**
     * @return the status
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusType status) {
        this.status = status;
    }
      
   
      } 
      
