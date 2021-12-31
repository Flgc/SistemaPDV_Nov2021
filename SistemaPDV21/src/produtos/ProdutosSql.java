/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import principal.Conectar;
import principal.GerarCodigos;

/**
 *
 * @author fabio
 */
public class ProdutosSql {
    
    static Conectar cc = new Conectar();
    static Connection cn = cc.conexao();
    static PreparedStatement ps;
    
    public static void listar(String buscarTxtCodNom) {
        DefaultTableModel modelo = (DefaultTableModel) produtos.FrmProdutos
                .tabela.getModel();
        
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
        String sql = "";
        if(buscarTxtCodNom.equals("")){
            sql = Produtos.LIST_PR;
        }else {
            sql = "SELECT * FROM produtos WHERE (codigo_pr like'" 
                    + buscarTxtCodNom + "%' or nome_pr like'" + buscarTxtCodNom
                    + "%') " + "order by nome_pr";
        }
        
        // Array with the number of fields in the table "jTable"
        String dados[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet  rs = st.executeQuery(sql);
            while (rs.next()){
                dados[0] = rs.getString("codigo_pr");
                dados[1] = rs.getString("tipo_pr");
                dados[2] = rs.getString("nome_pr");
                dados[3] = rs.getString("valor_pr");
                
                modelo.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Produtos.class.getName()).log(Level.SEVERE, sql);
        }        
    }
    
    public static int registrar(Produtos reg){
        int rsp = 0;
        String sql = Produtos.INSERT_PR;
        
        try {
            ps = cn.prepareStatement(sql);
            
            ps.setString(1, reg.getPrimaryKey());
            ps.setString(2, reg.getTipoProd());
            ps.setString(3, reg.getNome());
            ps.setString(4, reg.getPreco());
            
            rsp = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rsp;
    }
    
    public static void gerarId() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "SELECT MAX(codigo_pr) FROM produtos";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }
            
            if (c == null ) {
                produtos.FrmProdutos.txtCodigo.setText("PRD0001");
            }else {
                char r1 = c.charAt(3);
                char r2 = c.charAt(4);
                char r3 = c.charAt(5);
                char r4 = c.charAt(6);
                String r = "";
                r = ""+ r1 + r2 + r3 + r4;
                j = Integer.parseInt(r);
                GerarCodigos gen = new GerarCodigos();
                gen.gerar(j);
                
                produtos.FrmProdutos.txtCodigo.setText("PRD" + gen.serie());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosSql.class.getName()).log(Level.SEVERE, SQL);
        }
    } 
    
    public static int atualizarProdto(Produtos pR) {
        int rpr = 0;
        String sql = Produtos.UPDATE_PR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, pR.getNome());
            ps.setString(2, pR.getTipoProd());
            ps.setString(3, pR.getPreco());
            ps.setString(4, pR.getPrimaryKey());
            
            rpr = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rpr;    
    }
    
    public static int eliminarProduto(String id) {
        int rpr = 0;
        
        String sql = Produtos.DELETE_PR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            
            rpr = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rpr;    
    }
    
    public static int eliminarTodos() {
        int rpr = 0;
        
        String sql = Produtos.DELETE_ALL_PR;
        try {
            ps = cn.prepareStatement(sql);
            
            rpr = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rpr;        
    }

    public static void listarCatProduto(String buscarCodigoNome) {
        DefaultTableModel modelo = (DefaultTableModel) produtos.FrmProdutos
                .tabela.getModel();
        
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
        String sql = "";
        if(buscarCodigoNome.equals("")){
            sql = Produtos.LIST_PR;
        }else {
            sql = "SELECT * FROM produtos WHERE (codigo_pr like'" 
                    + buscarCodigoNome + "%' or nome_pr like'" + buscarCodigoNome
                    + "%') " + "order by nome_pr";
        }
        
        // Array with the number of fields in the table "jTable"
        String dados[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet  rs = st.executeQuery(sql);
            while (rs.next()){
                dados[0] = rs.getString("codigo_pr");
                dados[1] = rs.getString("tipo_pr");
                dados[2] = rs.getString("nome_pr");
                dados[3] = rs.getString("valor_pr");
                
                modelo.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Produtos.class.getName()).log(Level.SEVERE, sql);
        }        
    }    
}