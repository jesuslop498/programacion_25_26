package mm.U1.Tarea8a;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int mayor = 0;
        int suma = 0;
        int numeroAlumnos = 0;

        System.out.print("Introduce la edad del alumno: ");

        while (true) {
            int edad = teclado.nextInt();

            if (edad < 0) {
                break;
            }

            suma += edad;
            numeroAlumnos++;

            if (edad >= 18) {
                mayor++;
            }
        }

        if (numeroAlumnos > 0) {
            double media = suma / numeroAlumnos;
            System.out.println("La suma es: " + suma);
            System.out.println("La media es: " + media);
            System.out.println("Numero de alumnos ha sido: " + numeroAlumnos);
            System.out.println("Son mayores de edad: " + mayor);
        } else {
            System.out.println("No se introdujeron edades");
        }

    }
}
