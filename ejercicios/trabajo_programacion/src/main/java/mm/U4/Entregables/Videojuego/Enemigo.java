package mm.U4.Entregables.Videojuego;

public class Enemigo {
    private Enem tipo;
    private int puntosVida;
    private int puntosDmg;

    public Enemigo(Enem tipo) {
        this.tipo = tipo;
        this.puntosVida = 100;
        this.puntosDmg = 70;
    }

    public void restarPuntosVida(int dano) {
        puntosVida -= dano;
        if (puntosVida < 0) {
            puntosVida = 0;
        }
    }

    @Override
    public String toString() {
        return tipo + " | Vida: " + puntosVida + " | Daño: " + puntosDmg;
    }
}
