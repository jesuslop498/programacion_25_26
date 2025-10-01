package mm.U1.Tarea6;

import java.util.Scanner;

public class ej4v2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero tipo byte: ");
        byte num1 = teclado.nextByte();

        System.out.print("Introduce un segundo numero tipo byte: ");
        byte num2 = teclado.nextByte();

        int menor = 0;

        menor = num1 > num2 ? +num2 : +num1;

        System.out.print(menor);
    }
}
