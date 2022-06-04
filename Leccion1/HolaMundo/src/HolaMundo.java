
import java.util.Scanner;

public class HolaMundo {
    
    public static void main(String[] args) {
        /*
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
         */

 /* //Clase 4 - Tipos primitivos
        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor mínimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del Byte: " + Byte.MAX_VALUE);

        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor mínimo del Short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo del Short: " + Short.MAX_VALUE);
        
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor mínimo del Integer: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo del Integer: " + Integer.MAX_VALUE);
        
        long numEnteroLong = 9223372036854775806L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor mínimo del Long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo del Long: " + Long.MAX_VALUE);
         
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de Float: " + Float.MIN_VALUE);
        System.out.println("El valor maximo de Float: " + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de Double: " + Double.MIN_VALUE);
        System.out.println("El valor maximo de Double: " + Double.MAX_VALUE);
         
        //Clase 5 Tipos primitivos parte 2
        //Inferencia de tipos con var y tipos primitivos
        var mumero = 20; // Las literales sin punto automaticamente se convierten en tipo int
        System.out.println("mumero = " + mumero);
        var numFloat = 10.9F; // Las literales con punto automaticamente se convierten en double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.9; 
        System.out.println("numDouble = " + numDouble);
         
        // Tipos primitivos Char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; // Indicamos a Java la asignacion con su valor unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; // Valor decimal del caracter unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; // Un caracter especial copiado y pegado
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);

        var varCaracter1 = '\u0024'; // Indicamos a Java la asignacion con su valor unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36; // Valor decimal del caracter unicode
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; // Un caracter especial copiado y pegado
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int varCaracterChar = 'm';
        System.out.println("varCaracterChar = " + varCaracterChar);
        char varCaracterChar1 = 109;
        System.out.println("varCaracterChar1 = " + varCaracterChar1);
        
      
        // Tipos primitivos Booleanos
        boolean varBool = true;
        System.out.println("varBool = " + varBool);
        
        if (varBool) {
            System.out.println("La bandera es verde.");
        }
        else {
            System.out.println("La bandera es roja.");
        }
        // Algoritmo ¿Es mayor de edad?
        var edad = 11; // Literal tener presente la inferencia de tipos
        var adulto = edad >= 18; // Expresión booleana
        if (adulto) {
            System.out.println("Es mayor de edad");
            
        } 
        else {
            System.out.println("Es menor de edad");    
        }
    
        //Conversión de tipos primitivos
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1415");
        System.out.println("valorPI = " + valorPI);
        
        // Pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad:");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad= " + edad);
        
        
        var entrada = new Scanner(System.in);
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        var fraseChar = "programadores".charAt(12);
        System.out.println("fraseChar = " + fraseChar);

        System.out.println("Digite un caracter:");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);

        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("Solucion de la suma = " + solucion);
        solucion = num1 - num2;
        System.out.println("Solucion de la resta= " + solucion);
        solucion = num1 * num2;
        System.out.println("Solucion de la multiplicación= " + solucion);
        solucion = num1 / num2;
        System.out.println("Solucion de la division= " + solucion);

        var solucion2 = 14.3 / num2;
        System.out.println("Solucion de la division= " + solucion2);

        solucion = num1 % num2;
        System.out.println("solucion = " + solucion);

        if (num1 % 2 == 0) {
            System.out.println("Es un número par.");
        } else {
            System.out.println("Es un número impar.");
        }
        
        int varNum1 = 5, varNum2 = 2;
        int varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);

        varNum1 += 1;
        System.out.println("varNum1 = " + varNum1);

        varNum1 -= 1;
        System.out.println("varNum1 = " + varNum1);
        varNum1 *= 2;
        System.out.println("varNum1 = " + varNum1);
        varNum1 /= 2;
        System.out.println("varNum1 = " + varNum1);
        varNum1 %= 2;
        System.out.println("varNum1 = " + varNum1);
        
        // operadores unarios, cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB); // El resultado es negativo
        // Operador de negacion
        var varC = true;
        var varD = !varC;
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD); // Invierte el valor de la variable booleana
        // Operadores unarios de incremento: PreIncremento
        var varE = 9;
        var varF = ++varE; // Simbolo antes de la variable, va a modificar el valor de varE
        // Se incrementa la variable y luego se utiliza su valor
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);
        // Operadores unarios de incremento: PostIncremento
        var varG = 3;
        var varH = varG++; // Simbolo luego de la variable, va a modificar el valor luego de que varH la absorba
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        // Operadores Unarios de decremento - PreDecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ); // Modifica la variable antes de utilizarla 
        //Operadores unarios de decremento - PostDecremento
        var varK = 5;
        var varL = varK--; //Modifica la variable luego de utilizarla
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);
        
        // Operadores de igualdad y relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = aNum == bNum;
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "hola";
        var cadenaB = "chauu";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);

        //Forma correcta de comprobar objetos tipo Sting
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        var gVar = aNum > bNum; // Se puede utilizar cualquier operador logico! 
        System.out.println("gVar = " + gVar);
        
        if (aNum % 2 == 0) {
            System.out.println("El nro aNum es par");
        } else {
            System.out.println("El nro aNum es impar");
        }
        
        var edad = 10;
        var adulto = 18;
        
        if (edad >= adulto) {
            System.out.println("Es mayor de edad! ");
        } else {
            System.out.println("Es menor de edad");
        }
       
        var valorA = 15;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        
        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else { 
            System.out.println("Esta fuera del rango establecido");
        }
        
        var vacaciones = false;
        var diaLibre = true;
        
        if (diaLibre || vacaciones) {
            System.out.println("El padre puede asistir al juego de su hijo");
        } else {
            System.out.println("El padre no puede asistir al juego de su hijo");
        }
        
        // Operador ternario
        var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Par" : "Impar";
        System.out.println("resultadoT = " + resultadoT);
         */
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
