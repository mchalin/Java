package test;

import domain.Persona;

public class PersonaPrueba {

    private static int contador;

    public static void main(String[] args) {
        Persona persona1 = new Persona("Maxi");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Juani");
        System.out.println("persona2 = " + persona2);
        Persona persona3 = new Persona("Lucia");
        System.out.println("persona3 = " + persona3);
        System.out.println(Persona.getContadorPersona());
        imprimir(persona1);
        imprimir(persona2);
        imprimir(persona3);
        contador = 10;
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());

    }

    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
        //Contador de impresiones
        contador++;
    }

    public int getContador() {
        imprimir(new Persona("Valeria"));
        return this.contador;
    }
}
