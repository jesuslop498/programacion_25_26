package mm.U3.Tarea1;

public class ej5 {
    public static void main(String[] args) {
        mayor(5, 8, 3);
    }

    public static void mayor(int num1, int num2, int num3) {
        if (num1 < num2) {
            if (num2 < num3) {
                System.out.print(num3);
            } else if (num2 > num3) {
                System.out.print(num2);
            }
        } else {
            System.out.print(num1);
        }
    }
}
