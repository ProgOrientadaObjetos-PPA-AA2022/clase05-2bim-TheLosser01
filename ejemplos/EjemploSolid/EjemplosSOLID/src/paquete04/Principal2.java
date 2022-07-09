/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Principal2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese en numero de tranporte que desea ingresar:\n");
        System.out.println("1)Bus");
        System.out.println("2)Taxi");
        System.out.println("3)Aereo");
        System.out.println("4)Marino");
        int t = entrada.nextInt();
        if(t > 4 || t < 1){
            System.out.println("Opcion Incorrecta");
        }else{
            switch(t){
                case 1:
                    entrada.nextLine();
                    System.out.println("Bus");
                    System.out.println("Tarifa: ");
                    double tarifa = entrada.nextDouble();
                    
                    TransporteBus b1 = new TransporteBus();
                    b1.establecerTarifa();
                    
                    System.out.printf("%s\n", b1);
                    
                    break;
                case 2:
                    System.out.println("Taxi");
                    System.out.println("Tarifa: ");
                    double tarifa1 = entrada.nextDouble();
                    
                    TransporteTaxi t1 = new TransporteTaxi();
                    t1.establecerTarifa();
                    
                    System.out.printf("%s\n", t1);
                    break;
                case 3:
                    System.out.println("Aereo");
                    System.out.println("Tarifa: ");
                    double tarifa2 = entrada.nextDouble();
                    
                    TransporteAereo a1 = new TransporteAereo();
                    a1.establecerTarifa();
                    
                    System.out.printf("%s\n", a1);
                    break;
                case 4:
                    System.out.println("Marino");
                    System.out.println("Tarifa: ");
                    double tarifa3 = entrada.nextDouble();
                    
                    TransporteMaritimo m1 = new TransporteMaritimo();
                    m1.establecerTarifa();
                
                    
                
                    
            }
           
        }
    }
    
    
}
