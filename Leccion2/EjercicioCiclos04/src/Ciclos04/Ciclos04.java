package Ciclos04;

import java.util.Scanner;

/**
 *
 * Pedir números hasta que se teclee uno negativo, y mostrar cuantos números se
 * han introducido. Lo hacemos primero con la clase Scanner Luego lo hacemos con
 * la clase JOptionPane
 *
 * @author Maxi
 */
public class Ciclos04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1, numero;
        System.out.print("Ingrese un número: ");
        numero = Integer.parseInt(entrada.nextLine());

        while (numero >= 0) {
            System.out.print("Ingrese otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
            contador++;
        }
        System.out.println("Se termina el programa por haber ingresado un número negativo. \nUd ingresó " + contador + " números mientras duró la ejecución.");
    }

}
