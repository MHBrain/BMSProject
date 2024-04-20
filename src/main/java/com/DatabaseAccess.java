/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 1-MBrain
 */
public class DatabaseAccess {
    
    private static final String CONN_URL = "jdbc:mysql://computing.gfmat.org:3306/";
    private static final String DB_NAME = "BMSProject";
    private static final String USERNAME = "MBrain";
    private static final String PASSWORD = "hkFfdZ2X3N";
    //Declaring database information; final = constant
    
    //try catch
    public static boolean sqlTestDBConnection() {
        boolean connection;
        try (Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USERNAME, PASSWORD)){
            System.out.println("Connection made.");
            connection = true;
            con.close();
        } catch (Exception error) {
            System.out.println("Connection failed." + error.getMessage());
            connection = false;
        }
        return connection;
    }
    
    
//   public static ResultSet getData() throws SQLException {
//       String sql = "SELECT * FROM stock";
//       Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USERNAME, PASSWORD);
//       Statement statement = con.createStatement();
//       ResultSet resultset = statement.executeQuery(sql);
//       
//       return resultset;
//   }
            
    public static void addStock() {
        //INSERT INTO 
    }
          
}
