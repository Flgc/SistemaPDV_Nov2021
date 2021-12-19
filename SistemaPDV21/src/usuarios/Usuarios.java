/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

/**
 *
 * @author fabio
 */
public class Usuarios {
    
    //Constants
    public static String LIST_US = "SELECT * FROM usuarios ORDER BY nome_us";
    
    public static String INSERT_US = "INSERT INTO usuarios(codigo_us, nome_us,"
            + "sexo_us, tipo_us, senha)" 
            + "VALUES(?,?,?,?,?)";
    
    public static String UPDATE_US = "UPDATE usuarios SET "
            + "nome_us = ?, "
            + "sexo_us = ?, "
            + "tipo_us = ?, "
            + "senha = ? WHERE codigo_us=?";
    
    public static String DELETE_US = "DELETE FROM usuarios WHERE codigo_us = ?";
    
    public static String DELETE_ALL_US = "DELETE FROM usuarios";
    
    private String primaryKey;
    private String nome;
    private String sexo;
    private String tipoUser;
    private String senha;
    
   public Usuarios(){
       
   }
   
   public String getPrimaryKey(){
       return primaryKey;
   }
   
   public void setPrimaryKey(String primaryKey) {
       this.primaryKey = primaryKey;
   }
   
   public String getNome(){
       return nome;
   }
   
   public void setNome(String nome) {
       this.nome = nome;
   }

   public String getSexo(){
       return sexo;
   }
   
   public void setSexo(String sexo) {
       this.sexo = sexo;
   }

   public String getTipoUser(){
       return tipoUser;
   }
   
   public void setTipoUser(String tipoUser) {
       this.tipoUser = tipoUser;
   }

   public String getSenha(){
       return senha;
   }
   
   public void setSenha(String senha) {
       this.senha = senha;
   }   
    
}
