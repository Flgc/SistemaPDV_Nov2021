/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author fabio
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        painelPrincipal = new javax.swing.JPanel();
        painelCabecalho = new javax.swing.JPanel();
        hora = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        desconect = new javax.swing.JLabel();
        userConect = new javax.swing.JLabel();
        logoUserOn = new javax.swing.JLabel();
        logoDesconect = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnProd = new javax.swing.JButton();
        btnVend = new javax.swing.JButton();
        btnCaixa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1140, 640));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        painelPrincipal.setPreferredSize(new java.awt.Dimension(1280, 640));
        painelPrincipal.setLayout(new java.awt.BorderLayout());

        painelCabecalho.setBackground(new java.awt.Color(0, 0, 51));
        painelCabecalho.setPreferredSize(new java.awt.Dimension(1280, 125));
        painelCabecalho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hora.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        hora.setForeground(java.awt.Color.white);
        hora.setText("HORA");
        painelCabecalho.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 22, -1, -1));

        data.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        data.setForeground(java.awt.Color.white);
        data.setText("DIA - MES - ANO");
        painelCabecalho.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        desconect.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        desconect.setForeground(java.awt.Color.white);
        desconect.setText("DESCONECTAR...");
        painelCabecalho.add(desconect, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        userConect.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        userConect.setForeground(java.awt.Color.white);
        userConect.setText("USUÁRIO");
        painelCabecalho.add(userConect, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        logoUserOn.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        logoUserOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/conectado.png"))); // NOI18N
        painelCabecalho.add(logoUserOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        logoDesconect.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        logoDesconect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/desconec.png"))); // NOI18N
        painelCabecalho.add(logoDesconect, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnInfo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(225, 225, 225));
        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/info.png"))); // NOI18N
        btnInfo.setText("INFORMAÇÕES");
        btnInfo.setBorder(null);
        btnInfo.setContentAreaFilled(false);
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfo.setPreferredSize(new java.awt.Dimension(100, 120));
        btnInfo.setRolloverEnabled(true);
        btnInfo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/info2.png"))); // NOI18N
        btnInfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        painelCabecalho.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, -1, -1));

        btnUser.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnUser.setForeground(new java.awt.Color(225, 225, 225));
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/usuario1.png"))); // NOI18N
        btnUser.setText("USUÁRIOS");
        btnUser.setBorder(null);
        btnUser.setContentAreaFilled(false);
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUser.setPreferredSize(new java.awt.Dimension(100, 120));
        btnUser.setRolloverEnabled(true);
        btnUser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/usuario2.png"))); // NOI18N
        btnUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        painelCabecalho.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        btnProd.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnProd.setForeground(new java.awt.Color(225, 225, 225));
        btnProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/produtos.png"))); // NOI18N
        btnProd.setText("PRODUTOS");
        btnProd.setBorder(null);
        btnProd.setContentAreaFilled(false);
        btnProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProd.setPreferredSize(new java.awt.Dimension(100, 120));
        btnProd.setRolloverEnabled(true);
        btnProd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/produtos2.png"))); // NOI18N
        btnProd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdActionPerformed(evt);
            }
        });
        painelCabecalho.add(btnProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        btnVend.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnVend.setForeground(new java.awt.Color(225, 225, 225));
        btnVend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/vendas1.png"))); // NOI18N
        btnVend.setText("VENDAS");
        btnVend.setBorder(null);
        btnVend.setContentAreaFilled(false);
        btnVend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVend.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVend.setPreferredSize(new java.awt.Dimension(100, 120));
        btnVend.setRolloverEnabled(true);
        btnVend.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/vendas2.png"))); // NOI18N
        btnVend.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendActionPerformed(evt);
            }
        });
        painelCabecalho.add(btnVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));

        btnCaixa.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCaixa.setForeground(new java.awt.Color(225, 225, 225));
        btnCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/caixa.png"))); // NOI18N
        btnCaixa.setText("CAIXA");
        btnCaixa.setBorder(null);
        btnCaixa.setContentAreaFilled(false);
        btnCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaixa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaixa.setPreferredSize(new java.awt.Dimension(100, 120));
        btnCaixa.setRolloverEnabled(true);
        btnCaixa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/caixa2.png"))); // NOI18N
        btnCaixa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixaActionPerformed(evt);
            }
        });
        painelCabecalho.add(btnCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, -1));

        painelPrincipal.add(painelCabecalho, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(painelPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProdActionPerformed

    private void btnVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVendActionPerformed

    private void btnCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaixaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuPrincipal tela = new MenuPrincipal();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaixa;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnProd;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btnVend;
    private javax.swing.JLabel data;
    private javax.swing.JLabel desconect;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel logoDesconect;
    private javax.swing.JLabel logoUserOn;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JLabel userConect;
    // End of variables declaration//GEN-END:variables
}
