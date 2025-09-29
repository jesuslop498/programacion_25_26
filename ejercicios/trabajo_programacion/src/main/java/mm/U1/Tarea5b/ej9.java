package mm.U1.Tarea5b;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String horoscopo = "";

        System.out.print("Introduce tu dia de nacimiento: ");
        int dia = teclado.nextInt();

        System.out.print("Introduce tu mes de nacimiento del 1-12: ");
        int mes = teclado.nextInt();

        switch (mes) {
            case 1:
                if (dia < 21) {
                    horoscopo = "capricornio";
                } else {
                    horoscopo = "acuario";
                }
                break;
            case 2:
                if (dia < 19) {
                    horoscopo = "acuario";
                } else {
                    horoscopo = "piscis";
                }
                break;
            case 3:
                if (dia < 21) {
                    horoscopo = "piscis";
                } else {
                    horoscopo = "aries";
                }
                break;
            case 4:
                if (dia < 20) {
                    horoscopo = "aries";
                } else {
                    horoscopo = "tauro";
                }
                break;
            case 5:
                if (dia < 21) {
                    horoscopo = "tauro";
                } else {
                    horoscopo = "géminis";
                }
                break;
            case 6:
                if (dia < 21) {
                    horoscopo = "géminis";
                } else {
                    horoscopo = "cáncer";
                }
                break;
            case 7:
                if (dia < 23) {
                    horoscopo = "cáncer";
                } else {
                    horoscopo = "leo";
                }
                break;
            case 8:
                if (dia < 23) {
                    horoscopo = "leo";
                } else {
                    horoscopo = "virgo";
                }
                break;
            case 9:
                if (dia < 23) {
                    horoscopo = "virgo";
                } else {
                    horoscopo = "libra;";
                }
                break;
            case 10:
                if (dia < 23) {
                    horoscopo = "libra";
                } else {
                    horoscopo = "escorpio";
                }
                break;
            case 11:
                if (dia < 22) {
                    horoscopo = "escorpio";
                } else {
                    horoscopo = "sagitario";
                }
                break;
            case 12:
                if (dia < 22) {
                    horoscopo = "sagitario";
                } else {
                    horoscopo = "capricornio";
                }
                break;
            default:
        }
        System.out.print("Tu horoscopo es: " + horoscopo);
    }
}
