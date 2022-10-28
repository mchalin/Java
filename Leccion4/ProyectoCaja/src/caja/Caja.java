package caja;

/**
 * Proyecto Caja Ejercicio 1: Crear un proyecto según las especificaciones
 * mostradas a continuación La formula es volumen = ancho * alto * profundidad
 *
 * @author Maxi
 */
public class Caja {

    // Atributos
    int ancho;
    int alto;
    int profundidad;

    // Constructores
    public Caja() { // Constructor 1 (vacio)
        System.out.println("Usando constructor 1");
    }

    public Caja(int ancho, int alto, int profundidad) { // Constructor 2 (con parametros) 
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
        System.out.println("Usando constructor 2");
    }

    // Metodo
    public int obtenerVolumen() {
        return ancho * alto * profundidad;
    }

}
