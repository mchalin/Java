package ciclos10;

import javax.swing.JOptionPane;

/**
 * Ejercicio 10: Pedir 10 numeros y escribir la suma total hacerlo con la clase
 * Scanner y JOptionPane
 *
 * @author Maxi
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        int numero, resultado = 0;
        for (int i = 0; i < 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            resultado += numero;
        }
        JOptionPane.showMessageDialog(null, "La suma de los 10 números ingresados es: " + resultado);
    }
}
