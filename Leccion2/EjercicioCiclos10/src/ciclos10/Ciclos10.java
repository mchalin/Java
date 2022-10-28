package ciclos10;

import java.util.Scanner;

/**
 * Ejercicio 10: Pedir 10 numeros y escribir la suma total
 * hacerlo con la clase Scanner y JOptionPane
 * @author Maxi
 */
public class Ciclos10 {
    public static void main(String[] args) {
        int numero, resultado = 0;
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            numero = Integer.parseInt(entrada.nextLine());
            resultado += numero;
        }
        System.out.println("La suma de los 10 números ingresados es: " + resultado);
    }
}
