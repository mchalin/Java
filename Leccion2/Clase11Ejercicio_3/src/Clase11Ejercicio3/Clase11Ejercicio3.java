package Clase11Ejercicio3;

import java.util.Scanner;

/**
 * Leer dos números
 * Si son iguales, multiplicarlos
 * Si el primero es mayor que el segundo, que los reste
 * Y sino que los sume
 * 
 * @author Maxi
 */
public class Clase11Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var resultado = 0;
        System.out.print("Ingrese el primer número: ");
        var nro1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Ahora ingrese el segundo número: ");
        var nro2 = Integer.parseInt(entrada.nextLine());
        if (nro1 == nro2) { 
            System.out.print("Los dos números son iguales. Se multiplican: ");
            System.out.println(nro1*nro2);
        } else if (nro1 > nro2){
            System.out.print("El primer número es mayor que el segundo. Se restan: ");
            System.out.println(nro1-nro2);
        } else {
            System.out.print("El segundo número es mayor que el primero. Se suman: ");
            System.out.println(nro1+nro2);
        }
        
    }
}
