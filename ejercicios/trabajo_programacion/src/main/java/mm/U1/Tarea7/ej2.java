package mm.U1.Tarea7;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        System.out.print("Introduce tu nivel de estudios: ");
        int estudios = teclado.nextInt();

        System.out.print("Introduce tus ingresos: ");
        int ingresos = teclado.nextInt();

        boolean jasp = true;

        jasp = edad <= 28 && estudios > 3 && ingresos >= 28000;

        System.out.println(jasp);
    }
}
