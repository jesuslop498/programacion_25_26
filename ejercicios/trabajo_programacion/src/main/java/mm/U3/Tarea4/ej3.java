package mm.U3.Tarea4;

import java.util.Arrays;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] mesas = new int[10];

        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = (int) (Math.random() * 5);
        }

        System.out.println("mesas = " + Arrays.toString(mesas));

        System.out.print("Cuantos son? (Introduzca -1 para salir del programa): ");
        int num = teclado.nextInt();

        while(num != -1) {
            if (num < 1 || num > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + num + ", haga grupos de 4 personas como máximo e intente de nuevo.");
                System.out.print("Cuantos son? (Introduzca -1 para salir del programa): ");
                num = teclado.nextInt();
                continue;
            }

            boolean asignado = false;
            for (int i = 0; i < mesas.length; i++) {
                if (mesas[i] + num <= 4) {
                    mesas[i] += num;
                    asignado = true;
                    System.out.println("Grupo de " + num + " personas asignado a la mesa " + (i + 1));
                    break;
                }
            }
            if (!asignado) {
                System.out.println("No hay sitio para " + num + " personas.");
            }

            System.out.println("Estado actual de las mesas:");
            System.out.println("mesas = " + Arrays.toString(mesas));

            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            num = teclado.nextInt();
        }
        System.out.println("Adiós");
        teclado.close();
    }
}
