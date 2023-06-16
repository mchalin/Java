package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {

    public static int division(int numerador, int denominador){
        if (denominador == 0) {
            System.out.println("Lanza la excepción");
            throw new OperacionExcepcion("No se puede dividir por 0");
        }
        return numerador / denominador;
    }
}
