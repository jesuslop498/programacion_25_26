package mm.U8.Tarea5;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Futbolista {

    private int dorsal;
    private String nombre;
    private ArrayList<String> demarcaciones;
    private String equipo;

    public Futbolista(int dorsal, String nombre, ArrayList<String> demarcaciones, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcaciones = demarcaciones;
        this.equipo = equipo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getDemarcaciones() {
        return demarcaciones;
    }

    public String getEquipo() {
        return equipo;
    }


    @Override
    public String toString() {
        return "{"
                + "\"dorsal\":" + dorsal + ","
                + "\"nombre\":\"" + nombre + "\","
                + "\"demarcaciones\":" + demarcaciones + ","
                + "\"equipo\":\"" + equipo + "\""
                + "}";
    }
}