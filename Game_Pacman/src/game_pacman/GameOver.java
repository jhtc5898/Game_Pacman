/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_pacman;

import static game_pacman.Juego.panelJuego;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
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
public class GameOver extends JFrame {

    private ImageIcon imagenFondoPres;
    private JLabel eti;
    private JPanel panel;
    private JScrollPane scroll;

    public GameOver() {
        super("Game Over");
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.iniciaComponente();
    }

    public void iniciaComponente() {
      
        panelJuego = new JPanel();
        panelJuego.setLayout(null);
        panelJuego.setBackground(Color.black);
        panelJuego.setBounds(0,0,this.getWidth(),this.getHeight());
        panelJuego.setVisible(true);
        
        eti = new JLabel("Dato");
        eti.setBounds(0, 0, this.getWidth(), this.getHeight());
        imagenFondoPres = new ImageIcon("imagenes/GameOver.gif");
        imagenFondoPres = new ImageIcon(imagenFondoPres.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
        eti.setIcon(imagenFondoPres);
        eti.setVisible(true);
        panelJuego.add(eti);
        
        this.add(panelJuego);
    
        
   
        
        
        
    }
    

}
