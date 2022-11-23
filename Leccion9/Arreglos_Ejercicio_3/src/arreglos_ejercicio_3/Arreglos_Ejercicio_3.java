/*
Ejercicio 3: Leer 5 números, guardarlos en un arreglo 
y a continuacion mostrar la media de los números positivos, la media de los
negativos y contar el número de ceros.
 */
package arreglos_ejercicio_3;

import java.util.Scanner;

public class Arreglos_Ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Utilizamos un array para almacenar contadores y sumas de la siguiente forma: 
        // pos 0 = negativos
        // pos 1 = positivos
        // pos 2 = 0's
        int[] contador = new int[3];
        float[] sumas = new float[3];
        float[] listaNumeros = new float[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un valor para la posicion " + (i + 1) + ": ");
            listaNumeros[i] = entrada.nextFloat();
            if (listaNumeros[i] == 0) {
                contador[2]++;
            } else if (listaNumeros[i] < 0) {
                contador[0]++;
                sumas[0] += listaNumeros[i];

            } else {
                contador[1]++;
                sumas[1] += listaNumeros[i];
            }
        }
        if (contador[0] > 0) {
            System.out.println("\nLa media de los números negativos ingresados es: " + (sumas[0] / contador[0]));
        } else {
            System.out.println("\nNo se ingresaron números negativos, no se puede sacar promedio.");
        }
        if (contador[1] > 0) {
            System.out.println("La media de los números positivos ingresados es: " + (sumas[1] / contador[1]));

        } else {
            System.out.println("No se ingresaron números positivos, no se puede sacar promedio.");
        }
        if (contador[2] != 0) {
            System.out.println("La cantidad de 0's intruducidos es: " + contador[2]);

        } else {
            System.out.println("No se ingresaron 0's.");
        }

    }

}
