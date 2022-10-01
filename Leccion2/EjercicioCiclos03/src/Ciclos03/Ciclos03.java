package Ciclos03;

import java.util.Scanner;

/**
 *
 * Leer números hasta que se introduzca un 0
 * Para cada uno indicar si es par o impar
 * primero lo hacemos con la clase Scanner
 * Luego con la clase JOptionPane
 * @author Maxi
 */

public class Ciclos03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {            
            if (numero % 2 == 0) {
                System.out.println("El número ingresado es par.");
            } else {
                System.out.println("El número ingresado es impar.");
            }
            System.out.print("Digite un número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Se termina el programa, Ud ingresó el nro 0.");
    }
}
