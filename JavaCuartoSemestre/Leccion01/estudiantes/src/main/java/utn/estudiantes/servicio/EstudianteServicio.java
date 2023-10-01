package utn.estudiantes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.estudiantes.modelo.Estudiantes2022;
import utn.estudiantes.repositorio.EstudianteRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServicio implements IEstudianteServicio{

    // Inyecta automaticamente
    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiantes2022> listarEstudiantes() {
        List<Estudiantes2022> estudiantes = estudianteRepositorio.findAll();
        return estudiantes;
    }

    @Override
    public Optional<Estudiantes2022> buscarEstudiantePorId(Integer idEstudiante) {
        Optional<Estudiantes2022> estudiante = estudianteRepositorio.findById(idEstudiante);
        return estudiante;
    }

    // Guarda el estudiante, para una inserción o una actualización (dependiendo si el Estudiante lleva id)
    @Override
    public void guardarEstudiante(Estudiantes2022 estudiante) {
        estudianteRepositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Estudiantes2022 estudiante) {
        estudianteRepositorio.delete(estudiante);
    }
}
