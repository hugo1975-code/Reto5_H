package ModeloDAO;

import Utilidades.JDBCUtilities;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author hugop
 */
public class Consulta3DAO {
     public static ResultSet Consulta3DAO() {
        ResultSet rs = null;
        String csql = "SELECT ID_Compra AS 'Compra', Constructora, Banco_Vinculado AS 'Financiado por' FROM Compra JOIN Proyecto USING(ID_Proyecto) WHERE Ciudad=='Salento' AND Proveedor=='Homecenter'";
        try {
            var conn=JDBCUtilities.conexion();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        return rs;
    }
    
}
