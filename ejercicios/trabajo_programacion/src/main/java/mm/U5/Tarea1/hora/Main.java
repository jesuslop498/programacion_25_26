package mm.U5.Tarea1.hora;

public class Main {
    public static void main(String[] args) {

        HoraExacta hora = new HoraExacta(12, 22, 1);

        hora.inc();

        System.out.println(hora.toString());

        HoraExacta hora1 = new HoraExacta(12, 30, 45);
        HoraExacta hora2 = new HoraExacta(12, 30, 45);
        HoraExacta hora3 = new HoraExacta(14, 15, 20);

        System.out.println("Hora 1: " + hora1);
        System.out.println("Hora 2: " + hora2);
        System.out.println("Hora 3: " + hora3);

        System.out.println("¿Hora 1 es igual a Hora 2? " + hora1.esIgual(hora2));
        System.out.println("¿Hora 1 es igual a Hora 3? " + hora1.esIgual(hora3));
    }
}