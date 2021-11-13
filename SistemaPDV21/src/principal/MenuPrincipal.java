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
        desc = new javax.swing.JLabel();
        userConect = new javax.swing.JLabel();
        logoUser = new javax.swing.JLabel();
        logoDesconect = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 640));
        getContentPane().setLayout(new java.awt.GridLayout());

        painelPrincipal.setPreferredSize(new java.awt.Dimension(1280, 640));
        painelPrincipal.setLayout(new java.awt.BorderLayout());

        painelCabecalho.setBackground(new java.awt.Color(8, 52, 126));
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

        desc.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        desc.setForeground(java.awt.Color.white);
        desc.setText("DESCONECTAR...");
        painelCabecalho.add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        userConect.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        userConect.setForeground(java.awt.Color.white);
        userConect.setText("USUÁRIO");
        painelCabecalho.add(userConect, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        logoUser.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        logoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/conectado.png"))); // NOI18N
        painelCabecalho.add(logoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        logoDesconect.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        logoDesconect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/desconec.png"))); // NOI18N
        painelCabecalho.add(logoDesconect, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/usuario1.png"))); // NOI18N
        jButton1.setText("USUÁRIOS");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 120));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        painelCabecalho.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        painelPrincipal.add(painelCabecalho, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(painelPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel data;
    private javax.swing.JLabel desc;
    private javax.swing.JLabel hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel logoDesconect;
    private javax.swing.JLabel logoUser;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JLabel userConect;
    // End of variables declaration//GEN-END:variables
}
