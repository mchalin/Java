package utn.estudiantes.servicio;

import utn.estudiantes.modelo.Estudiantes2022;

import java.util.List;
import java.util.Optional;

public interface IEstudianteServicio  {
    public List<Estudiantes2022> listarEstudiantes();
    public Optional<Estudiantes2022> buscarEstudiantePorId(Integer idEstudiante);
    public void guardarEstudiante(Estudiantes2022 estudiante);
    public void eliminarEstudiante(Estudiantes2022 estudiante);
}
