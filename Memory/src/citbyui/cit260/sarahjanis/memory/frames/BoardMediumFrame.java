/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.sarahjanis.memory.frames;

import citbyui.cit260.sarahjanis.memory.controls.Game;
import citbyui.cit260.sarahjanis.memory.exceptions.BoardException;
import citbyui.cit260.sarahjanis.memory.exceptions.CardException;
import citbyui.cit260.sarahjanis.memory.exceptions.MemoryException;
import citbyui.cit260.sarahjanis.memory.models.Board;
import citbyui.cit260.sarahjanis.memory.models.Player;
import citbyui.cit260.sarahjanis.memory.models.SymbolArray;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Janis
 */
public class BoardMediumFrame extends javax.swing.JFrame {
    private char symbols[];
    Game game;
    Board board;
    SymbolArray symArr;
    Player player1;
    Player player2;
    /**
     * Creates new form BoardMediumFrame
     */
    public BoardMediumFrame(Player player1, Player player2, char getSymbols[]) {
        initComponents();
        setLocationRelativeTo(null);
        symbols = getSymbols;
        jlP1Name.setText(player1.getName());
        jlP2Name.setText(player2.getName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMTitle = new javax.swing.JPanel();
        jlMTitle = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        jbMainMenu = new javax.swing.JButton();
        jbHelp = new javax.swing.JButton();
        jbQuit = new javax.swing.JButton();
        jpMGameArea = new javax.swing.JPanel();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb10 = new javax.swing.JButton();
        jb11 = new javax.swing.JButton();
        jb12 = new javax.swing.JButton();
        jb13 = new javax.swing.JButton();
        jb14 = new javax.swing.JButton();
        jb15 = new javax.swing.JButton();
        jb16 = new javax.swing.JButton();
        jb17 = new javax.swing.JButton();
        jb18 = new javax.swing.JButton();
        jb19 = new javax.swing.JButton();
        jb20 = new javax.swing.JButton();
        jb21 = new javax.swing.JButton();
        jb22 = new javax.swing.JButton();
        jb23 = new javax.swing.JButton();
        jb24 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jpMTitle.setBackground(new java.awt.Color(204, 255, 255));
        jpMTitle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));

