package mm.U3.Tarea1;

public class ej12 {

    public static void main(String[] args) {
        System.out.println("Factorial recursivo (5!): " + factorial(5));
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1; // Caso base: 0! = 1
        } else {
            return n * factorial(n - 1); // Caso recursivo
        }
    }

}
