package caja;

/**
 * Proyecto Caja Ejercicio 1: Crear un proyecto según las especificaciones
 * mostradas a continuación La formula es volumen = ancho * alto * profundidad
 *
 * @author Maxi
 */
public class PruebaCaja {

    public static void main(String[] args) {
        int alto = 2, ancho = 3, profundidad = 6;

        //Usando constructor vacio
        Caja caja1 = new Caja();
        caja1.alto = alto;
        caja1.ancho = ancho;
        caja1.profundidad = profundidad;
        System.out.println("Volumen caja1: " + caja1.obtenerVolumen());

        // Usando constructor con argumentos
        Caja caja2 = new Caja(2, 4, 6);
        System.out.println("Volumen caja2: " + caja2.obtenerVolumen());

    }
}
