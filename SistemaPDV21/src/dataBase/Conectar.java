/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author fabio
 * 
 */
public class Conectar {
    
    Connection conect = null;
    
    public Connection conexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemapdv21", "fabio", "mysql2021");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error ao conectar no banco de dados -> " + e);
        }
        return conect;
   }        
}
