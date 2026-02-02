package mm.U5.Tarea1.hora;

public class hora12 {
    private int hora;
    private int minuto;
    private String horario;

    public hora12(int hora, int minuto, String horario) {
        this.hora = hora;
        this.minuto = minuto;
        this.horario = horario;
    }

    void inc12() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 12 && horario.equals("pm")) {
                hora = 0;
                horario = "am";
            }
            if (hora == 12 && horario.equals("am")) {
                hora = 12;
                horario = "pm";
            }
        }
    }

    void setMinuto(int valor) {
        if (valor >= 0 && valor < 60) {
            this.minuto = valor;
        }
    }

    void setHora(int valor) {
        if (valor >= 0 && valor < 24) {
            this.hora = valor;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d" + horario, hora, minuto);
    }


}
