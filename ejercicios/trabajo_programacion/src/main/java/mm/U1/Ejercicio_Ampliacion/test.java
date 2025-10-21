package mm.U1.Ejercicio_Ampliacion;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introdue una altura para el arbol: ");
        int altura = teclado.nextInt();

        while (altura <4 ) {
            System.out.println("Altura incorrecta");
            altura = teclado.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura*2-1; j++) {
                if (i == 0 && j == altura /2 +1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if ((i + j == altura -2 && i != 0 || i != altura-2) || j-i == altura -2 || i == altura -2) {
                    System.out.print("^");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
