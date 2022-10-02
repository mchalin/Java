package Ciclos05;

import java.util.Scanner;

/**
 * Ejercicio 5: Realizar un juego para adivinar un número, para ello generar un
 * número aleatorio de 0 al 100 y luego ir pidiendo un número y devolver si es
 * mayor o menor. El proceso termina cuando el usuario acierta el número e
 * indicamos cuantos intentos utilizó.
 *
 * @author Maxi
 */
public class Ciclos05 {

    public static void main(String[] args) {
        int numero, aleatorio, contador;
        Scanner entrada = new Scanner(System.in);
        aleatorio = (int) (Math.random() * 100); // Genera un número aleatorio entre 0 y 100
        //System.out.println("aleatorio = " + aleatorio);
        System.out.println("El sistema le indicará la cercanía del número que digite.");
        System.out.print("Ingrese un número entre 0 y 100: ");
        numero = Integer.parseInt(entrada.nextLine());
        contador = 1;
        while (numero != aleatorio) {
            if (numero < aleatorio) {
                System.out.println("El nro " + numero + " es menor que el aleatorio!");
            } else {
                System.out.println("El nro " + numero + " es mayor que el aleatorio!");
            }
            System.out.print("\nIngrese otro número entre 0 y 100: ");
            numero = Integer.parseInt(entrada.nextLine());
            contador++;
        }
        System.out.println("Felicidades! Encontró el numero secreto [" + numero + "] luego de " + contador + " intentos.\n");
    }
}
