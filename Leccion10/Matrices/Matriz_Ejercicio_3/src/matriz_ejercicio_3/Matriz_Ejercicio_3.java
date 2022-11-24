/*
 Ejercicio 3: Crear y cargar una matriz de tamaño 3 x 3, transponerla y mostrarla
 */
package matriz_ejercicio_3;

import java.util.Scanner;

public class Matriz_Ejercicio_3 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Ingrese un valor entero para la posicion [" + i + "][" + j + "]");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Imprimiendo matriz original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Imprimiendo matriz transpuesta: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
