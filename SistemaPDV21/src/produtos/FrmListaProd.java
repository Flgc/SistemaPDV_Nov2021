/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ListSelectionModel;

/**
 *
 * @author fabio
 */
public class FrmListaProd extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmListaProd
     */
    public FrmListaProd() {
        initComponents();
        FrmListaProd.tabelaListarProdutos.getTableHeader().setDefaultRenderer(new principal.EstiloTabelaHeader());
        FrmListaProd.tabelaListarProdutos.setDefaultRenderer(Object.class, new principal.EstiloTabelaRenderer());
                
        //list all records
        FrmListaProd.tabelaListarProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        ProdutosSql.listarCatProduto(""); 
        
        //Submit the combo box value
        tipoProd.addItemListener(new ItemListener() {
        
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (tipoProd.getSelectedIndex() == 0) {
                    
                    ProdutosSql.listarCatProduto("");
                }
                if (tipoProd.getSelectedIndex() == 1) {
                    
                    ProdutosSql.listarCatProduto(tipoProd.getSelectedItem().toString());
                }
                if (tipoProd.getSelectedIndex() == 2) {
                    
                    ProdutosSql.listarCatProduto(tipoProd.getSelectedItem().toString());
                }
                if (tipoProd.getSelectedIndex() == 3) {
                    
                    ProdutosSql.listarCatProduto(tipoProd.getSelectedItem().toString());
                }
                if (tipoProd.getSelectedIndex() == 4) {
                    
                    ProdutosSql.listarCatProduto(tipoProd.getSelectedItem().toString());
                }                
                if (tipoProd.getSelectedIndex() == 5) {
                    
                    ProdutosSql.listarCatProduto(tipoProd.getSelectedItem().toString());
                }                                
                if (tipoProd.getSelectedIndex() == 6) {
                    
                    ProdutosSql.listarCatProduto(tipoProd.getSelectedItem().toString());
                }                                
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelListarProd = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaListarProdutos = new javax.swing.JTable();
        painelOpcoes = new javax.swing.JPanel();
        codigoNome = new app.bolivia.swing.JCTextField();
        imgCodigoNome = new javax.swing.JLabel();
        tipoProd = new org.bolivia.combo.SComboBoxBlue();
        imgTipoProd = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();

        setClosable(true);
        setTitle("LISTAR PRODUTOS");
        setPreferredSize(new java.awt.Dimension(715, 400));

        panelListarProd.setName("Listar Produtos"); // NOI18N

        tabelaListarProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TIPO PRODUTO", "NOME DO PRODUTO", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaListarProdutos);

        painelOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPÇÕES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        painelOpcoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigoNome.setBackground(new java.awt.Color(34, 102, 145));
        codigoNome.setBorder(null);
        codigoNome.setForeground(new java.awt.Color(255, 255, 255));
        codigoNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codigoNome.setOpaque(false);
        codigoNome.setPhColor(new java.awt.Color(255, 255, 255));
        codigoNome.setPlaceholder("CÓDIGO/NOME");
        codigoNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigoNomeKeyReleased(evt);
            }
        });
        painelOpcoes.add(codigoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, -1));

        imgCodigoNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/buscarL.png"))); // NOI18N
        painelOpcoes.add(imgCodigoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        tipoProd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO PRODUTO", "BEBIDAS", "LIMPEZA", "CARNES", "CONGELADOS", "LACTINEOS", "VERDURAS" }));
        tipoProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoProdActionPerformed(evt);
            }
        });
        painelOpcoes.add(tipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 190, -1));

        imgTipoProd.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        imgTipoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/tipopro.png"))); // NOI18N
        painelOpcoes.add(imgTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 50, 50));

        btnEnviar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(0, 0, 0));
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/regis1.png"))); // NOI18N
        btnEnviar.setText("Enviar Produto");
        btnEnviar.setBorder(null);
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnviar.setName("btnEnviar"); // NOI18N
        btnEnviar.setPreferredSize(new java.awt.Dimension(75, 95));
        btnEnviar.setRolloverEnabled(true);
        btnEnviar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/regis2.png"))); // NOI18N
        btnEnviar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        painelOpcoes.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 120, 100));

        javax.swing.GroupLayout panelListarProdLayout = new javax.swing.GroupLayout(panelListarProd);
        panelListarProd.setLayout(panelListarProdLayout);
        panelListarProdLayout.setHorizontalGroup(
            panelListarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarProdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelListarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(painelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        panelListarProdLayout.setVerticalGroup(
            panelListarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelListarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelListarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoNomeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoNomeKeyReleased

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void tipoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoProdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private app.bolivia.swing.JCTextField codigoNome;
    private javax.swing.JLabel imgCodigoNome;
    private javax.swing.JLabel imgTipoProd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelOpcoes;
    private javax.swing.JPanel panelListarProd;
    public static javax.swing.JTable tabelaListarProdutos;
    private org.bolivia.combo.SComboBoxBlue tipoProd;
    // End of variables declaration//GEN-END:variables
}
