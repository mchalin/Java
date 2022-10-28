// Paso por referencia
package pasoporreferencia;

import Clases.Persona;

/**
 *
 * @author Maxi
 */
public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Maximiliano";
        System.out.println("persona1.nombre = " + persona1.nombre);
        cambiarValor(persona1, "Valeria");
        System.out.println("El cambio q hicimos en el nombre es: " + persona1.nombre);
        persona1 = cambiarElValor(persona1);
        System.out.println("persona1.nombre = " + persona1.nombre);
        // Persona persona2 = null;
        Persona persona2 = new Persona();
        persona2 = cambiarElValor(persona2);
    }

    public static void cambiarValor(Persona persona, String nombreNuevo) { // Paso por referencia
        persona.nombre = nombreNuevo;
    }

    public static Persona cambiarElValor(Persona persona) {
        if (persona == null) {
            System.out.println("El valor de persona es invalido: Null");
            return null;
        } else {
            persona.nombre = "Lucia";
            return persona;
        }
    }
}
