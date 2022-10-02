package Ciclos02;

import javax.swing.JOptionPane;

/**
 * Ejercicio 2: Leer un número e indicar si es negativo o positivo. El proceso
 * se repite hasta que se introduzca un 0.
 * Ahora realizarlo utilizando JOptionPane
 *
 * @author Maxi
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        //System.out.print("Ingrese un número: ");
        //numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El número ingresado [" + numero + "] es positivo.");
                //System.out.println("El número ingresado [" + numero + "] es positivo.");
            } else {
                JOptionPane.showMessageDialog(null, "El número ingresado [" + numero + "] es negativo.");
                //System.out.println("El número ingresado [" + numero + "] es negativo.");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
            //System.out.print("Ingrese otro número: ");
            //numero = Integer.parseInt(entrada.nextLine());
        }
        JOptionPane.showMessageDialog(null, "Se finaliza el programa por ingresar el número [0].");
        //System.out.println("Se finaliza el programa por ingresar el número [0].");
    }
}
