/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosintroduccion;

/**
 *
 * @author cristina
 */
public class TestCajaCarton {

    public static void main(String[] args) {
        CajaCarton cajaGrande = new CajaCarton(500, 250, 400, 200);
        CajaCarton cajaChica = new CajaCarton(15, 25, 30, 17);

        System.out.println("Caja chica " + cajaChica.toString());
        System.out.println("--------------------");
        System.out.println("Caja grande " + cajaGrande.toString());
    }

}
