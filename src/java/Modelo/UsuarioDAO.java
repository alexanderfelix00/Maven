package Modelo;

import Conexion.CConexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.codec.digest.DigestUtils;

public class UsuarioDAO {

    Connection con;
    CConexion cn = new CConexion();
    PreparedStatement ps;
    ResultSet rs;

    public int Validar(Usuario usu) {
//        String sql = "SELECT * FROM USUARIO WHERE GMAIL = ? AND CLAVE = ?";
        String sql = "SELECT * FROM USUARIO WHERE GMAIL = ? AND (aes_decrypt(CLAVE, 'AES')=?)";
//        SELECT * FROM USUARIO WHERE GMAIL = 'ADMIN' AND (aes_decrypt(CLAVE, 'AES')='ADMIN');
        int r = 0;
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, usu.getEmail());
            ps.setString(2, usu.getClave());
            rs = ps.executeQuery();
            while (rs.next()) {
                r = r + 1;
                usu.setEmail(rs.getString("gmail"));
//                usu.setClave(DigestUtils.md5Hex(rs.getString("clave")));
                usu.setClave(rs.getString("clave"));
            }
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }

    }
    
//    public String encriptar(){
//        String texto="Saludos desde Apuntesdejava.com";
//        String encriptMD5=DigestUtils.md5Hex(texto);
//        System.out.println("md5:"+encriptMD5);
//        return texto;
//    }
//    
//    public static void main(String[] args) {
//        UsuarioDAO dao = new UsuarioDAO();
//        String resp = dao.encriptar();
//        System.out.println(resp);
//    }
    

//    public static void main(String[] args) {
//        UsuarioDAO dao = new UsuarioDAO();
//        Usuario oUsu = new Usuario(1, "ADMIN", "ADMIN");
//        int resp = dao.Validar(oUsu);
//        System.out.println(resp);
//    }

}
