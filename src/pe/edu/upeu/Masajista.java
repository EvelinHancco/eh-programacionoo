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
public class Masajista extends SeleccionFutbol{
    String titulacion;
    int anhosExperiencia;

    public Masajista(String titulacion, int anhosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anhosExperiencia = anhosExperiencia;
    }

    @Override
    public void entrenamiento(){
        System.out.println("da asistencia en el entrenamiento" +"(clase masajista)");
    }
}
