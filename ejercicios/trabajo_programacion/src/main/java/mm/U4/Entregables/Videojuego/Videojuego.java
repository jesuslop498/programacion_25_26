package mm.U4.Entregables.Videojuego;

import java.util.Calendar;

public class Videojuego {
    private static String ip = "127.0.0.1";

    private Personaje personaje;
    private Escenario escenario;
    private Calendar inicio;

    public Videojuego() {
        this.personaje = new Personaje();
        this.escenario = new Escenario(
                new Enem[]{Enem.BuzzBomber, Enem.Coconuts}
        );
        this.inicio = Calendar.getInstance();
    }

    public Videojuego(Personaje personaje, Escenario escenario) {
        this.personaje = personaje;
        this.escenario = escenario;
        this.inicio = Calendar.getInstance();
    }

    public static String getIp() {
        return ip;
    }

    public static void setIp(String nuevaIp) {
        ip = nuevaIp;
    }

    public void imprimirEstado() {
        System.out.println("IP: " + ip);
        System.out.println("Inicio: " + inicio.getTime());
        System.out.println(personaje);
        System.out.println(escenario);
    }
}
