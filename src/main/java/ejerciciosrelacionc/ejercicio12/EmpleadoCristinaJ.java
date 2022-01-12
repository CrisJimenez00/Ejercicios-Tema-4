/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrelacionc.ejercicio12;


/**
 *
 * @author cristina
 */
public class EmpleadoCristinaJ {

    private String nombre, apellidos, NIF;
    private double sueldoBase, pagoHoraExtra, horasExtrasMensuales, tipoIRPF;
    private int numHijos;
    private boolean casado;//True = sí, False = no.

    public EmpleadoCristinaJ() {
        this.nombre = "Cristina";
        this.apellidos = "Jiménez";
        this.NIF = "09117305J";
        this.sueldoBase = 1120;
        if (pagoHoraExtra < 10 || pagoHoraExtra > 25) {
            throw new IllegalArgumentException("Pago por hora extra está fuera de rango");
        }
        this.pagoHoraExtra = 12;

        this.horasExtrasMensuales = 8;
        if (tipoIRPF < 1 || tipoIRPF > 21) {
            this.tipoIRPF = 12;
        }
        this.numHijos = 0;
        this.casado = false;

    }

    public EmpleadoCristinaJ(String nombre, String apellidos, String NIF, double sueldoBase, double pagoHoraExtra, double horasExtrasMensuales, double tipoIRPF, int numHijos, boolean casado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.sueldoBase = sueldoBase;
        if (pagoHoraExtra < 10 || pagoHoraExtra > 25) {
            throw new IllegalArgumentException("Pago por hora extra está fuera de rango");
        }
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtrasMensuales = horasExtrasMensuales;
        if (tipoIRPF < 1 || tipoIRPF > 21) {
            this.tipoIRPF = tipoIRPF;
        }
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
        if (tipoIRPF <= 21 && tipoIRPF >= 1) {
            this.tipoIRPF = tipoIRPF;
        }
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
    public double calculoHorasExtras() {
        double resultado = this.pagoHoraExtra * this.horasExtrasMensuales;
        return resultado;
    }

    //Para calcular sueldo bruto
    public double calculoSueldoBruto() {
        double resultado = this.sueldoBase + this.calculoHorasExtras();
        return resultado;
    }

    //Calcula el IRPF
    public double calculoIRPF() {
        if (this.isCasado()) {
            this.tipoIRPF = -2;
        }
        if (this.numHijos != 0) {
            for (int i = 0; i <= this.numHijos; i++) {
                this.tipoIRPF--;
            }
        }
        return ((tipoIRPF * sueldoBase) / 100);
    }

    public double sueldoNeto() {
        return (calculoSueldoBruto() - calculoIRPF());
    }

    public String escribirBasicInfo() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", numHijos=" + numHijos + ", casado=" + casado + '}';

    }

    //Falta este
    public String escribirAllInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", sueldoBase=" + sueldoBase + ", pagoHoraExtra=" + pagoHoraExtra + ", horasExtrasMensuales=" + horasExtrasMensuales + ", tipoIRPF=" + tipoIRPF + ", numHijos=" + numHijos + ", casado=" + casado + '}';
    }

}
