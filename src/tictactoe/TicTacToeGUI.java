/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Yashashvini
 */
public class TicTacToeGUI extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToeGUI
     */
    
    private String startgame = "X";
    private int xcount = 0;
    private int ocount = 0;
    private int movecount = 0;
    
    
    
    
    public TicTacToeGUI() {
        initComponents();
    }

    
    private void scorecard()
    {
        p1text.setText(String.valueOf(xcount));
        p2text.setText(String.valueOf(ocount));
    }
    
    private void playerTurn()
    {
        if(startgame.equalsIgnoreCase("X"))
        {
            startgame="O";
        }
        else
        {
            startgame="X";
        }
    }
  
    private int  checkwinner()
    {
//       if (b1 == null && b2 == null && b3 == null && b4 == null && b5 == null && b6 == null && b7 == null && b8 == null && b9 == null) {
//        System.out.println("One or more buttons are null.");
//        return 0;
//       }
//        if (b1.equals(" ") && b2.equals(" ") && b3.equals(" ") && b4.equals(" ") && b5.equals(" ") && b6.equals(" ") && b7.equals(" ") && b8.equals(" ") && b9 == null) {
//        System.out.println("One or more buttons are null.");
//        return 0;
//        }
       String B1 = b1.getText();
       String B2 = b2.getText();
       String B3 = b3.getText();
       String B4 = b4.getText();
       String B5 = b5.getText();
       String B6 = b6.getText();
       String B7 = b7.getText();
       String B8 = b8.getText();
       String B9 = b9.getText();
       
        System.out.println("all strings \nB1 = "+B1+" B2 = "+B2+" B3 = "+B3+" B4 = "+B4+" B5 = "+B5+" B6 = "+B6+" B7 = "+B7+" B8 = "+B8+" B9 = "+B9+"\nfinished");
       
       if(B1.equalsIgnoreCase("x")&& B2.equalsIgnoreCase("x") && B3.equalsIgnoreCase("x")){
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scorecard();
            reset();
            return 0;
       }else if ( B1.equalsIgnoreCase("x")&& B4.equalsIgnoreCase("x") && B7.equalsIgnoreCase("x")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scorecard();
            reset();
            return 0;
        }else if (B1.equalsIgnoreCase("x")&& B5.equalsIgnoreCase("x") && B9.equalsIgnoreCase("x")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scorecard();
            reset();
            return 0;
        }else if (B2.equalsIgnoreCase("x")&& B5.equalsIgnoreCase("x") && B8.equalsIgnoreCase("x")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scorecard();
            reset();
            return 0;
        }else if (B3.equalsIgnoreCase("x") && B6.equalsIgnoreCase("x") && B9.equalsIgnoreCase("x")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scorecard();
            reset();
            return 0;
        }else if (B3.equalsIgnoreCase("x")&& B5.equalsIgnoreCase("x") && B7.equalsIgnoreCase("x")){
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scorecard();
            reset();
            return 0;
        }else if (B4.equalsIgnoreCase("x")&& B5.equalsIgnoreCase("x") && B6.equalsIgnoreCase("x")){
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scorecard();
            reset();
            return 0;
        }else if (B7.equalsIgnoreCase("x")&& B8.equalsIgnoreCase("x") && B9.equalsIgnoreCase("x")){
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            scorecard();
            reset();
            return 0;
        }else if(B1.equalsIgnoreCase("o")&& B2.equalsIgnoreCase("o") && B3.equalsIgnoreCase("o")){
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            scorecard();
            reset();
            return 0;
       }else if (B1.equalsIgnoreCase("o")&& B4.equalsIgnoreCase("o") && B7.equalsIgnoreCase("o")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            scorecard();
            reset();
            return 0;
        }else if (B1.equalsIgnoreCase("o")&& B5.equalsIgnoreCase("o") && B9.equalsIgnoreCase("o")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            scorecard();
            reset();
            return 0;
        }else if (B2.equalsIgnoreCase("o")&& B5.equalsIgnoreCase("o") && B8.equalsIgnoreCase("o")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            scorecard();
            reset();
            return 0;
        }else if (B3.equalsIgnoreCase("o")&& B6.equalsIgnoreCase("o") && B9.equalsIgnoreCase("o")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            scorecard();
            reset();
            return 0;
        }else if (B3.equalsIgnoreCase("o")&& B5.equalsIgnoreCase("o") && B7.equalsIgnoreCase("o")){
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            scorecard();
            reset();
            return 0;
        }else if (B4.equalsIgnoreCase("o")&& B5.equalsIgnoreCase("o") && B6.equalsIgnoreCase("o")){
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            scorecard();
            reset();
            return 0;
        }else if (B7.equalsIgnoreCase("o")&& B8.equalsIgnoreCase("o") && B9.equalsIgnoreCase("o")){
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            scorecard();
            reset();
            return 0;
        }else if(movecount == 9){
            JOptionPane.showMessageDialog(this, "Game tie...!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            reset();
            
        }
       return 0;
    }
    
    
    private void reset()
    {

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        
        movecount = 0;
//        winx = false;
//        wino = false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Upperpanel = new javax.swing.JPanel();
        TicTacToe = new javax.swing.JLabel();
        Lowerpanel = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        scoreboard = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        player2 = new javax.swing.JLabel();
        player1 = new javax.swing.JLabel();
        p2text = new javax.swing.JTextField();
        p1text = new javax.swing.JTextField();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC Tac Toe ");
        setResizable(false);

        Upperpanel.setBackground(new java.awt.Color(0, 204, 204));
        Upperpanel.setToolTipText("let's play ....!");
        Upperpanel.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        TicTacToe.setBackground(new java.awt.Color(0, 102, 102));
        TicTacToe.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        TicTacToe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TicTacToe.setText("Tic Tac Toe");

        javax.swing.GroupLayout UpperpanelLayout = new javax.swing.GroupLayout(Upperpanel);
        Upperpanel.setLayout(UpperpanelLayout);
        UpperpanelLayout.setHorizontalGroup(
            UpperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperpanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(TicTacToe, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        UpperpanelLayout.setVerticalGroup(
            UpperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperpanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(TicTacToe, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Lowerpanel.setBackground(new java.awt.Color(0, 102, 102));
        Lowerpanel.setForeground(new java.awt.Color(0, 102, 102));

        b1.setBackground(new java.awt.Color(0, 51, 51));
        b1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 204, 204));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(0, 51, 51));
        b2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 204, 204));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(0, 51, 51));
        b3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 204, 204));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(0, 51, 51));
        b4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b4.setForeground(new java.awt.Color(0, 204, 204));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        scoreboard.setBackground(new java.awt.Color(0, 51, 51));
        scoreboard.setForeground(new java.awt.Color(0, 204, 204));

        Exit.setBackground(new java.awt.Color(0, 51, 51));
        Exit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Exit.setForeground(new java.awt.Color(0, 204, 204));
        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(0, 51, 51));
        Reset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Reset.setForeground(new java.awt.Color(0, 204, 204));
        Reset.setText("RESET");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        player2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        player2.setForeground(new java.awt.Color(255, 255, 255));
        player2.setText("Player 2 :");

        player1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        player1.setForeground(new java.awt.Color(255, 255, 255));
        player1.setText("Player 1 :");

        p2text.setEditable(false);
        p2text.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p2text.setToolTipText("match win");
        p2text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2textActionPerformed(evt);
            }
        });

        p1text.setEditable(false);
        p1text.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p1text.setToolTipText("match win");
        p1text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout scoreboardLayout = new javax.swing.GroupLayout(scoreboard);
        scoreboard.setLayout(scoreboardLayout);
        scoreboardLayout.setHorizontalGroup(
            scoreboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scoreboardLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(scoreboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset))
                .addGap(76, 76, 76))
            .addGroup(scoreboardLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(scoreboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p1text, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(scoreboardLayout.createSequentialGroup()
                        .addComponent(player2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p2text, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(scoreboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(scoreboardLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(player1)
                    .addContainerGap(165, Short.MAX_VALUE)))
        );
        scoreboardLayout.setVerticalGroup(
            scoreboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scoreboardLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(p1text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(scoreboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2)
                    .addComponent(p2text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(Reset)
                .addGap(32, 32, 32)
                .addComponent(Exit)
                .addGap(21, 21, 21))
            .addGroup(scoreboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(scoreboardLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(player1)
                    .addContainerGap(224, Short.MAX_VALUE)))
        );

        b5.setBackground(new java.awt.Color(0, 51, 51));
        b5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b5.setForeground(new java.awt.Color(0, 204, 204));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(0, 51, 51));
        b6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b6.setForeground(new java.awt.Color(0, 204, 204));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(0, 51, 51));
        b7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b7.setForeground(new java.awt.Color(0, 204, 204));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(0, 51, 51));
        b8.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b8.setForeground(new java.awt.Color(0, 204, 204));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(0, 51, 51));
        b9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        b9.setForeground(new java.awt.Color(0, 204, 204));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LowerpanelLayout = new javax.swing.GroupLayout(Lowerpanel);
        Lowerpanel.setLayout(LowerpanelLayout);
        LowerpanelLayout.setHorizontalGroup(
            LowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LowerpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LowerpanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(LowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(LowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(LowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(LowerpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(scoreboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        LowerpanelLayout.setVerticalGroup(
            LowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LowerpanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(LowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scoreboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LowerpanelLayout.createSequentialGroup()
                        .addGroup(LowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(LowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(LowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LowerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Upperpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Lowerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Upperpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lowerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        b1.setText(startgame);
        if(startgame.equalsIgnoreCase("x"))
        {
            b1.setForeground(Color.red);
        }
        else
        {
            b1.setForeground(Color.yellow);
        }
        playerTurn();
        b1.setEnabled(false);
        movecount++;
        checkwinner();

    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        b2.setText(startgame);
        if(startgame.equalsIgnoreCase("x"))
        {
            b2.setForeground(Color.red);
        }
        else
        {
            b2.setForeground(Color.yellow);
        }
        playerTurn();
        b2.setEnabled(false);
        movecount++;
        checkwinner();

    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        b3.setText(startgame);
        if(startgame.equalsIgnoreCase("x"))
        {
            b3.setForeground(Color.red);
        }
        else
        {
            b3.setForeground(Color.yellow);
        }
        playerTurn();
        b3.setEnabled(false);
        movecount++;
        checkwinner();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        b4.setText(startgame);
        if(startgame.equalsIgnoreCase("x"))
        {
            b4.setForeground(Color.red);
        }
        else
        {
            b4.setForeground(Color.yellow);
        }
        playerTurn();
        b4.setEnabled(false);
        movecount++;
        checkwinner();
    }//GEN-LAST:event_b4ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        JFrame frame = new JFrame();
        if(JOptionPane.showConfirmDialog(frame, "Do you want to exit ?","Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        reset();
    }//GEN-LAST:event_ResetActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        b5.setText(startgame);
        if(startgame.equalsIgnoreCase("x"))
        {
            b5.setForeground(Color.red);
        }
        else
        {
            b5.setForeground(Color.yellow);
        }
        playerTurn();
        b5.setEnabled(false);
        movecount++;
        checkwinner();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
       b6.setText(startgame);
        if(startgame.equalsIgnoreCase("x"))
        {
            b6.setForeground(Color.red);
        }
        else
        {
            b6.setForeground(Color.yellow);
        }
        playerTurn();
        b6.setEnabled(false);
        movecount++;
        checkwinner();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        b7.setText(startgame);
        if(startgame.equalsIgnoreCase("x"))
        {
            b7.setForeground(Color.red);
        }
        else
        {
            b7.setForeground(Color.yellow);
        }
        playerTurn();
        b7.setEnabled(false);
        movecount++;
        checkwinner();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        b8.setText(startgame);
        if(startgame.equalsIgnoreCase("x"))
        {
            b8.setForeground(Color.red);
        }
        else
        {
            b8.setForeground(Color.yellow);
        }
        playerTurn();
        b8.setEnabled(false);
        movecount++;
        checkwinner();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        b9.setText(startgame);
        if(startgame.equalsIgnoreCase("x"))
        {
            b9.setForeground(Color.red);
        }
        else
        {
            b9.setForeground(Color.yellow);
        }
        playerTurn();
        b9.setEnabled(false);
        movecount++;
        checkwinner();
    }//GEN-LAST:event_b9ActionPerformed

    private void p1textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1textActionPerformed
        scorecard();
        p1text.setEditable(false);
    }//GEN-LAST:event_p1textActionPerformed

    private void p2textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2textActionPerformed
        scorecard();
        p1text.setEditable(false);
    }//GEN-LAST:event_p2textActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JPanel Lowerpanel;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel TicTacToe;
    private javax.swing.JPanel Upperpanel;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField p1text;
    private javax.swing.JTextField p2text;
    private javax.swing.JLabel player1;
    private javax.swing.JLabel player2;
    private javax.swing.JPanel scoreboard;
    // End of variables declaration//GEN-END:variables
}
