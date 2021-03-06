/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
        
        cmbSexo.addItemListener(new ItemListener() {
 
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (cmbSexo.getSelectedItem().equals("SEXO")){
                    lblSexo.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/sexoL.png")));                
                }

                if (cmbSexo.getSelectedItem().equals("MASCULINO")){
                    lblSexo.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/masL.png")));                
                }

                if (cmbSexo.getSelectedItem().equals("FEMININO")){
                    lblSexo.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/femL.png")));                
                }                                            
            }            
        });
        
        cmbTipoUsu.addItemListener(new ItemListener(){
            //TIPO USUÁRIO, ADMINISTRADOR, FINANCEIRO, VENDEDOR
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (cmbTipoUsu.getSelectedItem().equals("TIPO USUÁRIO")){
                    lblTipoUsu.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/tipousL.png")));                
                }
                
                if (cmbTipoUsu.getSelectedItem().equals("ADMINISTRADOR")){
                    lblTipoUsu.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/administrador.png")));                
                }

                if (cmbTipoUsu.getSelectedItem().equals("FINANCEIRO")){
                    lblTipoUsu.setIcon(new ImageIcon(getClass().getResource("/imagens/usuarios/masL.png")));                
                }
                
                if (cmbTipoUsu.getSelectedItem().equals("VENDEDOR")){
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
                    selecionarRegistro = true;
                }
            
            }        
        });      

    }

    void atualizarDados(){
        // Associating table fields with variables
        
        int linha = tabelaUsuarios.getSelectedRow();
        txtCodigo.setText(tabelaUsuarios.getValueAt(linha, 0).toString());
        txtNome.setText(tabelaUsuarios.getValueAt(linha, 1).toString());
        cmbSexo.setSelectedItem(tabelaUsuarios.getValueAt(linha, 2).toString());
        cmbTipoUsu.setSelectedItem(tabelaUsuarios.getValueAt(linha, 3).toString());
        txtSenha.setText(tabelaUsuarios.getValueAt(linha, 4).toString());
        
    }
    
    void limparCampos(){
        if (tabelaUsuarios.getSelectedRow() > -1){
            tabelaUsuarios.removeRowSelectionInterval(tabelaUsuarios.getSelectedRow(),
                    tabelaUsuarios.getSelectedRow());
        }
        txtCodigo.setText("");
        txtNome.setText("");
        cmbSexo.setSelectedItem("SEXO");
        cmbTipoUsu.setSelectedItem("TIPO USUÁRIO");
        txtSenha.setText("");
        txtCodNom.setText("");        
        UsuariosSql.listarUsuario("");
        UsuariosSql.gerarId();
    }
    
    void selecionarLinha(String id){
        for (int i = 0; i < tabelaUsuarios.getRowCount(); i++) {
            if (id.equals(tabelaUsuarios.getValueAt(i, 0))) {
                tabelaUsuarios.setRowSelectionInterval(i, i);
                break;
            }
        }
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
        txtCodigo = new app.bolivia.swing.JCTextField();
        txtNome = new app.bolivia.swing.JCTextField();
        txtSenha = new jpass.JRPasswordField();
        cmbTipoUsu = new org.bolivia.combo.SComboBoxBlue();
        imgCodigo = new javax.swing.JLabel();
        imgNome = new javax.swing.JLabel();
        imgPreco = new javax.swing.JLabel();
        lblTipoUsu = new javax.swing.JLabel();
        cmbSexo = new org.bolivia.combo.SComboBoxBlue();
        lblSexo = new javax.swing.JLabel();
        painelOpcoes = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnExcluirTudo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        painelBuscar = new javax.swing.JPanel();
        txtCodNom = new app.bolivia.swing.JCTextField();
        imgCodigoNome = new javax.swing.JLabel();
        jspTabUsuario = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();

        setClosable(true);
        setTitle("USUÁRIOS");
        setName("Usuários"); // NOI18N

        painelUsuarios.setName("Usuários"); // NOI18N

        panelRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        panelRegistro.setName(""); // NOI18N
        panelRegistro.setPreferredSize(new java.awt.Dimension(703, 142));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setBackground(new java.awt.Color(34, 102, 145));
        txtCodigo.setBorder(null);
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodigo.setOpaque(false);
        txtCodigo.setPhColor(new java.awt.Color(255, 255, 255));
        txtCodigo.setPlaceholder("CÓDIGO");
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });
        panelRegistro.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, -1));

        txtNome.setBackground(new java.awt.Color(34, 102, 145));
        txtNome.setBorder(null);
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNome.setOpaque(false);
        txtNome.setPhColor(new java.awt.Color(255, 255, 255));
        txtNome.setPlaceholder("NOME USUÁRIO");
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });
        panelRegistro.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 180, -1));

        txtSenha.setBackground(new java.awt.Color(34, 102, 145));
        txtSenha.setBorder(null);
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSenha.setName("txtSenha"); // NOI18N
        txtSenha.setOpaque(false);
        txtSenha.setPhColor(new java.awt.Color(255, 255, 255));
        txtSenha.setPlaceholder("SENHA");
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        panelRegistro.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 180, -1));

        cmbTipoUsu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO USUÁRIO", "ADMINISTRADOR", "FINANCEIRO", "VENDEDOR" }));
        cmbTipoUsu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelRegistro.add(cmbTipoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, -1));

        imgCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos/codigoL.png"))); // NOI18N
        panelRegistro.add(imgCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        imgNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios/nomUs.png"))); // NOI18N
        panelRegistro.add(imgNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        imgPreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios/senha.png"))); // NOI18N
        panelRegistro.add(imgPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        lblTipoUsu.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        lblTipoUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios/tipousL.png"))); // NOI18N
        panelRegistro.add(lblTipoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 50, 50));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SEXO", "FEMININO", "MASCULINO" }));
        cmbSexo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelRegistro.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 190, -1));

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

        txtCodNom.setBackground(new java.awt.Color(34, 102, 145));
        txtCodNom.setBorder(null);
        txtCodNom.setForeground(new java.awt.Color(255, 255, 255));
        txtCodNom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodNom.setOpaque(false);
        txtCodNom.setPhColor(new java.awt.Color(255, 255, 255));
        txtCodNom.setPlaceholder("CÓDIGO/NOME");
        txtCodNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodNomMouseClicked(evt);
            }
        });
        txtCodNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodNomKeyReleased(evt);
            }
        });
        painelBuscar.add(txtCodNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 180, -1));

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

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        txtCodigo.setText(txtCodigo.getText().toUpperCase());
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        txtNome.setText(txtNome.getText().toUpperCase());
    }//GEN-LAST:event_txtNomeKeyReleased

    private void txtCodNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodNomKeyReleased
        // if you enter text in this text box
        
        txtCodNom.setText(txtCodNom.getText().toUpperCase());
        UsuariosSql.listarUsuario(txtCodNom.getText());
    }//GEN-LAST:event_txtCodNomKeyReleased

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirTudoActionPerformed
        if (tabelaUsuarios.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this, "Deseja realizar a excusão "
                    + "de todos?", "Usuários", JOptionPane.YES_NO_OPTION, 0, 
                    new ImageIcon(getClass().getResource("/imagens/usuarios/info"
                            + ".png"))) == JOptionPane.YES_OPTION) {
                
                    int eliminaT = UsuariosSql.eliminarTodos();
                
                    if (eliminaT != 0){
                        limparCampos();
                        JOptionPane.showMessageDialog(this, "Registros excluidos.", 
                        "Usuários", 0, new ImageIcon(getClass().getResource(
                                "/imagens/usuarios/info.png")));
                    }               
        } else {
            
                JOptionPane.showMessageDialog(this, "Não há registros para exclusão.", 
                        "Usuários", 0, new ImageIcon(getClass().getResource(
                                "/imagens/usuarios/info.png")));            
            }
        }
    }//GEN-LAST:event_btnExcluirTudoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaUsuarios.getRowCount() > 0) {
            if (tabelaUsuarios.getSelectedRowCount() > 0) {
                if (JOptionPane.showConfirmDialog(this, "Deseja excluir?", 
                        "Usuários", JOptionPane.YES_NO_OPTION, 0, new ImageIcon(
                                getClass().getResource("/imagens/usuarios/info"
                                        + ".png"))) == JOptionPane.YES_OPTION) {
                    int linha = tabelaUsuarios.getSelectedRow();
                    String id = tabelaUsuarios.getValueAt(linha, 0).toString();
                    
                    int elimina = UsuariosSql.eliminarUsuario(id);
                    
                    if (elimina != 0){                        
                        JOptionPane.showMessageDialog(this, "Registro excluido.", 
                        "Usuários", 0, new ImageIcon(getClass().getResource(
                                "/imagens/usuarios/info.png")));
                        limparCampos();
                    }                
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione o registro.", 
                        "Usuários", 0, new ImageIcon(getClass().getResource(
                                "/imagens/usuarios/info.png")));                
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há registros para exclusão.", 
                        "Usuários", 0, new ImageIcon(getClass().getResource(
                                "/imagens/usuarios/info.png")));            
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (tabelaUsuarios.getRowCount() > 0) {
            if (tabelaUsuarios.getSelectedRowCount() > 0) {
                String sen = new String(txtSenha.getPassword());
                if (txtCodigo.getText().equals("") || txtNome.getText().equals("")
                        || cmbSexo.getSelectedItem().equals("SEXO") || cmbTipoUsu
                                .getSelectedItem().equals("TIPO USUÁRIO")) {
                    JOptionPane.showMessageDialog(this, "Preencha os campo ", 
                            "Usuários", 0, new ImageIcon(getClass().getResource(
                                    "/imagens/usuarios/info.png")));                            
                } else if (JOptionPane.showConfirmDialog(this, "Deseja alterar o"
                        + " registro?", "Usuários", 0, JOptionPane.YES_NO_OPTION,
                        new ImageIcon(getClass().getResource("/imagens/usuarios/"
                                + "info.png"))) == JOptionPane.YES_OPTION) {
                    
                    usuarios.Usuarios us = new Usuarios();
                    us.setPrimaryKey(txtCodigo.getText());
                    us.setNome(txtNome.getText());
                    us.setSexo(cmbSexo.getSelectedItem().toString());
                    us.setTipoUser(cmbTipoUsu.getSelectedItem().toString());
                    us.setSenha(sen);
                    
                    int opc = UsuariosSql.atualizarUsuario(us);
                    
                    if (opc !=0){
                        String id = txtCodigo.getText();                        
                        selecionarLinha(id);
                        JOptionPane.showMessageDialog(this, "Registro Atualizado",
                                "Usuários", 0, new ImageIcon(getClass().
                                        getResource("/imagens/usuarios/info.png"
                                        )));
                        limparCampos();
                    }
            }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um registro.",
                        "Usuários", 0, new ImageIcon(getClass().
                                getResource("/imagens/usuarios/info.png")));                                        
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há registro para alterar.",
                    "Usuários", 0, new ImageIcon(getClass().
                            getResource("/imagens/usuarios/info.png")));                        
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    boolean selecionarRegistro = false;
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(selecionarRegistro) {
            JOptionPane.showMessageDialog(this, "O código: " + this.txtCodigo.
                    getText() + "\n Já está registrado.", "Usuários", 0,
                    new ImageIcon(getClass().getResource("/imagens/usuarios/info"
                            + ".png")));        
        }else{
            String sen = new String(txtSenha.getPassword());
            if (txtCodigo.getText().equals("") || txtNome.getText().equals("") 
                || cmbSexo.getSelectedItem().equals("SEXO") || cmbTipoUsu.
                        getSelectedItem().equals("TIPO USUÁRIO") || txtSenha.
                                equals("")) {
            JOptionPane.showMessageDialog(this, "Todos os campos \n são obriga"
                    + "tórios.", "Usuários", 0, new ImageIcon(getClass().
                            getResource("/imagens/usuarios/info.png")));            
            }else {
                usuarios.Usuarios us = new Usuarios();
                
                us.setPrimaryKey(txtCodigo.getText());
                us.setNome(txtNome.getText());
                us.setSexo(cmbSexo.getSelectedItem().toString());
                us.setTipoUser(cmbTipoUsu.getSelectedItem().toString());
                us.setSenha(sen);
                
                int op = UsuariosSql.registrarUsuario(us);
                
                if(op != 0){
                    String id = txtCodigo.getText();
                    limparCampos();
                    selecionarLinha(id);
                    JOptionPane.showMessageDialog(this, "Usuário Inserido com"
                            + " Sucesso.", "Usuários", 0, new ImageIcon(getClass().
                            getResource("/imagens/usuarios/info.png")));                     
                }                
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtCodNomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodNomMouseClicked
        limparCampos();
    }//GEN-LAST:event_txtCodNomMouseClicked

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirTudo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRegistrar;
    private org.bolivia.combo.SComboBoxBlue cmbSexo;
    private org.bolivia.combo.SComboBoxBlue cmbTipoUsu;
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
    public static javax.swing.JTable tabelaUsuarios;
    private app.bolivia.swing.JCTextField txtCodNom;
    public static app.bolivia.swing.JCTextField txtCodigo;
    private app.bolivia.swing.JCTextField txtNome;
    private jpass.JRPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
