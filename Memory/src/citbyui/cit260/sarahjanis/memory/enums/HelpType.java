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
    BOARD ("BOARD"),
    CARDS ("CARDS"),
    HOW_TO ("HOW_TO"),
    OPTIONS ("OPTIONS");
    
    String message;
    
    HelpType(String message){
        this.message = message;
    }
}
