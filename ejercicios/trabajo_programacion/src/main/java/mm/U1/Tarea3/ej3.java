package mm.U1.Tarea3;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner telcado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        float num1 = telcado.nextFloat();

        System.out.println("Introduce un numero: ");
        float num2 = telcado.nextFloat();

        System.out.println("La division da: " + num1/num2);
    }
}
