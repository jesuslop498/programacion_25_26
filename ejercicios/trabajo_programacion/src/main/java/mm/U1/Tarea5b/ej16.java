package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {

        Scanner telcado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = telcado.nextInt();

        System.out.println("El ultimo numero es: " + num%10);

    }
}
