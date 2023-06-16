package test;

// Importamos nuestra operación aritmética
import static aritmetica.Aritmetica.division;

// Importamos nuestra excepción
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 2);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrió un error (OperacionExcepcion): ");
            // Se conoce como la pila de excepciones
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error (Exception): ");
            // Se conoce como la pila de excepciones
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } 
        finally { // Existan o no excepciones, el finally siempre se va a ejecutar
            System.out.println("Se revisó la división entre 0");
        }
        System.out.println("La variable resultado es= " + resultado);
    }
}
