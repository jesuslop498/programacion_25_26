package mm.U5.Tarea1.Instrumentos;

public class TestInstrumentos {
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.add(Nota.DO);
        piano.add(Nota.RE);
        piano.add(Nota.MI);
        piano.add(Nota.FA);

        Campana campana = new Campana();
        campana.add(Nota.SOL);
        campana.add(Nota.LA);
        campana.add(Nota.SI);

        piano.interpretar();
        campana.interpretar();
    }
}
