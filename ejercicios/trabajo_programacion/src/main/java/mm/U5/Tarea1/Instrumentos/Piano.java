package mm.U5.Tarea1.Instrumentos;

public class Piano extends Instrumento {
    @Override
    public void interpretar() {
        System.out.print("Piano interpretando: ");
        for (int i = 0; i < numNotas; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
    }
}
