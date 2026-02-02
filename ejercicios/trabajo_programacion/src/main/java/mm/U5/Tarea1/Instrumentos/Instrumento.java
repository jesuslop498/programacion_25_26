package mm.U5.Tarea1.Instrumentos;

enum Nota {
    DO, RE, MI, FA, SOL, LA, SI
}

abstract class Instrumento {
    protected static final int max_notas = 100;
    protected Nota[] notas;
    protected int numNotas;

    public Instrumento() {
        this.notas = new Nota[max_notas];
        this.numNotas = 0;
    }

    public void add(Nota nota) {
        if (numNotas < max_notas) {
            notas[numNotas] = nota;
            numNotas++;
        } else {
            System.out.println("Nos e pueden anadir mas notas, el instrumento esta completo");
        }
    }

    public abstract void interpretar();
}
