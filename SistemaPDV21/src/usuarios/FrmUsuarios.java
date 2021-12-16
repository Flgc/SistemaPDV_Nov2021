/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author fabio
 */
public class FrmUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmUsuarios
     */
    public FrmUsuarios() {
        initComponents();
        tabelaUsuarios.getTableHeader().setDefaultRenderer(new principal.EstiloTabelaHeader());
        tabelaUsuarios.setDefaultRenderer(Object.class, new principal.EstiloTabelaRenderer());
                
        //list all records
        tabelaUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        limparCampos();
        
         // Initial components
        
        scmbSexo.addItemListener(new ItemListener() {
 
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (scmbSexo.getSelectedItem().equals("SEXO")){
                    lblSexo.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/sexoL.png")));                
                }

                if (scmbSexo.getSelectedItem().equals("MASCULINO")){
                    lblSexo.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/masL.png")));                
                }

                if (scmbSexo.getSelectedItem().equals("FEMININO")){
                    lblSexo.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/femL.png")));                
                }                                            
            }            
        });
        
        scmbTipoUsu.addItemListener(new ItemListener(){
            //TIPO USUÁRIO, ADMINISTRADOR, FINANCEIRO, VENDEDOR
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (scmbTipoUsu.getSelectedItem().equals("TIPO USUÁRIO")){
                    lblTipoUsu.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/tipousL.png")));                
                }
                
                if (scmbTipoUsu.getSelectedItem().equals("ADMINISTRADOR")){
                    lblTipoUsu.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/administrador.png")));                
                }

                if (scmbTipoUsu.getSelectedItem().equals("FINANCEIRO")){
                    lblTipoUsu.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/masL.png")));                
                }
                
                if (scmbTipoUsu.getSelectedItem().equals("VENDEDOR")){
                    lblTipoUsu.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/normal.png")));                
                }                
            }
        });
        
        tabelaUsuarios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            // If you select the row in the table, show the information      
        
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (tabelaUsuarios.getSelectedRow() != -1) {
                    atualizarDados();
                }
            
            }        
        });      

    }

    void atualizarDados(){
        // Associating table fields with variables
        
        int linha = tabelaUsuarios.getSelectedRow();
        textCodigo.setText(tabelaUsuarios.getValueAt(linha, 0).toString());
        textNome.setText(tabelaUsuarios.getValueAt(linha, 1).toString());
        scmbSexo.setSelectedItem(tabelaUsuarios.getValueAt(linha, 2).toString());
        scmbTipoUsu.setSelectedItem(tabelaUsuarios.getValueAt(linha, 3).toString());
        textSenha.setText(tabelaUsuarios.getValueAt(linha, 4).toString());
        
    }
    
    void limparCampos(){
        if (tabelaUsuarios.getSelectedRow() > -1){
            tabelaUsuarios.removeRowSelectionInterval(tabelaUsuarios.getSelectedRow(),
                    tabelaUsuarios.getSelectedRow());
        }
        textCodigo.setText("");
        textNome.setText("");
        scmbSexo.setSelectedItem("SEXO");
        scmbTipoUsu.setSelectedItem("TIPO USUÁRIO");
        textSenha.setText("");
        textCodNom.setText("");        
        UsuariosSql.listarUsuario("");
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelUsuarios = new javax.swing.JPanel();
        panelRegistro = new javax.swing.JPanel();
        textCodigo = new app.bolivia.swing.JCTextField();
        textNome = new app.bolivia.swing.JCTextField();
        textSenha = new app.bolivia.swing.JCTextField();
        scmbTipoUsu = new org.bolivia.combo.SComboBoxBlue();
        imgCodigo = new javax.swing.JLabel();
        imgNome = new javax.swing.JLabel();
        imgPreco = new javax.swing.JLabel();
        lblTipoUsu = new javax.swing.JLabel();
        scmbSexo = new org.bolivia.combo.SComboBoxBlue();
        lblSexo = new javax.swing.JLabel();
        painelOpcoes = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnExcluirTudo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        painelBuscar = new javax.swing.JPanel();
        textCodNom = new app.bolivia.swing.JCTextField();
        imgCodigoNome = new javax.swing.JLabel();
        jspTabUsuario = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();

        setClosable(true);
        setName("Usuários"); // NOI18N

        painelUsuarios.setName("Usuários"); // NOI18N

        panelRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        panelRegistro.setName(""); // NOI18N
        panelRegistro.setPreferredSize(new java.awt.Dimension(703, 142));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textCodigo.setBackground(new java.awt.Color(34, 102, 145));
        textCodigo.setBorder(null);
        textCodigo.setForeground(new java.awt.Color(255, 255, 255));
        textCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textCodigo.setOpaque(false);
        textCodigo.setPhColor(new java.awt.Color(255, 255, 255));
        textCodigo.setPlaceholder("CÓDIGO");
        textCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCodigoKeyReleased(evt);
            }
        });
        panelRegistro.add(textCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, -1));

        textNome.setBackground(new java.awt.Color(34, 102, 145));
        textNome.setBorder(null);
        textNome.setForeground(new java.awt.Color(255, 255, 255));
        textNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textNome.setOpaque(false);
        textNome.setPhColor(new java.awt.Color(255, 255, 255));
        textNome.setPlaceholder("NOME USUÁRIO");
        textNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNomeKeyReleased(evt);
            }
        });
        panelRegistro.add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 180, -1));

        textSenha.setBackground(new java.awt.Color(34, 102, 145));
        textSenha.setBorder(null);
        textSenha.setForeground(new java.awt.Color(255, 255, 255));
        textSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textSenha.setOpaque(false);
        textSenha.setPhColor(new java.awt.Color(255, 255, 255));
        textSenha.setPlaceholder("SENHA");
        textSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSenhaKeyReleased(evt);
            }
        });
        panelRegistro.add(textSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 180, -1));

        scmbTipoUsu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO USUÁRIO", "ADMINISTRADOR", "FINANCEIRO", "VENDEDOR" }));
        scmbTipoUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelRegistro.add(scmbTipoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, -1));

        imgCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/codigoL.png"))); // NOI18N
        panelRegistro.add(imgCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        imgNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios/nomUs.png"))); // NOI18N
        panelRegistro.add(imgNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        imgPreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios/senha.png"))); // NOI18N
        panelRegistro.add(imgPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        lblTipoUsu.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        lblTipoUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios/tipousL.png"))); // NOI18N
        panelRegistro.add(lblTipoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 50, 50));

        scmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SEXO", "FEMININO", "MASCULINO" }));
        scmbSexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelRegistro.add(scmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 190, -1));

        lblSexo.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        lblSexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios/sexoL.png"))); // NOI18N
        panelRegistro.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 50, 50));

        painelOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPÇÕES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/regis1.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setName("btnRegistrar"); // NOI18N
        btnRegistrar.setPreferredSize(new java.awt.Dimension(75, 95));
        btnRegistrar.setRolloverEnabled(true);
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/regis2.png"))); // NOI18N
        btnRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/editar.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setBorder(null);
        btnAtualizar.setContentAreaFilled(false);
        btnAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setName("btnAtualizar"); // NOI18N
        btnAtualizar.setPreferredSize(new java.awt.Dimension(75, 95));
        btnAtualizar.setRolloverEnabled(true);
        btnAtualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/editar1.png"))); // NOI18N
        btnAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/apagar.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setName("btnExcluir"); // NOI18N
        btnExcluir.setPreferredSize(new java.awt.Dimension(75, 95));
        btnExcluir.setRolloverEnabled(true);
        btnExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/apagar1.png"))); // NOI18N
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnExcluirTudo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnExcluirTudo.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluirTudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/apagarT.png"))); // NOI18N
        btnExcluirTudo.setText("Excluir Tudo");
        btnExcluirTudo.setBorder(null);
        btnExcluirTudo.setContentAreaFilled(false);
        btnExcluirTudo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirTudo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluirTudo.setName("btnExcluirTudo"); // NOI18N
        btnExcluirTudo.setPreferredSize(new java.awt.Dimension(75, 95));
        btnExcluirTudo.setRolloverEnabled(true);
        btnExcluirTudo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/apagarT1.png"))); // NOI18N
        btnExcluirTudo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluirTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirTudoActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar Campos");
        btnLimpar.setBorder(null);
        btnLimpar.setContentAreaFilled(false);
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpar.setName("btnLimpar"); // NOI18N
        btnLimpar.setPreferredSize(new java.awt.Dimension(75, 95));
        btnLimpar.setRolloverEnabled(true);
        btnLimpar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/limpar1.png"))); // NOI18N
        btnLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelOpcoesLayout = new javax.swing.GroupLayout(painelOpcoes);
        painelOpcoes.setLayout(painelOpcoesLayout);
        painelOpcoesLayout.setHorizontalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOpcoesLayout.createSequentialGroup()
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelOpcoesLayout.setVerticalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnExcluirTudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        painelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        painelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textCodNom.setBackground(new java.awt.Color(34, 102, 145));
        textCodNom.setBorder(null);
        textCodNom.setForeground(new java.awt.Color(255, 255, 255));
        textCodNom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textCodNom.setOpaque(false);
        textCodNom.setPhColor(new java.awt.Color(255, 255, 255));
        textCodNom.setPlaceholder("CÓDIGO/NOME");
        textCodNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textCodNomMouseClicked(evt);
            }
        });
        textCodNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textCodNomKeyReleased(evt);
            }
        });
        painelBuscar.add(textCodNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 180, -1));

        imgCodigoNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/buscarL.png"))); // NOI18N
        painelBuscar.add(imgCodigoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "NOME DO USUÁRIO", "SEXO", "TIPO", "SENHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspTabUsuario.setViewportView(tabelaUsuarios);

        javax.swing.GroupLayout painelUsuariosLayout = new javax.swing.GroupLayout(painelUsuarios);
        painelUsuarios.setLayout(painelUsuariosLayout);
        painelUsuariosLayout.setHorizontalGroup(
            painelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelUsuariosLayout.createSequentialGroup()
                        .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jspTabUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        painelUsuariosLayout.setVerticalGroup(
            painelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUsuariosLayout.createSequentialGroup()
                .addComponent(panelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspTabUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCodigoKeyReleased
        textCodigo.setText(textCodigo.getText().toUpperCase());
    }//GEN-LAST:event_textCodigoKeyReleased

    private void textNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNomeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeKeyReleased

    private void textSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSenhaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaKeyReleased

    private void textCodNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCodNomKeyReleased
        // if you enter text in this text box
        
        textCodNom.setText(textCodNom.getText().toUpperCase());
        UsuariosSql.listarUsuario(textCodNom.getText());
    }//GEN-LAST:event_textCodNomKeyReleased

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirTudoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void textCodNomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCodNomMouseClicked
        limparCampos();
    }//GEN-LAST:event_textCodNomMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirTudo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel imgCodigo;
    private javax.swing.JLabel imgCodigoNome;
    private javax.swing.JLabel imgNome;
    private javax.swing.JLabel imgPreco;
    private javax.swing.JScrollPane jspTabUsuario;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTipoUsu;
    private javax.swing.JPanel painelBuscar;
    private javax.swing.JPanel painelOpcoes;
    private javax.swing.JPanel painelUsuarios;
    private javax.swing.JPanel panelRegistro;
    private org.bolivia.combo.SComboBoxBlue scmbSexo;
    private org.bolivia.combo.SComboBoxBlue scmbTipoUsu;
    public static javax.swing.JTable tabelaUsuarios;
    private app.bolivia.swing.JCTextField textCodNom;
    private app.bolivia.swing.JCTextField textCodigo;
    private app.bolivia.swing.JCTextField textNome;
    private app.bolivia.swing.JCTextField textSenha;
    // End of variables declaration//GEN-END:variables
}
