package Operaciones;

/**
 *
 * @author Maxi
 */
public class Aritmetica {

    // Atributos
    int a;
    int b;

    //Metodos
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
