package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juani", 10);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Maxi", 10000, "Sistemas");
        determinarTipo(empleado1);

    }

    // Instance Of, se realiza en tiempo de ejecución
    // Revisa que tipo de dato esta apuntado en la memoria
    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println(empleado + ": Es de tipo Gerente");

            // Forma 1: 
            // El IDE realiza una conversion de tipo de Empleado a Gerente
            System.out.println("Forma 1: " + ((Gerente) empleado).getDepartamento());

            // Forma 2:
            // Tambien se puede asignar a un objeto de tipo Gerente
            Gerente gerente = (Gerente) empleado;
            System.out.println("Forma 2: " + gerente.getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println(empleado + ": Es de tipo Empleado");
        } else if (empleado instanceof Object) {
            System.out.println(empleado + ": Es de tipo Object");
        }

    }

}
