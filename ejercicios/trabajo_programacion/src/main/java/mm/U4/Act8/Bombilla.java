package mm.U4.Act8;

public class Bombilla {
    private boolean encendida;
    private boolean interruptorActivado;

    public Bombilla() {
        encendida = false;
        interruptorActivado = false;
    }

    public void encender() {
        if (interruptorActivado = true) {
            encendida = true;
        }
    }

    public void apagar() {
        if (interruptorActivado = false) {
            encendida = false;
        }
    }

    public void activarInterruptor() {
        interruptorActivado = true;
    }

    public void desactivarInterruptor() {
        interruptorActivado = false;
        encendida = false;
    }

    public String estado() {
        return encendida ? "Encendida" : "Apagada";
    }

    public boolean estaEncendida() {
        return encendida;
    }
}
