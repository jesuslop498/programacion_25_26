package mm.U5.Lopez_Hidalgo_U5_Sevilla;

import java.util.Arrays;

public class Caseta {
    private int id;
    private ActuacionArtistica[] actuaciones = new ActuacionArtistica[4];
    private int cont = 0;

    public Caseta(int id) {
        this.id = id;
    }

    public void addActuacion(ActuacionArtistica act) {
        actuaciones[cont++] = act;
    }

    public void deleteActuacion(ActuacionArtistica act) {
        int contador = 0;

        ActuacionArtistica[] nuevo = new ActuacionArtistica[actuaciones.length - 1];

        for (int i = 0; i < actuaciones.length; i++) {
            if (actuaciones[i] == act) {
                break;
            } else {
                nuevo[contador++] = actuaciones[i];
            }
        }

        actuaciones = nuevo;
    }

    public int getId() {
        return id;
    }

    public ActuacionArtistica[] getActuaciones() {
        return actuaciones;
    }

    public int getCont() {
        return cont;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setActuaciones(ActuacionArtistica[] actuaciones) {
        this.actuaciones = actuaciones;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }


}
