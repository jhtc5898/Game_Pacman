/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_pacman;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author johne
 */
public class Tableros  
{
  
      public int[][] tablero(int opcion){
        int[][]aux1 = new int[15][15];
        if( opcion == 1){
            
            int aux[][] = {
                    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                    {2,1,1,1,1,1,1,2,1,1,1,1,1,1,2},
                    {2,1,2,2,1,2,1,2,1,2,2,1,2,1,2},
                    {2,1,2,1,1,2,1,1,1,1,2,1,2,1,2},
                    {2,1,1,1,2,2,2,1,2,1,1,1,1,1,2},
                    {2,1,2,1,1,1,1,1,2,2,2,1,2,2,2},
                    {2,1,2,2,1,2,2,1,1,2,2,1,1,1,2},
                    {2,1,1,1,1,1,2,2,1,1,1,1,2,1,2},
                    {2,2,2,1,2,1,2,2,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,1,1,1,1,1,1,1,1,2},
                    {2,1,2,1,1,1,2,2,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,2,1,1,1,1,1,2,1,2},
                    {2,1,2,1,2,1,2,1,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,1,1,1,1,1,1,1,1,2},
                    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                  };
            
            return aux;
        }
        if( opcion == 2){
           int aux[][]={
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                {2,3,1,1,1,1,1,1,1,1,1,1,1,1,2},
                {2,1,1,1,2,1,1,1,1,2,1,1,1,1,2},
                {2,1,1,1,2,2,2,2,2,2,1,1,1,1,2},
                {2,1,1,1,1,1,1,1,1,1,1,1,1,1,2},
                {2,1,2,1,2,1,2,2,2,1,2,2,2,1,2},
                {2,1,2,1,2,1,2,1,2,1,2,1,1,1,2},
                {2,1,2,1,2,1,2,1,2,1,2,2,2,1,2},
                {2,1,2,1,2,1,2,1,1,1,1,1,2,1,2},
                {2,1,2,2,2,1,2,1,1,1,2,2,2,1,2},
                {2,1,1,1,1,1,1,1,1,1,1,1,1,1,2},
                {2,1,1,1,1,1,1,2,2,1,2,2,1,1,2},
                {2,1,1,2,1,1,1,2,1,1,1,2,1,1,2},
                {2,1,1,2,1,1,1,2,1,1,1,2,1,1,2},
                {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            };
            return aux;
        }
        if( opcion == 3){
            int aux[][] = {
                    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                    {2,1,1,1,1,1,1,2,1,1,1,1,1,1,2},
                    {2,1,2,2,1,2,1,2,1,2,2,1,2,1,2},
                    {2,1,2,1,1,2,1,1,1,1,2,1,2,1,2},
                    {2,1,1,1,2,2,2,1,2,1,1,1,1,1,2},
                    {2,1,2,1,1,1,1,1,2,2,2,1,2,2,2},
                    {2,1,2,2,1,2,2,1,1,2,2,1,1,1,2},
                    {2,1,1,1,1,1,2,2,1,1,1,1,2,1,2},
                    {2,2,2,1,2,1,2,2,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,1,1,1,1,1,1,1,1,2},
                    {2,1,2,1,1,1,2,2,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,2,1,1,1,1,1,2,1,2},
                    {2,1,2,1,2,1,2,1,2,1,2,1,2,1,2},
                    {2,1,1,1,2,1,1,1,1,1,1,1,1,1,2},
                    {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
                  };
             return aux;
        }

        return aux1;
    }
}
