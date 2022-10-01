package Clase11Ejercicio2;

import java.util.Scanner;

/**
 * En un almacen se hace un 20% de descuento a los clientes cuya compra supere
 * los $ 100. Cual será la cantidad que pague una persona por su compra? 
 * 
 * @author Maxi
 */
public class Clase11Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor de su compra ($): ");
        var compra = Float.parseFloat(entrada.nextLine());
        if (compra > 100 ) {
            System.out.println("Deberá abonar un total de: $" + (compra-(compra*0.20)));
        } else {
            System.out.println("Deberá abonar sin descuento: $" + compra);
        }
    }
}