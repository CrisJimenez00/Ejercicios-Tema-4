/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrelacionc.ejercicio17;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author cristina
 */
public class Hora {

    private int hora;
    private int minutos;
    private int segundos;
    LocalTime tiempo;

    public Hora(int hora, int minutos, int segundos) {
        if (horaCorrecta()) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;

        } else {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    public Hora() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public boolean horaCorrecta() {
        boolean resultado = true;
        try {
            LocalTime horaCompleta = LocalTime.of(hora, minutos, segundos);

        } catch (DateTimeException dte) {
            LocalTime horaCompleta = LocalTime.of(0, 0, 0);
            resultado = false;
        }
        return resultado;
    }

    public void escribirHora() {
        tiempo = LocalTime.of(hora, minutos, segundos);
        System.out.println(tiempo);

    }
//segundosDesde(): devolverá el número de segundos transcurridos desde la medianoche.
//

    public long segundosDesde() {
        long resultado = 0;
        tiempo = LocalTime.of(hora, minutos, segundos);

        resultado = ChronoUnit.SECONDS.between(LocalTime.MIDNIGHT, tiempo);

        return resultado;
    }

//segundosHasta(): devolverá el número de segundos transcurridos hasta la medianoche.
//
    public long segundosHasta() {
        long resultado = 0;
        tiempo = LocalTime.of(hora, minutos, segundos);

        resultado = ChronoUnit.SECONDS.between(tiempo, LocalTime.MIDNIGHT);

        return resultado;
    }

//segundosEntreHoras(Hora h): devolverá el número de segundos entre la hora y el objeto Hora h.
//
    public long segundosEntreHoras(Hora h) {
        long resultado = 0;
        tiempo = LocalTime.of(hora, minutos, segundos);
        LocalTime hora = LocalTime.of(h.getHora(), h.getMinutos(), h.getSegundos());

        resultado = ChronoUnit.SECONDS.between(tiempo, hora);

        return resultado;
    }

//siguiente(): pasará al segundo siguiente.
//
    public void siguiente() {
        
    }
    
//anterior(): pasará al segundo anterior.
//
     public void anterior() {
        
    }
     
//copia(Hora h): devolverá un clon de la hora. Este método es de clase.
//
      public Hora copia(Hora h) {
        
    }
      
//igualQue(Hora h): indica si la hora es la misma que la proporcionada.
//
//menorQue(Hora h): indica si la hora es anterior a la proporcionada.
//
//mayorQue(Hora h): indica si la hora es posterior a la proporcionada.
}
