package Ciclos05;

import javax.swing.JOptionPane;

/**
 * Ejercicio 5: Realizar un juego para adivinar un número, para ello generar un
 * número aleatorio de 0 al 100 y luego ir pidiendo un número y devolver si es
 * mayor o menor. El proceso termina cuando el usuario acierta el número e
 * indicamos cuantos intentos utilizó.
 *
 * @author Maxi
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        int numero, aleatorio, contador;
        aleatorio = (int) (Math.random() * 100); // Genera un número aleatorio entre 0 y 100
        //System.out.println("aleatorio = " + aleatorio);
        numero = Integer.parseInt(JOptionPane.showInputDialog("El sistema le indicará la cercanía del número que digite.\nIngrese un número entre 0 y 100: "));
        contador = 1;
        while (numero != aleatorio) {
            if (numero < aleatorio) {
                JOptionPane.showMessageDialog(null, "El nro " + numero + " es menor que el aleatorio!");
                //System.out.println("El nro " + numero + " es menor que el aleatorio!");
            } else {
                JOptionPane.showMessageDialog(null, "El nro " + numero + " es mayor que el aleatorio!");
                //System.out.println("El nro " + numero + " es mayor que el aleatorio!");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número entre 0 y 100: "));
            contador++;
        }
        JOptionPane.showMessageDialog(null, "Felicidades! Encontró el numero secreto [" + numero + "] luego de " + contador + " intentos.");
    }
}
