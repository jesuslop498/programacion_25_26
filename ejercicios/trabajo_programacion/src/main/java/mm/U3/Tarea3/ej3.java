package mm.U3.Tarea3;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres introducir: ");
        int cantidad = teclado.nextInt();

        int [] num = new int[cantidad];

        int positivos = 0;
        int negativos = 0;
        int mediaPositivos = 0;
        int mediaNegativos = 0;
        int ceros = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Numero: " + i + " :");
            num[i] = teclado.nextInt();

            if (num[i] > 0) {
                positivos++;
                mediaPositivos += num[i];
            } else {
                negativos++;
                mediaNegativos += num[i];
            }

            String numStr = String.valueOf(Math.abs(num[i]));
            for (int j = 0; j < numStr.length(); j++) {
                if (numStr.charAt(j) == '0') {
                    ceros++;
                }
            }
        }

        mediaPositivos = mediaPositivos/positivos;
        mediaNegativos = mediaNegativos/negativos;

        System.out.println("Media de positivos: " + mediaPositivos);
        System.out.println("Media de negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
