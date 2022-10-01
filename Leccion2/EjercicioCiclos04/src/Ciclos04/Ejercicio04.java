/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclos04;

import javax.swing.JOptionPane;

/**
 *
 * @author Maxi
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        int contador = 1, numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));

        while (numero >= 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
            contador++;
        }
        JOptionPane.showMessageDialog(null, "Se termina el programa por haber ingresado un número negativo. \nUd ingresó "+contador+" números mientras duró la ejecución.");
    
    }
}
