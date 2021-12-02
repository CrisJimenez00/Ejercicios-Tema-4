/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrelacionc;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author cristina
 */
public class CuentaBancaria {

    //Atributos encapsulados.
    private String numeroDeCuenta;
    private String NIF;
    private String nombre;
    private double saldo;
    private double interes;

    //Métodos
    //Aumenta el saldo de la cuenta, aplicando el interés anual
    public void ingresarIntereses() {
        saldo = saldo + (interes * saldo);
    }

    //Permite ingresar una cantidad en la cuenta.
    public void ingresarDinero(double cantidad) {
        saldo = saldo + cantidad;
    }

    //Permite sacar una cantidad de la cuenta (si hay saldo). 
    //Si no hay saldo suficiente no se realiza la operación.
    public void retirarEfectivo(double cantidad) {
        if ((saldo - cantidad) < 0) {
            throw new IllegalArgumentException("No se puede retirar el dinero que desea por insuficiencia de saldo");
        }
        Math.abs(saldo = saldo - cantidad);
    }

    //Constructores
    public CuentaBancaria() {
        this.numeroDeCuenta = RandomStringUtils.randomNumeric(20).toUpperCase();
        this.NIF = "65407674K";
        this.nombre = "Alessandro Rebollo";
        this.saldo = 0;
        this.interes = 0;

    }

    public CuentaBancaria(String NIF, String nombre, double saldo, double interes) {
        this.numeroDeCuenta = RandomStringUtils.randomNumeric(20).toUpperCase();
        this.NIF = NIF;
        this.nombre = nombre;
        this.saldo = saldo;
        if (interes < 0.1 || interes > 3) {
            throw new IllegalArgumentException("Tiene que introducir un dato entre 0.1 y 3");
        }
        this.interes = interes;
    }

    //Getters y setters
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //toString
    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroDeCuenta=" + numeroDeCuenta + ", NIF=" + NIF + ", nombre=" + nombre + ", saldo=" + saldo + ", interes=" + interes + '}';
    }

}
