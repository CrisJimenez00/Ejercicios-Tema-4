/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrelacionc.ejercicio1y2;

/**
 *
 * @author cristina
 */
public class PruebaComplejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Números que no son iguales
        Complejo num1 = new Complejo(3, 7);
        Complejo num2 = new Complejo(8, 9);
        System.out.println(num1.toString() + "\n" + num2.toString());
        System.out.println(Complejo.suma(num1, num2).toString());
        System.out.println(Complejo.resta(num1, num2).toString());
        System.out.println(Complejo.multiplicacion(num1, num2).toString());
        Complejo.igualdad(num1, num2);

        System.out.println("\n------------OTRO CASO--------------");
        //Números que son iguales
        Complejo num3 = new Complejo(3, 7);
        Complejo num4 = new Complejo(3, 7);
        System.out.println(num3.toString() + "\n" + num4.toString());
        System.out.println(Complejo.suma(num3, num4).toString());
        System.out.println(Complejo.resta(num3, num4).toString());
        System.out.println(Complejo.multiplicacion(num3, num4).toString());
        Complejo.igualdad(num3, num4);
        
        System.out.println("--------------------------------");
        //Solamente lo he puesto en el parametrizado para que no cuente los objetos
        //creados en los métodos suma, resta, división e igualdad
        System.out.println("Hay: " + Complejo.getContador() + " números complejos creados correctamente");
    }

}
