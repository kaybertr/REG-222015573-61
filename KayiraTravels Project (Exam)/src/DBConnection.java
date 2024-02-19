
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T
 */
public class DBConnection {
    static final String DB_URL = "jdbc:mysql://localhost/kayiratravel";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection DBConnection(){
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            return con;
        } catch (SQLException ex) {
            System.out.println("Failed to Connect");
            return null;
        }
        
    
    }
    
    
}
