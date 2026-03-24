package mm.U7.PracticasExamen.ConcursoCanino;

import java.io.Serializable;

public class Propietario implements Serializable {
    private String nombre;
    private String apellidos;
    private int numSocio;
    private String pais;

    public Propietario(String nombre, String apellidos, int numSocio, String pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numSocio = numSocio;
        this.pais = pais;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + " (" + pais + ") - Socio: " + numSocio;
    }
}
