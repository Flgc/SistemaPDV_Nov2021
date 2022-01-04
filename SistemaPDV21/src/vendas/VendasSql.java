/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

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
import principal.GerarNumero;

/**
 *
 * @author fabio
 */
public class VendasSql {
    
    static Conectar cc = new Conectar();
    static Connection cn = cc.conexao();
    static PreparedStatement ps;
    
    public static void listar(String fldBuscar) {
        DefaultTableModel modelo = (DefaultTableModel) vendas.FrmVendas.tabelaVendas
                .getModel();
        
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
        String sql = "";
        if(fldBuscar.equals("")){
            sql = Vendas.LIST_VD;
        }else {
            sql = "SELECT * FROM vendas WHERE (numero_ve like'" 
                    + fldBuscar + "%' or data_ve='" + fldBuscar + "')" 
                    + " ORDER BY data_ve";
        }
        
        // Array with the number of fields in the table "jTable"
        String dados[] = new String[3];
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
    
    public static void numeros() {
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
                vendas.FrmCaixa.numFac.setText("00000001");                
            }else {
                j = Integer.parseInt(c);
                GerarNumero gen = new GerarNumero();
                gen.gerar(j);
                
                vendas.FrmCaixa.numFac.setText(gen.serie());
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendasSql.class.getName()).log(Level.SEVERE, SQL);
        }
    } 

    public static void numeros1() {
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
                vendas.FrmCaixa.numFac.setText("00000001");                
            }else {
                j = Integer.parseInt(c);
                GerarNumero gen = new GerarNumero();
                gen.gerar(j);
                
                vendas.FrmCaixa.numFac.setText(gen.serie());
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