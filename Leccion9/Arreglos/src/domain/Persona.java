package domain;

public class Persona {

    //Atributo
    private String nombre;

    //Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
