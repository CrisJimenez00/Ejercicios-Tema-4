/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosintroduccion;

/**
 *
 * @author cristina
 */
public class CajaCarton {

    private int largo;
    private int ancho;
    private int alto;
    private int peso;

    public CajaCarton(int largo, int ancho, int alto, int peso) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void abrir() {
    }

    public void cerrar() {
    }

    @Override
    public String toString() {
        return "= " + "largo=" + largo + " mm , ancho=" + ancho + " mm , alto=" + alto + " mm , peso=" + peso + " gr";
    }

}
