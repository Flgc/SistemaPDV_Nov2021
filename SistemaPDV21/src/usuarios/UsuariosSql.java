/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

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

/**
 *
 * @author fabio
 */
public class UsuariosSql {
    
    static Conectar cc = new Conectar();
    static Connection cn = cc.conexao();
    static PreparedStatement ps;
    
    public static void listarUsuario(String buscarTextCodNom) {
        DefaultTableModel modelo = (DefaultTableModel) usuarios.FrmUsuarios
                .tabelaUsuarios.getModel();
        
        while(modelo.getRowCount() > 0){
            modelo.removeRow(0);
        }
        String sql = "";
        if(buscarTextCodNom.equals("")){
            sql = Usuarios.LIST_US;
        }else {
            sql = "SELECT * FROM usuarios WHERE (codigo_us like'" 
                    + buscarTextCodNom + "%' or nome_us like'" + buscarTextCodNom
                    + "%') " + "order by nome_us";
        }
        
        // Array with the number of fields in the table "jTable"
        String dados[] = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet  rs = st.executeQuery(sql);
            while (rs.next()){
                dados[0] = rs.getString("codigo_us");
                dados[1] = rs.getString("nome_us");
                dados[2] = rs.getString("sexo_us");
                dados[3] = rs.getString("tipo_us");
                dados[4] = rs.getString("senha");
                modelo.addRow(dados);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, sql);
        }        
    }
}