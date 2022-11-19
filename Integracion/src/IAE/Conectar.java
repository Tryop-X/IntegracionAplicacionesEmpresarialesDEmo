/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAE;

/**
 *
 * @author Sistemas
 */
import java.sql.Connection;
import java.sql.DriverManager;
 
public class Conectar {
    public static final String URL = "jdbc:mysql://localhost:3306/icecream";
    public static final String USER = "root";
    public static final String CLAVE = "mysql";
     
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("Conectado");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}