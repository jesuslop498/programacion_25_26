package mm.U5.Tarea1.hora;

public class HoraExacta extends Hora {
    protected int segundos;

    HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = segundos;
    }


    @Override
    public void inc() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            super.inc();
        }
    }


    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.minutos = segundos;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", super.hora, super.minutos, segundos);
    }

    public boolean esIgual(HoraExacta otra) {
        if (this.hora == otra.hora && this.minutos == otra.minutos && this.segundos == otra.segundos) {
            return true;
        }
        return false;
    }
}
