/*
Ejercicio 2: Leer 5 números, guardarlos en un arreglo 
y mostrarlos en el orden inverso
 */
package arreglos_ejercicio_2;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] listaNumeros = new float[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un valor para la posicion " + (i + 1) + ": ");
            listaNumeros[i] = entrada.nextFloat();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.print(listaNumeros[i] + " ");
        }
        System.out.println("\n");
    }

}
