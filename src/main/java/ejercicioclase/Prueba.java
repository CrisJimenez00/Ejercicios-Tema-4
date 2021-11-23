/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Prueba {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Utilidades ejer = new Utilidades();
        int resultadoAleatorio;
        System.out.println("Introduzca el número mínimo");
        int minimo = ejer.leerDato();
        System.out.println("Introduce el número máximo");
        int maximo = ejer.leerDato();
        if (minimo < maximo) {

            resultadoAleatorio = ejer.numAleatorio(minimo, maximo);
            System.out.println("El número aleatorio es:" + resultadoAleatorio);

        } else {

            resultadoAleatorio = ejer.numAleatorio(maximo, minimo);
            System.out.println("El número aleatorio es:" + resultadoAleatorio);

        }
    }

}
