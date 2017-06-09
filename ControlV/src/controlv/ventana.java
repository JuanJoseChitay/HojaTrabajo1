/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlv;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author JUANJO
 */
public class ventana extends  JFrame  implements ActionListener{
   
    private JButton operacion1,operacion2,operacion3,operacion4;
   
 private JTextField campo1, campo2, campo3;
    
    public ventana(){
        this.setBounds(0, 0, 500, 500);
       this.setTitle("Control de versiones");
      this.setLayout(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
    
        
        operacion1 = new JButton("operacion1");
        operacion1.setBounds(20, 200, 100, 30);
        operacion1.addActionListener(this);
        add(operacion1);


           operacion2 = new JButton("operacion2");
        operacion2.setBounds(120, 200, 100, 30);
        operacion2.addActionListener(this);
        add(operacion2);
        
        
        
           operacion3 = new JButton("operacion3");
        operacion3.setBounds(220, 200, 100, 30);
        operacion3.addActionListener(this);
        add(operacion3);
        
           operacion4 = new JButton("operacio4");
        operacion4.setBounds(320, 200, 100, 30);
        operacion4.addActionListener(this);
        add(operacion4);
        
         campo1 = new JTextField();
        campo1.setBounds(200, 10, 150, 30);
        add(campo1);
        
        
         campo2 = new JTextField();
        campo2.setBounds(200, 50, 150, 30);
        add(campo2);
        
         campo3 = new JTextField();
        campo3.setBounds(200, 100, 150, 30);
        add(campo3);
        
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        
            
     //boton 1 _-----------------------------------------------------------------------------------------
        if (a.getSource() == operacion1) {
             
            double  opera1 = Integer.parseInt(campo1.getText());
            double opera2 = Integer.parseInt(campo2.getText());
            double resultado= Math.sqrt((opera1*opera1)+(opera2 * opera2));
        
           String result = String.valueOf(resultado);
            campo3.setText(result);
         
           campo1.setText("");
           campo2.setText("");
           
          
        }
  // boton 2-----------------------------------------------------------------------------------------------

      

            
  
    
    

  //boton 3--------------------------------------------------------------------------------------------------
     if(a.getSource() == operacion3){
     
     
     String palabra = campo1.getText();
     String palabra1 = campo2.getText();
     String palabra3 = campo3.getText();
             String sCadenaInvertida = "";
            String CadenaInvertida = " ";
     for (int x=palabra.length()-1;x>=0;x--)
	  sCadenaInvertida = sCadenaInvertida + palabra.charAt(x);
     for (int x=palabra1.length()-1;x>=0;x--)
	  CadenaInvertida = CadenaInvertida + palabra1.charAt(x);
     
     campo3.setText(sCadenaInvertida+CadenaInvertida+palabra3);
    
     
     }
     
     // boton 4-----------------------------------------------------------------------------------------------
     if(a.getSource() == operacion4){
            double resultado;
            double opera1 = Integer.parseInt(campo1.getText());
            double opera2 = Integer.parseInt(campo2.getText());
            double opera3 = Integer.parseInt(campo3.getText());
		
		
		//hallamos la regla de 3
		// Y = (B * X) / A
		resultado = (opera2 * opera3 ) / opera1;
                 String resulta = String.valueOf(resultado);
		campo3.setText(resulta);
		
    
    }
    
     
       
    }
}
