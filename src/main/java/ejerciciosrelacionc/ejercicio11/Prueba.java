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

        Puerta pp = new Puerta(v1, false);
        Puerta pc = new Puerta(new Ventana(true, true), false);

        Rueda rdi = new Rueda(50, true);
        Rueda rdd = new Rueda(50, true);
        Rueda rti = new Rueda(50, true);
        Rueda rtd = new Rueda(50, true);

        Coche auto = new Coche(m, pp, pc, rdi, rdd, rti, rtd);
        Coche auto2 = new Coche(new Motor(2.0, false),
                new Puerta(new Ventana(true, true), false),
                new Puerta(new Ventana(true, true), false),
                new Rueda(50, true),
                new Rueda(50, true),
                new Rueda(50, true),
                new Rueda(50, true));

        System.out.println(auto);
        rtd.desinflar();
        
        System.out.println("\n------------AUTO2------------");

        System.out.println(auto2);

        System.out.println("Poner la ventana puerto piloto auto 2 sin tintar");
        auto2.getPuertaPiloto().getVentana().setTintada(false);

        System.out.println(auto2);

        System.out.println("\nDiametro rueda delantera izquierda");
        System.out.println(auto2.getRuedaDelanteraIzquierda().getDiametro());

        System.out.println("\nArrancar el motor del auto2");
        auto2.getMotor().arrancar();

        System.out.println("\n" + auto2);

    }

}
