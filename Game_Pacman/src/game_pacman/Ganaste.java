/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_pacman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class Ganaste extends JFrame {

    private ImageIcon imagenFondoPres;
    private JLabel eti;
    private JPanel panelGuardar;
    private JPanel panelInicial;
    private JPanel panelVer;
    private JScrollPane scroll;

    public Ganaste() {
        super("GANASTE");
        this.setSize(500, 300);
        this.setDefaultCloseOperation(3);
        
        this.iniciaComponente();
    }

    public void iniciaComponente() {

        this.eti = new JLabel();
        this.eti.add(new JLabel("FELICIDADES GANASTE "));

        imagenFondoPres = new ImageIcon("imagenes/Secundario.jpg");
       
        JPanel panelInicial = new JPanel();
       
        JTextField tex = new JTextField(20);
        
        this.panelInicial = new JPanel ();
       
        this.panelInicial.add(this.eti);
        this.panelInicial.add(tex);
        this.panelInicial.setBackground(Color.red);
       
        //this.eti.add(this.panelInicial);
        this.panelInicial.setVisible(true);
        
        
        
    }
    

}
