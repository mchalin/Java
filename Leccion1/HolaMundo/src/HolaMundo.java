
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        //Un clasico
        String saludo = "Hola Mundo!\n";
        System.out.println(saludo);

        //Variable tipo int
        int miVariable = 10;
        System.out.println("\nVariable tipo int..");
        System.out.println(miVariable);
        System.out.println("Le cambiamos el valor a la variable...");
        miVariable = 5;
        System.out.println(miVariable);

        //Variable tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println("\nVariable tipo String..");
        System.out.println(miVariableCadena);
        System.out.println("Le cambiamos el valor a la variable...");
        miVariableCadena = "Otro texto\n";
        System.out.println(miVariableCadena);

        //Var - Inferencia de tipos en Java
        var miVariableEntera2 = 10;
        System.out.println("miVariableEntera2 = " + miVariableEntera2); //soutv tabulador
        var miVariableCadena2 = "holix";
        System.out.println("miVariableCadena2 = " + miVariableCadena2); //soutv tabulador

        //Concatenar variables (siempre evalua el contexto de izquierda a derecha, toma el primer tipo de variable)
        var usuario = "Maximiliano";
        var titulo = "Técnico";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union); //soutv
        var a = 8;
        var b = 4;
        System.out.println(a + b);
        System.out.println(usuario + a + b);
        System.out.println(usuario + (a + b));

        //Ejercicio: Caracteres especiales con Java
        var nombre = "Valeria";
        System.out.println("\nNueva linea: \n" + nombre); // Diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre); // Diagonal inversa y letra t
        System.out.println("\t\t\t.:MENU:.");
        System.out.println("Retroceso: \b" + nombre); // Diagonal inversa y letra b
        System.out.println("Retroceso: \b\b\b\b\b\b\b");
        System.out.println("Comillas simples: \'" + nombre + "\'"); // Diagonal inversa y '
        System.out.println("Comillas dobles: \"" + nombre + "\""); // Diagonal inversa y "

        // Clase Scanner        
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nDigite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el título: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);

        //Ejercicio hecho en Laboratorio con Phyton
        System.out.println("\nEscribe el título del libro: ");
        var tituloLibro = entrada.nextLine();
        System.out.println("Escribe el autor del libro: ");
        var autorLibro = entrada.nextLine();
        System.out.println("El libro " + tituloLibro + " fue escrito por: " + autorLibro);

    }
}
