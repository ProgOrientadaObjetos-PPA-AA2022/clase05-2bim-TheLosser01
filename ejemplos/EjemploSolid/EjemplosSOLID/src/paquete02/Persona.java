/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;


import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String n, int e){
        nombre = n;
        edad = e;
    }

    Persona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerEdad(int n){
        edad = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerEdad(){
        return edad;
    }
    
}
