
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import pe.edu.upeu.Entrenador;
import pe.edu.upeu.Futbolista;
import pe.edu.upeu.Masajista;
import pe.edu.upeu.SeleccionFutbol;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumnos
 */
public class Principal {
    BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
    
   public int LeerTeclado(String dato){
        int datos=0;
       try {datos=Integer.parseInt(dato);
           
          
       } catch (Exception e) { System.out.println("error"+e.getMessage());}
       return datos;
       }
   public int LeerTeclado(double dato){
        int datos=0;
       try {datos=(int)dato;
           
          
       } catch (Exception e) { System.out.println("error"+e.getMessage());}
       return datos;
       }
   public int LeerTeclado(char dato){
        int datos=0;
       try {datos=Integer.parseInt(String.valueOf(dato));
           
          
       } catch (Exception e) { System.out.println("error"+e.getMessage());}
       return datos;
       }
       
   public static ArrayList<SeleccionFutbol>
            integrantes=new ArrayList<SeleccionFutbol>();
    public static void main(String[] arg){
   // inicio uso de sobrecarga  de metodo
        Principal cp=new Principal();
        Object dato=null;
        try {
            System.out.println("ingresa un dato :");
            dato=cp.teclado.readLine();
        } catch (Exception e) {
        }
        System.out.println(cp.LeerTeclado(dato.toString()));
        System.out.println(cp.LeerTeclado('5'));
        System.out.println(cp.LeerTeclado(45.15d));
        //fin del uso de sobrecarga del metodo
    SeleccionFutbol entrenador=new Entrenador(5421,1,"Vicente", "del bosque", 60);
    SeleccionFutbol futbolista=new Futbolista(6, "Interior derecho", 2, "Andres", "Iniesta", 30);
    SeleccionFutbol masajista=new Masajista("licenciado en fisioterapia",10,3,"Raul","Cosi",40);
    
    integrantes.add(entrenador);
    integrantes.add(futbolista);
    integrantes.add(masajista);
    
    for (SeleccionFutbol integrante: integrantes){
        System.out.println(integrante.getNombre()+""+integrante.getApellidos()+"->");
        integrante.concentrarse();
        
    
    }
    //Entenamiento
    System.out.println("______________________________________");
    for (SeleccionFutbol integrante: integrantes){
        System.out.println(integrante.getNombre()+""+integrante.getApellidos()+"->");
        integrante.entrenamiento();
        
    
    }
    
    //Partido de Futbol
    System.out.println("______________________________________");
    for (SeleccionFutbol integrante: integrantes){
        System.out.println(integrante.getNombre()+""+integrante.getApellidos()+"->");
        integrante.Partidofutbol();
        
    
    }
    }
}
   
   
    
