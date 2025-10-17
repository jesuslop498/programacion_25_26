package mm.U1.Entregables_Examen.Entregable1;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();

        String binario = "";

        while (numero > 0) {
            int residuo = numero % 2;
            binario = residuo + binario;
            numero /= 2;
        }

        System.out.println("El número en binario es: " + binario);
    }
}
