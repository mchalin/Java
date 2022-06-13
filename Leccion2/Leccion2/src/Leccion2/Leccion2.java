package Leccion2;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class Leccion2 {

    public static void main(String[] args) {
//        var condicion = true;
//        if (condicion) {
//            System.out.println("Condicion verdadera."); // Condicional simple
//        } else {
//            System.out.println("Condicion falsa."); // Condicional doble
//        }
//        var num = 5;
//        var numeroTexto = "Número desconocido";
//        if (num == 1) {
//            numeroTexto = "Número uno";
//        } else if (num == 2) {
//            numeroTexto = "Número dos";
//        } else if (num == 3) {
//            numeroTexto = "Número tres";
//        } else if (num == 4) {
//            numeroTexto = "Número cuatro";
//        } else {
//            numeroTexto = "Número no encontrado.";
//        }
//        System.out.println("numeroTexto = " + numeroTexto);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 4:");
        var seleccion = Integer.parseInt(entrada.nextLine());
        var numeroTexto = "Número desconocido";
        switch (seleccion) {
            case 1:
                numeroTexto = "Número uno";
                break;
            case 2:
                numeroTexto = "Número dos";
                break;
            case 3:
                numeroTexto = "Número tres";
                break;
            case 4:
                numeroTexto = "Número cuatro";
                break;
            default:
                numeroTexto = "Número no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
