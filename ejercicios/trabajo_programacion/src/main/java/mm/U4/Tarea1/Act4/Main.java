package mm.U4.Tarea1.Act4;

public class Main {
    public static void main(String[] args) {

        CuentaCorriente a = new CuentaCorriente(100, "49826349");
        CuentaCorriente b = new CuentaCorriente(200, "45481695");

        a.ingresarDinero(50);
        a.sacarDinero(50);
        a.mostrarInfo();

        a.sacarDinero(50);
        a.mostrarInfo();

        a.cambiarBanco("Santander");
        a.mostrarInfo();

        b.sacarDinero(50);
        b.mostrarInfo();

    }
}
