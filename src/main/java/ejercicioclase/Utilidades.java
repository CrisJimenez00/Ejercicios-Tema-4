/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioclase;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Utilidades {

    //********METODOS*********
    //*****PARA GENERAR LOS ALEATORIOS********
    //Método privado el cual genera un número aleatorio entre dos 
    //márgenes introducidos por parámetros
    public int numAleatorio(int numMinimo, int numMaximo) {

        int aleatorio;
        Random random = new Random();
        aleatorio = random.nextInt(numMaximo - numMinimo + 1) + numMinimo;
        return aleatorio;
    }
    //*******PARA LEER DATOS POR TECLADO*******
    //Metodo privado el cual lee los datos por scanner 
    //y controla excepciones(que no se introduzca números en los nextInt())

    public int leerDato() {
        Scanner teclado = new Scanner(System.in);
        boolean solicitarDatos = true;
        int numero = 0;
        do {
            try {
                //Bloque candidato a lanzar la excepcion
                System.out.println("El número será: ");
                numero = teclado.nextInt();

                //Para controlar que los datos están correctamente introducidos.
                solicitarDatos = false;
            } catch (InputMismatchException ime) {

                //Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números"
                        + "\nVuelva a introducir los datos");
                teclado.nextLine();
            }
        } while (solicitarDatos); // Bucle que controla la excepción

        return numero;

    }

}
