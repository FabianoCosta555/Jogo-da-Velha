/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha.design;

import jogodavelha.design.TelaJogo;
import java.awt.Color;

/**
 *
 * @author Fabiano
 */
public class TelaInicialJogo extends javax.swing.JFrame {

    public TelaInicialJogo() {
        initComponents();

            
            radFacil.setVisible(false);
            radMedio.setVisible(false);
            radDificil.setVisible(false);
            
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        radComputador = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtNomeJogador2 = new javax.swing.JTextField();
        btnComecar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSimbolo2 = new javax.swing.JTextField();
        radDificil = new javax.swing.JRadioButton();
        radFacil = new javax.swing.JRadioButton();
        radMedio = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeJogador1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSimbolo1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setLocation(new java.awt.Point(300, 150));
        setMinimumSize(new java.awt.Dimension(450, 470));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 51, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 255));
        jLabel3.setText("Jogar contra:");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        radComputador.setBackground(new java.awt.Color(153, 153, 255));
        radComputador.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        radComputador.setForeground(new java.awt.Color(255, 204, 255));
        radComputador.setText("Computador");
        radComputador.setOpaque(false);
        radComputador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radComputadorActionPerformed(evt);
            }
        });
        jPanel1.add(radComputador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 51, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setText("Jogador 2:");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txtNomeJogador2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNomeJogador2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtNomeJogador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 50, 90, -1));

        btnComecar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnComecar.setText("COMEÇAR");
        btnComecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComecarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComecar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 366, 40));

        jLabel6.setBackground(new java.awt.Color(0, 51, 153));
        jLabel6.setForeground(new java.awt.Color(255, 204, 255));
        jLabel6.setText("Digite seu Simbolo para o Tabuleiro  Exemplo:  \"X\" ou \"O\".");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtSimbolo2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(txtSimbolo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 27, -1));

        radDificil.setBackground(new java.awt.Color(0, 51, 153));
        radDificil.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        radDificil.setForeground(new java.awt.Color(0, 0, 102));
        radDificil.setText("Dificil");
        radDificil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        radDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDificilActionPerformed(evt);
            }
        });
        jPanel1.add(radDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 60, -1));

        radFacil.setBackground(new java.awt.Color(0, 51, 153));
        radFacil.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        radFacil.setForeground(new java.awt.Color(0, 0, 102));
        radFacil.setText("Fácil");
        radFacil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        radFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFacilActionPerformed(evt);
            }
        });
        jPanel1.add(radFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        radMedio.setBackground(new java.awt.Color(0, 51, 153));
        radMedio.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        radMedio.setForeground(new java.awt.Color(0, 0, 102));
        radMedio.setText("Médio");
        radMedio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        radMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radMedioActionPerformed(evt);
            }
        });
        jPanel1.add(radMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 210, 80));

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 410, 220));

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setText("Jogador 1:");
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        txtNomeJogador1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtNomeJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 90, -1));

        jLabel5.setBackground(new java.awt.Color(0, 51, 153));
        jLabel5.setForeground(new java.awt.Color(255, 204, 255));
        jLabel5.setText("Digite seu Simbolo para o Tabuleiro Exemplo: \"X\" ou \"O\".");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        txtSimbolo1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtSimbolo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 27, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 410, 110));

        jLabel4.setBackground(new java.awt.Color(0, 153, 102));
        jLabel4.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("JOGO DA VELHA 2.0");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 310, 60));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fabiano\\Pictures\\celula-tronco.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean versusComputador;
    String nome1;
    String nome2;
    String simbolo1;
    String simbolo2;
    int dificuldade=0;

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }
    
    
    


    private void btnComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComecarActionPerformed

        if (versusComputador) {
            txtNomeJogador2.setText("Computador");
        }

        nome1 = txtNomeJogador1.getText();
        nome2 = txtNomeJogador2.getText();
        simbolo1 = txtSimbolo1.getText().toUpperCase();
        simbolo2 = txtSimbolo2.getText().toUpperCase();

        if (simbolo1.equals("")) {
            if (!simbolo2.equals("X")) {
                simbolo1 = "X";
            } else {
                simbolo1 = "O";
            }

        }
        if (simbolo2.equals("")) {
            if (!simbolo1.equals("O")) {
                simbolo2 = "O";
            } else {
                simbolo2 = "X";
            }

        }

        TelaJogo jogarTelaJogo = new TelaJogo(nome1, nome2, simbolo1, simbolo2, versusComputador, dificuldade);

        jogarTelaJogo.setVisible(true);
        jogarTelaJogo.novaPartida();
       
        
        dispose();

    }//GEN-LAST:event_btnComecarActionPerformed

    private void radComputadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radComputadorActionPerformed

        if (radComputador.isSelected()) {
            txtNomeJogador2.setEnabled(false);
            radFacil.setVisible(true);
            radFacil.setForeground(Color.white);
            
          radMedio.setVisible(true);
           radMedio.setForeground(Color.white);
            radDificil.setVisible(true);
            radDificil.setForeground(Color.white);
            
            txtNomeJogador2.setBackground(Color.gray);
            txtSimbolo2.setBackground(Color.gray);
            versusComputador = true;

        }
        if (radComputador.isSelected() == false) {
           radFacil.setVisible(false);
            radMedio.setVisible(false);
            radDificil.setVisible(false);
            txtNomeJogador2.setEnabled(true);
            txtNomeJogador2.setBackground(Color.white);
            txtSimbolo2.setBackground(Color.white);
            versusComputador = false;
            dificuldade=0;
            
        }
    }//GEN-LAST:event_radComputadorActionPerformed

    private void radDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDificilActionPerformed
        radMedio.setSelected(false);
         radFacil.setSelected(false);
        dificuldade=2;
    }//GEN-LAST:event_radDificilActionPerformed

    private void radFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFacilActionPerformed
       radMedio.setSelected(false);
        radDificil.setSelected(false);
        dificuldade=0;
    }//GEN-LAST:event_radFacilActionPerformed

    private void radMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radMedioActionPerformed
        radDificil.setSelected(false);
        radFacil.setSelected(false);
        dificuldade=1;
    }//GEN-LAST:event_radMedioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicialJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialJogo().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComecar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton radComputador;
    private javax.swing.JRadioButton radDificil;
    private javax.swing.JRadioButton radFacil;
    private javax.swing.JRadioButton radMedio;
    private javax.swing.JTextField txtNomeJogador1;
    private javax.swing.JTextField txtNomeJogador2;
    private javax.swing.JTextField txtSimbolo1;
    private javax.swing.JTextField txtSimbolo2;
    // End of variables declaration//GEN-END:variables
}
