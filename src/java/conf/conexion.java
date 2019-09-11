/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conf;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Pavón
 */
public class conexion {

    /*relaizar conexion*/
    Connection con;

    public conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdbodega", "root", "");
        } catch (Exception e) {
            System.err.println("Error" + e);
            JOptionPane.showMessageDialog(null, "no se puede consultar");
            
        }
    }
    
    public Connection getConnection(){
        return con;
    }
}
