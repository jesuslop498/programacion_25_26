package mm.U3.examen_U3;

public class ej4 {
    public static void main(String[] args) {
        System.out.println("Ejemplo 1: ");
        int [] v1 = {  };
        System.out.println(convierteArrayEnString(v1));

        System.out.println("Ejemplo 2: ");
        int [] v2 = { 8 };
        System.out.println(convierteArrayEnString(v2));

        System.out.println("Ejemplo 3: ");
        int [] v3 = { 6, 2, 5, 0, 1 };
        System.out.println(convierteArrayEnString(v3));
    }

    public static String convierteArrayEnString(int[] a) {
        
        StringBuilder res = new StringBuilder();

        for (int j : a) {
            res.append(j);
        }

        return res.toString();
    }

}
