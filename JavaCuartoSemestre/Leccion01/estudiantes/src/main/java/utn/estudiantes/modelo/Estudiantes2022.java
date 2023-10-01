package utn.estudiantes.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity

// boilerplate (codigo repetitivo) UTILIZAMOS LOMBOK
@Data // Getters y Settters
@NoArgsConstructor // Constructor vacio
@AllArgsConstructor // Constructor con todos los argumentos
@ToString // Método toString()

public class Estudiantes2022 {
    // Id, llave autoincrementable
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idestudiantes2022;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
