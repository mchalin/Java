package Operaciones;

/**
 *
 * @author Maxi
 */
public class Aritmetica {

    // Atributos
    int a;
    int b;

    // Constructor (es un metodo especial)
    public Aritmetica() { // Constructor 1
        System.out.println("Se esta ejecutando el constructor número 1..");
    }

    public Aritmetica(int a, int b) { // Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando el constructor número 2..");
    }

    // Metodos
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        int resultado = a + b;
        return resultado;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        // return a + b;
        return this.sumarConRetorno();
    }
}
