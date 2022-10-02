package Clases;

/**
 *
 * @author Maxi
 */
public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona(); // Instanciamos la clase y llamamos al constructor
        persona1.nombre = "Maximiliano"; // Modificamos el atributo nombre del objeto
        persona1.apellido = "Chalin"; // Modificamos el atributo apellido del objeto
        persona1.obtenerInformacion(); // Llamamos al método

        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "Valeria";
        persona2.apellido = "Alvarez";
        persona2.obtenerInformacion();
    }
}
