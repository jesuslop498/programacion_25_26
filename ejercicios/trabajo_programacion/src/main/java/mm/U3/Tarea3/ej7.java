package mm.U3.Tarea3;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int trimestre = 3;
        int alumno = 5;

        int[][] datos = new int[alumno][trimestre];

        for (int i = 0; i < trimestre; i++) {
            System.out.println("Notas para el trimestre " + (i + 1));
            for (int j = 0; j < alumno; j++) {
                System.out.print("Nota para el alumno " + (j + 1) + ": ");
                datos[j][i] = teclado.nextInt();
            }
        }

        System.out.print("Introduzca la posición del alumno para calcular su media (1 a 5): ");
        int pos = teclado.nextInt() - 1;

        if (pos < 0 || pos >= alumno) {
            System.out.println("Posición de alumno inválida.");
            return;
        }

        for (int i = 0; i < trimestre; i++) {
            int sumaTrimestre = 0;
            for (int j = 0; j < alumno; j++) {
                sumaTrimestre += datos[j][i];
            }
            double mediaTrimestre = sumaTrimestre / 5.0;
            System.out.println("La media del grupo en el trimestre " + (i + 1) + " es: " + mediaTrimestre);
        }

        int sumaAlumno = 0;
        for (int i = 0; i < trimestre; i++) {
            sumaAlumno += datos[pos][i];
        }
        double mediaAlumno = sumaAlumno / 3.0;
        System.out.println("La media del alumno " + (pos + 1) + " es: " + mediaAlumno);
    }
}