package Ciclos09;

import javax.swing.JOptionPane;

/**
 * Ejercicio 9: Pedir el dia, mes y año de una fecha e indicar si la fecha es
 * correcta. Suponiendo que todos los meses son de 30 dias.
 *
 * @author Maxi
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el anio: "));
        if (dia != 0 && dia <= 30) {
            if (mes != 0 && mes <= 12) {
                if (anio != 0 && anio <= 2022) {
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es correcta: " + dia + "/" + mes + "/" + anio);
                } else {
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es incorrecta. Año incorrecto.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La fecha ingresada es incorrecta. Mes incorrecto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La fecha ingresada es incorrecta. Dia incorrecto.");
        }
    }
}
