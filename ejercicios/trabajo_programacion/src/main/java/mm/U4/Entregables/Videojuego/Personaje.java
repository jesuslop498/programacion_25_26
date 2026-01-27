package mm.U4.Entregables.Videojuego;

public class Personaje {
    private Caracter personaje;
    private double velocidad;
    private int dmgPuno;
    private int dmgPatada;

    public Personaje() {
        this.personaje = Caracter.Sonic;
        this.velocidad = 100.0;
        this.dmgPuno = 100;
        this.dmgPatada = 200;
    }

    public Personaje(Caracter personaje, double velocidad, int dmgPuno, int dmgPatada) {
        this.personaje = personaje;
        this.velocidad = velocidad;
        this.dmgPuno = dmgPuno;
        this.dmgPatada = dmgPatada;
    }

    public int getDmgPuno() {
        return dmgPuno;
    }

    public void mostrarInfo() {
        System.out.println("Personaje: " + personaje);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Daño Puño: " + dmgPuno);
        System.out.println("Daño Patada: " + dmgPatada);
    }

    @Override
    public String toString() {
        return personaje + " | Velocidad: " + velocidad +
                " | Puño: " + dmgPuno +
                " | Patada: " + dmgPatada;
    }
}
