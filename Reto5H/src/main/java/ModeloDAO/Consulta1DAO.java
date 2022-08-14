package ModeloDAO;

import Utilidades.JDBCUtilities;
import java.sql.ResultSet;

/**
 *
 * @author hugop
 */
public class Consulta1DAO {
    public static ResultSet consulta1DAO() {
        ResultSet rs = null;
        String csql = "SELECT ID_Lider,Nombre,Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";
        try {
            var conn = JDBCUtilities.conexion();
            java.sql.Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);

        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }
    
}
