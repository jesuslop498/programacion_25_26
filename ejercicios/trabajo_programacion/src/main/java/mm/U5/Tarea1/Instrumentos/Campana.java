package mm.U5.Tarea1.Instrumentos;

public class Campana extends Instrumento {
    @Override
    public void interpretar() {
        System.out.print("Campana interpretando: ");
        for (int i = 0; i < numNotas; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
    }
}
