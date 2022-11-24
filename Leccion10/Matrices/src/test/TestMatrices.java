package test;

import domain.Persona;
import java.util.Arrays;

public class TestMatrices {
    
    public static void main(String[] args) {
        int[][] edades = new int[3][2];
        System.out.println("edades = " + edades);
        edades[0][0] = 5; // LLenado manual
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 9;
        edades[2][1] = 3;
        System.out.println("Mostrando la matriz a manopla: ");
        System.out.println("edades[0][0] = " + edades[0][0]);
        System.out.println("edades[0][1] = " + edades[0][1]);
        System.out.println("edades[1][0] = " + edades[1][0]);
        System.out.println("edades[1][1] = " + edades[1][1]);
        System.out.println("edades[2][0] = " + edades[2][0]);
        System.out.println("edades[2][1] = " + edades[2][1]);
        
        System.out.println("Mostramos la matriz con ciclo for anidado");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades " + fila + "-" + col + ": " + edades[fila][col]);
            }
        }
        // Sintaxis clásica
        //String[][] frutas = new String[3][2];
        // Sintaxis simplificada
        String[][] frutas = {{"Limon", "Pomelo"}, {"Ciruela", "Kiwi"}, {"Banana", "Manzana"}};
//        for (int i = 0; i < frutas.length; i++) {
//            for (int j = 0; j < frutas[i].length; j++) {
//                System.out.println("frutas " + i + "-" + j + ": " + frutas[i][j]);
//            }
//        }
        imprimirMatriz(frutas);
        // Creamos una matriz de objetos
        Persona[][] personas = new Persona[2][3];
        // Asignamos valores a la matriz
        personas[0][0] = new Persona("Maxi");
        personas[0][1] = new Persona("Juan");
        personas[0][2] = new Persona("Lucia");
        personas[1][0] = new Persona("Vale");
        personas[1][1] = new Persona("ALberto");
        personas[1][2] = new Persona("Fernanda");
        imprimirMatriz(personas);
        
    }

    public static void imprimirMatriz(Object matriz[][]) {
        System.out.println("Imprimiendo matriz: " );
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz [" + i + "]-[" + j + "]: " + matriz[i][j].toString());
            }
        }
    }
    
}
