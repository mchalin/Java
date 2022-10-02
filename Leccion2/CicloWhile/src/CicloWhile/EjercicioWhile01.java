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
        //Etiquetas (Labels)
        
        // Ciclo For
        System.out.println("\nCiclo for (con break):");
        inicio: 
        for (int i = 0; i < 15; i++) {
            //System.out.println("El valor de i es: " + i);
            if (i % 2 == 0) {
                System.out.println("El nro " + i + " es par");
                break inicio; // Rompe el bucle
            }
        }
        
        // Ciclo For (break y continue)
        System.out.println("\nCiclo for (con continue):");
        inicio:
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                continue inicio; //Continua a la siguiente itereación
            }
            System.out.println("El nro " + i + " es par");
        }
    }
}
