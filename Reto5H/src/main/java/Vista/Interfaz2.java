package Vista;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hugop
 */
public class Interfaz2 extends JFrame {
    JPanel panelg;
    JTable tabla;
    JScrollPane scpanel02;
    DefaultTableModel model02;
    private TableModel modelo02;

    public Interfaz2() {
        setTitle("Consulta 2");
        setSize(500, 320);
        //setDefaultCloseOperation(EXIT_ON_CLOSE)

        setResizable(false);
        panelg = new JPanel();
        panelg.setBackground(new Color(45, 144, 73));
        
      
        String[] columnas = { "ID", "constructora", "Numero_Habitaciones", "Ciudad" };
        //ResultSet datos=consulta1.consulta1();
        String[][] Datos = { { "", "", "", "" }, { "", "", "", "" } };
        modelo02 = new DefaultTableModel(Datos, columnas);
        tabla = new JTable(modelo02);
        scpanel02 = new JScrollPane(tabla);
        scpanel02.setBounds(50, 100, 450, 300);
        add(scpanel02);


        add(panelg);
        setVisible(true);

    }
}
