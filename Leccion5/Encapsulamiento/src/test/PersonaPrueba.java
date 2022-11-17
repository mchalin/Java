package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Max", 13000, true);

        // Modificar a traves de los métodos
        System.out.println("El nombre de la persona es: " + persona1.getNombre());
        persona1.setNombre("Vale");
        // Al estar encapsulado no se puede modificar de la siguiente manera
        // persona2.nombre = "Vale";
        System.out.println("El nombre de la persona modificado es: " + persona1.getNombre());
        System.out.println("EL sueldo de la persona es: $" + persona1.getSueldo());
        System.out.println("Es eliminado? " + persona1.isEliminado());

        // Tarea: crear otro objeto de tipo Persona, asignar los valores de manera inicial
        // e imprimir, luego modificar sus valores y volver a imprimir
        Persona persona2 = new Persona("Juani", 200, false);
        System.out.println("persona2.nombre: " + persona2.getNombre());
        System.out.println("persona2.sueldo: $" + persona2.getSueldo());
        System.out.println("persona2.eliminado?: " + persona2.isEliminado());
        persona2.setNombre("Lucia");
        persona2.setSueldo(250.50);
        persona2.setEliminado(true);
        System.out.println("(modificado) persona2.nombre: " + persona2.getNombre());
        System.out.println("(modificado) persona2.sueldo: $" + persona2.getSueldo());
        System.out.println("(modificado) persona2.eliminado?: " + persona2.isEliminado());
        System.out.println(persona2.toString());
        System.out.println(persona1);
        System.out.println(persona2);
    }

}
