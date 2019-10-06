import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JOptionPane;


public class VentanaBitwise{
   /*-----------*/
  /* Atributos */
  /*-----------*/
   
  /* Ventana */
  private JFrame Ventana;
  
  /*Caja de texto*/
  private JTextField  ResultadoTxt;
    
  //Clase pincipal
  public static void main(String[] args){  
    new VentanaBitwise();
  }
  
  //Constructor De la Ventana
  public VentanaBitwise(){
  
    //Variablede tipo JFrame    
    Ventana = new JFrame("Ventanita");
    Ventana.setSize(550,550);
    Ventana.getContentPane().setBackground(Color.white);
    Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*Finaliza el programa*/
    Ventana.setLayout(new GridBagLayout());
    
    /*Declarando todas las cajas de texto*/
    
    ResultadoTxt = new JTextField("");
    Border bordeResultado = BorderFactory.createLineBorder(Color.pink, 2);
    ResultadoTxt.setBorder(bordeResultado);
    
    /*-------Objeto de configuración del grid-------*/
    GridBagConstraints gridConf = new GridBagConstraints();
    gridConf.fill = GridBagConstraints.HORIZONTAL;
    /*---------------------------------------------*/
    
    /*-------------------------------*/
    /* Adherir elementos a la ventana*/
    /*-------------------------------*/
    
    /*Confi de pocicion ResultadoTxt*/
    gridConf.gridx = 2;
    gridConf.gridy = 0;
    gridConf.ipady = 20;
    gridConf.ipadx = 50;
    gridConf.insets = new Insets(0,0,3,3); //padding
    
    //Añadir ResultadoTxt a la ventana
    Ventana.add(ResultadoTxt, gridConf);
    
    /*------------------------*/
    //ventanaM.pack();
    Ventana.setVisible(true);//Configurando visualización de la ventana
    /*------------------------*/
  }

}
