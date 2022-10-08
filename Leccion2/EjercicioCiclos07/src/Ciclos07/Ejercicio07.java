package Ciclos07;

import javax.swing.JOptionPane;

/**
 * Ejercicio 7: Pedir números hasta que se introduzca uno negativo y calcular la
 * media
 *
 * @author Maxi
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        int suma = 0, contador = 0;
        float promedio = 0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (numero >= 0) {
            suma += numero;
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "No se puede empezar con un número negativo :(");
        } else {
            promedio = (float) suma / contador;
            JOptionPane.showMessageDialog(null, "Finaliza la ejecución por ingresar el nro negativo [" + numero + "]. \nLa media de todos los números introducidos es: " + promedio);
        }
    }
}
