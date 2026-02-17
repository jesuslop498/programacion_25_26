package mm.U5.EntregableCOAC;

import java.util.ArrayList;

public abstract class AgrupacionOficial extends Agrupacion {

    protected int puntos;
    protected ArrayList<Integrante> integrantes;

    public AgrupacionOficial(String nombre, String autor, String autorMusica,
                             String autorLetras, String tipo, int puntos) {
        super(nombre, autor, autorMusica, autorLetras, tipo);
        this.puntos = puntos;
        this.integrantes = new ArrayList<>();
    }

    public void insertar_integrante(Integrante i) {
        integrantes.add(i);
    }

    public boolean eliminar_integrante(Integrante i) {
        return integrantes.remove(i);
    }

    public abstract void caminito_del_falla();

    @Override
    public String toString() {
        return super.toString() + ", Puntos: " + puntos +
                ", Integrantes: " + integrantes;
    }
}

