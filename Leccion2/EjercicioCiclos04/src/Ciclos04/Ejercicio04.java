package Ciclos04;

import javax.swing.JOptionPane;

/**
 *
 * @author Maxi
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        int contador = 1, numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

        while (numero >= 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
            contador++;
        }
        JOptionPane.showMessageDialog(null, "Se termina el programa por haber ingresado un número negativo. \nUd ingresó " + contador + " números mientras duró la ejecución.");

    }
}
