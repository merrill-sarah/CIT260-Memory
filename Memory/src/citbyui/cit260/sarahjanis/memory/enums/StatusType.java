/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sarahjanis.memory.enums;

/**
 *
 * @author Janis
 */
public enum StatusType {
    START ("START"),
    PLAYING ("PLAYING"),
    CONTINUE ("CONTINUE"),
    QUIT ("QUIT"),
    EXIT ("EXIT"),
    WINNER("WINNER"),
    WINS ("WINS"),
    TIE ("TIE"),
    ERROR ("ERROR");
    
    String value;
    
    StatusType(String value){
        this.value = value;
    }
}
