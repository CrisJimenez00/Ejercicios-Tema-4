/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrelacionc.ejercicio11;

/**
 *
 * @author cristina
 */
public class Motor {

    private double cilindrada;//1.4, 2.6, 4.8
    private boolean estado; // true = encendido, false = false

    //Constructor
    public Motor(double cilindrada, boolean estado) {
        this.cilindrada = cilindrada;
        this.estado = estado;
    }

    //getters y setters
    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void arrancar() {
        this.estado = true;
    }

    public void parar() {
        this.estado = false;
    }

    //toString
    @Override
    public String toString() {
        return "Motor{" + "cilindrada=" + cilindrada + ", estado=" + estado + '}';
    }

}
