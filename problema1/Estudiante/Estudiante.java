/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiante;

/**
 *
 * @author USUARIO 2020
 */
public class Estudiante {

    private String nombre;
    private double materia1;
    private double materia2;
    private double materia3;
    private double promedio;

    public Estudiante(String nombre, double fisica, double matematica, double logica) {
        this.nombre = nombre;
        this.materia1 =fisica;
        this.materia2 = matematica;
        this.materia3 = logica;
    }
    
    

    @Override
    public String toString() {
        return String.format("Nombre: %s \nFisica: %.2f \nMatematica: %.2f \nLogica: %.2f \nPromedio: %.2f", nombre, materia1, materia2, materia3, promedio );
    }
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
     public void setMateria1(double materia1) {
        this.materia1 = materia1;
    }
    
    public void setMateria2(double materia2) {
        this.materia2 = materia2;
    }
    
    public void setMateria3(double materia3) {
        this.materia3 = materia3;
    }
    
    public void calcularPromedio() {
        this.promedio = (materia1 + materia2 + materia3) / 3;
    }

    
    public String getNombre() {
        return nombre;
    }

    public double getMateria1() {
        return materia1;
    }

    public double getMateria2() {
        return materia2;
    }

    public double getCalificacion3() {
        return materia3;
    }

    public double getPromedio() {
        return promedio;
    }

}

