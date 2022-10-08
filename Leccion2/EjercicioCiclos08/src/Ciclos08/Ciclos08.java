package Ciclos08;

import java.util.Scanner;

/**
 * Ejercicio 8: Pedir un número N y mostrar todos los nros del 1 al N.
 * 
 * @author Maxi
 */
public class Ciclos08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = Integer.parseInt(entrada.nextLine());
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
