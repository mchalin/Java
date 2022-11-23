/*
Uso de la pabra Final
Esta palabra tiene diferentes significados dependiendo donde se aplique:
    variables: Evita cambiar el valor que almacena la variable.
    métodos: Evita que se modifique la definicion o el comportamiento de un método
        desde una subclase (hija)
    clases: Evita que se creen clases hijas
Otra caracteristica es que normalmente, cuando trabajamos con variables se 
combina con el modificador de acceso estatico para convertir una variable en 
una constante, es decir que no se puede modificar su valor, el ejemplo de esto 
es la clase Math en la cual todos sus atributos son de tipo static y final, 
es por esto que la varuable pi* se conoce como una constante.
 */
package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        final int miDni = 30564631;
        System.out.println("miDni = " + miDni);
        //miDni = 123; // No se puede hacer! 
        //Persona.CONSTANTE_AQUI = 9; // No se puede modificar
        System.out.println("Mi atributo constante es: " + Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); // No se puede asignar una nueva referencia
        persona1.setNombre("Maxi");
        System.out.println(persona1.getNombre());
        persona1.setNombre("Juani");
        System.out.println(persona1.getNombre());

    }
}
