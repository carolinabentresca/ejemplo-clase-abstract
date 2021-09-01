/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;



public class Enfermero extends Personal{
    
    private String matricula;

    public Enfermero() {
    }

    public Enfermero(String matricula, String nombre, String apellido, double sueldo) {
        super(nombre, apellido, sueldo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public double getSueldo() {
        return sueldo;
    }

    @Override
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    } 

    //Heredamos los Métodos abstractos
    @Override
    public void sueldo() {
        System.out.println("*************");
        System.out.println("Sueldo de Enfermero: " + sueldo);
        System.out.println();
        System.out.println();
    }

    @Override
    public void datosCompletos() {
        System.out.println("****Datos Completos del Enfermero****");
        System.out.println("Matricula: " + matricula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println();
    }
    
}
