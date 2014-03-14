/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package memory;


import java.util.Scanner;

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
  
   //********************************************************************* 
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
   //**********************************************************************
    
    
    // default constructor
    public HelpMenuView() {
        super(HelpMenuView.menuItems);
        
        
    } 
    
 @Override
    public String executeCommands(Object object){
    // return "WIP";}
   //******************************************************************* 
    // display the help menu and get the end users input selection
  //  public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
    //***********************************************
        
        
    
       
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
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
