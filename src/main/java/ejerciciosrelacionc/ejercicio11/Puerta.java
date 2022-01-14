/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrelacionc.ejercicio11;

/**
 *
 * @author cristina
 */
public class Puerta {

    private Ventana ventana;
    private boolean estado;//true abierta

    public Puerta(Ventana ventana, boolean estado) {
        this.ventana = ventana;
        this.estado = estado;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public boolean isEstado() {
        return estado;
    }

    public void cerrar() {
        this.estado = false;
    }

    public void abrir() {
        this.estado = true;
    }

    //Recordatorio: ¿Qué pasa si el objeto ventana no tiene implementado toString?
    //Aparecería la dirección del espacio de memoria
    @Override
    public String toString() {
        return "Puerta{" + "ventana=" + ventana + ", estado=" + estado + '}';
    }

}
