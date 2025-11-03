package mm.U3.Tarea1;

public class ej9 {
    public static void main(String[] args) {
        int numero = 99;
        System.out.println("Contador: " + numero);
        System.out.print("Divisores: ");
        divisoresPrimos(numero);
        System.out.println("Cantidad de divisores primos: " + div(numero));
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

    public static int div(int n) {
        int contador = 0;
        for (int i = 2; i <= n ; i++) {
            if (n % i == 0 && esPrimo(i))
                contador++;
        }
        return contador;
    }

    public static void divisoresPrimos(int a) {
        boolean primero = true;
        for (int i = 2; i <= a ; i++) {
            if (a % i == 0 && esPrimo(i)) {
                if (!primero) System.out.print(", ");
                System.out.print(i);
                primero = false;
            }
        }
        System.out.println();
    }
}
