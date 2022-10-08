package Ciclos07;

import java.util.Scanner;

/**
 * Ejercicio 7: Pedir números hasta que se introduzca uno negativo y calcular la
 * media
 *
 * @author Maxi
 */
public class Ciclos07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0, contador = 0;
        float promedio = 0;
        System.out.print("Ingrese un número: ");
        int numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {
            suma += numero;
            contador++;
            System.out.print("Ingrese otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if (contador == 0) {
            System.out.println("No se puede empezar con un número negativo :(");
        } else {
            promedio = (float) suma / contador;
            System.out.println("Finaliza la ejecución por ingresar el nro negativo [" + numero + "]. \nLa media de todos los números introducidos es: " + promedio);
        }
    }

}
