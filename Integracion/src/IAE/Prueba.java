/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAE;
import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author Sistemas
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conectar conecta = new Conectar();
        Connection con = conecta.getConexion();
        String query = "SELECT * FROM icecream.tblicecream;";
        try {
            Statement stm = con.createStatement();
            ResultSet result = stm.executeQuery(query);
            System.out.println("HOLA");
            int id;
            String nombre;
            String descripcion;
            
            while(result.next()){
                id = result.getInt("IceCreamID");
                nombre = result.getString("IceCream");
                descripcion = result.getString("Description");
                System.out.println(id + "\t" + nombre + "\t\t\t" + descripcion);
            }
        } catch (Exception e) {
        }
        
    }
    
}
