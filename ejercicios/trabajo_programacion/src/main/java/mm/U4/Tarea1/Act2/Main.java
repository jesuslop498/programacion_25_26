package mm.U4.Tarea1.Act2;

public class Main {
    public static void main(String[] args) {

        CuentaCorriente a = new CuentaCorriente(100, "49826349");

        a.ingresarDinero(50);
        a.sacarDinero(50);
        a.mostrarInfo();

        a.sacarDinero(50);
        a.mostrarInfo();

        a.sacarDinero(50);
        a.mostrarInfo();
    }
}
