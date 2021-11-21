/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

/**
 *
 * @author fabio
 */
public class FrmCaixa extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmVendas
     */
    public FrmCaixa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCaixa = new javax.swing.JPanel();
        painelFiltro = new javax.swing.JPanel();
        bntBuscaProd = new javax.swing.JButton();
        fldData = new app.bolivia.swing.JCTextField();
        imgFldData = new javax.swing.JLabel();
        fldRecibo = new app.bolivia.swing.JCTextField();
        imgFldRecibo = new javax.swing.JLabel();
        fldTroco = new app.bolivia.swing.JCTextField();
        imgFldTroco = new javax.swing.JLabel();
        painelOpcoes = new javax.swing.JPanel();
        bntCalculo = new javax.swing.JButton();
        bntVender = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        bntCancelar = new javax.swing.JButton();
        painelScrollCaixa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCaixa = new javax.swing.JTable();
        fldTotal = new app.bolivia.swing.JCTextField();
        lblTotal = new javax.swing.JLabel();
        painelLogo = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblTitTel = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblCel = new javax.swing.JLabel();
        painelNumVenda = new javax.swing.JPanel();
        numFac = new app.bolivia.swing.JCTextField();
        lblCodigFat = new javax.swing.JLabel();
        lblTitNumVend = new javax.swing.JLabel();

        setName("Caixa"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1074, 526));

        painelCaixa.setPreferredSize(new java.awt.Dimension(1064, 495));

        painelFiltro.setBackground(new java.awt.Color(255, 255, 255));
        painelFiltro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelFiltro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bntBuscaProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntBuscaProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/produto1.png"))); // NOI18N
        bntBuscaProd.setBorder(null);
        bntBuscaProd.setContentAreaFilled(false);
        bntBuscaProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntBuscaProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntBuscaProd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/produto.png"))); // NOI18N
        bntBuscaProd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntBuscaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBuscaProdActionPerformed(evt);
            }
        });
        painelFiltro.add(bntBuscaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fldData.setEditable(false);
        fldData.setBackground(new java.awt.Color(34, 102, 145));
        fldData.setBorder(null);
        fldData.setForeground(new java.awt.Color(255, 255, 255));
        fldData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fldData.setOpaque(false);
        fldData.setPhColor(new java.awt.Color(255, 255, 255));
        fldData.setPlaceholder("DATA");
        painelFiltro.add(fldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 180, -1));

        imgFldData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/data.png"))); // NOI18N
        painelFiltro.add(imgFldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 52));

        fldRecibo.setBackground(new java.awt.Color(34, 102, 145));
        fldRecibo.setBorder(null);
        fldRecibo.setForeground(new java.awt.Color(255, 255, 255));
        fldRecibo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fldRecibo.setOpaque(false);
        fldRecibo.setPhColor(new java.awt.Color(255, 255, 255));
        fldRecibo.setPlaceholder("RECIBIDO");
        painelFiltro.add(fldRecibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 130, -1));

        imgFldRecibo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/recibi.png"))); // NOI18N
        imgFldRecibo.setToolTipText("RECIBI");
        painelFiltro.add(imgFldRecibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, 52));

        fldTroco.setEditable(false);
        fldTroco.setBackground(new java.awt.Color(34, 102, 145));
        fldTroco.setBorder(null);
        fldTroco.setForeground(new java.awt.Color(255, 255, 255));
        fldTroco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fldTroco.setOpaque(false);
        fldTroco.setPhColor(new java.awt.Color(255, 255, 255));
        fldTroco.setPlaceholder("TROCO");
        painelFiltro.add(fldTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 130, -1));

        imgFldTroco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/valores.png"))); // NOI18N
        imgFldTroco.setToolTipText("CAMBIO");
        painelFiltro.add(imgFldTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, 52));

        painelOpcoes.setBackground(new java.awt.Color(255, 255, 255));
        painelOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "OPÇÕES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        bntCalculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntCalculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/calculo1.png"))); // NOI18N
        bntCalculo.setBorder(null);
        bntCalculo.setContentAreaFilled(false);
        bntCalculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntCalculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntCalculo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/calculo2.png"))); // NOI18N
        bntCalculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCalculoActionPerformed(evt);
            }
        });

        bntVender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/venda1.png"))); // NOI18N
        bntVender.setBorder(null);
        bntVender.setContentAreaFilled(false);
        bntVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntVender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntVender.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/venda2.png"))); // NOI18N
        bntVender.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVenderActionPerformed(evt);
            }
        });

        bntEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/elimina1.png"))); // NOI18N
        bntEliminar.setBorder(null);
        bntEliminar.setContentAreaFilled(false);
        bntEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/elimina2.png"))); // NOI18N
        bntEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEliminarActionPerformed(evt);
            }
        });

        bntCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/cancela1.png"))); // NOI18N
        bntCancelar.setBorder(null);
        bntCancelar.setContentAreaFilled(false);
        bntCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/cancela2.png"))); // NOI18N
        bntCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelOpcoesLayout = new javax.swing.GroupLayout(painelOpcoes);
        painelOpcoes.setLayout(painelOpcoesLayout);
        painelOpcoesLayout.setHorizontalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntCalculo)
                    .addComponent(bntVender)
                    .addComponent(bntEliminar)
                    .addComponent(bntCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelOpcoesLayout.setVerticalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntCalculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntVender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelScrollCaixa.setBackground(new java.awt.Color(255, 255, 255));
        painelScrollCaixa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelScrollCaixa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TIPO PRODUTO", "DESCRIÇÃO", "VALOR", "QUANTIDADE", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tabelaCaixa);

        painelScrollCaixa.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 200));

        fldTotal.setEditable(false);
        fldTotal.setBackground(new java.awt.Color(34, 102, 145));
        fldTotal.setBorder(null);
        fldTotal.setForeground(new java.awt.Color(255, 255, 255));
        fldTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fldTotal.setOpaque(false);
        fldTotal.setPhColor(new java.awt.Color(255, 255, 255));
        fldTotal.setPlaceholder("TOTAL");
        painelScrollCaixa.add(fldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 80, 30));

        lblTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/total.png"))); // NOI18N
        painelScrollCaixa.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, 50));

        painelLogo.setBackground(new java.awt.Color(255, 255, 255));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/logomenor.png"))); // NOI18N

        lblEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresa.setText("COMÉRCIO FREITAS LTDA");

        lblTitTel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitTel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitTel.setText("TELEFONES:");

        lblTel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTel.setText("31 97527-5084");

        lblCel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCel.setText("31 97527-5084");

        javax.swing.GroupLayout painelLogoLayout = new javax.swing.GroupLayout(painelLogo);
        painelLogo.setLayout(painelLogoLayout);
        painelLogoLayout.setHorizontalGroup(
            painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLogoLayout.createSequentialGroup()
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        painelLogoLayout.setVerticalGroup(
            painelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitTel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCel)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelNumVenda.setBackground(new java.awt.Color(255, 255, 255));
        painelNumVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelNumVenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numFac.setEditable(false);
        numFac.setBackground(new java.awt.Color(34, 102, 145));
        numFac.setBorder(null);
        numFac.setForeground(new java.awt.Color(255, 255, 255));
        numFac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numFac.setOpaque(false);
        numFac.setPhColor(new java.awt.Color(255, 255, 255));
        numFac.setPlaceholder("FATURA");
        painelNumVenda.add(numFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 130, 30));

        lblCodigFat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas/numFac.png"))); // NOI18N
        painelNumVenda.add(lblCodigFat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 50));

        lblTitNumVend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitNumVend.setText("NÚMERO DE VENDA");
        painelNumVenda.add(lblTitNumVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        javax.swing.GroupLayout painelCaixaLayout = new javax.swing.GroupLayout(painelCaixa);
        painelCaixa.setLayout(painelCaixaLayout);
        painelCaixaLayout.setHorizontalGroup(
            painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCaixaLayout.createSequentialGroup()
                        .addComponent(painelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(painelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelScrollCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelNumVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painelCaixaLayout.setVerticalGroup(
            painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCaixaLayout.createSequentialGroup()
                .addGroup(painelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCaixaLayout.createSequentialGroup()
                        .addComponent(painelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelScrollCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelCaixaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelNumVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Caixa");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed

    }//GEN-LAST:event_bntCancelarActionPerformed

    private void bntEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarActionPerformed

    }//GEN-LAST:event_bntEliminarActionPerformed

    private void bntVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVenderActionPerformed

    }//GEN-LAST:event_bntVenderActionPerformed

    private void bntCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCalculoActionPerformed

    }//GEN-LAST:event_bntCalculoActionPerformed

    private void bntBuscaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBuscaProdActionPerformed
       
    }//GEN-LAST:event_bntBuscaProdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBuscaProd;
    private javax.swing.JButton bntCalculo;
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton bntEliminar;
    private javax.swing.JButton bntVender;
    private app.bolivia.swing.JCTextField fldData;
    public static app.bolivia.swing.JCTextField fldRecibo;
    public static app.bolivia.swing.JCTextField fldTotal;
    public static app.bolivia.swing.JCTextField fldTroco;
    private javax.swing.JLabel imgFldData;
    private javax.swing.JLabel imgFldRecibo;
    private javax.swing.JLabel imgFldTroco;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCodigFat;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTitNumVend;
    private javax.swing.JLabel lblTitTel;
    private javax.swing.JLabel lblTotal;
    public static app.bolivia.swing.JCTextField numFac;
    private javax.swing.JPanel painelCaixa;
    private javax.swing.JPanel painelFiltro;
    private javax.swing.JPanel painelLogo;
    private javax.swing.JPanel painelNumVenda;
    private javax.swing.JPanel painelOpcoes;
    private javax.swing.JPanel painelScrollCaixa;
    public static javax.swing.JTable tabelaCaixa;
    // End of variables declaration//GEN-END:variables
}
