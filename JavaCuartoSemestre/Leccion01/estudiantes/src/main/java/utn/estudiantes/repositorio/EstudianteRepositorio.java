package utn.estudiantes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.estudiantes.modelo.Estudiantes2022;

// Al extender de JpaRepository no hace falta llamar a @Repository
//@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiantes2022, Integer> {

}
