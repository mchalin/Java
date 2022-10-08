package Ciclos06;

import javax.swing.JOptionPane;

/**
 * Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos
 * los números introducidos
 *
 * @author Maxi
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        int suma = 0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (numero != 0) {
            suma += numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro nro: "));
        }
        JOptionPane.showMessageDialog(null, "Finaliza la ejecución por ingresar el nro 0. \nLa suma de todos los números introducidos es: " + suma);
    }
}
