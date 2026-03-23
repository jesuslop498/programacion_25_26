package mm.U7.PracticasExamen.Filmafinnity;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Serializable {
    private static int contador = 0;

    private int id;
    private String nombre;
    private String apellido;
    private String nacionalidad;

    public Actor(String nombre, String apellido, String nacionalidad) {
        this.id = ++contador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;
        return nombre.equals(actor.nombre) && apellido.equals(actor.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
