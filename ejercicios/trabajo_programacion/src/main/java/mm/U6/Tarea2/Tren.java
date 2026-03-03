package mm.U6.Tarea2;

import java.io.Serializable;

public class Tren implements Serializable {
    private String modelo;
    private int capacidad;

    public Tren(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String toString() {
        return "Modelo: " + modelo + ", Capacidad: " + capacidad;
    }
}
