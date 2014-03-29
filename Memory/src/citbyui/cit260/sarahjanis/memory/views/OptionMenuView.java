/*
 * PROJECT  - MEMORY
 * TEAM     - Sarah Merrill and Janis Felsted
 * COURSE   -  CIT 260 ~ 03 online
 */

package citbyui.cit260.sarahjanis.memory.views;

import citbyui.cit260.sarahjanis.memory.controls.OptionsMenuControl;
import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.enums.StatusType;
import citbyui.cit260.sarahjanis.memory.exceptions.MenuException;
import java.util.Scanner;
import citbyui.cit260.sarahjanis.memory.models.MemoryError;
import citbyui.cit260.sarahjanis.memory.interfaces.EnterInfo;

/**
 *
 * @author Janis
 */
public class OptionMenuView extends Menu /*implements EnterInfo -unnecessary- inherits from Menu*/{
    public static final String BOARD = "BOARD"; 
    public static final String DIFFICULTY = "DIFFICULTY"; 
    public static final String PLAYERS = "PLAYERS";
    
    private final static String[][] menuItems = {
        {"B", "Board Size Choices"},
        {"M", "Matching Difficulty Levels"},
     //   {"N", "Number of Players"},
        {"X", "Exit Option Menu"}
    };
 
    private OptionsMenuControl optionsMenuControl = new OptionsMenuControl();
    private StatusType gameStatus;
    
    public OptionMenuView() {
        super(OptionMenuView.menuItems);
    } 
    
   
    @Override
    public Object getInput(Object object){
      //  String command;
      //  Scanner inFile = new Scanner(System.in);
        
        do {
            try{
              this.display(); 
               // get command entered
                 String command = this.getCommand();
                    
            //command = inFile.nextLine();
           // command = command.trim().toUpperCase();
            
            switch (command) {
                case "B":
                    this.getOptionsMenuControl().displayBoardOption();
                    break;
                case "M":
                    this.getOptionsMenuControl().displayMatchingOption();
                    break;
          /*      case "N":
                    this.getOptionsMenuControl().displayNumPlayersOption();
                    break;    */              
               
                case "X": 
                    return StatusType.QUIT;
              //  default: 
              //      new MemoryError().displayError("Invalid command. Please enter a valid command.");
                    //continue;
            }
            }
            catch(MenuException ex){
                       System.out.println(ErrorType.ERROR101.getMessage());
        }
        } while (gameStatus != StatusType.QUIT);  
        
         return gameStatus;
    }
    
    /**
     * @return the optionsMenuControl
     */
    public OptionsMenuControl getOptionsMenuControl() {
        return optionsMenuControl;
    }

    /**
     * @param optionsMenuControl the optionsMenuControl to set
     */
    public void setOptionsMenuControl(OptionsMenuControl optionsMenuControl) {
        this.optionsMenuControl = optionsMenuControl;
    }
    
}
