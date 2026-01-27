package mm.U4.Entregables.ObraVivienda;

import java.util.Arrays;
import java.util.Calendar;

public class Obra {
    private Vivienda intervencion;
    private Material[] materiales;
    private ManoDeObra manoDeObra;
    private Estancias estancias;
    private Calendar fecha;

    public Obra(Vivienda intervencion, ManoDeObra manoDeObra, Estancias estancias, Calendar fecha) {
        this.intervencion = intervencion;
        this.materiales = new Material[0];
        this.manoDeObra = manoDeObra;
        this.estancias = estancias;
        this.fecha = fecha;
    }

    public void addMaterial (Material material) {
        materiales = Arrays.copyOf(materiales, materiales.length + 1);
        materiales[materiales.length - 1] = material;
    }

    public void eliminarMaterial(int pos) {
        if (pos < 0 || pos >= materiales.length) {
            return;
        }

        Material[] nuevo = new Material[materiales.length - 1];
        int cont = 0;

        for (int i = 0; i < materiales.length; i++) {
            if (i != pos) {
                nuevo[cont++] = materiales[i];
            }
        }

        materiales = nuevo;
    }

    public void setIntervencion(Vivienda intervencion) {
        this.intervencion = intervencion;
    }

    public void setMateriales(Material[] materiales) {
        this.materiales = materiales;
    }

    public void setManoDeObra(ManoDeObra manoDeObra) {
        this.manoDeObra = manoDeObra;
    }

    public void setEstancias(Estancias estancias) {
        this.estancias = estancias;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Vivienda getIntervencion() {
        return intervencion;
    }

    public Material[] getMateriales() {
        return materiales;
    }

    public ManoDeObra getManoDeObra() {
        return manoDeObra;
    }

    public Estancias getEstancias() {
        return estancias;
    }

    public Calendar getFecha() {
        return fecha;
    }
}
