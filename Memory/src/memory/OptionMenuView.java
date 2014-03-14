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
public class OptionMenuView extends Menu {
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
    
    
    public OptionMenuView() {
        super(OptionMenuView.menuItems);
    } 
    
    @Override
    public String executeCommands(Object object){
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); 
                    
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
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
                    break;
                default: 
                    new MemoryError().displayError("Invalid command. Please enter a valid command.");
                    //continue;
            }
        } while (!command.equals("X"));  
        
         return "";
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
