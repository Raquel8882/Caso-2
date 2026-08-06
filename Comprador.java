/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso;

/**
 *
 * @author Laboratorio
 */
public class Comprador {
    private String Nombre;
    private int NumeroTelefonico;
    private int Numero;

    public Comprador(String Nombre, int NumeroTelefonico, int Numero) {
        this.Nombre = Nombre;
        this.NumeroTelefonico = NumeroTelefonico;
        this.Numero = Numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroTelefonico() {
        return NumeroTelefonico;
    }

    public void setNumeroTelefonico(int NumeroTelefonico) {
        this.NumeroTelefonico = NumeroTelefonico;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    @Override
    public String toString() {
        return "Comprador{" + "Nombre=" + Nombre + ", NumeroTelefonico=" + NumeroTelefonico + ", Numero=" + Numero + '}';
    }

    
    
    
}
