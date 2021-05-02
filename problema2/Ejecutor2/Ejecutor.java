/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor2;
import Docente.Docente;
/**
 *
 * @author USUARIO 2020
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Docente profesor1 = new Docente("7854265897", "Jonathan", "Erazo", 1999.99);
        profesor1.calcularSueldoTotal();

        Docente profesor2 = new Docente("5241359875", "Jossue", "Borrero", 1120.65);
        profesor2.calcularSueldoTotal();

        System.out.println(profesor1 + "\n\n" + profesor2);
    }

}
