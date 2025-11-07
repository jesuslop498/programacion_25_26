package mm.U3.Tarea1;

public class ej11 {

    public static void main(String[] args) {
        System.out.println("Potencia iterativa (2^5): " + potenciaIterativa(2, 5));
        System.out.println("Potencia recursiva (2^5): " + potenciaRecursiva(2, 5));
    }


    public static double potenciaIterativa(double a, int n) {
        double resultado = 1;
        for (int i = 0; i < n; i++) {
            resultado *= a;
        }
        return resultado;
    }

    public static double potenciaRecursiva(double a, int n) {
        if (n == 0) {
            return 1; // Caso base: a^0 = 1
        } else {
            return a * potenciaRecursiva(a, n - 1); // Caso recursivo
        }
    }

}
