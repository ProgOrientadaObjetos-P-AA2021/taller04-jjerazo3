/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor3;
import Cheque.Cheque;
/**
 *
 * @author USUARIO 2020
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Cheque cheque1 = new Cheque("Jonathan", "Banco de Loja", 123.45);
        cheque1.calcularComisionBanco();
        
        Cheque cheque2 = new Cheque("Jossue", "Banco Pichincha", 456.78);
        cheque2.calcularComisionBanco();
        
        System.out.println(cheque1 + "\n" + cheque2);
    }

}
