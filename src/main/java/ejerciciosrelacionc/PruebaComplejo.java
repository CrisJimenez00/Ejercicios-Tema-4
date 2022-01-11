/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrelacionc;

/**
 *
 * @author cristina
 */
public class PruebaComplejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complejo num1 = new Complejo(3, 7);
        Complejo num2 = new Complejo(8, 9);
        System.out.println(num1.toString() + "\n" + num2.toString());
        System.out.println(Complejo.suma(num1, num2).toString());
        System.out.println(Complejo.resta(num1, num2).toString());
        System.out.println(Complejo.multiplicacion(num1, num2).toString());
        Complejo.igualdad(num1, num2);

    }

}
