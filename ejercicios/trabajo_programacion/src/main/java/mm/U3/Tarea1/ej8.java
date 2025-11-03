package mm.U3.Tarea1;

public class ej8 {
    public static void main(String[] args) {
        System.out.print(divisores(30));
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

    public static int divisores(int n) {
        int contador = 0;
        for (int i = 2; i <= n ; i++) {
            if (n % i == 0 && esPrimo(i))
                contador++;
        }
        return contador;
    }

}
