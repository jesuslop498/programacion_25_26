package mm.U1.Ejercicio_Ampliacion;

import java.util.Scanner;

public class arbol {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca la altura del arbol: ");
        int altura = teclado.nextInt();

        while (altura < 4) {
            System.out.print("Introduce una altura correcta: ");
            altura = teclado.nextInt();
        }

        for (int y = 0; y < 1; y++)
            for (int x = 0; x < altura + 2; x++) {
                if (x == altura - 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

        System.out.println();

        int copiaAltura = altura - 2;
        int planta = 1;
        int longitud = 1;
        int espacios = copiaAltura - 1;

        while (planta <= copiaAltura) {
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= longitud; i++) {
                if (planta == copiaAltura || i == 1 || i == longitud) {
                    System.out.print("^");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            planta++;
            espacios--;
            longitud += 2;
        }

        for (int y = 0; y < 1; y++)
            for (int x = 0; x < altura + 2; x++) {
                if (x == altura - 3) {
                    System.out.print("Y");
                } else {
                    System.out.print(" ");
                }

            }
    }
}
