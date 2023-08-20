package UTN.presentacion;

import UTN.conexion.Conexion;
import UTN.datos.EstudianteDAO;
import UTN.dominio.Estudiante;

import java.util.Scanner;

public class SistemaEstudiantesApp {
    public static void main(String[] args) {

//
//        var conexion = Conexion.getConnection();
//        if (conexion != null) {
//            System.out.println("Conexión exitosa: " + conexion);
//        } else {
//            System.out.println("Ocurrió un error al conectarse.");
//        }

        Boolean salir = false;
        Scanner consola = new Scanner(System.in);

        EstudianteDAO estudianteDAO = new EstudianteDAO();
        while (!salir) {
            try {
                mostrarMenu();
                salir = ejecutarOpciones(consola, estudianteDAO);
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }


        }
    } // Fin main

    private static Boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion) {
            case 1 -> {
                var estudiantes = estudianteDAO.listar();
                System.out.println("Listado de estudiantes:");
                estudiantes.forEach(System.out::println);
            }
            case 2 -> {
                System.out.println("Ingrese el id_estudiante a buscar:");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDAO.buscarPorId(estudiante);
                if (encontrado) {
                    System.out.println("Estudiante encontrado: " + estudiante);
                } else {
                    System.out.println("Estudiante no encontrado: " + estudiante);
                }
            }
            case 3 -> {
                System.out.println("Agregar estudiante:");
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Teléfono: ");
                var telefono = consola.nextLine();
                System.out.print("Email: ");
                var email = consola.nextLine();

                var estudiante = new Estudiante(nombre,apellido,telefono,email);
                var agregado = estudianteDAO.agregarEstudiante(estudiante);
                if (agregado) {
                    System.out.println("Estudiante agregado correctamente: " + estudiante);
                } else {
                    System.out.println("El estudiante no se agregó: " + estudiante);
                }
            }
            case 4 -> {
                System.out.println("Modificar estudiante: ");
                System.out.print("Id: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Teléfono: ");
                var telefono = consola.nextLine();
                System.out.print("Email: ");
                var email = consola.nextLine();

                var estudiante = new Estudiante(idEstudiante, nombre,apellido,telefono,email);
                var modificado = estudianteDAO.modificarEstudiante(estudiante);
                if (modificado) {
                    System.out.println("Estudiante modificado correctamente: " + estudiante);
                } else {
                    System.out.println("El estudiante no se modificó: " + estudiante);
                }
            }
            case 5 -> {
                System.out.println("Eliminar estudiante: ");
                System.out.print("Id: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDAO.eliminarEstudiante(estudiante);
                if (eliminado) {
                    System.out.println("Estudiante eliminado correctamente: " + estudiante);
                } else {
                    System.out.println("El estudiante no se eliminó: " + estudiante);
                }
            }
            case 6 -> {
                System.out.println("Hasta luego!");
                salir = true;
            }
            default -> System.out.println("Opción no reconocida, ingrese otra opción");
        }
        return salir;
    }

    private static void mostrarMenu() {
        System.out.println("""
                ****** Sistema de Estudiantes ******
                1. Listar estudiantes
                2. Buscar estudiante
                3. Agregar estudiante
                4. Modificar estudiante
                5. Eliminar estudiante
                6. Salir
                Elige una opción: 
                """);
    } // Fin mostrarMenu()
} // Fin clase Main