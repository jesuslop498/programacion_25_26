package mm.U4.Entregables.Concierto;

import java.util.Arrays;

public class Festival {
    private Concierto[] concierto;

    public Festival() {
        this.concierto = new Concierto[0];
    }

    public Concierto[] getConcierto() {
        return concierto;
    }

    public void setConcierto(Concierto[] concierto) {
        this.concierto = concierto;
    }

    public void agregarConcierto(Concierto insertar) {
        concierto = Arrays.copyOf(concierto, concierto.length + 1);
        concierto[concierto.length - 1] = insertar;
    }


    public void mostrar_informacion() {
        System.out.println("Festival:");
        for (Concierto c : concierto) {
            System.out.println("- " + c.getNombre() + " | Fecha: " + c.getFecha());
        }
    }



}
