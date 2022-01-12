/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrelacionc.ejercicio12;

import ejerciciosrelacionc.ejercicio12.EmpleadoCristinaJ;

/**
 *
 * @author cristina
 */
public class PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 12
        EmpleadoCristinaJ prueba1 = new EmpleadoCristinaJ("Manuel", "Ortega", "25879436L", 1050, 12, 5, 1, 8, true);

        //Ejercicio 13
        System.out.println("-------------------Resultados del ejercicio 13-------------------------");
        System.out.println("Calulo IRPF----" + prueba1.calculoIRPF());
        System.out.println("Info Básica-----\n" + prueba1.escribirBasicInfo());
        System.out.println("Toda Info-----\n" + prueba1.escribirAllInfo());

    }

}
