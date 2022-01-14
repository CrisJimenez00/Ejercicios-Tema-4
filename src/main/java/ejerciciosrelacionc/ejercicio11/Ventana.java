/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrelacionc.ejercicio11;

/**
 *
 * @author cristina
 */
public class Ventana {

    private boolean tintada;//true = tintado
    private boolean estado; //true = cerrado

    //constructor
    public Ventana(boolean tintada, boolean estado) {
        this.tintada = tintada;
        this.estado = estado;
    }

    //getters y setters
    public boolean isTintada() {
        return tintada;
    }

    public void setTintada(boolean tintada) {
        this.tintada = tintada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void bajar() {
        this.estado = false;
    }

    public void subir() {
        this.estado = true;
    }

    //toString
    @Override
    public String toString() {
        return "Ventana{" + "tintada=" + tintada + ", estado=" + estado + '}';
    }

}
