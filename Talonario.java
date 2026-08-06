/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso;

import javax.swing.JOptionPane;
import java.util.Random;


/**
 *
 * @author Laboratorio
 */
public class Talonario {
    private int [][] numeros;
    

    public Talonario() {
        
        this.numeros=new int[10][10];
        int contador= 0;
        for (int i = 0; i < numeros.length; i++) {
            
            for (int j = 0; j < numeros[i].length; j++) {
               contador+=numeros[i][j];  
              
            }
            
        }
       
    }

   
    public void Visualizacion() {
         String resultado = "";
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                 resultado+= numeros[i][j] +  "   ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    public  void CompraManual() {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba el número que desea comprar"));
        String Nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        int NumeroTelefonico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número teléfonico:"));
        int Numero = num;
        Comprador comprador = new Comprador(Nombre, NumeroTelefonico, Numero);
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (num == i || num == j) {
                    JOptionPane.showMessageDialog(null, "Número ya comprado");
                } else {
                    
                    
                }
               

            }
        }

    }
    
    public void CompraRandom() {
        String Nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        int NumeroTelefonico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número teléfonico:"));
        int boletos = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la cantidad de boletos que desea comprar:"));
        for (int i = 0; i < boletos; i++) {
            int num = parseInt( new Random());
            
            for (int[] numero : numeros) {
                for (int j = 0; j < numero.length; j++) {
                    if (num == num) {
                        JOptionPane.showMessageDialog(null, "Número ya comprado");
                    } else {
                        
                       int Numero = num;
                        Comprador comprador = new Comprador(Nombre, NumeroTelefonico, Numero);
                        numeros[i][j] = 0;
                    }
                }
            }

        }

    }

    private int parseInt(Random random) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void Reporte(){
    
}
    
    public void Sorteo(){
        
    }
}