        jlMTitle.setBackground(new java.awt.Color(204, 255, 255));
        jlMTitle.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jlMTitle.setForeground(new java.awt.Color(0, 153, 153));
        jlMTitle.setText("MEMORY");

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
                .addGap(68, 68, 68)
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

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jbMainMenu.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jbMainMenu.setForeground(new java.awt.Color(0, 153, 153));
        jbMainMenu.setText("MAIN MENU");
        jbMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMainMenuActionPerformed(evt);
            }
        });

        jbHelp.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jbHelp.setForeground(new java.awt.Color(0, 153, 153));
        jbHelp.setText("HELP");
        jbHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHelpActionPerformed(evt);
            }
        });

        jbQuit.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jbQuit.setForeground(new java.awt.Color(0, 153, 153));
        jbQuit.setText("QUIT");
        jbQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbQuit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jbMainMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbHelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbQuit)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpMTitleLayout = new javax.swing.GroupLayout(jpMTitle);
        jpMTitle.setLayout(jpMTitleLayout);
        jpMTitleLayout.setHorizontalGroup(
            jpMTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMTitleLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jlMTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpMTitleLayout.setVerticalGroup(
            jpMTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMTitleLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jpMTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpMTitleLayout.createSequentialGroup()
                        .addGroup(jpMTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMTitle))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpMGameArea.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 153)));
        jpMGameArea.setLayout(new java.awt.GridLayout(4, 6, 10, 10));

        jb1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb1.setForeground(new java.awt.Color(0, 153, 153));
        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb1);

        jb2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb2.setForeground(new java.awt.Color(0, 153, 153));
        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb2);

        jb3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb3.setForeground(new java.awt.Color(0, 153, 153));
        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb3);

        jb4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb4.setForeground(new java.awt.Color(0, 153, 153));
        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb4);

        jb5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb5.setForeground(new java.awt.Color(0, 153, 153));
        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb5);

        jb6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb6.setForeground(new java.awt.Color(0, 153, 153));
        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb6);

        jb7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb7.setForeground(new java.awt.Color(0, 153, 153));
        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb7);

        jb8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb8.setForeground(new java.awt.Color(0, 153, 153));
        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb8);

        jb9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb9.setForeground(new java.awt.Color(0, 153, 153));
        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb9);

        jb10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb10.setForeground(new java.awt.Color(0, 153, 153));
        jb10.setText("10");
        jb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb10ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb10);

        jb11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb11.setForeground(new java.awt.Color(0, 153, 153));
        jb11.setText("11");
        jb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb11ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb11);

        jb12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb12.setForeground(new java.awt.Color(0, 153, 153));
        jb12.setText("12");
        jb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb12ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb12);

        jb13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb13.setForeground(new java.awt.Color(0, 153, 153));
        jb13.setText("13");
        jb13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb13ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb13);

        jb14.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb14.setForeground(new java.awt.Color(0, 153, 153));
        jb14.setText("14");
        jb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb14ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb14);

        jb15.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb15.setForeground(new java.awt.Color(0, 153, 153));
        jb15.setText("15");
        jb15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb15ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb15);

        jb16.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb16.setForeground(new java.awt.Color(0, 153, 153));
        jb16.setText("16");
        jb16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb16ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb16);

        jb17.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb17.setForeground(new java.awt.Color(0, 153, 153));
        jb17.setText("17");
        jb17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb17ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb17);

        jb18.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb18.setForeground(new java.awt.Color(0, 153, 153));
        jb18.setText("18");
        jb18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb18ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb18);

        jb19.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb19.setForeground(new java.awt.Color(0, 153, 153));
        jb19.setText("19");
        jb19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb19ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb19);

        jb20.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb20.setForeground(new java.awt.Color(0, 153, 153));
        jb20.setText("20");
        jb20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb20ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb20);

        jb21.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb21.setForeground(new java.awt.Color(0, 153, 153));
        jb21.setText("21");
        jb21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb21ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb21);

        jb22.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb22.setForeground(new java.awt.Color(0, 153, 153));
        jb22.setText("22");
        jb22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb22ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb22);

        jb23.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb23.setForeground(new java.awt.Color(0, 153, 153));
        jb23.setText("23");
        jb23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb23ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb23);

        jb24.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jb24.setForeground(new java.awt.Color(0, 153, 153));
        jb24.setText("24");
        jb24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb24ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jb24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpMTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpMGameArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jpMTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpMGameArea, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addGap(123, 123, 123))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
       String symbol = Character.toString(symbols[0]);
       jb1.setText(symbol);
     /*  CLICK++;
        try {
            game.playersTurns(board, symArr, symbols, player1, player2);
        } catch (IOException ex) {
            Logger.getLogger(BoardMediumFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CardException ex) {
            Logger.getLogger(BoardMediumFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BoardException ex) {
            Logger.getLogger(BoardMediumFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MemoryException ex) {
            Logger.getLogger(BoardMediumFrame.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        String symbol = Character.toString(symbols[1]);
       jb2.setText(symbol);
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        String symbol = Character.toString(symbols[2]);
       jb3.setText(symbol);
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        String symbol = Character.toString(symbols[3]);
       jb4.setText(symbol);
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        String symbol = Character.toString(symbols[4]);
       jb5.setText(symbol);
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        String symbol = Character.toString(symbols[5]);
       jb6.setText(symbol);
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        String symbol = Character.toString(symbols[6]);
       jb7.setText(symbol);
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        String symbol = Character.toString(symbols[7]);
       jb8.setText(symbol);
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        String symbol = Character.toString(symbols[8]);
       jb9.setText(symbol);
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb10ActionPerformed
        String symbol = Character.toString(symbols[9]);
       jb10.setText(symbol);
    }//GEN-LAST:event_jb10ActionPerformed

    private void jb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb11ActionPerformed
        String symbol = Character.toString(symbols[10]);
       jb11.setText(symbol);
    }//GEN-LAST:event_jb11ActionPerformed

    private void jb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb12ActionPerformed
        String symbol = Character.toString(symbols[11]);
       jb12.setText(symbol);
    }//GEN-LAST:event_jb12ActionPerformed

    private void jb13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb13ActionPerformed
        String symbol = Character.toString(symbols[12]);
       jb13.setText(symbol);
    }//GEN-LAST:event_jb13ActionPerformed

    private void jb14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb14ActionPerformed
        String symbol = Character.toString(symbols[13]);
       jb14.setText(symbol);
    }//GEN-LAST:event_jb14ActionPerformed

    private void jb15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb15ActionPerformed
        String symbol = Character.toString(symbols[14]);
       jb15.setText(symbol);
    }//GEN-LAST:event_jb15ActionPerformed

    private void jb16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb16ActionPerformed
        String symbol = Character.toString(symbols[15]);
       jb16.setText(symbol);
    }//GEN-LAST:event_jb16ActionPerformed

    private void jb17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb17ActionPerformed
        String symbol = Character.toString(symbols[16]);
       jb17.setText(symbol);
    }//GEN-LAST:event_jb17ActionPerformed

    private void jb18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb18ActionPerformed
        String symbol = Character.toString(symbols[17]);
       jb18.setText(symbol);
    }//GEN-LAST:event_jb18ActionPerformed

    private void jb19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb19ActionPerformed
        String symbol = Character.toString(symbols[18]);
       jb19.setText(symbol);
    }//GEN-LAST:event_jb19ActionPerformed

    private void jb20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb20ActionPerformed
        String symbol = Character.toString(symbols[19]);
       jb20.setText(symbol);
    }//GEN-LAST:event_jb20ActionPerformed

    private void jb21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb21ActionPerformed
        String symbol = Character.toString(symbols[20]);
       jb21.setText(symbol);
    }//GEN-LAST:event_jb21ActionPerformed

    private void jb22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb22ActionPerformed
        String symbol = Character.toString(symbols[21]);
       jb22.setText(symbol);
    }//GEN-LAST:event_jb22ActionPerformed

    private void jb23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb23ActionPerformed
        String symbol = Character.toString(symbols[22]);
       jb23.setText(symbol);
    }//GEN-LAST:event_jb23ActionPerformed

    private void jb24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb24ActionPerformed
        String symbol = Character.toString(symbols[23]);
       jb24.setText(symbol);
    }//GEN-LAST:event_jb24ActionPerformed

    private void jbMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMainMenuActionPerformed
        this.dispose();
        MainFrame mainFrame =  new MainFrame();
        mainFrame.setVisible(true);
    }//GEN-LAST:event_jbMainMenuActionPerformed

    private void jbHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHelpActionPerformed
        HelpFrame helpFrame = new HelpFrame();
        helpFrame.setVisible(true);
    }//GEN-LAST:event_jbHelpActionPerformed

    private void jbQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbQuitActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb10;
    private javax.swing.JButton jb11;
    private javax.swing.JButton jb12;
    private javax.swing.JButton jb13;
    private javax.swing.JButton jb14;
    private javax.swing.JButton jb15;
    private javax.swing.JButton jb16;
    private javax.swing.JButton jb17;
    private javax.swing.JButton jb18;
    private javax.swing.JButton jb19;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb20;
    private javax.swing.JButton jb21;
    private javax.swing.JButton jb22;
    private javax.swing.JButton jb23;
    private javax.swing.JButton jb24;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbHelp;
    private javax.swing.JButton jbMainMenu;
    private javax.swing.JButton jbQuit;
    private javax.swing.JLabel jlMTitle;
    private javax.swing.JLabel jlP1Matches;
    private javax.swing.JLabel jlP1Name;
    private javax.swing.JLabel jlP1Wins;
    private javax.swing.JLabel jlP2Matches;
    private javax.swing.JLabel jlP2Name;
    private javax.swing.JLabel jlP2Wins;
    private javax.swing.JPanel jpMGameArea;
    private javax.swing.JPanel jpMTitle;
    // End of variables declaration//GEN-END:variables
}
