package Ciclos03;

import javax.swing.JOptionPane;

/**
 * Leer números hasta que se introduzca un 0 Para cada uno indicar si es par o
 * impar primero lo hacemos con la clase Scanner Luego con la clase JOptionPane
 *
 * @author Maxi
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número ingresado es par.");
            } else {
                JOptionPane.showMessageDialog(null, "El número ingresado es impar.");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        JOptionPane.showMessageDialog(null, "Se termina el programa, Ud ingresó el nro 0.");
    }
}
