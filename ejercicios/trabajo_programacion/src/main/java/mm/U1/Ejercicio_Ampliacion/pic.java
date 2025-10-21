package mm.U1.Ejercicio_Ampliacion;

public class pic {
    public static void main(String[] args) {
        int palo = (int) (Math.random() * 4);

        int picas = 0;
        int corazones = 1;
        int diamantes = 3;
        int treboles = 2;

        if (palo == picas) {
            System.out.println("Palo - picas");
        } else if (palo == corazones) {
            System.out.println("Palo - corazones");
        } else if (palo == diamantes) {
            System.out.println("Palo - diamantes");
        } else if (palo == treboles) {
            System.out.println("Palo - treboles");
        }

        int A = 0;
        int J = 10;
        int Q = 11;
        int K = 12;

        int carta = (int) (Math.random() * 13);

        if (carta == A) {
            System.out.print("Carta: A");
        } else if (carta == J) {
            System.out.print("Carta: J");
        } else if (carta == Q) {
            System.out.print("Carta: Q");
        } else if (carta == K) {
            System.out.print("Carta: K");
        } else {
            System.out.print("Carta: " + carta);
        }
    }
}
