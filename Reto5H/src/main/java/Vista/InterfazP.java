/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hugop
 */
public class InterfazP extends JFrame implements ActionListener {
    JPanel panel01;
    JButton btn01;
    JButton btn02;
    JButton btn03;

    public InterfazP(){
        setTitle("Principal");
        setSize(500,120);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        btn01=new JButton("Consulta 1");
        btn01.setBounds(40,20,100,40);
        btn01.addActionListener(this);
        add(btn01);

        btn02=new JButton("Consulta 2");
        btn02.setBounds(180,20,100,40);
        btn02.addActionListener(this);
        add(btn02);

        btn03=new JButton("Consulta 3");
        btn03.setBounds(320,20,100,40);
        btn03.addActionListener(this);
        add(btn03);

        panel01=new JPanel();
        add(panel01);

        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent  e){
        //TODO Auto-generate method stub
        if(e.getSource()==btn01){
            Interfaz1 interfaz1 = new Interfaz1();
        }
        else if(e.getSource()==btn02){
            Interfaz2 interfaz2 = new Interfaz2();
        }
        else if(e.getSource()==btn03){
            Interfaz3 interfaz3 = new Interfaz3();
        }
    }
}
