package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {
        Persona[] personas = new Persona[3];
        personas[0] = new Persona("Maxi");
        personas[1] = new Persona("Juani");
        personas[2] = new Persona("Lucia");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas[" + i + "] = " + personas[i]);
        }

        //Trabajamos con arreglos en su forma resumida
        String[] frutas = {"bananas", "peras", "manzanas"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas[" + i + "] = " + frutas[i]);

        }
    }
}
