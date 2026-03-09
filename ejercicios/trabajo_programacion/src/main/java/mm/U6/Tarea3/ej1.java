package mm.U6.Tarea3;

class EdadFueraDeRangoException extends Exception {
    public EdadFueraDeRangoException(String mensaje) {
        super(mensaje);
    }
}

class MenorDeEdadException extends Exception {
    public MenorDeEdadException(String mensaje) {
        super(mensaje);
    }
}

class Cliente {

    private int edad;

    public Cliente(int edad) throws EdadFueraDeRangoException, MenorDeEdadException {

        if (edad < 0 || edad > 100) {
            throw new EdadFueraDeRangoException("La edad debe estar entre 0 y 100");
        }

        if (edad < 18) {
            throw new MenorDeEdadException("No se admiten clientes menores de edad");
        }

        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}