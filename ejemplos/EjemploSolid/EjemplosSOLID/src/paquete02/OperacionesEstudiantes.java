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
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public void establecerPromedioEdadesCualitativo(){
        if(promedioEdades>=0 && promedioEdades <= 21){
            promedioEdadesCualitativo = "Promedio Adulto";
            
        }else{
            if(promedioEdades>21){
                promedioEdadesCualitativo = "Promedio Adulto";
            }
        }
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }
    
    public String obtenerPromedioEdadesCualitativo(){
        return promedioEdadesCualitativo;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Estudiante\n");
        for(Persona e: obtenerEstudiante()){
            cadena = String.format("%sNombre: %s",
                    cadena,
                    e.obtenerNombre());
            
            cadena = String.format("%s\n"
                    + "Promedio Edades: %.2f\n"
                    + "Promedio Edades Cualitativo: %s\n", 
                    cadena,
                    obtenerPromedioEdades(),
                    obtenerPromedioEdadesCualitativo());
        }
        return cadena;
        
    }
    
}
