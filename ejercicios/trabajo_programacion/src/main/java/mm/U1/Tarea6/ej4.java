package mm.U1.Tarea6;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero tipo byte: ");
        byte num1 = teclado.nextByte();

        System.out.print("Introduce un segundo numero tipo byte: ");
        byte num2 = teclado.nextByte();

        int menor = 0;

        if (num1 > num2) {
            menor += num2;
        } else {
            menor += num1;
        }
        System.out.println(menor);
    }
}
