package mm.U5.Resueltos.Interfaces;

import java.util.Comparator;

public class comparaEdadPersona implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {

        if (p1.getEdad() > p2.getEdad()) {
            return 1;
        } else if (p1.getEdad() < p2.getEdad()) {
            return -1;
        }
        return 0;
    }

}
