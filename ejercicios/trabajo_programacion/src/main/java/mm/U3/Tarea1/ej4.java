package mm.U3.Tarea1;

public class ej4 {
    public static void main(String[] args) {
        mayor(9,4);
    }

    public static void mayor(int num1, int num2) {
        if (num1 > num2) {
            System.out.print("El mayor es: " + num1);
        } else {
            System.out.print("El mayor es: " + num2);
        }
    }
}
