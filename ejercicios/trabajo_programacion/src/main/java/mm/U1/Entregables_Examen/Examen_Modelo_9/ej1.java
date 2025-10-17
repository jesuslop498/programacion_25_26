package mm.U1.Entregables_Examen.Examen_Modelo_9;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura (impar y >= 5): ");
        int altura = sc.nextInt();

        if (altura < 5 || altura % 2 == 0) {
            System.out.println("Error: la altura debe ser un número impar mayor o igual que 5.");
            return;
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0 || i == altura - 1 || i == 0 || i == altura / 2 || j == 5) {
                    System.out.print("M");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
