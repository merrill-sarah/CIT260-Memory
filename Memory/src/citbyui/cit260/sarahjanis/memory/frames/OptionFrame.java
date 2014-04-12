/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sarahjanis.memory.frames;

import citbyui.cit260.sarahjanis.memory.controls.Game;
import citbyui.cit260.sarahjanis.memory.controls.OptionsMenuControl;
import citbyui.cit260.sarahjanis.memory.enums.ErrorType;
import citbyui.cit260.sarahjanis.memory.exceptions.BoardException;
//import citbyui.cit260.sarahjanis.memory.exceptions.CardException;
//import citbyui.cit260.sarahjanis.memory.exceptions.MemoryException;
import citbyui.cit260.sarahjanis.memory.models.Board;
//import citbyui.cit260.sarahjanis.memory.models.MemoryError;
import citbyui.cit260.sarahjanis.memory.models.Player;
import citbyui.cit260.sarahjanis.memory.models.SymbolArray;
//import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Janis
 */
public class OptionFrame extends javax.swing.JFrame {
    private Board board = new Board();
    private SymbolArray symbols = new SymbolArray();
    private Player player1 = new Player();
    private Player player2 = new Player();
    private OptionsMenuControl control = new OptionsMenuControl();
    
    /**
     * Creates new form OptionFrame
     */
    public OptionFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpOptions = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbTwoCards = new javax.swing.JButton();
        jbFourCards = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbSmall = new javax.swing.JButton();
        jbMedium = new javax.swing.JButton();
        jbLarge = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfP1Name = new javax.swing.JTextField();
        jtfP2Name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtError = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpOptions.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("DEAL THE CARDS");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("OPTIONS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("How many of each card?");

        jbTwoCards.setText("2");
        jbTwoCards.setToolTipText("");
        jbTwoCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTwoCardsActionPerformed(evt);
            }
        });

        jbFourCards.setText("4");
        jbFourCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFourCardsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("What size grid?");

        jbSmall.setText("SMALL");
        jbSmall.setToolTipText("12 cards ");
        jbSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSmallActionPerformed(evt);
            }
        });

        jbMedium.setText("MEDIUM");
        jbMedium.setToolTipText("24 cards");
        jbMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMediumActionPerformed(evt);
            }
        });

        jbLarge.setText("LARGE");
        jbLarge.setToolTipText("48 cards");
        jbLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLargeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Enter player names:");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel5.setText("Player 1:");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel6.setText("Player 2:");

        jtError.setEditable(false);
        jtError.setBackground(new java.awt.Color(204, 255, 255));
        jtError.setColumns(20);
        jtError.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jtError.setForeground(new java.awt.Color(255, 0, 0));
        jtError.setRows(3);
        jtError.setBorder(null);
        jtError.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane1.setViewportView(jtError);

        javax.swing.GroupLayout jpOptionsLayout = new javax.swing.GroupLayout(jpOptions);
        jpOptions.setLayout(jpOptionsLayout);
        jpOptionsLayout.setHorizontalGroup(
            jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpOptionsLayout.createSequentialGroup()
                .addGroup(jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOptionsLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jpOptionsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(21, 21, 21)
                                .addGroup(jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfP1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfP2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpOptionsLayout.createSequentialGroup()
                                .addGroup(jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpOptionsLayout.createSequentialGroup()
                                        .addGroup(jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jbSmall)
                                            .addComponent(jLabel3)
                                            .addComponent(jbTwoCards))
                                        .addGap(18, 18, 18)
                                        .addGroup(jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbMedium)
                                            .addComponent(jbFourCards))
                                        .addGap(18, 18, 18)
                                        .addComponent(jbLarge))
                                    .addGroup(jpOptionsLayout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpOptionsLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addGap(24, 24, Short.MAX_VALUE))
        );
        jpOptionsLayout.setVerticalGroup(
            jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOptionsLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOptionsLayout.createSequentialGroup()
                        .addGroup(jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfP1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfP2Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbTwoCards)
                            .addComponent(jbFourCards))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSmall)
                    .addComponent(jbMedium)
                    .addComponent(jbLarge))
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpOptions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLargeActionPerformed
        board.setSize("l");
        jbLarge.setFont(new java.awt.Font("Berlin Sans FB", 0, 20));
        jbMedium.setFont(new java.awt.Font("Tahoma", 0, 11));
        jbSmall.setFont(new java.awt.Font("Tahoma", 0, 11));
    }//GEN-LAST:event_jbLargeActionPerformed

    private void jbMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMediumActionPerformed
        board.setSize("m");
        jbMedium.setFont(new java.awt.Font("Berlin Sans FB", 0, 20));
        jbSmall.setFont(new java.awt.Font("Tahoma", 0, 11));
        jbLarge.setFont(new java.awt.Font("Tahoma", 0, 11));
    }//GEN-LAST:event_jbMediumActionPerformed

    private void jbSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSmallActionPerformed
        board.setSize("s");
        jbSmall.setFont(new java.awt.Font("Berlin Sans FB", 0, 20));
        jbMedium.setFont(new java.awt.Font("Tahoma", 0, 11));
        jbLarge.setFont(new java.awt.Font("Tahoma", 0, 11));

    }//GEN-LAST:event_jbSmallActionPerformed

    private void jbFourCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFourCardsActionPerformed
        symbols.setNumMatchingSymbols(4);
        jbFourCards.setFont(new java.awt.Font("Berlin Sans FB", 0, 20));
        jbTwoCards.setFont(new java.awt.Font("Tahoma", 0, 11));
    }//GEN-LAST:event_jbFourCardsActionPerformed

    private void jbTwoCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTwoCardsActionPerformed
        symbols.setNumMatchingSymbols(2);
        jbTwoCards.setFont(new java.awt.Font("Berlin Sans FB", 0, 20));
        jbFourCards.setFont(new java.awt.Font("Tahoma", 0, 11));
    }//GEN-LAST:event_jbTwoCardsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        player1.setName(jtfP1Name.getText());
        player2.setName(jtfP2Name.getText());

        int check = control.inputCheck(symbols, player1, player2, board);
        if (check == 1){
            jtError.setText(ErrorType.ERROR101.getMessage());
        }
        else if (check == 2){
            jtError.setText(ErrorType.ERROR204.getMessage());
        }
        else if (check == 3){
            jtError.setMargin(new java.awt.Insets(10, 10, 10, 10));
            jtError.setText(ErrorType.ERROR103.getMessage());
        }
        else if (check == 0) {
            Game game = new Game();
            try {
                game.startGame(board, player1, player2, symbols);
            } catch (BoardException ex) {
                Logger.getLogger(OptionFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally {

            this.dispose();}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbFourCards;
    private javax.swing.JButton jbLarge;
    private javax.swing.JButton jbMedium;
    private javax.swing.JButton jbSmall;
    private javax.swing.JButton jbTwoCards;
    private javax.swing.JPanel jpOptions;
    private javax.swing.JTextArea jtError;
    private javax.swing.JTextField jtfP1Name;
    private javax.swing.JTextField jtfP2Name;
    // End of variables declaration//GEN-END:variables
}
