package game_pacman;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import game_pacman.Controlador.EventoJuego;
import game_pacman.VentanaGameOver;
import game_pacman.VentanaGanaste;
import Modelo.Sonido;
import Modelo.Tableros;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class VentanaJuego {

    JFrame ventana;

    //presentacion
    JPanel panelPresentacion;
    JButton iniciar;
    JLabel fondoPresentacion;
    ImageIcon imagenFondoPres;
    JComboBox comboListar;
    int nivel;

    //Atributos Menu 
    JPanel panelMenu;
    JButton btn1;
    JButton btn2;
    JLabel fondoMenu;
    ImageIcon imagenFondoMenu;

    //Atributos juegoPacman
    static JPanel panelJuego;
    JLabel fondoJuego;
    ImageIcon imagenFondoJuego;
    static int mat[][];// Matriz guia para la creacion de JLabel
    static JLabel matriz[][];// Cracion de matriz de Jlables apartir de una matriz creada
    int px;//varaible para saber la ubicacion en x  con esta variable podemos saber el movimiento para el pacman o fantasmas
    int py;//varaible para saber la ubicacion en y con esta variable podemos saber el movimiento para el pacman o fantasmas
    JLabel nombre;//JLabel para la presentacion del nombre del jugador
    int puntos;// variable para la carga de puntaje durante el juego 
    JLabel records;// Jlabel para la presentacion del puntaje
    int abajo;// Variables definidas para saber el moviemiento del pacman
    int arriba;
    int izq;
    int der;
    Timer timer;//Timer para repetir una accion durante cierta actividad
    Fantasmas fantasma1;// Creacion del Fantasmas
    Fantasmas fantasma2;
    Fantasmas fantasma3;
    static int matAux[][];//Matriz auxiliar para cuando el pacman pase por ella cargue los cuadro de fondo 
    Tableros Table = new Tableros();//llamado a la clase tablero para la carga de los tableros 

    public VentanaJuego() {

        ventana = new JFrame("PACMAN");
        ventana.setSize(700, 700);
        ventana.setLayout(null);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelPresentacion = new JPanel();
        panelPresentacion.setLayout(null);
        panelPresentacion.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        panelPresentacion.setVisible(true);
        panelPresentacion.setBackground(Color.red);

        fondoPresentacion = new JLabel();
        fondoPresentacion.setBounds(0, -80, 700, 800);
        imagenFondoPres = new ImageIcon("imagenes/Principal.jpg");
        imagenFondoPres = new ImageIcon(imagenFondoPres.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
        fondoPresentacion.setIcon(imagenFondoPres);
        fondoPresentacion.setVisible(true);
        Sonido.Inicio.play();//llama al sonido en este caso solo suena en la panatalla principal
        panelPresentacion.add(fondoPresentacion, 0);

        iniciar = new JButton("Iniciar");
        iniciar.setBounds(200, 510, 300, 30);
        iniciar.setBackground(Color.BLACK);
        iniciar.setForeground(Color.YELLOW);
        iniciar.setFont( new Font( "PacFont", Font.BOLD, 18 ) );//Codigo para cambio de fuente
        iniciar.setVisible(true);
        iniciar.addActionListener(new EventoJuego(this));
        panelPresentacion.add(iniciar, 0);

        comboListar = new JComboBox();
        comboListar.addItem("Nivel 1");//ComboBox para la presentacion de los niveles
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
        comboListar.setBackground(Color.BLACK);
        comboListar.setForeground(Color.yellow);
        comboListar.addActionListener(new ActionListener() // llamado al Actionlistener  para obtener todos los atibutos de la clase
        {
            public void actionPerformed(ActionEvent ae) {

                JOptionPane.showMessageDialog(null, "Dato Guardado");
                if (comboListar.getSelectedIndex() == 0) {
                    System.out.println("Nivel 1");
                    mat = new int[15][15];
                    Sonido.Fondo.loop();// llama al sonido y el sonido se repite varias veces
                    //Sonido.Fondo.stop(); le termina el sonido
                    //Sonido.Fondo.play(); llama al sonido pero el sonido se reproduce una vez 
                    mat = Table.tablero(1);
                    //juego.mat=Table.tablero(nivel);
                    //juego.pintarMatriz();
                    

                }
                if (comboListar.getSelectedIndex() == 1) {
                    System.out.println("Nivel 2");
                    mat = new int[15][15];
                    Sonido.Fondo.loop();
                    mat = Table.tablero(2);

                }
                if (comboListar.getSelectedIndex() == 2) {
                    System.out.println("Nivel 3 ");
                    mat = new int[15][15];
                    Sonido.Fondo.loop();
                    mat = Table.tablero(3);
                }
                if (comboListar.getSelectedIndex() == 3) {
                    System.out.println("Nivel 4 ");
                    mat = new int[15][15];
                    Sonido.Fondo.loop();
                    mat = Table.tablero(4);
                }
                if (comboListar.getSelectedIndex() == 4) {
                    System.out.println("Nivel 5 ");
                    mat = new int[15][15];
                    Sonido.Fondo.loop();
                    mat = Table.tablero(5);
                }
                if (comboListar.getSelectedIndex() == 5) {
                    System.out.println("Nivel 6 ");
                    mat = new int[15][15];
                    Sonido.Fondo.loop();
                    mat = Table.tablero(6);
                }
                if (comboListar.getSelectedIndex() == 6) {
                    System.out.println("Nivel 7 ");
                    mat = new int[15][15];
                    Sonido.Fondo.loop();
                    mat = Table.tablero(7);
                }
                if (comboListar.getSelectedIndex() == 7) {
                    System.out.println("Nivel 8 ");
                    mat = new int[15][15];
                    Sonido.Fondo.loop();
                    mat = Table.tablero(8);
                }
                if (comboListar.getSelectedIndex() == 8) {
                    System.out.println("Nivel 9 ");
                    mat = new int[15][15];
                    Sonido.Fondo.loop();
                    mat = Table.tablero(9);
                }
                if (comboListar.getSelectedIndex() == 9) {
                    System.out.println("Nivel 10 ");
                    mat = new int[15][15];
                    Sonido.Fondo.loop();
                    mat = Table.tablero(10);
                }
            }
        });

        panelPresentacion.add(comboListar, 0);
        //juego
        //Llamamos a nuestra Clase Tablero
        //la variable mat ya es cargada previamente  por tal razon se carga la que es elegida en este caso en el comboBox
        mat = new int[15][15];
        mat = Table.tablero(1);
        //matAux = tablero(1);
        matriz = new JLabel[15][15];
        matAux = new int[15][15];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                matriz[i][j] = new JLabel();// Acomodamos cada posicion con un JLabel
                matAux[i][j] = mat[i][j];
            }
        }

        px = 1;//posicion en x 1 para poder colocar el pacman en esa pocicion  
        py = 1;//posicion en y 1 para poder colocar el pacman en esa pocicion  
        mat[px][py] = 3; // Acomodamos al pacman que es la variable 3 
        
        abajo = 0; // Inicializacion de los controles
        arriba = 0;
        izq = 0;
        der = 0;

        ventana.add(panelPresentacion);

        ventana.setVisible(true);

    }//fin constructor

    public void jugar(String jugador) {
        panelMenu.setVisible(false);
        panelJuego = new JPanel();
        panelJuego.setLayout(null);
        panelJuego.setBackground(Color.black);
        panelJuego.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        panelJuego.setVisible(true);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                matriz[i][j].setIcon(new ImageIcon("imagenes/" + mat[i][j] + ".jpg")); // Agregamos en casa label la imagen que es definida por la matriz 
                matriz[i][j].setBounds(120 + (j * 30), 120 + (i * 30), 30, 30); // tama;o de cada JLabel
                matriz[i][j].setVisible(true);
                panelJuego.add(matriz[i][j], 0);
            }
        }

        nombre = new JLabel("JUGADOR: " + jugador);
        nombre.setBounds(20, 20, 700, 30);
        nombre.setForeground(Color.white);
        nombre.setFont( new Font( "PacFont", Font.BOLD, 18 ) );
        nombre.setVisible(true);
        panelJuego.add(nombre, 0);

        puntos = 0;
        records = new JLabel("PUNTOS: " + puntos);
        records.setBounds(20, 40, 300, 30);
        records.setVisible(true);
        records.setForeground(Color.white);
        panelJuego.add(records, 0);
        moverPacman();
        fantasma1 = new Fantasmas(12, 13);
        fantasma2 = new Fantasmas(13, 13);
        fantasma3 = new Fantasmas(13, 12);
        ventana.add(panelJuego);

    }

    public static void pintarMatriz() // Metodo creado para la actualizacion cuando el pacman ya este en movimiento
    {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                matriz[i][j].setIcon(new ImageIcon("imagenes/" + mat[i][j] + ".png"));// Cargamos las imagenes segun el nuevo trazo 
                matriz[i][j].setBounds(120 + (j * 30), 120 + (i * 30), 30, 30);
                matriz[i][j].setVisible(true);
                panelJuego.add(matriz[i][j], 0);
            }
        }
    }

    public void moverPacman() // Metodo para el movimiento del pacman 
    {

        timer = new Timer(1, new ActionListener() // Timer para el movimiento del pacman duarnte la partida (Timer es un bucle pero nosotros podemos hacer cada cuanto queremos que se repita )
        {
            public void actionPerformed(ActionEvent e) {
                
                if (arriba == 1 && (mat[px][py - 1] == 1 || mat[px][py - 1] == 0))      // Salto de posicion en Y  con una comparacion de si se encuentra un  comida o un cuadro vacio
                //if realizado para el movimiento solo para arriba
                {
                    if (mat[px][py - 1] == 1) // si se encuentra un 1 en la matriz entonces es comida asi que aumentamos el puntaje
                    {
                        Sonido.Movimiento.play();//sonido cuando come
                        puntos = puntos + 10;
                        records.setText("Puntos: " + puntos);
                    }
                    mat[px][py] = 0;// Movimiento normal ya que 0 es un cuadro vacio
                    matAux[px][py] = mat[px][py];
                    py = py - 1;
                    mat[px][py] = 3;//Agregamos al pacman en esa pocicion ya que no se encuentra ningun obtaculo 
                    pintarMatriz();

                }
                if (abajo == 1 && (mat[px][py + 1] == 1 || mat[px][py + 1] == 0))// Salto de posicion en Y  con una comparacion de si se encuentra un  comida o un cuadro vacio
                {
                    if (mat[px][py + 1] == 1) // si se encuentra un 1 en la matriz entonces es comida asi que aumentamos el puntaje
                    {
                        Sonido.Movimiento.play();
                        puntos = puntos + 5;
                        records.setText("Puntos: " + puntos);
                    }

                    mat[px][py] = 0;// Movimiento normal ya que 0 es un cuadro vacio
                    matAux[px][py] = mat[px][py]; 
                    py = py + 1;
                    mat[px][py] = 3;//Agregamos al pacman en esa pocicion ya que no se encuentra ningun obtaculo 
                    pintarMatriz();

                }
                if (izq == 1 && (mat[px - 1][py] == 1 || mat[px - 1][py] == 0)) // Salto de posicion en x  con una comparacion de si se encuentra un  comida o un cuadro vacio
                {
                    if (mat[px - 1][py] == 1) // si se encuentra un 1 en la matriz entonces es comida asi que aumentamos el puntaje
                    {
                        Sonido.Movimiento.play();
                        puntos = puntos + 5;
                        records.setText("Puntos: " + puntos);
                    }

                    mat[px][py] = 0;// Movimiento normal ya que 0 es un cuadro vacio
                    matAux[px][py] = mat[px][py]; 
                    px = px - 1;
                    mat[px][py] = 3;//Agregamos al pacman en esa pocicion ya que no se encuentra ningun obtaculo 
                    pintarMatriz();

                }
                if (der == 1 && (mat[px + 1][py] == 1 || mat[px + 1][py] == 0)) // Salto de posicion en X con una comparacion de si se encuentra un  comida o un cuadro vacio
                {
                    if (mat[px + 1][py] == 1) // si se encuentra un 1 en la matriz entonces es comida asi que aumentamos el puntaje
                    {
                        Sonido.Movimiento.play();
                        puntos = puntos + 5;
                        records.setText("Puntos: " + puntos);
                    }

                    mat[px][py] = 0;// Movimiento normal ya que 0 es un cuadro vacio
                    matAux[px][py] = mat[px][py]; 
                    px = px + 1;
                    mat[px][py] = 3;//Agregamos al pacman en esa pocicion ya que no se encuentra ningun obtaculo 
                    pintarMatriz();

                }
                int enc = 0;
                for (int i = 0; i < mat.length && enc == 0; i++) // For realizado para que recorra toda la matriz y encuentre cuanta comida hay 
                    // para asi saber si el jugador gano
                {
                    for (int j = 0; j < mat.length && enc == 0; j++)
                    {
                        if (mat[i][j] == 1) {
                            enc = 1;
                        }
                    }
                }
                if (enc == 0) //if para presentar la ventana de el jugador gana la partida 
                {
                    panelJuego.setVisible(false);
                    panelMenu.setVisible(true);
                    timer.stop();
                    VentanaGanaste Gn = new VentanaGanaste();
                    VentanaJuego J = new VentanaJuego ();
                    Gn.setVisible(true);

                }
                //matar pacman
                if (mat[px][py + 1] == 7 || mat[px][py - 1] == 7 || mat[px - 1][py] == 7 || mat[px + 1][py] == 7)//Si el movimiento en los laterales del JLabel 
                    // es en la matriz el valor 7 quiere decir que el fantasma lo alcanzo y pierde la partida
                {
                    Sonido.Fondo.stop();
                    Sonido.Muerte.play();//sonido cuando muere
                    fantasma1.timer.stop();
                    fantasma2.timer.stop();
                    fantasma3.timer.stop();
                    panelJuego.setVisible(false);
                    timer.stop();//paramos el timer por que el jeugo se terminaria
                    VentanaGameOver g = new VentanaGameOver();// llamado a la clase Game over para presentarlo 
                    VentanaJuego J = new VentanaJuego ();// llamado a la ventana principal para que pueda seguir jugando 
                    g.setVisible(true);
                }
            }
        });
        timer.start();
        ventana.addKeyListener(new KeyListener() // Key listener para que cuando de toque una tecla nuestras varables cambien y pueda entrar en el bucle 
                //que se enuentra mas arriba 
        {
            @Override
            public void keyTyped(KeyEvent e) { }
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if (mat[px][py - 1] == 1 || mat[px][py - 1] == 0) {
                        arriba = 1;
                        abajo = 0;
                        izq = 0;
                        der = 0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (mat[px][py + 1] == 1 || mat[px][py + 1] == 0) {
                        arriba = 0;
                        abajo = 1;
                        izq = 0;
                        der = 0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    if (mat[px - 1][py] == 1 || mat[px - 1][py] == 0) {
                        arriba = 0;
                        abajo = 0;
                        izq = 1;
                        der = 0;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if (mat[px + 1][py] == 1 || mat[px + 1][py] == 0) {
                        arriba = 0;
                        abajo = 0;
                        izq = 0;
                        der = 1;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) { }
        });

    }

    public void menu() {

        panelPresentacion.setVisible(false);
        panelMenu = new JPanel();
        panelMenu.setLayout(null);
        panelMenu.setBackground(Color.black);
        panelMenu.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        panelMenu.setVisible(true);

        fondoMenu = new JLabel();
        fondoMenu.setBounds(0, 0, ventana.getWidth(), ventana.getHeight());
        imagenFondoMenu = new ImageIcon("imagenes/fondojuego.png");
        imagenFondoMenu = new ImageIcon(imagenFondoMenu.getImage().getScaledInstance(ventana.getWidth(), ventana.getHeight(), Image.SCALE_DEFAULT));
        fondoMenu.setIcon(imagenFondoMenu);
        fondoMenu.setVisible(true);
        

        btn1 = new JButton("JUGAR");
        btn1.setBounds(200, 400, 300, 30);
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.YELLOW);
        btn1.setFont( new Font( "PacFont", Font.BOLD, 18 ) );
        btn1.setVisible(true);
        btn1.addActionListener(new EventoJuego(this));

        btn2 = new JButton("CONTROLES");
        btn2.setBounds(200, 500, 300, 30);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.YELLOW);
        btn2.setFont( new Font( "PacFont", Font.BOLD, 18 ) );
        btn2.setVisible(true);
        btn2.addActionListener(new EventoJuego(this));
      
        panelMenu.add(btn2);
        panelMenu.add(btn1);
        panelMenu.add(fondoMenu);

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
