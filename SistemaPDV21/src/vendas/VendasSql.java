/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

import produtos.*;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import principal.Conectar;
import principal.GerarCodigos;

/**
 *
 * @author fabio
 */
public class VendasSql {
    
    static Conectar cc = new Conectar();
    static Connection cn = cc.conexao();
    static PreparedStatement ps;
    
    public static void listar(String fldBuscar) {
        DefaultTableModel modelo = (DefaultTableModel) vendas.FrmVendas
                .tabela.getModel();
        
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
        String sql = "";
        if(fldBuscar.equals("")){
            sql = Vendas.LIST_VD;
        }else {
            sql = "SELECT * FROM vendas WHERE (numero_ve like'" 
                    + fldBuscar + "%' or data_ve like'" + fldBuscar
                    + "%') " + "order by data_ve";
        }
        
        // Array with the number of fields in the table "jTable"
        String dados[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet  rs = st.executeQuery(sql);
            while (rs.next()){
                dados[0] = rs.getString("numero_ve");
                dados[1] = rs.getString("total_ve");
                dados[2] = rs.getString("data_ve");                
                
                modelo.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Vendas.class.getName()).log(Level.SEVERE, sql);
        }        
    }
    
    public static int registrar(Vendas reg){
        int rsp = 0;
        String sql = Vendas.INSERT_VD;
        
        try {
            ps = cn.prepareStatement(sql);
            
            ps.setString(1, reg.getPrimaryKey());
            ps.setString(2, reg.getTotal());
            ps.setString(3, reg.getData());
            
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
        String SQL = "SELECT MAX(numero_ve) FROM vendas";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }
            
            if (c == null ) {
                vendas.FrmVendas.txtCodigo.setText("PRD0001");                
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
                
                vendas.FrmVendas.txtCodigo.setText("PRD" + gen.serie());
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendasSql.class.getName()).log(Level.SEVERE, SQL);
        }
    } 
   
    public static int eliminarVendas(String id) {
        int rpr = 0;
        
        String sql = Vendas.DELETE_VD;
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
        
        String sql = Vendas.DELETE_ALL_VD;
        try {
            ps = cn.prepareStatement(sql);
            
            rpr = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rpr;        
    }
}