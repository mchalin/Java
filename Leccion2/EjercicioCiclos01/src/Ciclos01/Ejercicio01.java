package Ciclos01;

import javax.swing.JOptionPane;

/**
 * Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso hasta
 * que se introduzca un número negativo
 *
 * @author Maxi
 */
public class Ejercicio01 {

    public static void main(String[] args) {
         int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "El número "+numero+" elevado al cuadrado es: " + cuadrado);
            //System.out.println("El número " + numero + " elevado al cuadrado es: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
        JOptionPane.showMessageDialog(null, "Salimos del programa al ingresar un número negativo (" + numero + ")");
        //System.out.println("\nSalimos del prrograma al ingresar un númer");
    }

}
