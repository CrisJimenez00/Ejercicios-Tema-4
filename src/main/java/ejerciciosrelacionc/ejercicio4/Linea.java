/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrelacionc.ejercicio4;

import ejerciciosrelacionc.ejercicio4.PuntoGeometrico;

/**
 *
 * @author cristina
 */
public class Linea {

    //Atributos
    private PuntoGeometrico puntoA;//Inicio
    private PuntoGeometrico puntoB;//Fin

    //Metodos
    //Desplaza la línea a la derecha a la distancia que se indique.
    public void mueveDerecha(double x) {
        this.puntoA.setX((int) (puntoA.getX() + x));
        this.puntoB.setX((int) (puntoB.getX() + x));
    }

    //Desplaza la línea a la izquierda a la distancia que se indique.
    public void mueveIzquierda(double x) {
        this.puntoA.setX((int) (puntoA.getX() - x));
        this.puntoB.setX((int) (puntoB.getX() - x));

    }

    //Desplaza la línea hacia arriba a la distancia que se indique.
    public void mueveArriba(double y) {
        this.puntoA.setY((int) (puntoA.getY() + y));
        this.puntoB.setY((int) (puntoB.getY() + y));

    }

    //Desplaza la línea hacia abajo a la distancia que se indique.
    public void mueveAbajo(double y) {
        this.puntoA.setY((int) (puntoA.getY() - y));
        this.puntoB.setY((int) (puntoB.getY() - y));

    }

    //Constructores
    public Linea() {
        this.puntoA.setX(0);
        this.puntoA.setY(0);
        this.puntoB.setX(1);
        this.puntoB.setY(1);
    }

    public Linea(PuntoGeometrico puntoA, PuntoGeometrico puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }

    @Override
    public String toString() {
        return "[" + puntoA + "," + puntoB + "]";
    }

    public String mostrarLinea() {
        return "[" + puntoA + "," + puntoB + "]";

    }

}
