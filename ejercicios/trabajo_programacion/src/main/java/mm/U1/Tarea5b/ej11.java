package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int puntos = 0;
        System.out.println("Vamos ha realizar un pequeño test y al final daremos la puntacion de dicho test");

        System.out.println("Primera pregunta: Etiqueta correcta para numeros decimales en java");
        System.out.println("a) int");
        System.out.println("b) double");
        String res1 = teclado.nextLine();

        if (res1.equals("b")) {
            puntos++;
        } else {
            System.out.println("Incorrecto");
        }
        System.out.println("Segunda pregunta: En xml com se deben cerrar las etiquetas: ");
        System.out.println("a) </hora>");
        System.out.println("b) <hola/>");
        String res2 = teclado.nextLine();

        if (res2.equals("a")) {
            puntos++;
        } else {
            System.out.println("Incorrecto");
        }
        System.out.println("Tercera pregunta: Cuantos objetivos hay en la agenda 2030:");
        System.out.println("a) 17");
        System.out.println("b) 20");
        String res3 = teclado.nextLine();

        if (res3.equals("a")) {
            puntos++;
        } else {
            System.out.println("Incorrecto");
        }
        System.out.println("Cuarta pregunta: Economia que ayudaria a los osos polares: ");
        System.out.println("a) Economia circular");
        System.out.println("b) Economia lineal");
        String res4 = teclado.nextLine();

        if (res4.equals("a")) {
            puntos++;
        } else {
            System.out.println("Incorrecto");
        }
        System.out.println("Quinta pregunta: Entidad principal en cliente: ");
        System.out.println("a) Nombre");
        System.out.println("b) Dni");
        String res5 = teclado.nextLine();

        if (res5.equals("b")) {
            puntos++;
        } else {
            System.out.println("Incorrecto");
        }
        System.out.println("Sexta pregunta: Repositorio que usamos en entorno de desarrollo: ");
        System.out.println("a) Drive");
        System.out.println("b) Git");
        String res6 = teclado.nextLine();

        if (res6.equals("b")) {
            puntos++;
        } else {
            System.out.println("Incorrecto");
        }
        System.out.println("Septima pregunta: Lenguaje que estamos aprendiendo en programacion: ");
        System.out.println("a) java");
        System.out.println("b) html");
        String res7 = teclado.nextLine();

        if (res7.equals("a")) {
            puntos++;
        } else {
            System.out.println("Incorrecto");
        }
        System.out.println("Octava pregunta: Sistema opertivo de los ordenadores de clase: ");
        System.out.println("a) Linux");
        System.out.println("b) Windows");
        String res8 = teclado.nextLine();

        if (res8.equals("b")) {
            puntos++;
        } else {
            System.out.println("Incorrecto");
        }
        System.out.println("Novena pregunta: Cuanto tiempo dura el recreo: ");
        System.out.println("a) 15 minutos");
        System.out.println("b) 30 minutos");
        String res9 = teclado.nextLine();

        if (res9.equals("a")) {
            puntos++;
        } else {
            System.out.println("Incorrecto");
        }
        System.out.println("Decima pregunta: Cuanto es 77 + 33");
        System.out.println("a) 100");
        System.out.println("b) 110");
        String res10 = teclado.nextLine();

        if (res10.equals("b")) {
            puntos++;
        } else {
            System.out.println("Incorrecto");
        }

        System.out.print("Has acumulado un total de: " + puntos + " puntos");
    }
}
