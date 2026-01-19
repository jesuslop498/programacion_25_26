package mm.U4.Tarea1.Act6;

public class Main {
    public static void main(String[] args) {

        Banco banco1 = new Banco("Banco Central", "Calle Principal 123");
        Banco banco2 = new Banco("Banco Secundario", "Avenida Secundaria 456", 10.0);

        CuentaCorriente cuenta1 = new CuentaCorriente("Juan Pérez");
        CuentaCorriente cuenta2 = new CuentaCorriente("Ana González");

        cuenta1.vincularBanco(banco1);
        cuenta2.vincularBanco(banco2);

        System.out.println("Información de la cuenta 1:");
        cuenta1.mostrarInfo();

        System.out.println("Información de la cuenta 2:");
        cuenta2.mostrarInfo();

        Banco banco3 = new Banco("Banco Nuevo", "Calle Nueva 789", 15.0);
        cuenta1.cambiarDeBanco(banco3);

        System.out.println("Información de la cuenta 1 después de cambiar de banco:");
        cuenta1.mostrarInfo();

        CuentaCorriente cuenta3 = new CuentaCorriente("Carlos López");
        System.out.println("Información de la cuenta 3 (sin banco vinculado):");
        cuenta3.mostrarInfo();

    }
}
