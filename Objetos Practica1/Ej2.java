/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

/**
 *
 * @author cobri
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        //Paso 2. iniciar el generador aleatorio     
	PaqueteLectura.GeneradorAleatorio.iniciar();
        //Paso 3. definir y crear la matriz de enteros de 5x5, iniciarla con nros. aleatorios 
        int [][] matriz = new int[5][5]; // Matriz
        int suma =0;    // Suma total
        int [] vectorSuma = new int[5];
        boolean seEncuentra = false;
        int valorRecibido;
        
        for (int i = 0; i<5;i++){
          for (int j=0;j<5;j++)
              matriz[i][j] = GeneradorAleatorio.generarInt(31);
        }
        //Paso 4. mostrar el contenido de la matriz en consola
        for (int i =0;i<5;i++){
            System.out.println();
            for (int j=0;j<5;j++)    
                System.out.print("("+i+ "," +j+")"+ matriz[i][j]+ " | ");
        }
        System.out.println("");
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        for (int c=0;c<5;c++){
            suma +=matriz[0][c];
        }
        System.out.println("La suma de los elementos de la fila 1 es: " + suma);
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
        for (int c=0;c<5;c++){
            int sumaC = 0;
            for (int f=0;f<5;f++)
                sumaC += matriz[f][c];
            vectorSuma[c] = sumaC;
        }
        for (int i=0;i<5;i++)
            System.out.print("("+i+")"+ vectorSuma[i]+"-->");
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. 
        //        En caso de encontrarse indique su ubicación (fila y columna)
        //        y en caso contrario imprima "No se encontró el elemento".
        System.out.println("");
        System.out.println("Ingrese el valor a buscar");
        valorRecibido = Lector.leerInt();
        int fila=0, columna = 0;
        for (int f=0;f<5;f++){
            for (int c=0;c<5;c++){
                if (valorRecibido == matriz[f][c]){
                    seEncuentra = true;
                    fila = f;
                    columna = c;
                }
            }
        }
        if (seEncuentra)
            System.out.println("Se encontro en la posicion"+"("+fila+","+columna+")");
        else
            System.out.println("No se encontro el elemento");
    
}
}
