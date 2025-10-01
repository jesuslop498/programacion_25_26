package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int puntos = 0;
        System.out.println("Vamos a hacer un test para ver si tu pareja es infiel. Contesta las preguntas con (v y f)");

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        String res1 = teclado.nextLine();

        if (res1.equals("v")) {
            puntos += 3;
        }

        System.out.println("2. Ha aumentado sus gastos de vestuario.");
        String res2 = teclado.nextLine();

        if (res2.equals("v")) {
            puntos += 3;
        }

        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
        String res3 = teclado.nextLine();

        if (res3.equals("v")) {
            puntos += 3;
        }

        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
        String res4 = teclado.nextLine();

        if (res2.equals("v")) {
            puntos += 3;
        }

        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
        String res5 = teclado.nextLine();

        if (res5.equals("v")) {
            puntos += 3;
        }

        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
        String res6 = teclado.nextLine();

        if (res6.equals("v")) {
            puntos += 3;
        }

        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        String res7 = teclado.nextLine();

        if (res7.equals("v")) {
            puntos += 3;
        }

        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        String res8 = teclado.nextLine();

        if (res8.equals("v")) {
            puntos += 3;
        }

        System.out.println("9. Has notado que últimamente se perfuma más.");
        String res9 = teclado.nextLine();

        if (res9.equals("v")) {
            puntos += 3;
        }

        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        String res10 = teclado.nextLine();

        if (res10.equals("v")) {
            puntos += 3;
        }

        System.out.println("Has acomulado un total de: " + puntos + "puntos");

        if (puntos <= 10) {
            System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
        } else if (puntos <= 20 && puntos >= 10) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    }
}
