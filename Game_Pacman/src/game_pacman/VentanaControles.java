package game_pacman;

import static game_pacman.VentanaJuego.panelJuego;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johne
 */
public class VentanaControles extends JFrame {

    private ImageIcon imagenFondoPres;
    private JLabel eti;
    private JPanel panel;
    private JScrollPane scroll;

    public VentanaControles() {
        super("Controles");
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.iniciaComponente();
    }

    public void iniciaComponente() {
      
        panelJuego = new JPanel();
        panelJuego.setLayout(null);
        panelJuego.setBackground(Color.black);
        panelJuego.setBounds(0,0,this.getWidth(),this.getHeight());
        panelJuego.setVisible(true);
        
        eti = new JLabel();
        eti.setBounds(0, 0, this.getWidth(), this.getHeight());
        imagenFondoPres = new ImageIcon("imagenes/Controles.png");
        imagenFondoPres = new ImageIcon(imagenFondoPres.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
        eti.setIcon(imagenFondoPres);
        eti.setVisible(true);
        panelJuego.add(eti);
        
        this.add(panelJuego);
    
        
   
        
        
        
    }
    

}
