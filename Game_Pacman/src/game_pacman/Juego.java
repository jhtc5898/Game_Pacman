package game_pacman;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import game_pacman.Controlador.EventoJuego;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Juego {
    
    //atributos
     JFrame ventana;
    
    //presentacion
    JPanel panelPresentacion;
    JButton iniciar;
    JLabel fondoPresentacion;
    ImageIcon imagenFondoPres;
    
    //menu
    JPanel panelMenu;
    JButton botones[];
    JButton btn1;
    JButton btn2;

       JLabel fondoMenu;
    ImageIcon imagenFondoMenu;
      
    //juego
    
    static JPanel panelJuego;
    JLabel fondoJuego;
    ImageIcon imagenFondoJuego;
    static int mat[][];
    static JLabel matriz [][];
    int px;
    int py;
    JLabel nombre;
    int puntos;
    JLabel records;
    int abajo;
    int arriba;
    int izq;
    int der;
    Timer timer;
    
    //fantasmas
    Fantasmas fantasma1;
    Fantasmas fantasma2;
    Fantasmas fantasma3;
    static int matAux[][];
    Tableros Table = new Tableros();
    //ComboBox
    JComboBox comboListar;
    int nivel;
  
    
    
    public  Juego(){
    
        ventana = new JFrame("PACMAN");
        ventana.setSize(700, 700);
        ventana.setLayout(null);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelPresentacion = new JPanel();
        panelPresentacion.setLayout(null);
        panelPresentacion.setBounds(0,0,ventana.getWidth(),ventana.getHeight());
        panelPresentacion.setVisible(true);
        panelPresentacion.setBackground(Color.red);
        
        
         
        fondoPresentacion = new JLabel();
        fondoPresentacion.setBounds(0, -80, 700,800);
        imagenFondoPres = new ImageIcon("imagenes/Principal.jpg");
        imagenFondoPres = new ImageIcon(imagenFondoPres.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
        fondoPresentacion.setIcon(imagenFondoPres);
        fondoPresentacion.setVisible(true);
        panelPresentacion.add(fondoPresentacion,0);
        
        iniciar = new JButton("Iniciar");
        iniciar.setBounds(200, 510, 300, 30);
        iniciar.setBackground(Color.BLACK);
        iniciar.setForeground(Color.YELLOW);
         iniciar.setVisible(true);
        iniciar.addActionListener(new EventoJuego(this));
       panelPresentacion.add(iniciar,0);
        
       comboListar = new JComboBox();
        comboListar.addItem("Nivel 1");
        comboListar.addItem("Nivel 2");
        comboListar.addItem("Nivel 3");
        comboListar.addItem("Nivel 4");
        comboListar.addItem("Nivel 5");
        comboListar.addItem("Nivel 6");
        comboListar.addItem("Nivel 7");
        comboListar.addItem("Nivel 8");
        comboListar.addItem("Nivel 9");
        comboListar.addItem("Nivel 10");
        comboListar.setSize(300, 30);
        comboListar.setLocation(200, 545);
        comboListar.setBackground (Color.BLACK);
        comboListar.setForeground (Color.yellow);
        comboListar.addActionListener(new ActionListener(){

      public void actionPerformed(ActionEvent ae){

            JOptionPane.showMessageDialog(null, "Dato Guardado");
            if(comboListar.getSelectedIndex()==0)
                      {
                          System.out.println("Nivel 1");
                          mat = new int[15][15];
                           mat = Table.tablero(1);
                          //juego.mat=Table.tablero(nivel);
                          //juego.pintarMatriz();

                      }
                      if(comboListar.getSelectedIndex()==1)
                      {
                          System.out.println("Nivel 2");
                          mat = new int[15][15];
                           mat = Table.tablero(2);

                      }
                      if(comboListar.getSelectedIndex()==2)
                      {
                          System.out.println("Nivel 3 ");
                          mat = new int[15][15];
                           mat = Table.tablero(3);
                      }
                      if(comboListar.getSelectedIndex()==3)
                      {
                          System.out.println("Nivel 4 ");
                          mat = new int[15][15];
                           mat = Table.tablero(4);
                      }
                      if(comboListar.getSelectedIndex()==4)
                      {
                          System.out.println("Nivel 5 ");
                          mat = new int[15][15];
                           mat = Table.tablero(5);
                      }
                      if(comboListar.getSelectedIndex()==5)
                      {
                          System.out.println("Nivel 6 ");
                          mat = new int[15][15];
                           mat = Table.tablero(6);
                      }
                      if(comboListar.getSelectedIndex()==6)
                      {
                          System.out.println("Nivel 7 ");
                          mat = new int[15][15];
                           mat = Table.tablero(7);
                      }
                      if(comboListar.getSelectedIndex()==7)
                      {
                          System.out.println("Nivel 8 ");
                          mat = new int[15][15];
                           mat = Table.tablero(8);
                      }
                      if(comboListar.getSelectedIndex()==8)
                      {
                          System.out.println("Nivel 9 ");
                          mat = new int[15][15];
                           mat = Table.tablero(9);
                      }
                      if(comboListar.getSelectedIndex()==9)
                      {
                          System.out.println("Nivel 10 ");
                          mat = new int[15][15];
                           mat = Table.tablero(10);
                      }

      }

});

        panelPresentacion.add(comboListar,0);
        
        
       
        
       
        //juego
        //Llamamos a nuestra Clase Tablero 

         mat = new int[15][15];
         mat = Table.tablero(1);
         //matAux = tablero(1);
         matriz = new JLabel[15][15];
         matAux = new int[15][15];
         for (int i = 0; i < mat.length; i++) 
         {
            for (int j = 0; j < mat.length; j++) 
            {
                matriz[i][j] = new JLabel();
                matAux[i][j] = mat[i][j];
            }
            
        }
         
        px = 1;
        py = 1;
        mat[px][py] = 3;

        abajo = 0;
        arriba = 0;
        izq = 0;
        der = 0;
       
        ventana.add(panelPresentacion);

        ventana.setVisible(true);
        
        
        
    
    }//fin constructor
     

    
    public void jugar(String jugador){
        panelMenu.setVisible(false);
        panelJuego = new JPanel();
        panelJuego.setLayout(null);
        panelJuego.setBackground(Color.black);
        panelJuego.setBounds(0,0,ventana.getWidth(),ventana.getHeight());
        panelJuego.setVisible(true);
        
        fondoJuego = new JLabel();
        fondoJuego.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        imagenFondoJuego = new ImageIcon("imagenes/Secundario.jpg");
        imagenFondoJuego = new ImageIcon(imagenFondoMenu.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        fondoJuego.setIcon(imagenFondoJuego);
        fondoJuego.setVisible(true);
        panelJuego.add(fondoJuego,0);
        
        for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    matriz[i][j].setIcon(new ImageIcon("imagenes/"+mat[i][j]+".jpg"));
                    matriz[i][j].setBounds(120+(j*30), 120+(i*30), 30, 30);
                    matriz[i][j].setVisible(true);
                    panelJuego.add(matriz[i][j],0);
            }
        }
        
        nombre = new JLabel("JUGADOR: "+ jugador);
        nombre.setBounds(20, 20, 150, 30);
        nombre.setForeground(Color.white);
        nombre.setVisible(true);
        panelJuego.add(nombre,0);
        
        puntos = 0;
        records = new JLabel("Puntos: "+puntos);
        records.setBounds(20, 40, 150, 30);
        records.setVisible(true);
        records.setForeground(Color.white);
        panelJuego.add(records,0);
        moverPacman();
        fantasma1 = new Fantasmas(12 ,13 ); 
        fantasma2 = new Fantasmas(13 ,13 );
        fantasma3 = new Fantasmas(13 ,12 );
        ventana.add(panelJuego);
               
    }
    
    public static  void pintarMatriz(){
        for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    matriz[i][j].setIcon(new ImageIcon("imagenes/"+mat[i][j]+".png"));
                    matriz[i][j].setBounds(120+(j*30), 120+(i*30), 30, 30);
                    matriz[i][j].setVisible(true);
                    panelJuego.add(matriz[i][j],0);
            }
        }
    }
    
    public void moverPacman(){
        
        
        timer = new Timer (1, new ActionListener () 
        { 
            public void actionPerformed(ActionEvent e) 
            { 
              if( arriba == 1 && (mat[px][py-1]==1 || mat[px][py-1]==0)){
                    if(mat[px][py-1]==1){
                        puntos = puntos + 10;
                        records.setText("Puntos: "+puntos);
                    } 
                     
                    mat[px][py] = 0;
                    matAux[px][py] = mat[px][py]; //esto es nuevo
                    py = py-1;
                    mat[px][py] = 3;
                    pintarMatriz();
                               
              }
              if( abajo == 1 && (mat[px][py+1]==1 || mat[px][py+1]==0)){
                    if(mat[px][py+1]==1){
                        puntos = puntos + 5;
                        records.setText("Puntos: "+puntos);
                    } 
                    
                    mat[px][py] = 0;
                    matAux[px][py] = mat[px][py]; //esto
                    py = py+1;
                    mat[px][py] = 3;
                    pintarMatriz();
                     
              }
              if( izq == 1 && (mat[px-1][py]==1 || mat[px-1][py]==0)){
                    if(mat[px-1][py]==1){
                        puntos = puntos + 5;
                        records.setText("Puntos: "+puntos);
                    } 
                     
                    mat[px][py] = 0;
                    matAux[px][py] = mat[px][py]; //esto es nuevo
                    px = px-1;
                    mat[px][py] = 3;
                    pintarMatriz();
                      
              }
              if( der == 1 && (mat[px+1][py]==1 || mat[px+1][py]==0)){
                    if(mat[px+1][py]==1){
                        puntos = puntos + 5;
                        records.setText("Puntos: "+puntos);
                    } 
                     
                    mat[px][py] = 0;
                    matAux[px][py] = mat[px][py]; //esto es nuevo
                    px = px+1;
                    mat[px][py] = 3;
                    pintarMatriz();
                   
              }
                int enc = 0;
                for (int i = 0; i < mat.length && enc == 0; i++) {
                    for (int j = 0; j < mat.length && enc == 0; j++) {
                          if(mat[i][j]==1)
                             enc =1;
                    }
                }
                if(enc == 0){
                    JOptionPane.showMessageDialog(ventana, "FELICITACIONES GANASTE");
                    panelJuego.setVisible(false);
                    panelMenu.setVisible(true);
                    timer.stop();
                    
                }
                      
                //matar pacman
                if(  mat[px][py+1] == 7 || mat[px][py-1] == 7 || mat[px-1][py] == 7 || mat[px+1][py] == 7 )
                {
                    fantasma1.timer.stop();
                    fantasma2.timer.stop();
                    fantasma3.timer.stop();
                    
                // pintarMatriz();
           
                    JOptionPane.showMessageDialog(ventana, "ESTAS MUERTO ");
                   panelJuego.setVisible(false);
                    //panelMenu.setVisible(true);
                   
                timer.stop();
            
                Juego J = new Juego ();
                
               // jugar();
                
                 
                    
                }
                
        }});
        timer.start();
        ventana.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                if(e.getKeyCode() == KeyEvent.VK_UP){
                   // System.out.println("tecla hacia arriba");
                    if(mat[px][py-1]==1 || mat[px][py-1]==0 ){
                        arriba = 1;
                        abajo = 0;
                        izq = 0;
                        der = 0;
                    }    
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN){
                  //  System.out.println("tecla hacia abajo");
                    if(mat[px][py+1]==1 || mat[px][py+1]==0 ){ 
                        arriba = 0;
                        abajo = 1;
                        izq = 0;
                        der = 0;
                    }    
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                  //  System.out.println("tecla hacia izquierda");
                    if(mat[px-1][py]==1 || mat[px-1][py]==0 ){
                        arriba = 0;
                        abajo = 0;
                        izq = 1;
                        der = 0;
                    }    
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                  //  System.out.println("tecla hacia derecha");
                    if(mat[px+1][py]==1 || mat[px+1][py]==0 ){
                        arriba = 0;
                        abajo = 0;
                        izq = 0;
                        der = 1;
                    }
                }

                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
    
    
    });
    
    
    } 
    
    public void menu()  {
        
        panelPresentacion.setVisible(false);
        panelMenu = new JPanel();
        panelMenu.setLayout(null);
        panelMenu.setBackground(Color.black);
        panelMenu.setBounds(0,0,ventana.getWidth(),ventana.getHeight());
        panelMenu.setVisible(true);
        
        fondoMenu = new JLabel();
        fondoMenu.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        imagenFondoMenu = new ImageIcon("imagenes/fondoPresentacion.png");
        imagenFondoMenu = new ImageIcon(imagenFondoMenu.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        fondoMenu.setIcon(imagenFondoMenu);
        fondoMenu.setVisible(true);
        panelMenu.add(fondoMenu,0);
        
        btn1 = new JButton("Jugar");
        btn1.setBounds(400, 50, 300, 30);
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.YELLOW);
        btn1.setVisible(true);      
        btn1.addActionListener(new EventoJuego(this));
        
        btn2 = new JButton("Records");
        btn2.setBounds(400, 100, 300, 30);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.YELLOW);
        btn2.setVisible(true);     
        btn2.addActionListener(new EventoJuego(this));
        
        panelMenu.add(btn2);
        panelMenu.add(btn1);
        
         
        ventana.add(panelMenu);
        
        
    
    }//fin del menu
   

     public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JButton getIniciar() {
        return iniciar;
    }

    public void setIniciar(JButton iniciar) {
        this.iniciar = iniciar;
    }

    public JComboBox getComboListar() {
        return comboListar;
    }

    public void setComboListar(JComboBox comboListar) {
        this.comboListar = comboListar;
    }


    

}
