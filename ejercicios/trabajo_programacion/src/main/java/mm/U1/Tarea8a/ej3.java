package mm.U1.Tarea8a;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int random = (int) (Math.random() * 100);

        int num = 0;

        while (random != num) {
            System.out.println("Introduce un numero (-1 para salir): ");
            num = teclado.nextInt();

            if (num > random) {
                System.out.println("Menor");
            }

            if (num < random) {
                System.out.println("Mayor");
            }

            if (num == random) {
                System.out.println("Acertaste");
                break;
            }

            if (num == -1) {
                System.out.println("El numero era: " + random);
            }
        }
    }
}
