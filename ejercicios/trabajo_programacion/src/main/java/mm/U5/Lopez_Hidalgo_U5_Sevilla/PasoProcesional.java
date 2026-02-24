package mm.U5.Lopez_Hidalgo_U5_Sevilla;

import java.util.Arrays;

public class PasoProcesional implements programar, procesionar{
    private int id;
    private ActuacionArtistica[] actuacion;
    private String nombreHermandad;
    private int numCosataleros;

    public PasoProcesional(int id, String nombreHermandad, int numCosataleros) {
        this.id = id;
        this.actuacion = new ActuacionArtistica[0];
        this.nombreHermandad = nombreHermandad;
        this.numCosataleros = numCosataleros;
    }

    public void addActuacion(ActuacionArtistica act) {
        actuacion = Arrays.copyOf(actuacion, actuacion.length + 1);
        actuacion[actuacion.length - 1] = act;
    }

    public void deleteActuacion(ActuacionArtistica act) {
        int contador = 0;

        ActuacionArtistica[] nuevo = new ActuacionArtistica[actuacion.length - 1];

        for (int i = 0; i < actuacion.length; i++) {
            if (actuacion[i] == act) {
                break;
            } else {
                nuevo[contador++] = actuacion[i];
            }
        }

        actuacion = nuevo;
    }

    public int getId() {
        return id;
    }

    public ActuacionArtistica[] getActuacion() {
        return actuacion;
    }

    public String getNombreHermandad() {
        return nombreHermandad;
    }

    public int getNumCosataleros() {
        return numCosataleros;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setActuacion(ActuacionArtistica[] actuacion) {
        this.actuacion = actuacion;
    }

    public void setNombreHermandad(String nombreHermandad) {
        this.nombreHermandad = nombreHermandad;
    }

    public void setNumCosataleros(int numCosataleros) {
        this.numCosataleros = numCosataleros;
    }


    @Override
    public void programar() {
        System.out.println("La actuación de " + getNombreHermandad() + " tiene horario fijo de procesión");
    }

    @Override
    public void procisionar() {
        System.out.println("El paso de la hermandad " + getNombreHermandad() +  " está procesionando con " + getNumCosataleros() +  " costaleros");
    }
}
