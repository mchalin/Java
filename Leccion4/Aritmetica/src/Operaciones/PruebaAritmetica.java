package Operaciones;

/**
 *
 * @author Maxi
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
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
        
        
    }
}
