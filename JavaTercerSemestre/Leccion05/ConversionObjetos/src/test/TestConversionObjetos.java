package test;

import domain.Empleado;
import domain.Escritor;
import domain.Gerente;
import domain.TipoEscritura;

public class TestConversionObjetos {

    public static void main(String[] args) {

        // Creamos un objeto tipo Empleado
        Empleado empleado;

        // Referencia de objetos de clase hija, hacia clase padre 
        // Escritor -> Empleado
        empleado = new Escritor("Maxi", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        // Gracias al polimorfismo, obtenerDetalles() muestra datos de clase hija
        System.out.println(empleado.obtenerDetalles());

        // Downcasting
        // Al crear un objeto tipo Empleado, necesitamos convertirlo a tipo
        // Escritor para acceder a sus métodos
        // Primera forma: 
        System.out.println(((Escritor) empleado).getTipoEscritura());

        // Segunda forma:
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoEscritura());
        
        // Upcasting
        Empleado empleado2 = escritor;
        System.out.println("empleado2 = " + empleado2);
        System.out.println(empleado2.obtenerDetalles());


    }
}
