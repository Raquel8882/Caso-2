/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Caso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Talonario talonario = new Talonario();
        String menu="Menu \n 1- Compra Manual \n 2-Compra Aleatoria \n 3-Estado actual talonario \n 4-Buscar Comprador 5-Reporte 6-Sorteo";
        int i=0;
        do {            
            i=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (i) {
                case 1:
                   talonario.CompraManual();
                    break;
                case 2:
                    talonario.CompraRandom();
                    break;    
                case 3:
                    talonario.Visualizacion();
                    break;
                case 4:
                    //JOptionPane.showMessageDialog(null, parqueo.toString());
                    break;
                case 5:
                    //JOptionPane.showMessageDialog(null, parqueo.toString());
                    break;
                case 6:
                    
                default:
                     
            }
        } while (i!=6);
                
    }
    }
    

