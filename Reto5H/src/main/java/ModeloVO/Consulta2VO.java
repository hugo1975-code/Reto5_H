package ModeloVO;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hugop
 */
public class Consulta2VO {
    public static void valores() {
        try {
            ResultSet rs = Consulta2VO.Consulta2VO();
            while (rs.next()) {
                int ID=rs.getInt("ID_Proyecto");
                String constructora=rs.getString("Constructora");
                int nh=rs.getInt("Numero_Habitaciones");
                String ciudad=rs.getString("Ciudad");
                System.out.println(String.format("%5d %25s %2s %15s", ID, constructora, nh,ciudad));
            }
        } catch (SQLException e) {
            //TODO: handle exception
        }
        
    }

    
}
