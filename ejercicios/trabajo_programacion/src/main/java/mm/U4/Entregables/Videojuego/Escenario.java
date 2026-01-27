package mm.U4.Entregables.Videojuego;

import java.util.Arrays;
import java.util.Random;

public class Escenario {
    private int altura;
    private int longitud;
    private int anillos;
    private int gemas;
    private Enem[] tiposEnemigos;
    private Enemigo[] enemigos;
    private int numEnemigos;

    public Escenario(Enem[] tiposEnemigos) {
        this.altura = 100;
        this.longitud = 100;
        this.anillos = 500;
        this.gemas = 2;
        this.tiposEnemigos = tiposEnemigos;
        this.enemigos = new Enemigo[10];
        this.numEnemigos = 0;
    }

    public void generarEnemigo() {
        if (numEnemigos >= 10) return;

        Random r = new Random();
        Enem tipo = tiposEnemigos[r.nextInt(tiposEnemigos.length)];
        enemigos[numEnemigos++] = new Enemigo(tipo);
    }

    public void eliminarEnemigo(int indice) {
        if (indice < 0 || indice >= numEnemigos) return;

        for (int i = indice; i < numEnemigos - 1; i++) {
            enemigos[i] = enemigos[i + 1];
        }
        enemigos[--numEnemigos] = null;
    }

    public int getNumEnemigos() {
        return numEnemigos;
    }

    @Override
    public String toString() {
        return "Escenario [" +
                "Altura=" + altura +
                ", Longitud=" + longitud +
                ", Anillos=" + anillos +
                ", Gemas=" + gemas +
                ", TiposEnemigos=" + Arrays.toString(tiposEnemigos) +
                ", Enemigos=" + Arrays.toString(enemigos) +
                "]";
    }
}
