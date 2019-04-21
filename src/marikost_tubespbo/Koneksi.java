/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marikost_tubespbo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author poncoe
 */
public class Koneksi {
    
     public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/marikost_db", "root", ""); // Port 3307
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marikost_db", "root", ""); // Port 3306
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}
