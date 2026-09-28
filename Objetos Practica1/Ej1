/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogramacion;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author cobri
 */
public class TallerProgramacion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaqueteLectura.GeneradorAleatorio.iniciar();
         //Paso 2: Declarar y crear el vector para 15 double 
        double[]vector = new double[5];
        double suma = 0;
        int cant = 0;
        //Paso 3: Ingresar 15 numeros (altura), cargarlos en el vector, 
        //        ir calculando la suma de alturas sobre variable auxiliar
        for (int i=0;i<5;i++){
            System.out.println("Ingrese la altura del jugador " + (i + 1));
            vector[i] += PaqueteLectura.Lector.leerDouble();
            suma += vector[i];
        };
        //Paso 4: Calcular el promedio de alturas e informar
        double prom = suma/5;
        System.out.printf("La altura promedio es: %.2f%n" , prom);
        //Paso 5: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        for (int i=0;i<5;i++){
            if (vector[i] > prom)
                cant++;
        };
        //Paso 6: Informar la cantidad.
        System.out.println("La cantidad de jugadores con alturas por encima del promedio fue de: " + cant);
    }
    
}
