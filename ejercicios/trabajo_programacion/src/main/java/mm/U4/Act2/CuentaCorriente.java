package mm.U4.Act2;

public class CuentaCorriente {
    static String nombreBanco = "Banco de España";
    double saldo;
    int limiteDescubrimiento;
    String nombre;
    String dni;

    CuentaCorriente(int saldo, String dni) {
        this.saldo = saldo;
        this.limiteDescubrimiento = 0;
        this.dni = dni;
    }

    void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    boolean sacarDinero(double dineroASacar) {
        boolean resultado = false;

        if (dineroASacar <= saldo - limiteDescubrimiento) {
            System.out.print("Es posible sacar: " + dineroASacar);
            saldo -= dineroASacar;
            resultado = true;
        } else {
            System.out.print("No es posible sacar el dinero");
        }
        return resultado;

    }

    void mostrarInfo() {
        System.out.println("El saldo es: " + saldo);
        System.out.println("El nombre del titular es: " + nombre);
        System.out.println("El DNI del titular es: " + dni);
        System.out.println("El nombre del banco es: " + nombreBanco);
        System.out.println("El limite del descubrimiento es: " + limiteDescubrimiento);
    }
}
