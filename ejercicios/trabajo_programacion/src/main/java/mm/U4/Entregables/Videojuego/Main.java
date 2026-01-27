package mm.U4.Entregables.Videojuego;

public class Main {
    public static void main(String[] args) {

        Videojuego partida1 = new Videojuego();
        partida1.imprimirEstado();

        Escenario escenario2 = new Escenario(
                new Enem[]{Enem.BuzzBomber, Enem.CrabMeat, Enem.Chopper, Enem.MotoBug}
        );

        for (int i = 0; i < 5; i++) {
            escenario2.generarEnemigo();
        }

        Personaje tails = new Personaje(Caracter.Tails, 80, 70, 120);
        Videojuego partida2 = new Videojuego(tails, escenario2);

        partida2.imprimirEstado();
        escenario2.eliminarEnemigo(2);
        partida2.imprimirEstado();

        System.out.println("Número de enemigos: " + escenario2.getNumEnemigos());
    }
}