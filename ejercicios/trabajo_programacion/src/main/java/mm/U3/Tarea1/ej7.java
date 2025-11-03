package mm.U3.Tarea1;

public class ej7 {
    public static void main(String[] args) {
        System.out.println(esPrimo(9));
        System.out.println(esPrimo(11));
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n% i == 0) {
                return false;
            }
        }
        return true;
    }
}
