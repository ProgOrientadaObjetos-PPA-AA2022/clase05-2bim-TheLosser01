/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Victor", 19);
        Persona p2 = new Persona("Jaime", 20);
        Persona p3 = new Persona("Miguel", 18);
        
        ArrayList<Persona> listado = new ArrayList<>();
        listado.add(p1);
        listado.add(p2);
        listado.add(p3);
        
        OperacionesEstudiantes operaciones = new OperacionesEstudiantes();
        operaciones.establecerEstudiante(listado);
        operaciones.establecerPromedioEdades();
       
        
        System.out.printf("%s\n", operaciones);
        
       
       
      
        
        
    }
    }
