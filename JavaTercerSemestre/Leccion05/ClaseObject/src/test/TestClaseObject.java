package test;

import domain.Empleado;
import domain.Escritor;
import domain.Gerente;
import domain.TipoEscritura;

public class TestClaseObject {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Maxi", 10000);
        Empleado empleado2 = new Empleado("Maxi", 10000);
        System.out.println(empleado1);
                System.out.println(empleado2);

        // Los objetos, son iguales? 
        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }
                // Y su contenido? Es el mismo?

        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales de contenido");
        } else {
            System.out.println("Los objetos son distintos de contenido");
        }
            
        // Hashcode
        System.out.println("empleado1.hashCode() = " + empleado1.hashCode());
        System.out.println("empleado2.hashCode() = " + empleado2.hashCode());
        if (empleado1.hashCode() == empleado2.hashCode()) {        
            System.out.println("Los objetos tienen el mismo hashcode");
        } else {
            System.out.println("Los objetos tienen distintos hashcode");
        }
    }
}
