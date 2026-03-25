package mm.U7.PracticasExamen.PreEntregable;

import java.io.Serializable;

public class Medicion implements Comparable<Medicion>, Serializable {
    private int temperatura;
    private int humedad;
    private int presion;

    public Medicion(int temperatura, int humedad, int presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public int getPresion() {
        return presion;
    }

    // Orden natural: temperatura ascendente
    @Override
    public int compareTo(Medicion otra) {
        return Integer.compare(this.temperatura, otra.temperatura);
    }

    // Para búsqueda de objetos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Medicion)) return false;
        Medicion m = (Medicion) obj;
        return this.temperatura == m.temperatura &&
                this.humedad == m.humedad &&
                this.presion == m.presion;
    }

    @Override
    public String toString() {
        return "[temp=" + temperatura + ", hum=" + humedad + ", pres=" + presion + "]";
    }
}
