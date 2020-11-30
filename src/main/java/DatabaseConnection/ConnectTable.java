/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDUWARA
 */
public class ConnectTable {
       
             private static String dbhost="jdbc:sqlserver://localhost:1433";
             private static String username="root";
             private static String password="password";
             private static Connection con; 
             
             
               public Connection Connect(){
                    /* try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;dabaseName=projtu6;user=root;password=password");
             Statement stmt= con.createStatement();

         }catch(Exception e){
             System.out.print(e);
         }
*/
                    /*                    @SuppressWarnings("finally")
                    public static String Connection createNewDB(){
                    try{
                    con=DriverManager.getConnection(dbhost, username, password);
                    
                    }catch(SQLException e){
                    System.out.println("Cannot create database connection");
                    
                    
                    
                    }finally{
                    return con;
                    }*/
                   
              return con; }

    public ResultSet executeQuery(String select__from_Supplier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
         
     }
/*
    public ResultSet executeQuery(String select__from_Supplier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void createNewDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
        

