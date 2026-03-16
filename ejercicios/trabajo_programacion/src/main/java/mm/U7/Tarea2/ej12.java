package mm.U7.Tarea2;

import java.util.Set;

public class ej12 {
    public static <E> boolean incluido(Set<E> conjunto1, Set<E> conjunto2) {
        return conjunto2.containsAll(conjunto1);
    }
}
