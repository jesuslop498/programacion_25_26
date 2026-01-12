package mm.U4.Act5;

public class CuentaCorriente {
    private static String nombreBanco = "Banco de España";
    private double saldo;
    private int limiteDescubrimiento;
    public String nombre;
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

    void cambiarBanco (String nombre) {
        nombreBanco = nombre;
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

    public static String getNombreBanco() {
        return nombreBanco;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getLimiteDescubrimiento() {
        return limiteDescubrimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public static void setNombreBanco(String nombreBanco) {
        CuentaCorriente.nombreBanco = nombreBanco;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimiteDescubrimiento(int limiteDescubrimiento) {
        this.limiteDescubrimiento = limiteDescubrimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    void mostrarInfo() {
        System.out.println("El saldo es: " + saldo);
        System.out.println("El nombre del titular es: " + nombre);
        System.out.println("El DNI del titular es: " + dni);
        System.out.println("El nombre del banco es: " + nombreBanco);
        System.out.println("El limite del descubrimiento es: " + limiteDescubrimiento);
    }
}
