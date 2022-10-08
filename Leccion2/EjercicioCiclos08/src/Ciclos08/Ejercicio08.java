package Ciclos08;

import javax.swing.JOptionPane;

/**
 * Ejercicio 8: Pedir un número N y mostrar todos los nros del 1 al N.
 * 
 * @author Maxi
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        for (int i = 1; i <= numero; i++) {
            JOptionPane.showMessageDialog(null, i);
        }
    }
}
