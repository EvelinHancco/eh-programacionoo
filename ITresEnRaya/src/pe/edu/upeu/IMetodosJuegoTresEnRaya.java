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
public interface IMetodosJuegoTresEnRaya {
    public void inicializarTablero();
    
    public String Saludo();
    public void imprimirTableroResultado();
    public boolean comprobarGanador(int valor_jugador);
    public void jugarTresEnRaya();
}
