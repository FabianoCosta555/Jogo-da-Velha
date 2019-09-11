/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha.design;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Fabiano
 */
public class TelaJogo extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogo
     *
     * @param nome1
     * @param nome2
     * @param simbolo1
     * @param simbolo2
     */
    public TelaJogo(String nome1, String nome2, String simbolo1, String simbolo2, Boolean computador, int dificuldades) {
        initComponents();

        jogador1 = nome1;
        lblJogador1.setText(jogador1);
        lblGeralJogador1.setText(jogador1);

        jogador2 = nome2;
        lblJogador2.setText(jogador2);
        lblGeralJogador2.setText(jogador2);

        versusComputador = computador;

        dificuldade = dificuldades;

        this.simbolo1 = simbolo1.toUpperCase();
        lblSimbolo1.setText(this.simbolo1);

        this.simbolo2 = simbolo2.toUpperCase();
        lblSimbolo2.setText(this.simbolo2);

        letraVerificadora = this.simbolo2.toUpperCase();

        lblPainelInforma.setText("> " + jogador1 + "  começa < ");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTabuleiro = new javax.swing.JPanel();
        lblC1 = new javax.swing.JLabel();
        lblC2 = new javax.swing.JLabel();
        lblC3 = new javax.swing.JLabel();
        lblC4 = new javax.swing.JLabel();
        lblC5 = new javax.swing.JLabel();
        lblC6 = new javax.swing.JLabel();
        lblC7 = new javax.swing.JLabel();
        lblC8 = new javax.swing.JLabel();
        lblC0 = new javax.swing.JLabel();
        panPainelPlacar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblPlacarJogador2 = new javax.swing.JLabel();
        lblPlacarVoce = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblNivelDificil = new javax.swing.JLabel();
        lblNivelFacil = new javax.swing.JLabel();
        lblNivelMedio = new javax.swing.JLabel();
        lblPlacarGeralJogador2 = new javax.swing.JLabel();
        lblPlacarVoce2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblGeralJogador1 = new javax.swing.JLabel();
        lblGeralJogador2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPlacarGeralJogador1 = new javax.swing.JLabel();
        lblPlacarJogador1 = new javax.swing.JLabel();
        lblJogador1 = new javax.swing.JLabel();
        lblJogador2 = new javax.swing.JLabel();
        lblSimbolo2 = new javax.swing.JLabel();
        lblSimbolo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblPainelInforma = new javax.swing.JLabel();
        btnNovaPartida = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setLocation(new java.awt.Point(100, 100));
        setMinimumSize(new java.awt.Dimension(671, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panTabuleiro.setBackground(new java.awt.Color(0, 0, 0));
        panTabuleiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblC1.setBackground(new java.awt.Color(51, 102, 255));
        lblC1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 70)); // NOI18N
        lblC1.setForeground(new java.awt.Color(240, 240, 240));
        lblC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC1.setToolTipText("");
        lblC1.setOpaque(true);
        lblC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC1MouseClicked(evt);
            }
        });
        panTabuleiro.add(lblC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 106, 85));

        lblC2.setBackground(new java.awt.Color(51, 102, 255));
        lblC2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 70)); // NOI18N
        lblC2.setForeground(new java.awt.Color(240, 240, 240));
        lblC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC2.setToolTipText("");
        lblC2.setOpaque(true);
        lblC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC2MouseClicked(evt);
            }
        });
        panTabuleiro.add(lblC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 106, 85));

        lblC3.setBackground(new java.awt.Color(51, 102, 255));
        lblC3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 70)); // NOI18N
        lblC3.setForeground(new java.awt.Color(240, 240, 240));
        lblC3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC3.setToolTipText("");
        lblC3.setAlignmentY(0.0F);
        lblC3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblC3.setOpaque(true);
        lblC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC3MouseClicked(evt);
            }
        });
        panTabuleiro.add(lblC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 106, 85));

        lblC4.setBackground(new java.awt.Color(51, 102, 255));
        lblC4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 70)); // NOI18N
        lblC4.setForeground(new java.awt.Color(240, 240, 240));
        lblC4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC4.setToolTipText("");
        lblC4.setOpaque(true);
        lblC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC4MouseClicked(evt);
            }
        });
        panTabuleiro.add(lblC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 106, 85));

        lblC5.setBackground(new java.awt.Color(51, 102, 255));
        lblC5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 70)); // NOI18N
        lblC5.setForeground(new java.awt.Color(240, 240, 240));
        lblC5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC5.setToolTipText("");
        lblC5.setOpaque(true);
        lblC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC5MouseClicked(evt);
            }
        });
        panTabuleiro.add(lblC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 106, 85));

        lblC6.setBackground(new java.awt.Color(51, 102, 255));
        lblC6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 70)); // NOI18N
        lblC6.setForeground(new java.awt.Color(240, 240, 240));
        lblC6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC6.setToolTipText("");
        lblC6.setAlignmentY(0.0F);
        lblC6.setOpaque(true);
        lblC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC6MouseClicked(evt);
            }
        });
        panTabuleiro.add(lblC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 106, 85));

        lblC7.setBackground(new java.awt.Color(51, 102, 255));
        lblC7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 70)); // NOI18N
        lblC7.setForeground(new java.awt.Color(240, 240, 240));
        lblC7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC7.setToolTipText("");
        lblC7.setOpaque(true);
        lblC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC7MouseClicked(evt);
            }
        });
        panTabuleiro.add(lblC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 106, 85));

        lblC8.setBackground(new java.awt.Color(51, 102, 255));
        lblC8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 70)); // NOI18N
        lblC8.setForeground(new java.awt.Color(240, 240, 240));
        lblC8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC8.setToolTipText("");
        lblC8.setOpaque(true);
        lblC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC8MouseClicked(evt);
            }
        });
        panTabuleiro.add(lblC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 106, 85));

        lblC0.setBackground(new java.awt.Color(51, 102, 255));
        lblC0.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 70)); // NOI18N
        lblC0.setForeground(new java.awt.Color(240, 240, 240));
        lblC0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC0.setToolTipText("");
        lblC0.setAlignmentY(0.0F);
        lblC0.setOpaque(true);
        lblC0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblC0MouseClicked(evt);
            }
        });
        panTabuleiro.add(lblC0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 106, 85));

        getContentPane().add(panTabuleiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 348, 288));

        panPainelPlacar.setBackground(new java.awt.Color(0, 102, 102));
        panPainelPlacar.setForeground(new java.awt.Color(255, 255, 255));
        panPainelPlacar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Nível");
        panPainelPlacar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 20));

        lblPlacarJogador2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblPlacarJogador2.setForeground(new java.awt.Color(204, 255, 255));
        lblPlacarJogador2.setText("0");
        panPainelPlacar.add(lblPlacarJogador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        lblPlacarVoce.setForeground(new java.awt.Color(204, 255, 255));
        lblPlacarVoce.setText("/3");
        panPainelPlacar.add(lblPlacarVoce, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Placar");
        panPainelPlacar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 20));

        lblNivelDificil.setForeground(new java.awt.Color(204, 255, 255));
        lblNivelDificil.setText("Difícil");
        panPainelPlacar.add(lblNivelDificil, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        lblNivelFacil.setForeground(new java.awt.Color(204, 255, 255));
        lblNivelFacil.setText("Fácil");
        panPainelPlacar.add(lblNivelFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        lblNivelMedio.setForeground(new java.awt.Color(204, 255, 255));
        lblNivelMedio.setText("Médio");
        panPainelPlacar.add(lblNivelMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        lblPlacarGeralJogador2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPlacarGeralJogador2.setForeground(new java.awt.Color(204, 255, 255));
        lblPlacarGeralJogador2.setText("0");
        panPainelPlacar.add(lblPlacarGeralJogador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        lblPlacarVoce2.setForeground(new java.awt.Color(204, 255, 255));
        lblPlacarVoce2.setText("/3");
        panPainelPlacar.add(lblPlacarVoce2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Placar Geral");
        panPainelPlacar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 20));

        lblGeralJogador1.setForeground(new java.awt.Color(204, 255, 255));
        lblGeralJogador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGeralJogador1.setText("Você");
        panPainelPlacar.add(lblGeralJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lblGeralJogador2.setForeground(new java.awt.Color(204, 255, 255));
        lblGeralJogador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGeralJogador2.setText("Computador");
        panPainelPlacar.add(lblGeralJogador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("/");
        panPainelPlacar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 10, -1));

        lblPlacarGeralJogador1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPlacarGeralJogador1.setForeground(new java.awt.Color(204, 255, 255));
        lblPlacarGeralJogador1.setText("0");
        panPainelPlacar.add(lblPlacarGeralJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lblPlacarJogador1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblPlacarJogador1.setForeground(new java.awt.Color(204, 255, 255));
        lblPlacarJogador1.setText("0");
        panPainelPlacar.add(lblPlacarJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblJogador1.setForeground(new java.awt.Color(153, 255, 255));
        lblJogador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogador1.setText("Jogador1");
        panPainelPlacar.add(lblJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblJogador2.setForeground(new java.awt.Color(153, 255, 255));
        lblJogador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJogador2.setText("Jogador2");
        panPainelPlacar.add(lblJogador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        lblSimbolo2.setForeground(new java.awt.Color(255, 0, 255));
        lblSimbolo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSimbolo2.setText("Simbolo2");
        panPainelPlacar.add(lblSimbolo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        lblSimbolo1.setForeground(new java.awt.Color(255, 0, 255));
        lblSimbolo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSimbolo1.setText("Simbolo1");
        panPainelPlacar.add(lblSimbolo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panPainelPlacar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 130));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panPainelPlacar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 100));

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panPainelPlacar.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 80));

        getContentPane().add(panPainelPlacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, 200, -1));

        lblPainelInforma.setBackground(new java.awt.Color(0, 153, 102));
        lblPainelInforma.setFont(new java.awt.Font("Perpetua", 3, 27)); // NOI18N
        lblPainelInforma.setForeground(new java.awt.Color(255, 255, 0));
        lblPainelInforma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPainelInforma.setOpaque(true);
        getContentPane().add(lblPainelInforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 348, 56));

        btnNovaPartida.setBackground(new java.awt.Color(0, 51, 204));
        btnNovaPartida.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnNovaPartida.setForeground(new java.awt.Color(255, 255, 255));
        btnNovaPartida.setText("NOVA PARTIDA ");
        btnNovaPartida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNovaPartida.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\Fabiano\\Pictures\\the matrix\\images.jpg")); // NOI18N
        btnNovaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 415, 350, 60));

        lblFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fabiano\\Pictures\\celulaNeuronios.jpg")); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String letraVerificadora;  //Letra verifica vez do jogador -- Sempre de forma Inversa
    private int partida = 0;
    private String ganhador = "";
    boolean deuVelha = false;

    private String jogador1;
    private String jogador2;
    private static boolean versusComputador;

    private String simbolo1;
    private String simbolo2;

    private int pontosJogador1 = 0;
    private int pontosJogador2 = 0;

    private int pontosGeralJogador1 = 0;
    private int pontosGeralJogador2 = 0;
    private String[] tab = new String[9];

    private String[] tabJog1 = new String[tab.length];
    private String[] tabJog2 = new String[tab.length];

    private int dificuldade;
    

    public void sorteioTabVazia() {

        //não ta dando em nada....DEBUGAR!!!!
        int cont = 0;

        Random sorteio = new Random();
        int result = sorteio.nextInt(tab.length);
        int parada = 0;

        atualizaCasas();
        //não ta dando em nada....DEBUGAR!!!!

        while (parada == 0) {
            cont += 1;

            if (result == 0) {

                if (tab[0].equals("")) {
                    lblC0.setText(letraVerificadora);

                    break;
                } else {
                    result = sorteio.nextInt(tab.length);
                }
            } //não ta dando em nada....DEBUGAR!!!!

            if (result == 1) {

                if (tab[1].equals("")) {
                    lblC1.setText(letraVerificadora);

                    break;
                } else {
                    result = sorteio.nextInt(tab.length);
                }
            }

            if (result == 2) {

                if (tab[2].equals("")) {
                    lblC2.setText(letraVerificadora);

                    break;
                } else {
                    result = sorteio.nextInt(tab.length);
                }
            }
            //não ta dando em nada....DEBUGAR!!!!
            if (result == 3) {

                if (tab[3].equals("")) {
                    lblC3.setText(letraVerificadora);

                    break;
                } else {
                    result = sorteio.nextInt(tab.length);
                }
            }

            if (result == 4) {

                if (tab[4].equals("")) {
                    lblC4.setText(letraVerificadora);

                    break;
                } else {
                    result = sorteio.nextInt(tab.length);
                }
            }
            //não ta dando em nada....DEBUGAR!!!!
            if (result == 5) {

                if (tab[5].equals("")) {
                    lblC5.setText(letraVerificadora);

                    break;
                } else {
                    result = sorteio.nextInt(tab.length);
                }
            }

            if (result == 6) {

                if (tab[6].equals("")) {
                    lblC6.setText(letraVerificadora);

                    break;
                } else {
                    result = sorteio.nextInt(tab.length);
                }
            }

            if (result == 7) {

                if (tab[7].equals("")) {
                    lblC7.setText(letraVerificadora);

                    break;
                } else {
                    result = sorteio.nextInt(tab.length);
                }
            }

            if (result == 8) {

                if (tab[8].equals("")) {
                    lblC8.setText(letraVerificadora);

                    break;
                } else {
                    result = sorteio.nextInt(tab.length);
                }

                //não ta dando em nada....DEBUGAR!!!!
            }

            if (cont == 50) {
                deuVelha = true;
                break;

            }
        }

    }

    public boolean verificaDefesa() {

        boolean defesa = false;

        //Verifica defesa na H1
        if (tab[0].equals(simbolo1) && tab[1].equals(simbolo1) && lblC2.getText().equals("")) {

            lblC2.setText(simbolo2);
            defesa = true;

        } else if (tab[0].equals(simbolo1) && tab[2].equals(simbolo1) && lblC1.getText().equals("")) {

            lblC1.setText(simbolo2);
            defesa = true;

        } else if (tab[1].equals(simbolo1) && tab[2].equals(simbolo1) && lblC0.getText().equals("")) {

            lblC0.setText(simbolo2);
            defesa = true;

        } //Verifica defesa na H2
        else if (tab[3].equals(simbolo1) && tab[4].equals(simbolo1) && lblC5.getText().equals("")) {

            lblC5.setText(simbolo2);
            defesa = true;

        } else if (tab[3].equals(simbolo1) && tab[5].equals(simbolo1) && lblC4.getText().equals("")) {

            lblC4.setText(simbolo2);
            defesa = true;

        } else if (tab[4].equals(simbolo1) && tab[5].equals(simbolo1) && lblC3.getText().equals("")) {

            lblC3.setText(simbolo2);
            defesa = true;

        } //Verifica defesa na H3
        else if (tab[6].equals(simbolo1) && tab[7].equals(simbolo1) && lblC8.getText().equals("")) {

            lblC8.setText(simbolo2);
            defesa = true;

        } else if (tab[7].equals(simbolo1) && tab[8].equals(simbolo1) && lblC6.getText().equals("")) {

            lblC6.setText(simbolo2);
            defesa = true;

        } else if (tab[6].equals(simbolo1) && tab[8].equals(simbolo1) && lblC7.getText().equals("")) {

            lblC7.setText(simbolo2);
            defesa = true;

        } //Verifica defesa na v1
        else if (tab[0].equals(simbolo1) && tab[3].equals(simbolo1) && lblC6.getText().equals("")) {

            lblC6.setText(simbolo2);
            defesa = true;

        } else if (tab[0].equals(simbolo1) && tab[6].equals(simbolo1) && lblC3.getText().equals("")) {

            lblC3.setText(simbolo2);
            defesa = true;

        } else if (tab[3].equals(simbolo1) && tab[6].equals(simbolo1) && lblC0.getText().equals("")) {

            lblC0.setText(simbolo2);
            defesa = true;

        } //Verifica defesa na v2
        else if (tab[1].equals(simbolo1) && tab[4].equals(simbolo1) && lblC7.getText().equals("")) {

            lblC7.setText(simbolo2);
            defesa = true;

        } else if (tab[1].equals(simbolo1) && tab[7].equals(simbolo1) && lblC4.getText().equals("")) {

            lblC4.setText(simbolo2);
            defesa = true;

        } else if (tab[4].equals(simbolo1) && tab[7].equals(simbolo1) && lblC1.getText().equals("")) {

            lblC1.setText(simbolo2);
            defesa = true;

        } //Verifica defesa na v3
        else if (tab[2].equals(simbolo1) && tab[5].equals(simbolo1) && lblC8.getText().equals("")) {

            lblC8.setText(simbolo2);
            defesa = true;

        } else if (tab[2].equals(simbolo1) && tab[8].equals(simbolo1) && lblC5.getText().equals("")) {

            lblC5.setText(simbolo2);
            defesa = true;

        } else if (tab[5].equals(simbolo1) && tab[8].equals(simbolo1) && lblC2.getText().equals("")) {

            lblC2.setText(simbolo2);
            defesa = true;

        } //Verifica defesa na D1
        else if (tab[0].equals(simbolo1) && tab[4].equals(simbolo1) && lblC8.getText().equals("")) {

            lblC8.setText(simbolo2);
            defesa = true;

        } else if (tab[0].equals(simbolo1) && tab[8].equals(simbolo1) && lblC4.getText().equals("")) {

            lblC4.setText(simbolo2);
            defesa = true;

        } else if (tab[4].equals(simbolo1) && tab[8].equals(simbolo1) && lblC0.getText().equals("")) {

            lblC0.setText(simbolo2);
            defesa = true;

        } //Verifica defesa na D2
        else if (tab[2].equals(simbolo1) && tab[6].equals(simbolo1) && lblC4.getText().equals("")) {

            lblC4.setText(simbolo2);
            defesa = true;

        } else if (tab[2].equals(simbolo1) && tab[4].equals(simbolo1) && lblC6.getText().equals("")) {

            lblC6.setText(simbolo2);
            defesa = true;

        } else if (tab[4].equals(simbolo1) && tab[6].equals(simbolo1) && lblC2.getText().equals("")) {

            lblC2.setText(simbolo2);
            defesa = true;

        }

        if (defesa == true) {
            atualizaCasas();
        }

        return defesa;
    }

    public boolean verificaAtaque() {

        boolean ataque = false;

        //Verifica defesa na H1
        if (tab[0].equals(simbolo2) && tab[1].equals(simbolo2) && lblC2.getText().equals("")) {

            lblC2.setText(simbolo2);
            ataque = true;

        } else if (tab[0].equals(simbolo2) && tab[2].equals(simbolo2) && lblC1.getText().equals("")) {

            lblC1.setText(simbolo2);
            ataque = true;

        } else if (tab[1].equals(simbolo2) && tab[2].equals(simbolo2) && lblC0.getText().equals("")) {

            lblC0.setText(simbolo2);
            ataque = true;

        } //Verifica defesa na H2
        else if (tab[3].equals(simbolo2) && tab[4].equals(simbolo2) && lblC5.getText().equals("")) {

            lblC5.setText(simbolo2);
            ataque = true;

        } else if (tab[3].equals(simbolo2) && tab[5].equals(simbolo2) && lblC4.getText().equals("")) {

            lblC4.setText(simbolo2);
            ataque = true;

        } else if (tab[4].equals(simbolo2) && tab[5].equals(simbolo2) && lblC3.getText().equals("")) {

            lblC3.setText(simbolo2);
            ataque = true;

        } //Verifica defesa na H3
        else if (tab[6].equals(simbolo2) && tab[7].equals(simbolo2) && lblC8.getText().equals("")) {

            lblC8.setText(simbolo2);
            ataque = true;

        } else if (tab[7].equals(simbolo2) && tab[8].equals(simbolo2) && lblC6.getText().equals("")) {

            lblC6.setText(simbolo2);
            ataque = true;

        } else if (tab[6].equals(simbolo2) && tab[8].equals(simbolo2) && lblC7.getText().equals("")) {

            lblC7.setText(simbolo2);
            ataque = true;

        } //Verifica defesa na v1
        else if (tab[0].equals(simbolo2) && tab[3].equals(simbolo2) && lblC6.getText().equals("")) {

            lblC6.setText(simbolo2);
            ataque = true;

        } else if (tab[0].equals(simbolo2) && tab[6].equals(simbolo2) && lblC3.getText().equals("")) {

            lblC3.setText(simbolo2);
            ataque = true;

        } else if (tab[3].equals(simbolo2) && tab[6].equals(simbolo2) && lblC0.getText().equals("")) {

            lblC0.setText(simbolo2);
            ataque = true;

        } //Verifica defesa na v2
        else if (tab[1].equals(simbolo2) && tab[4].equals(simbolo2) && lblC7.getText().equals("")) {

            lblC7.setText(simbolo2);
            ataque = true;

        } else if (tab[1].equals(simbolo2) && tab[7].equals(simbolo2) && lblC4.getText().equals("")) {

            lblC4.setText(simbolo2);
            ataque = true;

        } else if (tab[4].equals(simbolo2) && tab[7].equals(simbolo2) && lblC1.getText().equals("")) {

            lblC1.setText(simbolo2);
            ataque = true;

        } //Verifica defesa na v3
        else if (tab[2].equals(simbolo2) && tab[5].equals(simbolo2) && lblC8.getText().equals("")) {

            lblC8.setText(simbolo2);
            ataque = true;

        } else if (tab[2].equals(simbolo2) && tab[8].equals(simbolo2) && lblC5.getText().equals("")) {

            lblC5.setText(simbolo2);
            ataque = true;

        } else if (tab[5].equals(simbolo2) && tab[8].equals(simbolo2) && lblC2.getText().equals("")) {

            lblC2.setText(simbolo2);
            ataque = true;

        } //Verifica defesa na D1
        else if (tab[0].equals(simbolo2) && tab[4].equals(simbolo2) && lblC8.getText().equals("")) {

            lblC8.setText(simbolo2);
            ataque = true;

        } else if (tab[0].equals(simbolo2) && tab[8].equals(simbolo2) && lblC4.getText().equals("")) {

            lblC4.setText(simbolo2);
            ataque = true;

        } else if (tab[4].equals(simbolo2) && tab[8].equals(simbolo2) && lblC0.getText().equals("")) {

            lblC0.setText(simbolo2);
            ataque = true;

        } //Verifica defesa na D2
        else if (tab[2].equals(simbolo2) && tab[6].equals(simbolo2) && lblC4.getText().equals("")) {

            lblC4.setText(simbolo2);
            ataque = true;

        } else if (tab[2].equals(simbolo2) && tab[4].equals(simbolo2) && lblC6.getText().equals("")) {

            lblC6.setText(simbolo2);
            ataque = true;

        } else if (tab[4].equals(simbolo2) && tab[6].equals(simbolo2) && lblC2.getText().equals("")) {

            lblC2.setText(simbolo2);
            ataque = true;

        }

        if (ataque == true) {
            atualizaCasas();
        }

        return ataque;
    }

    public void atualizaCasas() {

        tab[0] = lblC0.getText();
        tab[3] = lblC3.getText();
        tab[6] = lblC6.getText();
        tab[1] = lblC1.getText();
        tab[4] = lblC4.getText();
        tab[7] = lblC7.getText();
        tab[2] = lblC2.getText();
        tab[5] = lblC5.getText();
        tab[8] = lblC8.getText();

        for (int i = 0; i < tab.length; i++) {

            if (tab[i].equals(simbolo1)) {
                tabJog1[i] = tab[i];
            }

            if (tab[i].equals(simbolo2)) {
                tabJog2[i] = tab[i];
            }
        }

    }

    public void jogadaBot() {
        atualizaCasas();

        if (versusComputador == true) {

            int n0[] = {0, 1, 2};
            int n1[]={0,1};
            int n2=1;
            

            Random dorte = new Random();
            int sorte=2;
            boolean parada = false;
            int sorte2;

            while (parada == false) {

                if (dificuldade == 0) {
                    sorte = dorte.nextInt(n0.length);
                }

                if (dificuldade == 1) {
                    sorte2 = dorte.nextInt(n1.length);
                    if (sorte2==0) {
                        sorte=1;
                    }else if (sorte2==1) {
                        sorte=0;
                    }

                }
                if (dificuldade == 2) {
                    
                    sorte = n2;

                }

                if (sorte == 0) {
                    boolean defesa = verificaDefesa();

                    if (defesa == false) {
                        boolean ataque = verificaAtaque();

                        if (ataque == false) {
                            sorteioTabVazia();
                            break;
                        } else if (ataque == true) {
                            break;
                        }

                    } else if (defesa == true) {
                        break;
                    }
                }

                if (sorte == 1) {
                    boolean ataque = verificaAtaque();

                    if (ataque == false) {
                        boolean defesa = verificaDefesa();

                        if (defesa == false) {

                            sorteioTabVazia();
                            break;
                        } else if (defesa == true) {
                            break;
                        }

                    } else if (ataque == true) {
                        break;
                    }
                }
                if (sorte == 2) {
                    sorteioTabVazia();
                    break;
                }
            }
        }
    }

    public void novaPartida() {

        partida += 1;

        lblC0.setText("");
        lblC3.setText("");
        lblC6.setText("");
        lblC1.setText("");
        lblC4.setText("");
        lblC7.setText("");
        lblC2.setText("");
        lblC5.setText("");
        lblC8.setText("");
        
        
        btnNovaPartida.setBackground(new java.awt.Color(0, 51, 204));
        btnNovaPartida.setForeground(new java.awt.Color(255, 255, 255));

        lblPainelInforma.setForeground(new java.awt.Color(255, 255, 0));
        lblPainelInforma.setBackground(new java.awt.Color(0, 153, 102));

        panTabuleiro.setBackground(new java.awt.Color(0, 0, 0));

        atualizaCasas();
        
        if (versusComputador==true && dificuldade==0) {
            lblNivelFacil.setForeground(Color.white);
            lblNivelMedio.setForeground(Color.gray);
            lblNivelDificil.setForeground(Color.gray);
        }
        else  if (versusComputador==true && dificuldade==1) {
            lblNivelFacil.setForeground(Color.gray);
            lblNivelMedio.setForeground(Color.yellow);
            lblNivelDificil.setForeground(Color.gray);
        }
        else  if (versusComputador==true && dificuldade==2) {
            lblNivelFacil.setForeground(Color.gray);
            lblNivelMedio.setForeground(Color.gray);
            lblNivelDificil.setForeground(Color.yellow);
        }
        else  if (versusComputador==false ) {
            lblNivelFacil.setForeground(Color.gray);
            lblNivelMedio.setForeground(Color.gray);
            lblNivelDificil.setForeground(Color.gray);
        }
       
        deuVelha = false;

        //verifica se Bot Começa a partida ou não caso tenha ganhado a aultima partida.
        if (!ganhador.equals("")) {
            lblPainelInforma.setText("> " + ganhador + "  começa <");

            if (ganhador.equals("Computador") && versusComputador == true) {
                ganhador = "";

                jogadaVez();
                jogadaBot();
                verificaFimJogada();
                atualizaCasas();
            }else  {
                ganhador = "";
            }
        }
 
    }

    public void jogadaVez() {

        if (letraVerificadora.equals(simbolo1)) {

            letraVerificadora = simbolo2;

        } else if (letraVerificadora.equals(simbolo2)) {

            letraVerificadora = simbolo1;
        }

    }

    private void lblC0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC0MouseClicked

        if (lblC0.getText().equals("")) {
            jogadaVez();
            lblC0.setText(letraVerificadora);
            verificaFimJogada();

            if (ganhador.equals("") && deuVelha == false) {
                if (versusComputador == true) {
                    jogadaVez();
                    jogadaBot();
                    verificaFimJogada();
                }
            }
        }

        atualizaCasas();
    }//GEN-LAST:event_lblC0MouseClicked

    private void lblC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC1MouseClicked

        if (lblC1.getText().equals("") && ganhador.equals("")) {
            jogadaVez();
            lblC1.setText(letraVerificadora);
            verificaFimJogada();

            if (ganhador.equals("") && deuVelha == false) {
                if (versusComputador == true) {
                    jogadaVez();
                    jogadaBot();
                    verificaFimJogada();
                }
            }

        }

        atualizaCasas();
    }//GEN-LAST:event_lblC1MouseClicked

    private void lblC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC2MouseClicked

        if (lblC2.getText().equals("") && ganhador.equals("")) {
            jogadaVez();
            lblC2.setText(letraVerificadora);
            verificaFimJogada();

            if (ganhador.equals("") && deuVelha == false) {
                if (versusComputador == true) {
                    jogadaVez();
                    jogadaBot();
                    verificaFimJogada();
                }
            }

        }
        atualizaCasas();
    }//GEN-LAST:event_lblC2MouseClicked

    private void lblC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC3MouseClicked

        if (lblC3.getText().equals("") && ganhador.equals("")) {
            jogadaVez();
            lblC3.setText(letraVerificadora);
            verificaFimJogada();

            if (ganhador.equals("") && deuVelha == false) {
                if (versusComputador == true) {
                    jogadaVez();
                    jogadaBot();
                    verificaFimJogada();
                }
            }

        }
        atualizaCasas();
    }//GEN-LAST:event_lblC3MouseClicked

    private void lblC4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC4MouseClicked

        if (lblC4.getText().equals("") && ganhador.equals("")) {
            jogadaVez();
            lblC4.setText(letraVerificadora);
            verificaFimJogada();

            if (ganhador.equals("") && deuVelha == false) {
                if (versusComputador == true) {
                    jogadaVez();
                    jogadaBot();
                    verificaFimJogada();
                }
            }

        }
        atualizaCasas();
    }//GEN-LAST:event_lblC4MouseClicked

    private void lblC5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC5MouseClicked

        if (lblC5.getText().equals("") && ganhador.equals("")) {
            jogadaVez();
            lblC5.setText(letraVerificadora);
            verificaFimJogada();

            if (ganhador.equals("") && deuVelha == false) {
                if (versusComputador == true) {
                    jogadaVez();
                    jogadaBot();
                    verificaFimJogada();
                }
            }

        }
        atualizaCasas();
    }//GEN-LAST:event_lblC5MouseClicked

    private void lblC6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC6MouseClicked

        if (lblC6.getText().equals("") && ganhador.equals("")) {
            jogadaVez();
            lblC6.setText(letraVerificadora);
            verificaFimJogada();

            if (ganhador.equals("") && deuVelha == false) {
                if (versusComputador == true) {
                    jogadaVez();
                    jogadaBot();
                    verificaFimJogada();
                }
            }

        }
        atualizaCasas();
    }//GEN-LAST:event_lblC6MouseClicked

    private void lblC7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC7MouseClicked

        if (lblC7.getText().equals("") && ganhador.equals("")) {
            jogadaVez();
            lblC7.setText(letraVerificadora);
            verificaFimJogada();

            if (ganhador.equals("") && deuVelha == false) {
                if (versusComputador == true) {
                    jogadaVez();
                    jogadaBot();
                    verificaFimJogada();
                }
            }

        }
        atualizaCasas();
    }//GEN-LAST:event_lblC7MouseClicked

    private void lblC8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblC8MouseClicked
        if (lblC8.getText().equals("") && ganhador.equals("")) {
            jogadaVez();
            lblC8.setText(letraVerificadora);
            verificaFimJogada();

            if (ganhador.equals("") && deuVelha == false) {
                if (versusComputador == true) {
                    jogadaVez();
                    jogadaBot();
                    verificaFimJogada();
                }
            }

        }
        atualizaCasas();

    }//GEN-LAST:event_lblC8MouseClicked

    //Verifica final de jogo
    public void verificaFimJogada() {

        if (ganhador.equals("")) {

            if (!lblC0.getText().equals("")) {

                //Verifica A horizontal
                if (lblC0.getText().equals(lblC1.getText()) && lblC0.getText().equals(lblC2.getText())) {

                    verificaGanhador(lblC0.getText());

                }
                //Verifica A diagonal
                if (lblC0.getText().equals(lblC4.getText()) && lblC0.getText().equals(lblC8.getText())) {

                    verificaGanhador(lblC0.getText());

                    //Verifica A vertical
                } else if (lblC0.getText().equals(lblC3.getText()) && lblC0.getText().equals(lblC6.getText())) {

                    verificaGanhador(lblC0.getText());

                }
            }
            if (!lblC1.getText().equals("")) {
                //Verifica B Vertical
                if (lblC1.getText().equals(lblC4.getText()) && lblC1.getText().equals(lblC7.getText())) {

                    verificaGanhador(lblC1.getText());

                }

            }
            if (!lblC2.getText().equals("")) {
                //Verifica C Vertical
                if (lblC2.getText().equals(lblC5.getText()) && lblC2.getText().equals(lblC8.getText())) {

                    verificaGanhador(lblC2.getText());

                }
                //Verifica C diagonal
                if (lblC2.getText().equals(lblC4.getText()) && lblC2.getText().equals(lblC6.getText())) {

                    verificaGanhador(lblC2.getText());

                }

            }
            if (!lblC3.getText().equals("")) {
                //Verifica A 2 horizontal
                if (lblC4.getText().equals(lblC5.getText()) && lblC3.getText().equals(lblC5.getText())) {

                    verificaGanhador(lblC4.getText());

                }

            }
            if (!lblC6.getText().equals("")) {
                //Verifica A 3 horizontal

                if (lblC7.getText().equals(lblC8.getText()) && lblC6.getText().equals(lblC8.getText())) {

                    verificaGanhador(lblC7.getText());

                }
            }

            if (!lblC0.getText().equals("")
                    && !lblC3.getText().equals("")
                    && !lblC6.getText().equals("")
                    && !lblC1.getText().equals("")
                    && !lblC4.getText().equals("")
                    && !lblC7.getText().equals("")
                    && !lblC2.getText().equals("")
                    && !lblC5.getText().equals("")
                    && !lblC8.getText().equals("") && ganhador.equals("")) {

                deuVelha = true;
            }

            if (deuVelha) {
                verificaGanhador("velha");
            }
        }
        atualizaCasas();
    }

    //Verifica um Ganhador    
    public void verificaGanhador(String letrax) {

        //Verifica se Jogador 1 ganhou.
        if (letrax.equals(simbolo1)) {
            ganhador = jogador1;
            pontosJogador1 += 1;
            letraVerificadora = simbolo2;
            lblPlacarJogador1.setText(String.valueOf(pontosJogador1));
            lblPainelInforma.setForeground(new java.awt.Color(0, 0, 0));
            lblPainelInforma.setBackground(new java.awt.Color(255, 255, 0));
            lblPainelInforma.setText(ganhador + "  GANHOU!!!");
            panTabuleiro.setBackground(new java.awt.Color(255, 255, 0));
            btnNovaPartida.setBackground(new java.awt.Color(255, 255, 50));
            btnNovaPartida.setForeground(new java.awt.Color(0, 100, 255));

            //Acrescenta pontos Gerais ao jogador1
            if (pontosJogador1 == 3) {
                pontosGeralJogador1 += 1;
                pontosJogador1 = 0;
               // pontosJogador2 = 0;
                lblPlacarGeralJogador1.setText(String.valueOf(pontosGeralJogador1));
                lblPlacarJogador1.setText(String.valueOf(pontosJogador1));
                lblPlacarJogador2.setText(String.valueOf(pontosJogador2));
                lblPlacarGeralJogador1.setForeground(new java.awt.Color(255, 255, 0));
                lblPlacarGeralJogador2.setForeground(new java.awt.Color(255, 255, 255));
            }
        } //Verifica se Jogador 2 ganhou.
        else if (letrax.equals(simbolo2)) {
            ganhador = jogador2;
            pontosJogador2 += 1;
            letraVerificadora = simbolo1;
            lblPlacarJogador2.setText(String.valueOf(pontosJogador2));
            lblPainelInforma.setForeground(new java.awt.Color(0, 0, 0));
            lblPainelInforma.setBackground(new java.awt.Color(255, 255, 0));
            lblPainelInforma.setText(ganhador + "  GANHOU!!!");
            panTabuleiro.setBackground(new java.awt.Color(255, 255, 0));
            btnNovaPartida.setBackground(new java.awt.Color(255, 255, 50));
            btnNovaPartida.setForeground(new java.awt.Color(0, 100, 255));

            //Acrescenta pontos Gerais ao jogador2
            if (pontosJogador2 == 3) {
                pontosGeralJogador2 += 1;
                pontosJogador2 = 0;
               // pontosJogador1 = 0;
                lblPlacarGeralJogador2.setText(String.valueOf(pontosGeralJogador2));
                lblPlacarJogador2.setText(String.valueOf(pontosJogador2));
                lblPlacarJogador1.setText(String.valueOf(pontosJogador1));
                lblPlacarGeralJogador2.setForeground(new java.awt.Color(255, 255, 0));
                lblPlacarGeralJogador1.setForeground(new java.awt.Color(255, 255, 255));

            }
        }

        if (letrax == "velha") {

            if (letraVerificadora.equals(simbolo1)) {

                ganhador = jogador2;

            } else if (letraVerificadora.equals(simbolo2)) {

                ganhador = jogador1;
            }

            lblPainelInforma.setForeground(new java.awt.Color(0, 0, 0));
            lblPainelInforma.setBackground(new java.awt.Color(255, 100, 0));
            btnNovaPartida.setBackground(new java.awt.Color(153, 153, 0));
            btnNovaPartida.setForeground(new java.awt.Color(0, 0, 0));
            lblPainelInforma.setText("    DEU VELHA!     :(");
        }

    }


    private void btnNovaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPartidaActionPerformed

        novaPartida();


    }//GEN-LAST:event_btnNovaPartidaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

