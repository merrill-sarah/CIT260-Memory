/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.views;


import citbyui.cit260.sarahjanis.memory.controls.HelpMenuControl;
import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.enums.HelpType;
import citbyui.cit260.sarahjanis.memory.enums.StatusType;
import citbyui.cit260.sarahjanis.memory.exceptions.MenuException;
import citbyui.cit260.sarahjanis.memory.interfaces.EnterInfo;
import citbyui.cit260.sarahjanis.memory.interfaces.DisplayInfo;
import java.util.Scanner;
import citbyui.cit260.sarahjanis.memory.models.MemoryError;

/**
 *
 * @author Janis
 *//*
public class HelpMenuView extends Menu implements EnterInfo, DisplayInfo {
    
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
    private StatusType gameStatus;
   
    public HelpMenuView() {
        super(HelpMenuView.menuItems);
        
        
    } 
 /*   
 @Override
    public Object getInput(Object object){
         
    //String command;
  //  Scanner inFile = new Scanner(System.in);

    do {
        try {

        this.display(); // display the menu

        // get command entered
                 String command = this.getCommand();
                 
               //  command = inFile.nextLine();
               //  command = command.trim().toUpperCase();
                 
        switch (command) {/*
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
                    return StatusType.QUIT;
              //  default: 
              //      new MemoryError().displayError("Invalid command. Please enter a valid command.");
                    //continue;
            }*/
      /*      }
            catch(MenuException ex){
                       System.out.println(ErrorType.ERROR101.getMessage());
        }
        }while (gameStatus != StatusType.QUIT);  
        
         return gameStatus;
    }
*//*
    public HelpMenuControl getHelpMenuControl(String helpType) {
        return helpMenuControl;
    }

    /**
     * @param helpMenuControl the helpMenuControl to set
     */
 /*   public void setHelpMenuControl(HelpMenuControl helpMenuControl) {
        this.helpMenuControl = helpMenuControl;
 //   }
    
}
*/