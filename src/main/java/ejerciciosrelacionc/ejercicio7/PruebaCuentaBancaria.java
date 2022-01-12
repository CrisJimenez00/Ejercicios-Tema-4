/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosrelacionc.ejercicio7;

import ejerciciosrelacionc.ejercicio7.CuentaBancaria;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author cristina
 */
public class PruebaCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria prueba = new CuentaBancaria("42192614B", "Yoel Elvira", 120, 3);
        System.out.println("Saldo principal: " + prueba.getSaldo());
        //prueba.retirarEfectivo(150);
        prueba.ingresarDinero(30);
        System.out.println("Ingresamos dinero--------------");
        System.out.println("El saldo actual de la cuenta es de: " + prueba.getSaldo());
        prueba.retirarEfectivo(10);
        System.out.println("Retiramos efectivo--------------");
        System.out.println("EL saldo actual de la cuenta es de: " + prueba.getSaldo());
        prueba.ingresarIntereses();
        System.out.println("Ingresar interés-----------------");
        System.out.println("EL saldo actual de la cuenta es de: " + prueba.getSaldo());

    }

}
