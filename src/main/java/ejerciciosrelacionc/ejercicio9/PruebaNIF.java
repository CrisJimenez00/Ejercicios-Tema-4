/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrelacionc.ejercicio9;

/**
 *
 * @author cristina
 */
public class PruebaNIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Un DNI correcto
        NIF prueba = new NIF("09117305");
        System.out.println(prueba.toString());

        //Un DNI correcto
        NIF prueba3 = new NIF("00395469");
        System.out.println(prueba3.toString());

        //Un DNI incorrecto
        NIF prueba2 = new NIF("0917");
        System.out.println(prueba2.toString());

        //Muestra el contador
        System.out.println("Hasta ahora has creado: " + prueba.getContador() + " DNIs correctamente");
    }

}
