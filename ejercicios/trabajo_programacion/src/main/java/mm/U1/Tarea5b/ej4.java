package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana:");
        int num = teclado.nextInt();

        int sueldo = 0;

        for (int i = 0; i < num; i++) {
            if (i <= 40 ) {
                sueldo += 12;
            } else {
                sueldo += 16;
            }
        }
        System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros");
    }
}
