package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreescritura {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juani", 10);
        imprimir(empleado);
        //System.out.println(empleado.obtenerDetalles());

        Gerente gerente = new Gerente("Maxi", 10000, "Sistemas");
        imprimir(gerente);
        //System.out.println(gerente.obtenerDetalles());
    }

    // Polimorfismo, se suele ver solo en tiempo de ejecución
    // Gracias a la herencia, al recibir una referencia del tipo 
    // Empleado (padre), utiliza la clase de mayor escala
    // El objetivo es generar un método más genérico (no duplicarlo)
    public static void imprimir(Empleado empleado) {
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }

}
