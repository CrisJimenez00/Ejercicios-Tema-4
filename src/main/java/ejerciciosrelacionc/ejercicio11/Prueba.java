/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrelacionc.ejercicio11;

/**
 *
 * @author cristina
 */
public class Prueba {

    public static void main(String[] args) {

        Motor m = new Motor(2.0, false);
        Ventana v1 = new Ventana(true, true);
        Ventana v2 = new Ventana(true, true);
        Ventana v3 = v2;
        Puerta pp = new Puerta(v1, false);
        Puerta pc = new Puerta(v1, false);
        Coche auto = new Coche();

    }

}
