package mm.U7.PracticasExamen.ConcursoCanino;

import java.io.Serializable;

public class Perro implements Serializable {
    private String nombre;
    private int edad;
    private double peso;
    private boolean vacunado;
    private Propietario propietario;
    private String raza;

    public Perro(String nombre, int edad, double peso, boolean vacunado, Propietario propietario, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
        this.propietario = propietario;
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return nombre + " | Edad: " + edad + " | Peso: " + peso +
                " | Vacunado: " + vacunado + " | Dueño: " + propietario.getNombreCompleto();
    }
}
