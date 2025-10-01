package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hacia donde quieres que mire el vertice de la piramide: ");
        System.out.println("1 .Hacia arriba: ");
        System.out.println("2. Hacia abajo: ");
        System.out.println("3. Hacia la izquierda: ");
        System.out.println("4. Hacia la derecha: ");
        int piramide = teclado.nextInt();

        switch (piramide) {
            case 1:
                System.out.println(" " + " " + "$");
                System.out.println(" " + "$" + "$" + "$");
                System.out.println("$" + "$" + "$" + "$" + "$");
                break;
            case 2:
                System.out.println("$" + "$" + "$" + "$" + "$");
                System.out.println(" " + "$" + "$" + "$");
                System.out.println(" " + " " + "$");
                break;
            case 3:
                System.out.println(" " + " " + "$");
                System.out.println(" " + "$" + "$");
                System.out.println("$" + "$" + "$");
                System.out.println(" " + "$" + "$");
                System.out.println(" " + " " + "$");
                break;
            case 4:
                System.out.println("$" + " " + " ");
                System.out.println("$" + "$" + " ");
                System.out.println("$" + "$" + "$");
                System.out.println("$" + "$" + " ");
                System.out.println("$" + " " + " ");
                break;
            default:
        }
    }
}
