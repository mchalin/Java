package Operaciones;

/**
 *
 * @author Maxi
 */
public class PruebaAritmetica {

    public static void main(String[] args) {
        // El alcance de las variables es LOCAL
        // Se guardan en la memoria STACK
        int a = 10;
        int b = 7;
        miMetodo();

        // Para almacenar un objeto o sus atributos se utiliza la memoria HEAP
        Aritmetica aritmetica1 = new Aritmetica();

        aritmetica1.a = 3;
        aritmetica1.b = 7;

        System.out.println("sumarNumeros()");
        aritmetica1.sumarNumeros();

        System.out.println("Con retorno");
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        System.out.println("Usando argumentos");
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado usando argumentos = " + resultado);

        System.out.println("aritmetica1.a = " + aritmetica1.a);
        System.out.println("aritmetica1.b = " + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2.a = " + aritmetica2.a);
        System.out.println("aritmetica2.b = " + aritmetica2.b);

        // aritmetica1 = null; // Nunca utilizar esto, no se debe hacer
        // System.gc(); // Metodo para limpiar residuos, es pesado, no utilizar
        Persona persona = new Persona("Maxi", "Chalin");
        System.out.println("persona = " + persona);
        System.out.println(persona.nombre + " " + persona.apellido);
    }

    // Modularidad, creamos un nuevo metodo
    public static void miMetodo() {
        // a = 10; // No puede utilizar variables del main
        System.out.println("Este es miMetodo");

    }
}
// Creamos una nueva clase Persona

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) { // Constructor
        super(); // Llamada al constructor de la clase Padre Object
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto Persona usando this: " + this);
    }
}

class Imprimir {

    public Imprimir() {
        super(); //El constructor de la clase padre, para reservar memoria
    }

    public void imprimir(Persona persona) {
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this): " + this);
    }
}
