/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosrelacionc;

/**
 *
 * @author cristina
 */
public class NIF {

    //Atributos
    private String numero;
    private char letraDNI;
    private int contador = 1;


    private char generaLetra(String numero) {
        char letra;
        switch (Integer.parseInt(numero) % 23) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            default:
                letra = 'E';
                break;
        }
        return letra;
    }

    //Constructores
    public NIF(String numero) {
        this.numero = numero;
        if(numero.length() == 8){
        this.letraDNI = generaLetra(numero);
        }else{
            System.out.println("El numero tiene que tener mínimo 8 dígitos");
        }
        contador++;
    }

    //getters, no setters
    public String getNumero() {
        return numero;
    }

    public char getLetraDNI() {
        return letraDNI;
    }

    public int getContador() {
        return contador;
    }

    //toString
    @Override
    public String toString() {
        return numero + "-" + letraDNI;
    }

}
