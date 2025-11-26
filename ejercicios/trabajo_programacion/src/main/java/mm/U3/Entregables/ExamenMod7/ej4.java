package mm.U3.Entregables.ExamenMod7;

public class ej4 {
    public static String convierteEnPalabras(int n) {
        String numero = String.valueOf(n);
        StringBuilder cadena = new StringBuilder();

        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);

            switch (c) {
                case '1': cadena.append("uno"); break;
                case '2': cadena.append("dos"); break;
                case '3': cadena.append("tres"); break;
                case '4': cadena.append("cuatro"); break;
                case '5': cadena.append("cinco"); break;
                case '6': cadena.append("seis"); break;
                case '7': cadena.append("siete"); break;
                case '8': cadena.append("ocho"); break;
                case '9': cadena.append("nueve"); break;
                case '0': cadena.append("cero"); break;
            }

            if (i < numero.length() - 1) {
                cadena.append(", ");
            }
        }

        return cadena.toString();
    }


    public static void main(String[] args) {
        int num = 111111111;

        System.out.println(convierteEnPalabras(num));
    }
}
