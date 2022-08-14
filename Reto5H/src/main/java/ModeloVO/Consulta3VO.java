package ModeloVO;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hugop
 */
public class Consulta3VO {
    public static void valores() {
        try {
            ResultSet rs = Consulta3VO.Consulta3VO();
            while (rs.next()) {
                int ID=rs.getInt("ID_Compra");
                String constructora=rs.getString("Constructora");
                String banco=rs.getString("Banco_Vinculado");
                System.out.println(String.format("%5d %25s %15s", ID, constructora,banco));
            }
        } catch (SQLException e) {
            //TODO: handle exception
        }
       
    }

}
