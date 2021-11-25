/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrelacionc;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Empleado {

    private String nombre, apellidos, NIF;
    private double sueldoBase, pagoHoraExtra, horasExtrasMensuales, tipoIRPF;
    private int numHijos;
    private boolean casado;//True = sí, False = no.

    public Empleado() {
        this.nombre = "Cristina";
        this.apellidos = "Jiménez";
        this.NIF = "09117305J";
        this.sueldoBase = 1120;
        this.pagoHoraExtra = 120;
        this.horasExtrasMensuales = 8;
        this.tipoIRPF = 12;
        this.numHijos = 0;
        this.casado = false;

    }

    public Empleado(String nombre, String apellidos, String NIF, double sueldoBase, double pagoHoraExtra, double horasExtrasMensuales, double tipoIRPF, int numHijos, boolean casado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtrasMensuales = horasExtrasMensuales;
        this.tipoIRPF = tipoIRPF;
        this.numHijos = numHijos;
        this.casado = casado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public double getHorasExtrasMensuales() {
        return horasExtrasMensuales;
    }

    public void setHorasExtrasMensuales(double horasExtrasMensuales) {
        this.horasExtrasMensuales = horasExtrasMensuales;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    //Metodos del ejercicio 13
    //Para calcular h extras
    public double calculoHorasExtras(Empleado e) {
        double resultado = e.getPagoHoraExtra() * e.getHorasExtrasMensuales();
        return resultado;
    }

    //Para calcular sueldo bruto
    public double calculoSueldoBruto(Empleado e) {
        double resultado = e.getSueldoBase() + e.calculoHorasExtras(e);
        return resultado;
    }

    //Calcula el IRPF
    public void calculoIRPF(Empleado e) {
        if (e.isCasado()) {
            e.setTipoIRPF(e.getTipoIRPF() - 2);
        }
        if (e.getNumHijos() != 0) {
            for (int i = 0; i <= e.getNumHijos(); i++) {
                e.setTipoIRPF(e.getTipoIRPF() - 1);
            }
        }
        e.setSueldoBase(e.sueldoBase * (e.getTipoIRPF() / 100));
    }

    public void escribirBasicInfo() {
        Scanner teclado = new Scanner(System.in);
        Empleado e = new Empleado();
        System.out.println("Introduzca el nombre:");
        e.setNombre(teclado.nextLine());

        System.out.println("Introduzca el apellido:");
        e.setApellidos(teclado.nextLine());

        System.out.println("Introduzca el NIF:");
        e.setNIF(teclado.nextLine());

        System.out.println("Introduzca su estado civil(s o c):");
        if (teclado.nextLine().equalsIgnoreCase("C")) {
            e.setCasado(true);
        } else if (teclado.nextLine().equalsIgnoreCase("S")) {
            e.setCasado(false);
        } else {
            System.out.println("Ha puesto un dato no válido con lo cual se quedará en false");
        }

        System.out.println("Introduzca el número de hijos:");
        e.setNumHijos(teclado.nextInt());

    }

    //Falta este
    public void escribirAllInfo(){
    
    }
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", sueldoBase=" + sueldoBase + ", pagoHoraExtra=" + pagoHoraExtra + ", horasExtrasMensuales=" + horasExtrasMensuales + ", tipoIRPF=" + tipoIRPF + ", numHijos=" + numHijos + ", casado=" + casado + '}';
    }

}
