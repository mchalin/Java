package domain;

import java.io.Serializable;

// Para considerarse una JavaBeans:
//      Debe implementar el Serializable 
//      Debe tener un constructor vacío
//      Getters y Setters de forma encapsulada (private)

public class Persona implements Serializable {

    private String nombre;
    private String apellido;

    // Requerido, constructor vacío
    public Persona() {
    }

    // No requerido, constructor con parámetros
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // Requerido, getters y setters
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // No requerido
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
}
