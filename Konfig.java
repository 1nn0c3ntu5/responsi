/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi162;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author INNOCENTUS
 */
public class Konfig {
    
    private static Connection MySQLConfig;
    
    private static Connection configDB()throws SQLException{
        try{
            String url = "jdbc.mysql://localhost:3306/movie";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e) {
            System.out.println(" koneksi ke database gagal " + e.getMassage());
        }
        
        return MySQLConfig;
    }
}
