package mm.U7.PracticasExamen.ServicioEmpleo;

import java.io.Serializable;

public class Trabajador implements Comparable<Trabajador>, Serializable {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String formacion;

    public Trabajador(String dni, String nombre, String apellidos, int edad, String formacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.formacion = formacion;
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public int getEdad() { return edad; }

    @Override
    public int compareTo(Trabajador o) {
        int cmp = this.apellidos.compareTo(o.apellidos);
        if (cmp == 0) {
            cmp = this.nombre.compareTo(o.nombre);
        }
        return cmp;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Trabajador)) return false;
        Trabajador t = (Trabajador) o;
        return this.dni.equals(t.dni);
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (" + edad + ")";
    }
}
