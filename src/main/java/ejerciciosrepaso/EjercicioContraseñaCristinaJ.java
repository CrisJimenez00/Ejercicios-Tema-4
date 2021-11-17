/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrepaso;

import java.util.Random;

/**
 *
 * @author cristina
 */
public class EjercicioContraseñaCristinaJ {
    //********METODOS*********
    //*****PARA GENERAR LOS ALEATORIOS********
    //Método privado el cual genera un número aleatorio entre dos 
    //márgenes introducidos por parámetros

    private static int numAleatorio(int numMinimo, int numMaximo) {

        int aleatorio;
        Random random = new Random();
        aleatorio = random.nextInt(numMaximo - numMinimo + 1) + numMinimo;
        return aleatorio;
    }

    private static char letraAleatoriaEntreFYX() {

        char aleatorio;
        Random random = new Random();
        aleatorio = (char) (random.nextInt(88 - 70 + 1) + 70);
        return aleatorio;
    }

    private static int generarDig2(int dig1, int dig2) {
        do {
            dig2 = numAleatorio(0, 9);
            //Para comprobar si funciona 
            System.out.println("Contraseña 2 primeros dígitos");
            System.out.println(dig1 + "" + dig2);
        } while (dig2 == dig1);
        return dig2;
    }

    private static int generarDig3(int dig1, int dig2, int dig3) {
        do {
            dig3 = numAleatorio(0, 9);
            //Para comprobar si funciona 
            System.out.println("Contraseña 3 dígitos");
            System.out.println(dig1 + "" + dig2 + "" + dig3);
        } while ((dig3 == dig1) || (dig3 == dig2));
        return dig3;
    }

    private static int generarDig4(int dig1, int dig2, int dig3, int dig4) {
        do {
            dig4 = numAleatorio(0, 9);
            //Para comprobar si funciona 
            System.out.println("\nContraseña 4 dígitos");
            System.out.println(dig1 + "" + dig2 + "" + dig3 + "" + dig4);
        } while ((dig4 == dig1) || (dig4 == dig2) || (dig4 == dig3));
        return dig4;
    }

    public static void main(String[] args) {

        int dig1, dig2 = 0, dig3 = 0, dig4 = 0;
        char letra;

        //Hacemos el número aletorio 1 
        dig1 = numAleatorio(0, 9);
        System.out.println("-------------------");
        dig2 = generarDig2(dig1, dig2);
        System.out.println("-------------------");
        dig3 = generarDig3(dig1, dig2, dig3);
        System.out.println("-------------------");
        dig4 = generarDig4(dig1, dig2, dig3, dig4);
        System.out.println("-------------------");
        letra = letraAleatoriaEntreFYX();
        System.out.println("La letra es: " + letra);
        System.out.println("-------------------");

        System.out.println("----------COMPROBAMOS CONDICIONES--------");
        if ((dig1 + dig4) % 2 != 0) {
            if ((dig2 * dig3) % 2 == 0) {
            } else {
                do {
                    dig2 = generarDig2(dig1, dig2);
                    System.out.println("-------------------");
                    dig3 = generarDig3(dig1, dig2, dig3);
                } while ((dig2 * dig3) % 2 == 0);
            }
        } else {
            do {
                dig1 = numAleatorio(0, 9);
                dig4 = generarDig4(dig1, dig2, dig3, dig4);
            } while ((dig1 + dig4) % 2 != 0);
        }

        System.out.println("La contraseña final es: " + dig1 + "" + dig2 + "" + dig3 + "" + dig4 + "" + letra);

    }

}
