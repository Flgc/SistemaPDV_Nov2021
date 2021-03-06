/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabio Luis Guia da Conceção
 */
public class Login extends javax.swing.JFrame {
    
    SplashScreen inicio;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    
    public Login(SplashScreen inicio){
       this.inicio = inicio;
       setProgress(0, "Carregando componente do sistema!");
       initComponents();
       setProgress(20, "Conectando ao banco de dados!");
       setProgress(40, "Carregando os módulos!");
       setProgress(60, "Carregamento de módulos concluidos!");
       setProgress(80, "Carregando interfaces!");
       setProgress(90, "Interface carregada!");
       setProgress(100, "Bem vindo ao sistema!");
       //thus.setSize(410,500);       
    };
    
    void setProgress(int percentual, String informacao){
        inicio.getJLabel().setText(informacao);
        inicio.getJProgressBar().setValue(percentual);
        
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(this, "Não foi possível carregar a inicialização");
        }
    }; 
    
    
    // Starting database connection
    Conectar con = new Conectar();
    Connection conn = con.conexao(); 
    
    public void Logar(String nom, String senha){
        String tipoUser = null;
        try {
            String sql = "SELECT nome_us FROM usuarios WHERE nome_us = '"+nom+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.first()){
               String sql1 = "SELECT senha FROM usuarios WHERE senha = '"+senha+"'";
               Statement st1 = conn.createStatement();
               ResultSet rs1 = st1.executeQuery(sql1);
               
               if(rs1.first()){
                  String sql2 = "SELECT tipo_us FROM usuarios WHERE nome_us = '"+nom+"'"
                          + "and senha = '"+senha+"'";
                  Statement st2 = conn.createStatement();
                  ResultSet rs2 = st2.executeQuery(sql2); 
                  
                  while(rs2.next()){
                    tipoUser = rs2.getString(1);
                  }
                  
                  if (tipoUser.equals("ADMINISTRADOR")){
                      String sql3 = "SELECT nome_us FROM usuarios WHERE nome_us = '"+nom+"'";
                      Statement st3 = conn.createStatement();
                      ResultSet rs3 = st3.executeQuery(sql3); 
                      
                      while(rs3.next()){
                          tipoUser = rs3.getString(1);
                      } 
                      
                      dispose();
                      MenuPrincipal menu = new MenuPrincipal();
                      
                      JOptionPane.showMessageDialog(this, "Bem vindo ao Sistema " + tipoUser + "!", "Administrador", 0,
                        new ImageIcon(getClass().getResource("/imagens/usuarios/administrador.png")));
                      
                      menu.userConect.setText(tipoUser);
                      menu.setLocationRelativeTo(null);
                      menu.setVisible(true);
                      
                  } else {
                      String sql4 = "SELECT nome_us FROM usuarios WHERE nome_us = '"+nom+"'";
                      Statement st4 = conn.createStatement();
                      ResultSet rs4 = st4.executeQuery(sql4); 
                      
                      while(rs4.next()){
                          tipoUser = rs4.getString(1);
                      } 
                      
                      dispose();
                      MenuPrincipalP menuP = new MenuPrincipalP();
                      
                      JOptionPane.showMessageDialog(this, "Bem vindo ao Sistema " + tipoUser + "!", "Usuário", 0,
                        new ImageIcon(getClass().getResource("/imagens/usuarios/normal.png")));
                                                                  
                      menuP.userConect.setText(tipoUser);
                      menuP.setLocationRelativeTo(null);
                      menuP.setVisible(true);                                            
                  }                  
                  
               } else {
                 JOptionPane.showMessageDialog(this, "Senha incorreta!", "Login", 0,
                   new ImageIcon(getClass().getResource("/imagens/usuarios/info.png")));              
               }
            } else{
               JOptionPane.showMessageDialog(this, "Usuário inexistente!", "Login", 0,
                 new ImageIcon(getClass().getResource("/imagens/usuarios/info.png")));
            }          
        } catch (Exception e) {
        }
    };

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLogin = new javax.swing.JPanel();
        painelImgCab = new javax.swing.JPanel();
        imgLogin = new javax.swing.JLabel();
        painelCentral = new javax.swing.JPanel();
        imgUser = new javax.swing.JLabel();
        painelCampoLogin = new javax.swing.JPanel();
        usuario = new app.bolivia.swing.JCTextField();
        senha = new jpass.JRPasswordField();
        imgCampoUser = new javax.swing.JLabel();
        imgCampoPass = new javax.swing.JLabel();
        painelButtonLogin = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        painelLogin.setPreferredSize(new java.awt.Dimension(390, 400));
        painelLogin.setLayout(new java.awt.BorderLayout());

        imgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/imagemLogin.jpg"))); // NOI18N
        imgLogin.setPreferredSize(new java.awt.Dimension(150, 109));

        javax.swing.GroupLayout painelImgCabLayout = new javax.swing.GroupLayout(painelImgCab);
        painelImgCab.setLayout(painelImgCabLayout);
        painelImgCabLayout.setHorizontalGroup(
            painelImgCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImgCabLayout.createSequentialGroup()
                .addComponent(imgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelImgCabLayout.setVerticalGroup(
            painelImgCabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelImgCabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        painelLogin.add(painelImgCab, java.awt.BorderLayout.PAGE_START);

        painelCentral.setPreferredSize(new java.awt.Dimension(410, 200));
        painelCentral.setLayout(new java.awt.BorderLayout());

        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/user.png"))); // NOI18N
        imgUser.setToolTipText("");
        imgUser.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgUser.setPreferredSize(new java.awt.Dimension(115, 110));
        painelCentral.add(imgUser, java.awt.BorderLayout.LINE_START);

        painelCampoLogin.setPreferredSize(new java.awt.Dimension(140, 110));
        painelCampoLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setBackground(new java.awt.Color(34, 102, 145));
        usuario.setBorder(null);
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuario.setName("txtUsuario"); // NOI18N
        usuario.setOpaque(false);
        usuario.setPhColor(new java.awt.Color(255, 255, 255));
        usuario.setPlaceholder("USUARIO");
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuarioKeyReleased(evt);
            }
        });
        painelCampoLogin.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, -1));

        senha.setBackground(new java.awt.Color(34, 102, 145));
        senha.setBorder(null);
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        senha.setName("txtSenha"); // NOI18N
        senha.setOpaque(false);
        senha.setPhColor(new java.awt.Color(255, 255, 255));
        senha.setPlaceholder("SENHA");
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        painelCampoLogin.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, -1));

        imgCampoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/campoLoginUs.png"))); // NOI18N
        painelCampoLogin.add(imgCampoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        imgCampoPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/campoLoginPass.png"))); // NOI18N
        painelCampoLogin.add(imgCampoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        painelCentral.add(painelCampoLogin, java.awt.BorderLayout.CENTER);

        painelButtonLogin.setPreferredSize(new java.awt.Dimension(390, 60));
        painelButtonLogin.setRequestFocusEnabled(false);
        painelButtonLogin.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/entrar2.png"))); // NOI18N
        btnEntrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setName("btnEntrar"); // NOI18N
        btnEntrar.setPreferredSize(new java.awt.Dimension(135, 45));
        btnEntrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/entrar1.png"))); // NOI18N
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        painelButtonLogin.add(btnEntrar);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/sair2.png"))); // NOI18N
        btnSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.darkGray, java.awt.Color.darkGray));
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setName("btnSair"); // NOI18N
        btnSair.setPreferredSize(new java.awt.Dimension(135, 45));
        btnSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/principal/sair1.png"))); // NOI18N
        painelButtonLogin.add(btnSair);

        painelCentral.add(painelButtonLogin, java.awt.BorderLayout.PAGE_END);

        painelLogin.add(painelCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(painelLogin);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyReleased
        usuario.setText(usuario.getText().toUpperCase());
    }//GEN-LAST:event_usuarioKeyReleased

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String us = usuario.getText();
        String sn = senha.getText();
        if (us.equals("") || sn.equals("")) {
           JOptionPane.showMessageDialog(this, "Preencha os Campos", "Login", 0,
                   new ImageIcon(getClass().getResource("/imagens/usuarios/info.png")));
        } else {
           Logar(us, sn);
        }       
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login tela = new Login();
                tela.setLocationRelativeTo(null);
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel imgCampoPass;
    private javax.swing.JLabel imgCampoUser;
    private javax.swing.JLabel imgLogin;
    private javax.swing.JLabel imgUser;
    private javax.swing.JPanel painelButtonLogin;
    private javax.swing.JPanel painelCampoLogin;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JPanel painelImgCab;
    private javax.swing.JPanel painelLogin;
    private jpass.JRPasswordField senha;
    private app.bolivia.swing.JCTextField usuario;
    // End of variables declaration//GEN-END:variables
}
