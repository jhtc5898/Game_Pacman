/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_pacman.Controlador;

import game_pacman.Juego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author johne
 */
public class EventoJuego implements ActionListener 
{
private Juego juego;

    public EventoJuego(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource().equals(juego.getBtn1()))
        {
             System.out.println("jugar");
                 //pedir nombre
              String jugador = JOptionPane.showInputDialog(null, "Nombre del jugador", "Escribe aqui" );     
               if (jugador.equals("Escribe aqui")|| jugador.equals(""))
               {
                 jugador= "null"  ;
               }
              
                
                 juego.jugar(jugador);
                 
        }
          if (e.getSource().equals(juego.getBtn2()))
        {
            System.err.println("Records");
        }
          if (e.getSource().equals(juego.getIniciar()))
          {
               /*  System.out.println("jugar");
                 //pedir nombre
              String jugador = JOptionPane.showInputDialog(null, "Nombre del jugador", "Escribe aqui" );     
               if (jugador.equals("Escribe aqui")|| jugador.equals(""))
               {
                 jugador= "null"  ;
               }*/
              
                juego.menu();
               //  juego.jugar("");
                
                 //juego.jugar(jugador);
          }   
    
}
}
