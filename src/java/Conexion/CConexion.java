package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * @author Angel Gabriel TG
 */
public class CConexion {
    
    Connection conectar = null;
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDMATRICULA","root","12345678");
//            System.out.println("EXITO");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar: "+e.getMessage());
        }
        return conectar;
    }
//    public static void main(String[] args) {
//        CConexion oConec = new CConexion();
//        oConec.conectar();
//    }
    
}
