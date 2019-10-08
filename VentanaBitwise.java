import ParteLógica.Bitwise;

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
  /*oooooooooooooooooooooooooooooooooo*/
  private Bitwise Bits = new Bitwise();
   
  /* Ventana */
  private JFrame Ventana;
  
  /*Caja de texto*/
  private JTextField  EncenderTxt;
  private JTextField  MostrarTxt;
  
  /*Button*/
  private JButton Encender;
  private JButton Apagar;
  
  /*Label*/
  //private JLabel labelPocition;
  /*oooooooooooooooooooooooooooooooooo*/  
  //Clase pincipal
  public static void main(String[] args){  
    new VentanaBitwise();
  }
  
  //Constructor De la Ventana
  public VentanaBitwise(){
  
    //Variablede tipo JFrame    
    Ventana = new JFrame("Ventanita");
    Ventana.setSize(850,550);
    Ventana.getContentPane().setBackground(Color.white);
    Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*Finaliza el programa*/
    Ventana.setLayout(new GridBagLayout());
    
    /*+++++++++++++++++++++++++++++++++++*/
    /*Declarando todas las Cajas de texto*/
    /*+++++++++++++++++++++++++++++++++++*/
    
    //Declaramos la caja EncenderTxt
    EncenderTxt = new JTextField("");
    //Creamos nuetro propio color celeste	
    Color lightBlue = new Color(51, 153, 255); 	
    Border BordeEncenderTxt = BorderFactory.createLineBorder(lightBlue, 2);
    EncenderTxt.setBorder(BordeEncenderTxt);
    
    //Declaramos la caja MostrarTxt
    MostrarTxt = new JTextField("");
    Border BorderMostrarTxt = BorderFactory.createLineBorder(lightBlue, 2);
    MostrarTxt.setBorder(BorderMostrarTxt);
    
    
    /*+++++++++++++++++++++++++++++++++++*/
    /*+++Declaramos todos los Botones+++*/
    /*+++++++++++++++++++++++++++++++++*/
    
    //Declaramos botón Encender
    Encender = new JButton("Encender");
    Encender.setForeground(Color.white);
    Border Border_Encender = BorderFactory.createLineBorder(Color.darkGray, 2);
    Encender.setBorder(Border_Encender);
    Encender.setBackground(lightBlue);
    
    //Declaramos botón Apagar
    Apagar = new JButton("Apagar");
    Apagar.setForeground(Color.white);
    Apagar.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
    Apagar.setBackground(lightBlue);
    
    /*+++++++++++++++++++++++++++++++++++*/
    /*+++Declaramos todos los Labels +++*/
    /*+++++++++++++++++++++++++++++++++*/
    
    //Crea JLabel
    /*labelPocition = new JLabel("        32 31 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 09 08 07 06 05 04 03 02 01");
    labelPocition.setFont(new Font("Arial", 0,7));
    Border borde = BorderFactory.createLineBorder(Color.pink, 2);
    labelPocition.setBorder(borde);*/
    
    /*-------Objeto de configuración del grid-------*/
    GridBagConstraints gridConf = new GridBagConstraints();
    gridConf.fill = GridBagConstraints.HORIZONTAL;
    /*---------------------------------------------*/
    
    /*-------------------------------*/
    /* Adherir elementos a la ventana*/
    /*-------------------------------*/
    
    /*+++++++++++++*/
    /*Caja de Texto*/
    /*+++++++++++++*/
    
    /*Confi de pocicion EncenderTxt*/
    gridConf.gridx = 2;
    gridConf.gridy = 0;
    gridConf.ipady = 20;
    gridConf.ipadx = 50;
    gridConf.gridwidth = 1;
    gridConf.insets = new Insets(0,0,3,3); //padding
    
    //Añadir EncenderTxt a la ventana
    Ventana.add(EncenderTxt, gridConf);
    
    /*Confi de MostrarTxt*/
    gridConf.gridx = 2;
    gridConf.gridy = 1;
    gridConf.ipadx = 450;
    gridConf.gridwidth = 2;
    gridConf.insets = new Insets(0,0,3,3); //padding
    //Añadir MostrarTxt en la ventana
    Ventana.add(MostrarTxt,gridConf);
    gridConf.gridwidth = 1;
    
    /*++++++++*/
    /* Labels */
    /*++++++++*/
    
    /*gridConf.gridx = 2;
    gridConf.gridy = 2;
    //gridConf.ipadx = 450;
    gridConf.gridwidth = 3;
    //Añadir labelPocition en la ventana
    Ventana.add(labelPocition,gridConf);
    gridConf.gridwidth = 1;*/
    
    /*+++++++*/
    /*Botones*/
    /*+++++++*/
    
    //Confi de Encender
    gridConf.ipady = 20;
    gridConf.ipadx = 20;
    gridConf.gridwidth = 2;
    gridConf.insets = new Insets(10,10,10,10);
    
    //Ayadir Encender en la ventana
    gridConf.gridx = 0;
    gridConf.gridy = 0;
    Ventana.add(Encender, gridConf);
    
    //Confi de Apagar
    //Ayadir Apagar en la ventana
    gridConf.gridx = 0;
    gridConf.gridy = 1;
    Ventana.add(Apagar, gridConf);
    
    /*****************************************/
    /*******Onclick De los Botoncitos*********/
    /*****************************************/
    
    //onclick Encender
    Encender.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Encender_Click();
      }
    });
    
    //onclick Apagar
    Apagar.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        Apagar_Click();
      }
    });
    
    /*------------------------*/
    //ventanaM.pack();
    Ventana.setVisible(true);//Configurando visualización de la ventana
    /*------------------------*/
  }
  

  
  public void Encender_Click(){
    
    int Posicioncita = Integer.parseInt(EncenderTxt.getText());
    Bits.Encender(Posicioncita);
    String AuxPosition = String.valueOf(Bits.GetBit(Posicioncita));
    MostrarTxt.setText(Bits.ObtenerTodo());
  }
  
  public void Apagar_Click(){
  
    int Posicioncita = Integer.parseInt(EncenderTxt.getText());
    Bits.Apagar(Posicioncita);
    MostrarTxt.setText(Bits.ObtenerTodo());
  }
}
