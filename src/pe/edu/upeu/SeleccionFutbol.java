/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu;

/**
 *
 * @author Alumnos
 */
public abstract class SeleccionFutbol {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad; 

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void viajar(){
        System.out.println("viajar (clase padre)");
    }
    
    public void concentrarse(){
        System.out.println("concentrarse(clase padre)");
    }
    public void Partidofutbol(){
    System.out.println("asiste al partido de futbol(clase padre)");
   
    }
     public abstract void entrenamiento();
     
     public int getId() {
        return id;
    }
     
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
