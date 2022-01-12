/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrelacionc.ejercicio8;

import ejerciciosrelacionc.ejercicio8.Cafetera;

/**
 *
 * @author cristina
 */
public class PruebaCafetera {

    public static void main(String[] args) {
        Cafetera prueba = new Cafetera(1000);
        prueba.llenarCafetera();
        System.out.println("Hemos llenado la cafetera");
        prueba.servirTaza(500);
        System.out.println("Hemos servido una taza y ahora queda: " + Math.abs(prueba.getCantidadActual()));
        prueba.agregarCafe(1200);
        System.out.println("Hemos agregado café");
        prueba.vaciarCafetera();
        System.out.println("Tras vaciarlo queda " + Math.abs(prueba.getCantidadActual()));
    }

}
