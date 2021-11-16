/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

/**
 *
 * @author fabio
 */
public class Produtos extends javax.swing.JFrame {

    /**
     * Creates new form Produtos
     */
    public Produtos() {
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

        painelProdutos = new javax.swing.JPanel();
        panelRegistro = new javax.swing.JPanel();
        codigo = new app.bolivia.swing.JCTextField();
        nome = new app.bolivia.swing.JCTextField();
        preco = new app.bolivia.swing.JCTextField();
        tipoProd = new org.bolivia.combo.SComboBoxBlue();
        imgCodigo = new javax.swing.JLabel();
        imgNome = new javax.swing.JLabel();
        imgPreco = new javax.swing.JLabel();
        imgTipoProd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 520));
        getContentPane().setLayout(new java.awt.GridLayout());

        panelRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        panelRegistro.setName(""); // NOI18N
        panelRegistro.setPreferredSize(new java.awt.Dimension(703, 142));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigo.setBackground(new java.awt.Color(34, 102, 145));
        codigo.setBorder(null);
        codigo.setForeground(new java.awt.Color(255, 255, 255));
        codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codigo.setOpaque(false);
        codigo.setPhColor(new java.awt.Color(255, 255, 255));
        codigo.setPlaceholder("CÓDIGO");
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigoKeyReleased(evt);
            }
        });
        panelRegistro.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 180, -1));

        nome.setBackground(new java.awt.Color(34, 102, 145));
        nome.setBorder(null);
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nome.setOpaque(false);
        nome.setPhColor(new java.awt.Color(255, 255, 255));
        nome.setPlaceholder("NOME PRODUTO");
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeKeyReleased(evt);
            }
        });
        panelRegistro.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 180, -1));

        preco.setBackground(new java.awt.Color(34, 102, 145));
        preco.setBorder(null);
        preco.setForeground(new java.awt.Color(255, 255, 255));
        preco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        preco.setOpaque(false);
        preco.setPhColor(new java.awt.Color(255, 255, 255));
        preco.setPlaceholder("PREÇO");
        preco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precoKeyReleased(evt);
            }
        });
        panelRegistro.add(preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 180, -1));

        tipoProd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO PRODUTO", "BEBIDAS", "LIMPEZA", "CARNES", "CONGELADOS", "LACTINEOS", "VERDURAS" }));
        tipoProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelRegistro.add(tipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 190, -1));

        imgCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/codigoL.png"))); // NOI18N
        panelRegistro.add(imgCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        imgNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/nomeL.png"))); // NOI18N
        panelRegistro.add(imgNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        imgPreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/precoL.png"))); // NOI18N
        panelRegistro.add(imgPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        imgTipoProd.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        imgTipoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/tipopro.png"))); // NOI18N
        panelRegistro.add(imgTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        javax.swing.GroupLayout painelProdutosLayout = new javax.swing.GroupLayout(painelProdutos);
        painelProdutos.setLayout(painelProdutosLayout);
        painelProdutosLayout.setHorizontalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelProdutosLayout.setVerticalGroup(
            painelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(painelProdutos);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyReleased
        codigo.setText(codigo.getText().toUpperCase());
    }//GEN-LAST:event_codigoKeyReleased

    private void nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeKeyReleased

    private void precoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_precoKeyReleased

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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField codigo;
    private javax.swing.JLabel imgCodigo;
    private javax.swing.JLabel imgNome;
    private javax.swing.JLabel imgPreco;
    private javax.swing.JLabel imgTipoProd;
    private app.bolivia.swing.JCTextField nome;
    private javax.swing.JPanel painelProdutos;
    private javax.swing.JPanel panelRegistro;
    private app.bolivia.swing.JCTextField preco;
    private org.bolivia.combo.SComboBoxBlue tipoProd;
    // End of variables declaration//GEN-END:variables
}
