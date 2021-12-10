/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrelacionc;

/**
 *
 * @author cristina
 */
public class PruebaPuntoGeometrico {

    public static void main(String[] args) {
        PuntoGeometrico prueba1 = new PuntoGeometrico(1, 1);
        PuntoGeometrico prueba2 = new PuntoGeometrico();
        Linea linea = new Linea(prueba2, prueba1);
        System.out.println(prueba1.toString());
        prueba1.setX(4);
        System.out.println(prueba1.toString());
        System.out.println(prueba2);
        System.out.println("------------------");
        System.out.println(linea.mostrarLinea());
    }
}
