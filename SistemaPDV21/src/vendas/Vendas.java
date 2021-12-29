/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

/**
 *
 * @author fabio
 */
public class Vendas {
    //Constants
    public static String LIST_VD = "SELECT * FROM vendas ORDER BY data_ve";
    
    public static String INSERT_VD = "INSERT INTO vendas(numero_ve, total_ve,"
            + "data_ve) VALUES(?,?,?)";
    
    public static String DELETE_VD = "DELETE FROM vendas WHERE numero_ve = ?";
    
    public static String DELETE_ALL_VD = "DELETE FROM vendas";
    
    private String primaryKey;
    private String total;
    private String data;
    
   public Vendas(){
       
   }
   
   public String getPrimaryKey(){
       return primaryKey;
   }
   
   public void setPrimaryKey(String primaryKey) {
       this.primaryKey = primaryKey;
   }
   
   public String getTotal(){
       return total;
   }
   
   public void setTotal(String total) {
       this.total = total;
   }

   public String getData(){
       return data;
   }
   
   public void setData(String data) {
       this.data = data;
   }
}