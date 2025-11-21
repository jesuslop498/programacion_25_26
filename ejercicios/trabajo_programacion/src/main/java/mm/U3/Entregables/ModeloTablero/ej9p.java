package mm.U3.Entregables.ModeloTablero;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ej9p {
    public static int[] convierteArrayEnString(String a) {
        int [] x = new int[a.length()];

        for (int i = 0; i < x.length; i++) {
            x[i] = a.charAt(i) - '0';
        }
        
        return x;
    }

    public static void main(String[] args) {
        String num = "8452";

        System.out.println(Arrays.toString(convierteArrayEnString(num)));
    }
}
