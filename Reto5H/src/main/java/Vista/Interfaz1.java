package Vista;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hugop
 */
public class Interfaz1 extends JFrame {
    JPanel panelg;
    JScrollPane scpanel01;
    JTable tabla01;
    DefaultTableModel modelo01;

    public Interfaz1() {
        setTitle("Consulta 1");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setResizable(false);
        panelg = new JPanel();
        panelg.setBackground(new Color(45, 144, 73));

        String[] columnas = { "ID", "Nombre", "Apellidos", "Ciudad" };
        //ResultSet datos=consulta1.consulta1();
        String[][] Datos = { { "", "", "", "" }, { "", "", "", "" } };
        modelo01 = new DefaultTableModel(Datos, columnas);
        tabla01 = new JTable(modelo01);
        scpanel01 = new JScrollPane(tabla01);
        scpanel01.setBounds(50, 100, 450, 300);
        add(scpanel01);

       
        add(panelg);
        setVisible(true);
 
    }       

}
