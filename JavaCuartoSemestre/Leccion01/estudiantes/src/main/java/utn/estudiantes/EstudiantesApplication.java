package utn.estudiantes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.estudiantes.modelo.Estudiantes2022;
import utn.estudiantes.servicio.EstudianteServicio;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

    @Autowired
    private EstudianteServicio estudianteServicio;
    private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

    // Devuelve el caracter de salto de linea en cualquier sistema operativo.
    String nl = System.lineSeparator();

    public static void main(String[] args) {
        logger.info("Iniciando la aplicación...");
        // Inicia la fábrica de Spring
        SpringApplication.run(EstudiantesApplication.class, args);
        logger.info("Aplicación finalizada.");
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(nl + "Ejecutando el método run de Spring..." + nl);
        var salir = false;
        var consola = new Scanner(System.in);
        while (!salir) {
            mostrarMenu();
            salir = ejecutarOpciones(consola);
            logger.info(nl);
        }
    }

    private boolean ejecutarOpciones(Scanner consola) {
        try {
            var opcion = Integer.parseInt(consola.nextLine());
            var salir = false;
            switch (opcion) {
                case 1 -> {
                    logger.info(nl + "Listado de estudiantes: " + nl);
                    List<Estudiantes2022> estudiantes = estudianteServicio.listarEstudiantes();
                    estudiantes.forEach(estudiante -> logger.info(estudiante.toString() + nl));
                }
                case 2 -> {
                    logger.info(nl + "Buscar estudiante: " + nl);
                    logger.info("Ingrese nro de id del estudiante: ");
                    var idEstudiante = Integer.parseInt(consola.nextLine());
                    Optional<Estudiantes2022> estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
                    if (estudiante.isPresent()) {
                        logger.info(estudiante.toString());
                    } else {
                        logger.info("No se encontró el estudiante con id:" + idEstudiante);
                    }
                }
                case 3 -> {
                    logger.info(nl + "Agregar estudiante: " + nl);
                    logger.info("Ingrese el nombre: ");
                    var nombre = consola.nextLine();
                    logger.info("Ingrese el apellido: ");
                    var apellido = consola.nextLine();
                    logger.info("Ingrese el telefono: ");
                    var telefono = consola.nextLine();
                    logger.info("Ingrese el email: ");
                    var email = consola.nextLine();
                    Estudiantes2022 estudiante = new Estudiantes2022();
                    estudiante.setNombre(nombre);
                    estudiante.setApellido(apellido);
                    estudiante.setTelefono(telefono);
                    estudiante.setEmail(email);
                    estudianteServicio.guardarEstudiante(estudiante);
                }
                case 4 -> {
                    logger.info(nl + "Modificar estudiante: " + nl);
                    logger.info("Ingrese el id: ");
                    var id = Integer.parseInt(consola.nextLine());
                    if (estudianteServicio.buscarEstudiantePorId(id).isPresent()) {
                        logger.info("Ingrese el nombre: ");
                        var nombre = consola.nextLine();
                        logger.info("Ingrese el apellido: ");
                        var apellido = consola.nextLine();
                        logger.info("Ingrese el telefono: ");
                        var telefono = consola.nextLine();
                        logger.info("Ingrese el email: ");
                        var email = consola.nextLine();
                        Estudiantes2022 estudiante = new Estudiantes2022(id, nombre, apellido, telefono, email);
                        estudianteServicio.guardarEstudiante(estudiante);
                    } else {
                        logger.info("No existe usuario con ese id.");
                    }
                }
                case 5 -> {
                    logger.info(nl + "Eliminar estudiante: " + nl);
                    logger.info("Ingrese el id: ");
                    var id = Integer.parseInt(consola.nextLine());
                    if (estudianteServicio.buscarEstudiantePorId(id).isPresent()) {
                        Estudiantes2022 estudiante = new Estudiantes2022();
                        estudiante.setIdestudiantes2022(id);
                        estudianteServicio.eliminarEstudiante(estudiante);
                    } else {
                        logger.info("No se encontró estudiante  con ese id.");
                    }
                }
                case 6 -> {
                    salir = true;
                }
            }
            return salir;
        } catch (RuntimeException e) {
            logger.info("Ocurrió un error.");
            return false;
        }
    }

    private void mostrarMenu() {
        logger.info(nl);
        logger.info("""
                ******* Sistema de estudiantes *******
                1. Listar estudiantes
                2. Buscar estudiante
                3. Agregar estudiante
                4. Modificar estudiante
                5. Eliminar estudiante
                6. Salir
                Elija una opción: """);
    }
}
