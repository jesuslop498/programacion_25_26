package mm.U3.Entregables.Modelo24;

public class ej2 {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5, 6};
        int[] v2 = {4, 3, 2, 1};
        int pos = 2;

        int[] resultado = insertarEnVector(v1, v2, pos);

        System.out.print("{");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static int[] insertarEnVector(int[] v1, int[] v2, int pos) {
        if (pos < 0) {
            return v1;
        }

        if (pos > v1.length) {
            return v2;
        }

        int[] result = new int[v1.length + v2.length];

        int i = 0;
        for (; i < pos; i++) {
            result[i] = v1[i];
        }

        for (int j = 0; j < v2.length; j++) {
            result[i + j] = v2[j];
        }

        for (int k = pos; k < v1.length; k++) {
            result[i + v2.length + k - pos] = v1[k];
        }

        return result;

    }
}
