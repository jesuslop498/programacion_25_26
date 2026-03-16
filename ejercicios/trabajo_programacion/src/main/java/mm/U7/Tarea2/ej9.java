package mm.U7.Tarea2;

import java.util.HashSet;
import java.util.Set;

public class ej9 {
    public static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> resultado = new HashSet<>();

        resultado.addAll(conjunto1);
        resultado.addAll(conjunto2);

        return resultado;
    }
}
