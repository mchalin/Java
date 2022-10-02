package Ciclos02;

import java.util.Scanner;

/**
 * Ejercicio 2: Leer un número e indicar si es negativo o positivo. El proceso
 * se repite hasta que se introduzca un 0.
 *
 * @author Maxi
 */
public class Ciclos02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El número ingresado [" + numero + "] es positivo.");
            } else {
                System.out.println("El número ingresado [" + numero + "] es negativo.");
            }
            System.out.print("Ingrese otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Se finaliza el programa por ingresar el número [0].");
    }
}
