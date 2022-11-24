/*
Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada
fila y columna
 */
package matriz_ejercicio_5;

import java.util.Scanner;

public class Matriz_Ejercicio_5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese cantidad de filas: ");
        int n = entrada.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        int m = entrada.nextInt();

        //Creamos la matriz
        int[][] matriz = new int[n][m];

        // Creamos el vector para las filas y columnas
        int[] filas = new int[n];
        int[] columnas = new int[m];
        System.out.println("");

        //Cargamos la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Ingrese valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
                //Cargamos el vector con los valores ingresados
                filas[i] += matriz[i][j];
                columnas[j] += matriz[i][j];
            }
        }

        System.out.println("\nMostrando la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\nMostrando suma de las filas: ");
        for (int i = 0; i < n; i++) {
            System.out.println("fila[" + (i + 1) + "] = " + filas[i]);
        }
        
        System.out.println("\nMostrando suma de las columnas: ");
        for (int i = 0; i < m; i++) {
            System.out.println("columna[" + (i + 1) + "] = " + columnas[i]);
        }
    }
}
