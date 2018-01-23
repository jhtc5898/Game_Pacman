/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_pacman;

import java.applet.Applet;
import java.applet.AudioClip;
import javax.swing.JInternalFrame;

/**
 *
 * @author USUARIO
 */
public class Sonido {
    
    public static final AudioClip inicio = Applet.newAudioClip(Sonido.class.getResource("/Inicio.wav"));
    public static final AudioClip Fondo = Applet.newAudioClip(Sonido.class.getResource("/Fondo.wav"));
   // public static final AudioClip perder = Applet.newAudioClip(Sonido.class.getResource("/Sonidos_Pacman.mp3"));
}
