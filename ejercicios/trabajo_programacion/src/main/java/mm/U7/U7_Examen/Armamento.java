package mm.U7.U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Armamento implements Serializable {
    private static int contador = 0;

    private int id;
    private String nombre;
    private String descriptivo;
    private int municion;
    private int AlcanceKm;

    public Armamento(String nombre, String descriptivo, int municion, int alcanceKm) {
        this.id = ++contador;
        this.nombre = nombre;
        this.descriptivo = descriptivo;
        this.municion = municion;
        AlcanceKm = alcanceKm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescriptivo() {
        return descriptivo;
    }

    public void setDescriptivo(String descriptivo) {
        this.descriptivo = descriptivo;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public int getAlcanceKm() {
        return AlcanceKm;
    }

    public void setAlcanceKm(int alcanceKm) {
        AlcanceKm = alcanceKm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Armamento)) return false;
        Armamento armamento = (Armamento) o;
        return nombre.equals(armamento.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Armamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descriptivo='" + descriptivo + '\'' +
                ", municion=" + municion +
                ", AlcanceKm=" + AlcanceKm +
                '}';
    }
}
