package mm.U4.Tarea1.Act7;

public class SintonizadorFM {

    private double frecuencia;

    public SintonizadorFM() {
        frecuencia = 80.0;
    }

    public void up() {
        frecuencia += 0.5;
        if (frecuencia > 108.0) {
            frecuencia = 80.0;
        }
    }

    public void down() {
        frecuencia -= 0.5;
        if (frecuencia < 80.0) {
            frecuencia = 108.0;
        }
    }

    public void display() {
        System.out.println("La frecuencia actual es: " + frecuencia + " MHz");
    }


}
