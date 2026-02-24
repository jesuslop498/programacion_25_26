package mm.U5.Lopez_Hidalgo_U5_Sevilla;

public class Main {
    public static void main(String[] args) {

        Coordinador c1 = new Coordinador("Alfredo", "Gutierrez Dominguez", 15);

        FeriaSevilla f1 = new FeriaSevilla("1", "20/05/2026", "Arrancate", c1);

        Caseta caseta1 = new Caseta(1);
        Caseta caseta2 = new Caseta(2);
        Caseta caseta3 = new Caseta(3);
        Caseta caseta4 = new Caseta(4);
        Caseta caseta5 = new Caseta(5);
        Caseta caseta6 = new Caseta(6);
        Caseta caseta7 = new Caseta(7);
        Caseta caseta8 = new Caseta(8);
        Caseta caseta9 = new Caseta(9);
        Caseta caseta10 = new Caseta(10);

        ActuacionArtistica a1 = new ActuacionArtistica(250, "Urbano", 3, "Manguera");

        caseta1.addActuacion(a1);
        caseta2.addActuacion(a1);
        caseta3.addActuacion(a1);
        caseta4.addActuacion(a1);
        caseta5.addActuacion(a1);
        caseta6.addActuacion(a1);
        caseta7.addActuacion(a1);
        caseta8.addActuacion(a1);
        caseta9.addActuacion(a1);
        caseta10.addActuacion(a1);

        caseta1.deleteActuacion(a1);

        f1.addCaseta(caseta1);
        f1.addCaseta(caseta2);
        f1.addCaseta(caseta3);
        f1.addCaseta(caseta4);
        f1.addCaseta(caseta5);
        f1.addCaseta(caseta6);
        f1.addCaseta(caseta7);
        f1.addCaseta(caseta8);
        f1.addCaseta(caseta9);
        f1.addCaseta(caseta10);

        f1.celebrar();

        PasoProcesional p1 = new PasoProcesional(2, "Angeles", 50);

        p1.addActuacion(a1);

        SemanaSanta s1 = new SemanaSanta("2", "20/05/2026", "alfalfa", c1);

        s1.addPaso(p1);

        p1.procisionar();
        p1.programar();

        a1.ensayar();

    }
}