//</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovaPartida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblC0;
    private javax.swing.JLabel lblC1;
    private javax.swing.JLabel lblC2;
    private javax.swing.JLabel lblC3;
    private javax.swing.JLabel lblC4;
    private javax.swing.JLabel lblC5;
    private javax.swing.JLabel lblC6;
    private javax.swing.JLabel lblC7;
    private javax.swing.JLabel lblC8;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblGeralJogador1;
    private javax.swing.JLabel lblGeralJogador2;
    private javax.swing.JLabel lblJogador1;
    private javax.swing.JLabel lblJogador2;
    private javax.swing.JLabel lblNivelDificil;
    private javax.swing.JLabel lblNivelFacil;
    private javax.swing.JLabel lblNivelMedio;
    private javax.swing.JLabel lblPainelInforma;
    private javax.swing.JLabel lblPlacarGeralJogador1;
    private javax.swing.JLabel lblPlacarGeralJogador2;
    private javax.swing.JLabel lblPlacarJogador1;
    private javax.swing.JLabel lblPlacarJogador2;
    private javax.swing.JLabel lblPlacarVoce;
    private javax.swing.JLabel lblPlacarVoce2;
    private javax.swing.JLabel lblSimbolo1;
    private javax.swing.JLabel lblSimbolo2;
    private javax.swing.JPanel panPainelPlacar;
    private javax.swing.JPanel panTabuleiro;
    // End of variables declaration//GEN-END:variables

}
