/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor1;
import Estudiante.Estudiante;
/**
 *
 * @author USUARIO 2020
 */
public class Ejecutor {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Jonathan", 6.5, 8.3, 9.4);
        estudiante1.calcularPromedio();
        
        Estudiante estudiante2 = new Estudiante("Jossue", 5.8, 6.3, 9.9);
        estudiante2.calcularPromedio();
        
        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
    }
    
}
