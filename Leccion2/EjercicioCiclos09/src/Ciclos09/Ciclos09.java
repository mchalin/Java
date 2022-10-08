package Ciclos09;

import java.util.Scanner;

/**
 * Ejercicio 9: Pedir el dia, mes y año de una fecha e indicar si la fecha es
 * correcta. Suponiendo que todos los meses son de 30 dias.
 *
 * @author Maxi
 */
public class Ciclos09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el dia: ");
        int dia = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese el mes: ");
        int mes = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese el año: ");
        int anio = Integer.parseInt(entrada.nextLine());
        if (dia != 0 && dia <= 30) {
            if (mes != 0 && mes <= 12) {
                if (anio != 0 && anio <= 2022) {
                    System.out.println("La fecha ingresada es correcta: " + dia + "/" + mes + "/" + anio);
                } else {
                    System.out.println("La fecha ingresada es incorrecta. Año incorrecto.");
                }
            } else {
                System.out.println("La fecha ingresada es incorrecta. Mes incorrecto.");
            }
        } else {
            System.out.println("La fecha ingresada es incorrecta. Dia incorrecto.");
        }
        /*
        
        int dia = Integer.parseInt(entrada.nextLine());
        while (dia <= 0 || dia > 30) {
            System.out.print("Ingrese un día correcto (del 1 al 30): ");
            dia = Integer.parseInt(entrada.nextLine());
        }
        System.out.print("Ingrese el mes: ");
        int mes = Integer.parseInt(entrada.nextLine());
        while (mes <= 0 || mes > 12) {
            System.out.print("Ingrese un mes correcto (del 1 al 12): ");
            mes = Integer.parseInt(entrada.nextLine());
        }
        System.out.print("Ingrese el año: ");
        int anio = Integer.parseInt(entrada.nextLine());
        while (anio <= 0 || anio > 2022) {
            System.out.print("Ingrese un año correcto (del 1 al 2022): ");
            anio = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("La fecha ingresada es correcta: " + dia + "/" + mes + "/" + anio);
         */

    }
}
