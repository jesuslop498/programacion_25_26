package mm.U3.Tarea3;

import java.util.Random;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Introduce la longitud de la clave: ");
        int lon = teclado.nextInt();
        int[] longitud = new int[lon];

        for (int i = 0; i < lon; i++) {
            longitud[i] = rand.nextInt(5) + 1;
        }

        boolean adivinado = false;


        while (!adivinado) {
            System.out.println("Intente acertarla: ");
            int [] intento = new int[lon];

            for (int i = 0; i < lon; i++) {
                System.out.println("Numero: ");
                intento[i] = teclado.nextInt();
            }

            for (int i = 0; i < lon; i++) {
                if (intento[i] < longitud[i]) {
                    System.out.println(intento[i] + " es menor");
                } else if (intento[i] > longitud[i]) {
                    System.out.println(intento[i] + " es mayor");
                } else {
                    System.out.println(intento[i] + " es igual");
                }
            }

            adivinado = true;
            for (int i = 0; i < lon; i++) {
                if (intento[i] != longitud[i]){
                    adivinado = false;
                    break;
                }
            }

            if (adivinado) {
                System.out.println("Has acertado la clave secreta.");
            }
        }
    }
}
