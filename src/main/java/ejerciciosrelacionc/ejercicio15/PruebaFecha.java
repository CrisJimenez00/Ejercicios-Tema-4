/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrelacionc.ejercicio15;

/**
 *
 * @author Cris
 */
public class PruebaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha hoy = new Fecha(17,1,2022);
        System.out.println("El mes tiene: " + hoy.diaMes() + " días");
        hoy.diaSemana();
        hoy.mostrarFechaCorta();
        hoy.setDia(30);
        System.out.println(hoy.toString());
    }
    
}
