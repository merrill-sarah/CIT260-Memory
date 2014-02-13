/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Janis
 */
public class BoardView {
   Board board;
   int nums [][];
    public void displayBoard(Board board) {
        this.board = board;
        
       int gridNums = 1;
       int rows= board.rows; //  pass these values in
       int columns=board.columns ;//  pass these values in
       int nums [][] = new int [rows][columns]; 
        
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++)
             nums[i][j] = gridNums++;
        }
   
        System.out.print("\t|");
        
        //Use method here for making the lines
        this.horizontalLn();
                                
         for (int x[] : nums){
             for (int y : x){
                 if (y%columns!=0){
                 System.out.print("\t|\t"+ y);
                 }
                 else{
                     System.out.print("\t|\t" +y + "\t|");
                     System.out.print("\n\t|");
                     this.horizontalLn();
                     
                 } 
               
             }      
         }
    }
                 
       public void horizontalLn(){  
           int columns=board.columns;
           for (int i=0; i<columns; i++){
                         System.out.print("---------------|");
           }
           System.out.print("\n");
       }

}
       

 
        
        
        
