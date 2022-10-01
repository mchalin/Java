package Clase11Ejercicio1;

import java.util.Scanner;

/**
 * Determinar si un alumno aprueba o reprueba un curso, sabiendo que su promedio
 * de tres calificaciones es mayor o igual a 70. Reprueba caso contrario
 *
 * @author Maxi
 */
public class Clase11Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese valor de la primer nota: ");
        var nota1 = Float.parseFloat(entrada.nextLine());
        System.out.print("Ahora la segunda nota: ");
        var nota2 = Float.parseFloat(entrada.nextLine());
        System.out.print("Por último, la tercer nota: ");
        var nota3 = Float.parseFloat(entrada.nextLine());
        var promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >= 70) {
            System.out.println("El alumno tiene un promedio de " + promedio + " . Felicitaciones, está aprobado!");
        } else {
            System.out.println("El alumno está desaprobado! Tiene un promedio de " + promedio + ".");
        }

    }
}
