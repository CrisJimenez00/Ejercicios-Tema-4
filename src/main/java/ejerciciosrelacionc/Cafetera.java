/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrelacionc;

/**
 *
 * @author cristina
 */
public class Cafetera {

    //Sintaxis de la clase:
    //1º Atributos, campos, propiedades
    //2º Métodos
    //3º Constructores
    //4º Getters y Setters
    //5º toString
    /*
    Va a preguntar:
        -Implicación(motivo) de public y private en los miembros(atributos y métodos) de una clase
        -Encapsulamiento
     */
 /*
    Si pone "recibe" es que se mete por parámetros
    Sobrecargado significa mismo nombre pero distintos parámetros
    
     */
    private double capacidadMaxima;
    private double cantidadActual;

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;

    }

    public void servirTaza(double cantidadAServir) {
        if (this.cantidadActual < cantidadAServir) {
            System.out.println("No se puede llenar la taza completamente, "
                    + "con lo cual se llenará con: " + this.cantidadActual);
            vaciarCafetera();
        }
        Math.abs(this.cantidadActual = -cantidadAServir);
    }

    public void agregarCafe(double cantidadAgregar) {

        if (cantidadAgregar > this.capacidadMaxima) {
            System.out.println("Si se le mete esa cantidad rebosa con lo cual "
                    + "vamos a añadir café hasta que se llene completamente");

            this.cantidadActual = this.capacidadMaxima;
            double resultado = Math.abs((this.capacidadMaxima - this.cantidadActual) - cantidadAgregar);
            System.out.println("Ha sobrado " + resultado + " ml de café");

        }
    }

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = Math.abs(capacidadMaxima);
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        if (capacidadMaxima < cantidadActual) {
            this.capacidadMaxima = capacidadMaxima;
            this.cantidadActual = capacidadMaxima;
        }
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

}
