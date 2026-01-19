package mm.U4.Tarea1.Act1;

public class Main {
    public static void main(String[] args) {

        CuentaCorriente a = new CuentaCorriente("Jesus", "49826349");

        a.ingresarDinero(50);
        a.sacarDinero(50);
        a.mostrarInfo();

        System.out.println();

        a.sacarDinero(50);
        a.mostrarInfo();

        System.out.println();
        a.sacarDinero(50);
        a.mostrarInfo();
    }
}
