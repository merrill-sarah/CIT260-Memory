/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.menus;


import java.util.Scanner;
import memory.MemoryError;

/**
 *
 * @author Janis
 */
public class HelpMenuView extends Menu {
    
    public static final String BOARD = "BOARD";
    public static final String CARDS = "CARDS";
    public static final String HOW_TO = "HOW_TO";
    public static final String OPTIONS = "OPTIONS";
   // public static final String PLAYERS = "PLAYERS";
 
  private final static String[][] menuItems = {
        {"B", "The Board"},
        {"C", "Choosing Cards"}, 
        {"H", "How to Play"},
        {"O", "Options"},
       // {"P", "Choosing Players"},        
        {"X", "Exit Help Menu"}        
    };
  
    
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
   
    public HelpMenuView() {
        super(HelpMenuView.menuItems);
        
        
    } 
    
 @Override
    public String executeCommands(Object object){
         
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
           
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "B":
                    this.getHelpMenuControl(HelpMenuView.BOARD).displayBoardHelp();
                    break;
                case "C":
                    this.getHelpMenuControl(HelpMenuView.CARDS).displayCardChoiceHelp();
                    break;
                case "H":
                    this.getHelpMenuControl(HelpMenuView.HOW_TO).displayGameHelp();
                    break;                  
                case "O":
                    this.getHelpMenuControl(HelpMenuView.OPTIONS).displayOptionsHelp();
                    break;
              //   case "P":
               //      this.getHelpMenuControl().displayPlayersHelp();
                //    break; 
                case "X": 
                    break;
                default: 
                    new MemoryError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("X"));  
        
         return " ";
    }

    public HelpMenuControl getHelpMenuControl(String helpType) {
        return helpMenuControl;
    }

    /**
     * @param helpMenuControl the helpMenuControl to set
     */
    public void setHelpMenuControl(HelpMenuControl helpMenuControl) {
        this.helpMenuControl = helpMenuControl;
    }
    
}
