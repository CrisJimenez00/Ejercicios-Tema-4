/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrelacionc.ejercicio15;

import java.time.LocalDate;

/**
 *
 * @author Cris
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    //Métodos
    //Comprueba si existe la fecha(da true si existe)
    private boolean comprobarFecha(int dia, int mes, int anio) {

        boolean fecha = true;
        try {
            LocalDate.of(dia, mes, anio);
        } catch (IllegalArgumentException IAE) {
            System.out.println("La fecha introducida no existe, introduzca una válida");
            fecha = false;
        }
        return fecha;
    }

    //Constructor por defecto con valores predeterminados
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2022;
    }

    //Constructor parametrizado
    public Fecha(int dia, int mes, int anio) {
        if (comprobarFecha(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            this.dia = 17;
            this.mes = 1;
            this.anio = 2022;

        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    

}
