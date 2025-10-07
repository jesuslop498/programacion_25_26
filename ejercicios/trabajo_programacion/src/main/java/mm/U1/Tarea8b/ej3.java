package mm.U1.Tarea8b;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un nunmero: ");
        int num = teclado.nextInt();
        System.out.print("0 1");
        switch (num) {
            case 1:
                System.out.println("0");
                break;
            case 2:
                System.out.println("0 1");
                break;
            default:
                int f1 = 0;
                int f2 = 1;
                int f0;
                while (num > 2) {
                    f0 = f1;
                    f1 = f2;
                    f2 = f0 + f2;
                    System.out.print(" " + f2);
                    num--;
                }
        }
    }
}
