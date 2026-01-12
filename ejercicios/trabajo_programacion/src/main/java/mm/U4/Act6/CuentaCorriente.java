package mm.U4.Act6;

public class CuentaCorriente {
    private double saldo;
    private String titular;
    private Banco banco;

    public CuentaCorriente(String titular) {
        this.saldo = 0.0;
        this.titular = titular;
        this.banco = null;
    }

    public void vincularBanco(Banco banco) {
        this.banco = banco;
    }

    public void cambiarDeBanco(Banco nuevoBanco) {
        this.banco = nuevoBanco;
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo + " €");
        if (banco != null) {
            System.out.println("Banco vinculado: ");
            banco.mostrarInfo();
        } else {
            System.out.println("No existe ningun banco vinculado.");
        }
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("Cantidad ingresada no valida.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("No hay fondos suficientes para retirar.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
