/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrelacionc.ejercicio10;

import ejerciciosrelacionc.ejercicio10.Cancion;

/**
 *
 * @author cristina
 */
public class PruebaCancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("La macarena", "Los del río");
        System.out.println("Canción 1 " + cancion1.toString());
        System.out.println("Canción 2 " + cancion2.toString());
        cancion1.setAutor("King África");
        cancion1.setTitulo("La Bomba");
        System.out.println("Cancion 1 actualizada " + cancion1.toString());
    }

}
