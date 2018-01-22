/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_pacman.Controlador;

import game_pacman.Juego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
                while(jugador == null || jugador.compareTo("Escribe aqui")==0 || jugador.compareTo("")==0){
                    jugador = JOptionPane.showInputDialog(null, "Debes ingresar usuario","Escribe aqui");
                }
                 juego.jugar(jugador);
                 
        }
          if (e.getSource().equals(juego.getBtn2()))
        {
            System.err.println("Records");
        }
          if (e.getSource().equals(juego.getIniciar()))
          {
               juego.menu();
          }
          
           if (e.getSource().equals(juego.getComboListar()))
                  {
                   
                           
                      
           
        
               
    }
    
}}
