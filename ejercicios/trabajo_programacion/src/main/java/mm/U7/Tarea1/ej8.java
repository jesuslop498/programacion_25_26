package mm.U7.Tarea1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ej8 {

    public static List<String> eliminaRepetidos(List<String> c) {
        HashSet<String> set = new HashSet<>(c);

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Pedro");
        nombres.add("Ana");
        nombres.add("Maria");
        nombres.add("Luis");

        System.out.println("Lista original:");
        System.out.println(nombres);

        List<String> sinRepetidos = eliminaRepetidos(nombres);

        System.out.println("Lista sin repetidos:");
        System.out.println(sinRepetidos);

        System.out.println("Lista original después de eliminar repetidos:");
        System.out.println(nombres);
    }
}
