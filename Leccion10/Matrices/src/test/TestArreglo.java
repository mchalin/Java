package test;

public class TestArreglo {
    
    public static void main(String[] args) {
        int[] edades = new int[3]; // Instanciamos un objeto del tipo arreglo
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades[0] = " + edades[0]);
        edades[1] = 15;
        System.out.println("edades[1] = " + edades[1]);
        edades[2] = 33;
        System.out.println("edades[2] = " + edades[2]);
        //edades[3] = 22; // Fuera de rango, error en tiempo de ejecucion
        
        System.out.println("Mostramos los datos con un for");
        for (int i = 0; i < edades.length; i++) {
            int edad = edades[i];
            System.out.println("edad = " + edad);
            
        }
        
        
    }
    
}
