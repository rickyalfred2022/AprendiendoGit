
package Ej_con_Matriz;

import java.util.Scanner;

/* En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de
 secundaria.  Cada fila corresponde a las notas y al promedio de cada alumno.
Hacer un programa que permita cargar en las 3 posiciones (columnas) de cada
fila, las notas de cada alumno y en la 4ta posición mostrar el promedio de
esas notas.  Una vez realizado los cálculos, mostrar las 3 notas de cada alumno
y el promedio correspondiente recorriendo la matriz.
 */
public class EjConMatriz {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Double matriz[][] = new Double[4][4];
        
       Double acum = 0.0;
        
        
        for(int f = 0; f < 4; f++){
            
            for(int c = 0; c < 3; c++){
            
                System.out.println("Ingrese nota alumno: "+f);
                matriz[f][c] = teclado.nextDouble();
                acum = acum + matriz[f][c];
                matriz[f][3] = acum/3;
            }
            
            acum = 0.0;
        }
        
        for(int f = 0; f < 4; f++){
            
            System.out.println("Las notas del alumno: "+f+" son:");
            
            for(int c = 0; c < 3; c++){
                
                 System.out.println(matriz[f][c]);  
             
            }     
                 
                 System.out.println("y el promedio es: ");
                 System.out.println(matriz[f][3]);
            
            
            System.out.println("-------------------------------");
        }    
            
            
            
            
    }

}
