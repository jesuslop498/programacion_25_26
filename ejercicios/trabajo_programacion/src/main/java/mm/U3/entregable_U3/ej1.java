package mm.U3.entregable_U3;

public class ej1 {
    public static int aleatorioDeArray(int[] a){
        int num = (int) (Math.random() * (a.length));
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == num) {
                res = a[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] a = {111, 222, 333, 444};
        int [] b = {52, 37};

        System.out.println(aleatorioDeArray(a));
        System.out.print(aleatorioDeArray(b));
    }
}
