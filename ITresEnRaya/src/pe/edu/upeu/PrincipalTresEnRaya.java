/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumnos
 */
public class PrincipalTresEnRaya {
      public void ejecutarJuegoTreEnRaya(){
    IMetodosJuegoTresEnRaya obj=new MetodosJuegoTresEnRaya();
    
        BufferedReader teclado=new 
        BufferedReader(new InputStreamReader(System.in));        
        char opcion=' ';
        do{
            System.out.println("Ingrese un Valor");
            System.out.println("1=Jugar con Maquina");
            System.out.println("2=Jugar con Otra Persona");            
            try {
                opcion=teclado.readLine().charAt(0);                
                switch(opcion){
                    case '1' :{
                        //Por Implementar
                        break;
                    }
                    case '2' :{
                        obj.inicializarTablero();
                        obj.imprimirTableroResultado();
                        obj.jugarTresEnRaya();
                        break;
                    }
                    default:{
                       // System.out.println("Valor incorrecto");
                       // System.out.println("Ingrese Nuevamente el Valor");
                       // opcion=teclado.readLine().charAt(0);
                        break;
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al Lecturar Valor");
            }
            
        }while(opcion!='0');
    }
}
