package mm.U5.Tarea1.hora;

public class Hora {
    protected int hora;
    protected int minutos;

    Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    void inc() {
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    }

    void setMinutos(int valor) {
        if (valor >= 0 && valor < 60) {
            this.minutos = valor;
        }
    }

    void setHora(int valor) {
        if (valor >= 0 && valor < 24) {
            this.hora = valor;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minutos);
    }
}
