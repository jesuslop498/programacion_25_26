package mm.U3.Tarea1;

public class ej10 {
    public static void main(String[] args) {
        System.out.println(amigos(220 ,284));
    }

    public static boolean amigos(int n1, int n2) {
        int sum = 0;
        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                sum += i;
            }
        }

        int sum1 = 0;
        for (int i = 1; i < n2; i++) {
            if (n2 % i == 0) {
                sum1 += i;
            }
        }

        if (n1 == sum1 && n2 == sum) {
            return true;
        } else {
            return false;
        }
    }
}