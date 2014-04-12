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
    private int dupCheck;
    private int numPlayers=2;
    private StatusType status;
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
    /*public void setIndices(int index){
        
        if (boardSm.getCLICKS() == 1){
            boardSm.indexTurn[0]= index;
            
        }
        else if (boardSm.getCLICKS() ==2){
          indexTurn[1]= index;
        }
    }
    public void setBoard(int size,  JButton [] button, Board board){
        
        for (int i = 1, j=0; i < size; i++, j++){
          if (boardSm.isMatched() == false){
            if (boardSm.getIndexTurn()[0]==i || boardSm.getIndexTurn()[1]==i){
               button[j].setText(Integer.toString(i)); 
            }
                     
            boardSm.setMatched(false);
            boardSm.getJbNext().setVisible(false); 
                card.enableCards(board, button);
                
                //player instructions
                if (boardSm.gettCounter() % 2 != 0){
                    boardSm.getJlInstructions().setText(boardSm.getP1().getName() + ": Choose a card.");  
                    }
                else{
                    boardSm.getJlInstructions().setText(boardSm.getP2().getName() + ": Choose a card.");
                    }
                }
        else if (boardSm.isMatched() == true){
            for (i = 1, j=0; i < size; i++, j++){
            if (boardSm.getIndexTurn()[0]==i || boardSm.getIndexTurn()[1]==i){
               button[j].setVisible(false);
            }
            
            boardSm.getJbNext().setVisible(false); 
                card.enableCards(board, button);
                
                //player instructions
                if (boardSm.gettCounter() % 2 != 0){
                    boardSm.getJlInstructions().setText(boardSm.getP1().getName() + ": Choose a card.");  
                    }
                else{
                    boardSm.getJlInstructions().setText(boardSm.getP2().getName() + ": Choose a card.");
                    }
                }
             
        }
        }
    } */
    

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
      
