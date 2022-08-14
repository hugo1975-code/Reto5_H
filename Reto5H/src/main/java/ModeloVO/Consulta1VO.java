package ModeloVO;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hugop
 */
public class Consulta1VO {
    public static void valores() {
        try {
            ResultSet rs = Consulta1VO.Consulta1VO();

            var ID = new ArrayList<Integer>();
            ArrayList<String> nombre = new ArrayList<>();
            ArrayList<String> apellido = new ArrayList<>();
            ArrayList<String> ciudad = new ArrayList<>();

            String url = "jdbc:sqlite:C:\\Users\\hugop\\Documents\\NetBeansProjects\\Reto5H\\ProyectosConstruccion.db";
            System.out.println("Conexion abierta con con la base de datos");

            while (rs.next()) {

            }
            Object[][] salida = new Object[ID.size()][4];
            for (int i = 0; i < ID.size(); i++) {

            }

            System.out.println(ID.size());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}
