/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sarahjanis.memory.frames;

/**
 *
 * @author Janis
 */

import citbyui.cit260.sarahjanis.memory.exceptions.BoardException;
import citbyui.cit260.sarahjanis.memory.models.Board;
import citbyui.cit260.sarahjanis.memory.models.Card;
import citbyui.cit260.sarahjanis.memory.models.Player;
import citbyui.cit260.sarahjanis.memory.models.SymbolArray;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BoardSmallFrame extends javax.swing.JFrame {
    Board board;
    
    //SymbolArray myArray = new SymbolArray();
    /**
     * Creates new form GameBoardFrame
     */
    public BoardSmallFrame(Player player1, Player player2, char getSymbols[]) throws BoardException{
        initComponents();
        setLocationRelativeTo(null);
        
        //char[] mySymbols = myArray.createArray(board, getSymbols);
        jlP1Name.setText(player1.getName());
        jlP2Name.setText(player2.getName());
       // jlFirstTurn.setText(player1.getName() + ", pick your first card.");
        firstTurn(player1, player2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTitle = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlP1Name = new javax.swing.JLabel();
        jlP2Name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlP1Matches = new javax.swing.JLabel();
        jlP2Matches = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlP1Wins = new javax.swing.JLabel();
        jlP2Wins = new javax.swing.JLabel();
        jpGamePlayInstructions = new javax.swing.JPanel();
        jlFirstTurn = new javax.swing.JLabel();
        jpSGameArea = new javax.swing.JPanel();
        jbSButton1 = new javax.swing.JButton();
        jbSButton2 = new javax.swing.JButton();
        jbSButton3 = new javax.swing.JButton();
        jbSButton4 = new javax.swing.JButton();
        jbSButton5 = new javax.swing.JButton();
        jbSButton6 = new javax.swing.JButton();
        jbSButton7 = new javax.swing.JButton();
        jbSButton8 = new javax.swing.JButton();
        jbSButton9 = new javax.swing.JButton();
        jbSButton10 = new javax.swing.JButton();
        jbSButton11 = new javax.swing.JButton();
        jbSButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memory Game Small Grid");
        setBackground(new java.awt.Color(204, 255, 255));

        jpTitle.setBackground(new java.awt.Color(204, 255, 255));

        jlTitle.setBackground(new java.awt.Color(204, 255, 255));
        jlTitle.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(0, 153, 153));
        jlTitle.setText("MEMORY");

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Player");

        jlP1Name.setText("Player 1:");

        jlP2Name.setText("Player 2:");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Matches");

        jlP1Matches.setText("0");

        jlP2Matches.setText("0");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Wins");

        jlP1Wins.setText("0");

        jlP2Wins.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jlP1Name)
                    .addComponent(jlP2Name))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jlP1Matches)
                    .addComponent(jlP2Matches))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlP2Wins)
                    .addComponent(jlP1Wins)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlP1Name)
                    .addComponent(jlP1Matches)
                    .addComponent(jlP1Wins))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlP2Name)
                    .addComponent(jlP2Matches)
                    .addComponent(jlP2Wins))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jpGamePlayInstructions.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpGamePlayInstructionsLayout = new javax.swing.GroupLayout(jpGamePlayInstructions);
        jpGamePlayInstructions.setLayout(jpGamePlayInstructionsLayout);
        jpGamePlayInstructionsLayout.setHorizontalGroup(
            jpGamePlayInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGamePlayInstructionsLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jlFirstTurn)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jpGamePlayInstructionsLayout.setVerticalGroup(
            jpGamePlayInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpGamePlayInstructionsLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jlFirstTurn)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addGroup(jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTitleLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jlTitle))
                    .addGroup(jpTitleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpGamePlayInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTitleLayout.createSequentialGroup()
                        .addComponent(jlTitle)
                        .addGap(21, 21, 21)
                        .addComponent(jpGamePlayInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpSGameArea.setLayout(new java.awt.GridLayout(3, 4, 10, 10));

        jbSButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbSButton1.setForeground(new java.awt.Color(0, 153, 153));
        jbSButton1.setText("1");
        jbSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSButton1ActionPerformed(evt);
            }
        });
        jpSGameArea.add(jbSButton1);

        jbSButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbSButton2.setForeground(new java.awt.Color(0, 153, 153));
        jbSButton2.setText("2");
        jbSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSButton2ActionPerformed(evt);
            }
        });
        jpSGameArea.add(jbSButton2);

        jbSButton3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbSButton3.setForeground(new java.awt.Color(0, 153, 153));
        jbSButton3.setText("3");
        jbSButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSButton3ActionPerformed(evt);
            }
        });
        jpSGameArea.add(jbSButton3);

        jbSButton4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbSButton4.setForeground(new java.awt.Color(0, 153, 153));
        jbSButton4.setText("4");
        jbSButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSButton4ActionPerformed(evt);
            }
        });
        jpSGameArea.add(jbSButton4);

        jbSButton5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbSButton5.setForeground(new java.awt.Color(0, 153, 153));
        jbSButton5.setText("5");
        jbSButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSButton5ActionPerformed(evt);
            }
        });
        jpSGameArea.add(jbSButton5);

        jbSButton6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbSButton6.setForeground(new java.awt.Color(0, 153, 153));
        jbSButton6.setText("6");
        jbSButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSButton6ActionPerformed(evt);
            }
        });
        jpSGameArea.add(jbSButton6);

        jbSButton7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbSButton7.setForeground(new java.awt.Color(0, 153, 153));
        jbSButton7.setText("7");
        jbSButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSButton7ActionPerformed(evt);
            }
        });
        jpSGameArea.add(jbSButton7);

        jbSButton8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbSButton8.setForeground(new java.awt.Color(0, 153, 153));
        jbSButton8.setText("8");
        jbSButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSButton8ActionPerformed(evt);
            }
        });
        jpSGameArea.add(jbSButton8);

        jbSButton9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbSButton9.setForeground(new java.awt.Color(0, 153, 153));
        jbSButton9.setText("9");
        jbSButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSButton9ActionPerformed(evt);
            }
        });
        jpSGameArea.add(jbSButton9);

        jbSButton10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbSButton10.setForeground(new java.awt.Color(0, 153, 153));
        jbSButton10.setText("10");
        jbSButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSButton10ActionPerformed(evt);
            }
        });
        jpSGameArea.add(jbSButton10);

        jbSButton11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbSButton11.setForeground(new java.awt.Color(0, 153, 153));
        jbSButton11.setText("11");
        jbSButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSButton11ActionPerformed(evt);
            }
        });
        jpSGameArea.add(jbSButton11);

        jbSButton12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbSButton12.setForeground(new java.awt.Color(0, 153, 153));
        jbSButton12.setText("12");
        jbSButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSButton12ActionPerformed(evt);
            }
        });
        jpSGameArea.add(jbSButton12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpSGameArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpSGameArea, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSButton1ActionPerformed
       Board board = new Board();
        SymbolArray symbolsAr = new SymbolArray();
        char getSymbols [] = new char [12]; //create foundation array
        try { 
            symbolsAr.createArray(board, getSymbols);
        } catch (BoardException ex) {
            Logger.getLogger(BoardSmallFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       String symbol = Character.toString(getSymbols[0]);
      
       jbSButton1.setText(symbol);
    }//GEN-LAST:event_jbSButton1ActionPerformed

    private void jbSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSButton2ActionPerformed

    private void jbSButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSButton3ActionPerformed

    private void jbSButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSButton4ActionPerformed

    private void jbSButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSButton5ActionPerformed

    private void jbSButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSButton6ActionPerformed

    private void jbSButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSButton7ActionPerformed

    private void jbSButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSButton8ActionPerformed

    private void jbSButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSButton9ActionPerformed

    private void jbSButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSButton10ActionPerformed

    private void jbSButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSButton11ActionPerformed

    private void jbSButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSButton12ActionPerformed

    
    public void firstTurn(Player player1, Player player2){
        
   jlFirstTurn.setText(player1.getName() + ", pick your first card");
  // }
    
    
   // public void createCards(){/*
  /*  jpTitle.setVisible(true);
    JButton buttonT = new JButton("4 title panel");
    JButton buttonGB = new JButton("4 game panel");
    jpTitle.add(buttonT);
    
    jpGameArea.add(buttonGB);
   // buttonGB.setText("I'M A manually added BUTTON IN THE GAME PANEL");
    
    //layout.*/
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbSButton1;
    private javax.swing.JButton jbSButton10;
    private javax.swing.JButton jbSButton11;
    private javax.swing.JButton jbSButton12;
    private javax.swing.JButton jbSButton2;
    private javax.swing.JButton jbSButton3;
    private javax.swing.JButton jbSButton4;
    private javax.swing.JButton jbSButton5;
    private javax.swing.JButton jbSButton6;
    private javax.swing.JButton jbSButton7;
    private javax.swing.JButton jbSButton8;
    private javax.swing.JButton jbSButton9;
    private javax.swing.JLabel jlFirstTurn;
    private javax.swing.JLabel jlP1Matches;
    private javax.swing.JLabel jlP1Name;
    private javax.swing.JLabel jlP1Wins;
    private javax.swing.JLabel jlP2Matches;
    private javax.swing.JLabel jlP2Name;
    private javax.swing.JLabel jlP2Wins;
    private javax.swing.JLabel jlTitle;
    javax.swing.JPanel jpGamePlayInstructions;
    private javax.swing.JPanel jpSGameArea;
    private javax.swing.JPanel jpTitle;
    // End of variables declaration//GEN-END:variables
}
