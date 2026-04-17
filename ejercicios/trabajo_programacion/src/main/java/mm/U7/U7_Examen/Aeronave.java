package mm.U7.U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Aeronave implements Serializable {

    private static int contador = 0;

    private int id;
    private String nombre;
    private String fabricante;
    private TipoAeronave tipo;
    private int AlcanceMax;

    public Aeronave(String nombre, String fabricante, TipoAeronave tipo, int alcanceMax) {
        this.id = ++contador;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.tipo = tipo;
        AlcanceMax = alcanceMax;
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public TipoAeronave getTipo() {
        return tipo;
    }

    public void setTipo(TipoAeronave tipo) {
        this.tipo = tipo;
    }

    public int getAlcanceMax() {
        return AlcanceMax;
    }

    public void setAlcanceMax(int alcanceMax) {
        AlcanceMax = alcanceMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aeronave)) return false;
        Aeronave aeronave = (Aeronave) o;
        return nombre.equals(aeronave.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Aeronave{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", tipo=" + tipo +
                ", AlcanceMax=" + AlcanceMax +
                '}';
    }
}
