/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosIntroduccion;

/**
 *
 * @author cristina
 */
public class MisVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creo el vehículo 
        Vehiculo miCacharro = new Vehiculo("7894HGF", "SEAT", "Ibiza", "Negro", 102);

        //Muestro el vehículo con get en un sout
        System.out.println("---------------MI CACHARRO---------------"
                + "\nMatricula: " + miCacharro.getMatricula()
                + "\nMarca:" + miCacharro.getMarca()
                + "\nModelo:" + miCacharro.getModelo()
                + "\nColor:" + miCacharro.getColor()
                + "\nTarifa:" + miCacharro.getTarifa());

        //Cambio de matrícula con set
        miCacharro.setMatricula("0000ASD");

        System.out.println("\n----------CAMBIO----------"
                + "\nMatricula cambiada: " + miCacharro.getMatricula());

    }

}
