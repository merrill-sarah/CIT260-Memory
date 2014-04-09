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
import citbyui.cit260.sarahjanis.memory.models.Card;
import citbyui.cit260.sarahjanis.memory.models.Player;
import citbyui.cit260.sarahjanis.memory.models.SymbolArray;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Janis
 */
public class BoardLargeFrame extends javax.swing.JFrame {
     private char symbols[];
     int indexTurn[];
    Game game;
    Board board;
    SymbolArray symArr;
    Player player1;
    Player player2;
    Card card1;
    Card card2;
    BoardLargeFrame lFrame;
    
    static int CLICKS;
    /**
     * Creates new form BoardLargeFrame
     */
    public BoardLargeFrame(Player player1, Player player2, char getSymbols[]) {
        initComponents();
        setLocationRelativeTo(null);
        symbols = getSymbols;
        jlP1Name.setText(player1.getName());
        jlP2Name.setText(player2.getName());
        CLICKS = 0;
        
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
        jbHelp = new javax.swing.JButton();
        jbQuit = new javax.swing.JButton();
        jbMainMenu = new javax.swing.JButton();
        jbContinue = new javax.swing.JButton();
        jpMGameArea = new javax.swing.JPanel();
        jbLButton1 = new javax.swing.JButton();
        jbLButton2 = new javax.swing.JButton();
        jbLButton3 = new javax.swing.JButton();
        jbLButton4 = new javax.swing.JButton();
        jbLButton5 = new javax.swing.JButton();
        jbLButton6 = new javax.swing.JButton();
        jbLButton7 = new javax.swing.JButton();
        jbLButton8 = new javax.swing.JButton();
        jbLButton9 = new javax.swing.JButton();
        jbLButton10 = new javax.swing.JButton();
        jbLButton11 = new javax.swing.JButton();
        jbLButton12 = new javax.swing.JButton();
        jbLButton13 = new javax.swing.JButton();
        jbLButton14 = new javax.swing.JButton();
        jbLButton15 = new javax.swing.JButton();
        jbLButton16 = new javax.swing.JButton();
        jbLButton17 = new javax.swing.JButton();
        jbLButton18 = new javax.swing.JButton();
        jbLButton19 = new javax.swing.JButton();
        jbLButton20 = new javax.swing.JButton();
        jbLButton21 = new javax.swing.JButton();
        jbLButton22 = new javax.swing.JButton();
        jbLButton23 = new javax.swing.JButton();
        jbLButton24 = new javax.swing.JButton();
        jbLButton25 = new javax.swing.JButton();
        jbLButton26 = new javax.swing.JButton();
        jbLButton27 = new javax.swing.JButton();
        jbLButton28 = new javax.swing.JButton();
        jbLButton29 = new javax.swing.JButton();
        jbLButton30 = new javax.swing.JButton();
        jbLButton31 = new javax.swing.JButton();
        jbLButton32 = new javax.swing.JButton();
        jbLButton33 = new javax.swing.JButton();
        jbLButton34 = new javax.swing.JButton();
        jbLButton35 = new javax.swing.JButton();
        jbLButton36 = new javax.swing.JButton();
        jbLButton37 = new javax.swing.JButton();
        jbLButton38 = new javax.swing.JButton();
        jbLButton39 = new javax.swing.JButton();
        jbLButton40 = new javax.swing.JButton();
        jbLButton41 = new javax.swing.JButton();
        jbLButton42 = new javax.swing.JButton();
        jbLButton43 = new javax.swing.JButton();
        jbLButton44 = new javax.swing.JButton();
        jbLButton45 = new javax.swing.JButton();
        jbLButton46 = new javax.swing.JButton();
        jbLButton47 = new javax.swing.JButton();
        jbLButton48 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbQuit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jbHelp, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jbHelp)
                .addGap(37, 37, 37)
                .addComponent(jbQuit)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jbMainMenu.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jbMainMenu.setForeground(new java.awt.Color(0, 153, 153));
        jbMainMenu.setText("MAIN MENU");
        jbMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMainMenuActionPerformed(evt);
            }
        });

        jbContinue.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jbContinue.setForeground(new java.awt.Color(0, 153, 153));
        jbContinue.setText("CONTINUE");
        jbContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMTitleLayout = new javax.swing.GroupLayout(jpMTitle);
        jpMTitle.setLayout(jpMTitleLayout);
        jpMTitleLayout.setHorizontalGroup(
            jpMTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMTitleLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jlMTitle)
                .addGap(310, 310, 310)
                .addGroup(jpMTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpMTitleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbContinue)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpMTitleLayout.setVerticalGroup(
            jpMTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpMTitleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbContinue))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpMTitleLayout.createSequentialGroup()
                        .addGroup(jpMTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbMainMenu)
                            .addComponent(jlMTitle)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpMGameArea.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 153, 153)));
        jpMGameArea.setLayout(new java.awt.GridLayout(6, 8, 10, 10));

        jbLButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton1.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton1.setText("1");
        jbLButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton1ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton1);

        jbLButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton2.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton2.setText("2");
        jbLButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton2ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton2);

        jbLButton3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton3.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton3.setText("3");
        jbLButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton3ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton3);

        jbLButton4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton4.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton4.setText("4");
        jbLButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton4ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton4);

        jbLButton5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton5.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton5.setText("5");
        jbLButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton5ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton5);

        jbLButton6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton6.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton6.setText("6");
        jbLButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton6ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton6);

        jbLButton7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton7.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton7.setText("7");
        jbLButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton7ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton7);

        jbLButton8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton8.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton8.setText("8");
        jbLButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton8ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton8);

        jbLButton9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton9.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton9.setText("9");
        jbLButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton9ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton9);

        jbLButton10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton10.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton10.setText("10");
        jbLButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton10ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton10);

        jbLButton11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton11.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton11.setText("11");
        jbLButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton11ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton11);

        jbLButton12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton12.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton12.setText("12");
        jbLButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton12ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton12);

        jbLButton13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton13.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton13.setText("13");
        jbLButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton13ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton13);

        jbLButton14.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton14.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton14.setText("14");
        jbLButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton14ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton14);

        jbLButton15.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton15.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton15.setText("15");
        jbLButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton15ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton15);

        jbLButton16.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton16.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton16.setText("16");
        jbLButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLButton16ActionPerformed(evt);
            }
        });
        jpMGameArea.add(jbLButton16);

        jbLButton17.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton17.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton17.setText("17");
        jpMGameArea.add(jbLButton17);

        jbLButton18.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton18.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton18.setText("18");
        jpMGameArea.add(jbLButton18);

        jbLButton19.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton19.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton19.setText("19");
        jpMGameArea.add(jbLButton19);

        jbLButton20.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton20.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton20.setText("20");
        jpMGameArea.add(jbLButton20);

        jbLButton21.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton21.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton21.setText("21");
        jpMGameArea.add(jbLButton21);

        jbLButton22.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton22.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton22.setText("22");
        jpMGameArea.add(jbLButton22);

        jbLButton23.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton23.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton23.setText("23");
        jpMGameArea.add(jbLButton23);

        jbLButton24.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton24.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton24.setText("24");
        jpMGameArea.add(jbLButton24);

        jbLButton25.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton25.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton25.setText("25");
        jpMGameArea.add(jbLButton25);

        jbLButton26.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton26.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton26.setText("26");
        jpMGameArea.add(jbLButton26);

        jbLButton27.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton27.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton27.setText("27");
        jpMGameArea.add(jbLButton27);

        jbLButton28.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton28.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton28.setText("28");
        jpMGameArea.add(jbLButton28);

        jbLButton29.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton29.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton29.setText("29");
        jpMGameArea.add(jbLButton29);

        jbLButton30.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton30.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton30.setText("30");
        jpMGameArea.add(jbLButton30);

        jbLButton31.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton31.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton31.setText("31");
        jpMGameArea.add(jbLButton31);

        jbLButton32.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton32.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton32.setText("32");
        jpMGameArea.add(jbLButton32);

        jbLButton33.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton33.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton33.setText("33");
        jpMGameArea.add(jbLButton33);

        jbLButton34.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton34.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton34.setText("34");
        jpMGameArea.add(jbLButton34);

        jbLButton35.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton35.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton35.setText("35");
        jpMGameArea.add(jbLButton35);

        jbLButton36.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton36.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton36.setText("36");
        jpMGameArea.add(jbLButton36);

        jbLButton37.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton37.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton37.setText("37");
        jpMGameArea.add(jbLButton37);

        jbLButton38.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton38.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton38.setText("38");
        jpMGameArea.add(jbLButton38);

        jbLButton39.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton39.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton39.setText("39");
        jpMGameArea.add(jbLButton39);

        jbLButton40.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton40.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton40.setText("40");
        jpMGameArea.add(jbLButton40);

        jbLButton41.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton41.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton41.setText("41");
        jpMGameArea.add(jbLButton41);

        jbLButton42.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton42.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton42.setText("42");
        jpMGameArea.add(jbLButton42);

        jbLButton43.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton43.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton43.setText("43");
        jpMGameArea.add(jbLButton43);

        jbLButton44.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton44.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton44.setText("44");
        jpMGameArea.add(jbLButton44);

        jbLButton45.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton45.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton45.setText("45");
        jpMGameArea.add(jbLButton45);

        jbLButton46.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton46.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton46.setText("46");
        jpMGameArea.add(jbLButton46);

        jbLButton47.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton47.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton47.setText("47");
        jpMGameArea.add(jbLButton47);

        jbLButton48.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jbLButton48.setForeground(new java.awt.Color(0, 153, 153));
        jbLButton48.setText("48");
        jpMGameArea.add(jbLButton48);

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
                .addContainerGap()
                .addComponent(jpMTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpMGameArea, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    private void jbLButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton1ActionPerformed
        CLICKS++;
        boolean matched = false;
       
        String symbol = Character.toString(symbols[0]); // index should be button#-1
        jbLButton1.setText(symbol);
        setIndices(0); //save the index of this card to an array
        if (CLICKS ==2){
            matched = checkMatch();
            CLICKS =0;
            } 
        if (matched == true){
            jbLButton1.setText("");}
        else if (matched == false)
          jbLButton1.setText("1");  
    }//GEN-LAST:event_jbLButton1ActionPerformed
    void setIndices(int index){
        
        int [] indexTurn = new int[2];
        if (CLICKS == 1){
            indexTurn[0]= indexTurn[index];
        }
        else if (CLICKS ==2){
          indexTurn[1]= indexTurn[index];
        }
      
    }
    
    boolean checkMatch(){
        
        if (symbols[indexTurn[0]]== symbols[indexTurn[1]])
          return true;
        else
            return false;
    }
    
    
    
    private void jbLButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton2ActionPerformed
         CLICKS++;
        boolean matched = false;
       
        String symbol = Character.toString(symbols[1]);// index should be button#-1
        jbLButton2.setText(symbol);
        setIndices(1); //save the index of this card to an array -- index should be button#-1
        if (CLICKS ==2){
            matched = checkMatch();
            CLICKS =0;
            } 
        if (matched == true){
            jbLButton2.setText("");}
        else if (matched == false)
          jbLButton2.setText("2");  
       
    }//GEN-LAST:event_jbLButton2ActionPerformed

    private void jbLButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton3ActionPerformed

    private void jbLButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton4ActionPerformed

    private void jbLButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton5ActionPerformed

    private void jbLButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton6ActionPerformed

    private void jbLButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton7ActionPerformed

    private void jbLButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton8ActionPerformed

    private void jbLButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton9ActionPerformed

    private void jbLButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton10ActionPerformed

    private void jbLButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton11ActionPerformed

    private void jbLButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton12ActionPerformed

    private void jbLButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton13ActionPerformed

    private void jbLButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton14ActionPerformed

    private void jbLButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton15ActionPerformed

    private void jbLButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbLButton16ActionPerformed

    private void jbContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContinueActionPerformed
        if (CLICKS!=2){setVisible(false);}
    
        
        
        
        
    }//GEN-LAST:event_jbContinueActionPerformed

    public void buttonsStatusHandler(int[] index1st, int[] index2nd){
    
    }
    
    public void trial(){
        jbLButton1.setText("trial");
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbContinue;
    private javax.swing.JButton jbHelp;
    private javax.swing.JButton jbLButton1;
    private javax.swing.JButton jbLButton10;
    private javax.swing.JButton jbLButton11;
    private javax.swing.JButton jbLButton12;
    private javax.swing.JButton jbLButton13;
    private javax.swing.JButton jbLButton14;
    private javax.swing.JButton jbLButton15;
    private javax.swing.JButton jbLButton16;
    private javax.swing.JButton jbLButton17;
    private javax.swing.JButton jbLButton18;
    private javax.swing.JButton jbLButton19;
    private javax.swing.JButton jbLButton2;
    private javax.swing.JButton jbLButton20;
    private javax.swing.JButton jbLButton21;
    private javax.swing.JButton jbLButton22;
    private javax.swing.JButton jbLButton23;
    private javax.swing.JButton jbLButton24;
    private javax.swing.JButton jbLButton25;
    private javax.swing.JButton jbLButton26;
    private javax.swing.JButton jbLButton27;
    private javax.swing.JButton jbLButton28;
    private javax.swing.JButton jbLButton29;
    private javax.swing.JButton jbLButton3;
    private javax.swing.JButton jbLButton30;
    private javax.swing.JButton jbLButton31;
    private javax.swing.JButton jbLButton32;
    private javax.swing.JButton jbLButton33;
    private javax.swing.JButton jbLButton34;
    private javax.swing.JButton jbLButton35;
    private javax.swing.JButton jbLButton36;
    private javax.swing.JButton jbLButton37;
    private javax.swing.JButton jbLButton38;
    private javax.swing.JButton jbLButton39;
    private javax.swing.JButton jbLButton4;
    private javax.swing.JButton jbLButton40;
    private javax.swing.JButton jbLButton41;
    private javax.swing.JButton jbLButton42;
    private javax.swing.JButton jbLButton43;
    private javax.swing.JButton jbLButton44;
    private javax.swing.JButton jbLButton45;
    private javax.swing.JButton jbLButton46;
    private javax.swing.JButton jbLButton47;
    private javax.swing.JButton jbLButton48;
    private javax.swing.JButton jbLButton5;
    private javax.swing.JButton jbLButton6;
    private javax.swing.JButton jbLButton7;
    private javax.swing.JButton jbLButton8;
    private javax.swing.JButton jbLButton9;
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
