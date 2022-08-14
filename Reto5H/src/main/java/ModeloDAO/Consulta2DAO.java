
package ModeloDAO;

import Utilidades.JDBCUtilities;
import java.sql.ResultSet;

/**
 *
 * @author hugop
 */
public class Consulta2DAO {
    public static ResultSet consulta2DAO() {
        ResultSet rs = null;
        String csql = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion =='Casa Campestre' AND Ciudad  IN('Santa Marta', 'Cartagena', 'Barranquilla')";
        try {
            var conn=JDBCUtilities.conexion();
            java.sql.Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        return rs;
    }
}
