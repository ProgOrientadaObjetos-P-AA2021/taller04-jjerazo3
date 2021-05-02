/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Docente;

/**
 *
 * @author USUARIO 2020
 */
public class Docente {
    
    String ci;
    String nombre;
    String apellido;
    double sueldoBasico;
    double sueldoTotal;

    public Docente(String ci, String nombre, String apellido, double sueldoBasico) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }
    
    public void setId(String ci) {
        this.ci = ci;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return ci;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void calcularSueldoTotal() {
        this.sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        return String.format("CI: %s \nNombre: %s \nApellido: %s \nSueldo Básico: %.2f \nSueldo Total: %.2f", ci, nombre, apellido, sueldoBasico, sueldoTotal);
    }
}

