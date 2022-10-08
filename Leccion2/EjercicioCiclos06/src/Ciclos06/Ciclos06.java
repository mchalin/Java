package Ciclos06;

import java.util.Scanner;

/**
 * Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos
 * los números introducidos
 *
 * @author Maxi
 */
public class Ciclos06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        System.out.print("Ingrese un número: ");
        int numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {            
            suma += numero;
            System.out.print("Ingrese otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Finaliza la ejecución por ingresar el nro 0. \nLa suma de todos los números introducidos es: " + suma);
    }
}
