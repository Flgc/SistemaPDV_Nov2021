/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

/**
 *
 * @author fabio
 */
public class Produtos {
    
    //Constants
    public static String LIST_PR = "SELECT * FROM produtos ORDER BY nome_pr";
    
    public static String INSERT_PR = "INSERT INTO produtos(codigo_pr, nome_pr,"
            + "tipo_pr, valor_pr)" 
            + "VALUES(?,?,?,?)";
    
    public static String UPDATE_PR = "UPDATE produtos SET "
            + "nome_pr = ?, "
            + "tipo_pr = ?, "
            + "valor_pr = ? WHERE codigo_pr=?";
    
    public static String DELETE_PR = "DELETE FROM produtos WHERE codigo_pr = ?";
    
    public static String DELETE_ALL_PR = "DELETE FROM produtos";
    
    private String primaryKey;
    private String nome;
    private String tipoProd;
    private String valor;
    
   public Produtos(){
       
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

   public String getTipoProd(){
       return tipoProd;
   }
   
   public void setTipoProd(String tipoProd) {
       this.tipoProd = tipoProd;
   }

   public String getValor(){
       return valor;
   }
   
   public void setSenha(String valor) {
       this.valor = valor;
   }  
}
