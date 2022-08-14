/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class Interfaz3 extends JFrame {
    JPanel panelg;
    JTable tabla;
    JScrollPane scpanel03;
    DefaultTableModel modelo03;

    public Interfaz3() {
        setTitle("Consulta 3");
        setSize(500, 400);
        //setDefaultCloseOperation(EXIT_ON_CLOSE)

        
        setResizable(false);
        panelg = new JPanel();
        panelg.setBackground(new Color(45, 144, 73));
               
        String[] columnas = { "ID", "constructora", "banco" };
        //ResultSet datos=consulta1.consulta1();
        String[][] Datos = { { "", "", "", "" }, { "", "", "", "" } };
        modelo03 = new DefaultTableModel(Datos, columnas);
        tabla = new JTable(modelo03);
        scpanel03 = new JScrollPane(tabla);
        scpanel03.setBounds(50, 100, 450, 300);
        add(scpanel03);

       
        add(panelg);
        setVisible(true);
 
    }       
}
