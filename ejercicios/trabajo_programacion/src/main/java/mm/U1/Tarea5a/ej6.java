package mm.U1.Tarea5a;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double gravedad = 9.8;

        System.out.println("Introduce el valor de tiempo: ");

        double tiempo = teclado.nextDouble();

        double velocidad = gravedad*tiempo;

        if (velocidad <= 0) {
            System.out.println("Tiempo incorrecto");
        } else {
            System.out.println("La velocidad es: " + velocidad);
        }
    }
}
