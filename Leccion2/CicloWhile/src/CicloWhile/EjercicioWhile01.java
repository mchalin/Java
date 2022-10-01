package CicloWhile;

/**
 *
 * @author Maxi
 */
public class EjercicioWhile01 {

    public static void main(String[] args) {
        // Ciclo While
        System.out.println("Ciclo while:");
        var conteo = 0; // Utilizando inferencia de tipos 
        while (conteo < 3) {
            System.out.println("conteo = " + conteo);
            conteo++;
        }

        // Ciclo Do While
        System.out.println("\nCiclo do while:");
        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);

        // Ciclo For
        System.out.println("\nCiclo for:");
        for (int i = 0; i < 3; i++) {
            System.out.println("El valor de i es: " + i);
        }
        
    }
}
