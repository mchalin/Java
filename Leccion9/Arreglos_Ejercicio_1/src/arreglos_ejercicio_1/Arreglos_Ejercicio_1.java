/*
Ejercicio 1: Leer 5 números, guardarlos en un arreglo 
y mostrarlos en el mismo orden introducidos
 */
package arreglos_ejercicio_1;

import java.util.Scanner;

public class Arreglos_Ejercicio_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] listaNumeros = new float[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un valor para la posicion " + (i + 1) + ": ");
            listaNumeros[i] = entrada.nextFloat();
        }
        for (float numero : listaNumeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\n");
    }

}
