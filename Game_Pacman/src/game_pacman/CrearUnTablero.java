/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_pacman;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author johne
 */
public class CrearUnTablero extends JFrame implements ActionListener
{
    private JLabel Tablero;
    private JTextField Mat1;
    private JTextField Mat2;
    private JTextField Mat3;
    private JTextField Mat4;
    private JTextField Mat5;
    private JTextField Mat6;
    private JTextField Mat7;
    private JTextField Mat8;
    private JTextField Mat9;
    private JTextField Mat10;
    private JTextField Mat11;
    private JTextField Mat12;
    private JTextField Mat13;
    private JTextField Mat14;
    private JTextField Mat15;
    private JButton Btn;
    private String Res;
    private  int aux[][];
                 
                 

    public CrearUnTablero() 
    {
       this.setBackground(Color.BLACK);
        this.setBounds(0, 0, 675, 650);
        this.setLocation(120, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.IniciaComponentes(); 
    }
     public void IniciaComponentes() 
    { 
        
        Tablero=new JLabel("Ingrese los datos del tablero ");
        Tablero.setBounds(0,0,300,50);
       
        
        Mat1 = new JTextField(  "222222222222222");
       Mat1.setBounds(200, 100, 300, 20);
        Mat2 = new JTextField(  "211111121111112");
       Mat2.setBounds(200, 120, 300, 20);
        Mat3 = new JTextField(  "212212121221212");
       Mat3.setBounds(200, 140, 300, 20);
        Mat4 = new JTextField(  "212112111121212");
       Mat4.setBounds(200, 160, 300, 20);
        Mat5 = new JTextField(  "211122212111112");
       Mat5.setBounds(200, 180, 300, 20);
        Mat6 = new JTextField(  "212111112221222");
       Mat6.setBounds(200, 200, 300, 20);
        Mat7 = new JTextField(  "212212211221112");
       Mat7.setBounds(200, 220, 300, 20);
        Mat8 = new JTextField(  "211111221111212");
       Mat8.setBounds(200, 240, 300, 20);
        Mat9 = new JTextField(  "222121222121212");
       Mat9.setBounds(200, 260, 300, 20);
        Mat10 = new JTextField( "211121111111112");
       Mat10.setBounds(200, 280, 300, 20);
        Mat11 = new JTextField( "212111222121212");
       Mat11.setBounds(200, 300, 300, 20);
        Mat12 = new JTextField( "211121211111212");
       Mat12.setBounds(200, 320, 300, 20);
        Mat13 = new JTextField( "212121212121212");
       Mat13.setBounds(200, 340, 300, 20);
        Mat14 = new JTextField( "211121111111112");
       Mat14.setBounds(200, 360, 300, 20);
        Mat15 = new JTextField( "222222222222222");
       Mat15.setBounds(200, 380, 300, 20);
       
       Btn = new JButton ("Guardar");
       Btn.setBounds(200, 400, 100, 100);
       Btn.addActionListener(this);
       
       this.getContentPane().add(Btn);
       this.getContentPane().add(Mat15);
       this.getContentPane().add(Mat14);
       this.getContentPane().add(Mat13);
       this.getContentPane().add(Mat12);
       this.getContentPane().add(Mat11);
       this.getContentPane().add(Mat10);
       this.getContentPane().add(Mat9);
       this.getContentPane().add(Mat8);
       this.getContentPane().add(Mat7);
       this.getContentPane().add(Mat6);
       this.getContentPane().add(Mat5);
       this.getContentPane().add(Mat4);
       this.getContentPane().add(Mat3);
       this.getContentPane().add(Mat2);
       this.getContentPane().add(Mat1);
       this.getContentPane().add(Tablero);
       
        this.setVisible(true);
        
    }   

 @Override
    public void actionPerformed(ActionEvent e) 
    {  
            Res = Mat1.getText()+Mat2.getText()+Mat3.getText()+Mat4.getText()+Mat5.getText()+Mat6.getText()+Mat7.getText()+Mat8.getText()+Mat9.getText()+Mat10.getText()+Mat11.getText()+Mat12.getText()+Mat13.getText()+Mat14.getText()+Mat15.getText();
    }

    public int[][] getAux() {
        return aux;
    }

    public void setAux(int[][] aux) {
        this.aux = aux;
    }

    
    
    
}
