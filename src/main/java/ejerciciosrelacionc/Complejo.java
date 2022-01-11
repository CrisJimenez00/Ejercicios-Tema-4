/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrelacionc;

/**
 *
 * @author cristina
 */
public class Complejo {

    private double numeroImaginario;
    private double numeroReal;

    //Métodos
    //Suma dos objetos de tipo Complejo
    public static Complejo suma(Complejo num1, Complejo num2) {
        //creamos el objeto que será eñl resultado
        Complejo resultado = new Complejo();

        //La estructura es (a,b)+(c,d)
        double resultadoReal = num1.getNumeroReal() + num2.getNumeroReal();
        double resultadoImaginario = num1.getNumeroImaginario() + num2.getNumeroImaginario();

        //Cambiamos valores
        resultado.setNumeroReal(resultadoReal);
        resultado.setNumeroImaginario(resultadoImaginario);

        //Devolvemos el resultado
        return resultado;
    }
    //Resta dos objetos de tipo Complejo

    public static Complejo resta(Complejo num1, Complejo num2) {
        //creamos el objeto que será eñl resultado
        Complejo resultado = new Complejo();

        //La estructura es (a,b)+(c,d)
        double resultadoReal = num1.getNumeroReal() - num2.getNumeroReal();
        double resultadoImaginario = num1.getNumeroImaginario() - num2.getNumeroImaginario();

        //Cambiamos valores
        resultado.setNumeroReal(resultadoReal);
        resultado.setNumeroImaginario(resultadoImaginario);

        //Devolvemos el resultado
        return resultado;
    }
    //Multiplicacion dos objetos de tipo Complejo

    public static Complejo multiplicacion(Complejo num1, Complejo num2) {
        //creamos el objeto que será eñl resultado
        Complejo resultado = new Complejo();

        //La estructura es (a,b)+(c,d)
        double resultadoReal = num1.getNumeroReal() * num2.getNumeroReal();
        double resultadoImaginario = num1.getNumeroImaginario() * num2.getNumeroImaginario();

        //Cambiamos valores
        resultado.setNumeroReal(resultadoReal);
        resultado.setNumeroImaginario(resultadoImaginario);

        //Devolvemos el resultado
        return resultado;
    }
    //Compara dos objetos de tipo Complejo

    public static void igualdad(Complejo num1, Complejo num2) {

        //La estructura es (a,b)+(c,d)
        if (num1.getNumeroReal() == num2.getNumeroReal() && num1.getNumeroImaginario() == num2.getNumeroImaginario()) {
            System.out.println("Son los mismos números complejos");
        } else {
            System.out.println("Los números no son iguales");
        }

    }

    //Constructores
    public Complejo(double numeroImaginario, double numeroReal) {
        this.numeroImaginario = numeroImaginario;
        this.numeroReal = numeroReal;
    }

    public Complejo() {
    }

    //getter/setter
    public double getNumeroImaginario() {
        return numeroImaginario;
    }

    public void setNumeroImaginario(double numeroImaginario) {
        this.numeroImaginario = numeroImaginario;
    }

    public double getNumeroReal() {
        return numeroReal;
    }

    public void setNumeroReal(double numeroReal) {
        this.numeroReal = numeroReal;
    }

    //toString
    @Override
    public String toString() {
        return "numeroComplejo(" + numeroImaginario + ", " + numeroReal + ')';
    }

}
