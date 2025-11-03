package mm.U3.Tarea1;

import java.util.Scanner;

public class ej1 {
    public static Scanner teclado;

    public static void main(String[] args) {

        teclado = new Scanner(System.in);
        int n;

        n = pedirnum();
        mostrar(n);
    }

    public static int pedirnum() {
        int numero;

        System.out.print("Indique el valor del numero: ");
        numero = teclado.nextInt();

        return numero;
    }

    public static void mostrar(int n) {
        int i;

        for (i = 1; i <= n; i++) {
            System.out.println("Eco");
        }
    }

}
