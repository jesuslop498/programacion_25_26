package mm.U6.Tarea3ej2;

class EdadErroneaException extends Exception {
    public EdadErroneaException(String mensaje) {
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
    private String dni;

    public Cliente(String dni, int edad) throws EdadErroneaException, MenorDeEdadException {

        if (edad < 0 || edad > 100) {
            throw new EdadErroneaException(
                    "Imposible crear el usuario con dni " + dni +
                            ". La edad no puede ser negativa o mayor de 100 (Edad indicada: " + edad + ")"
            );
        }

        if (edad < 18) {
            throw new MenorDeEdadException(
                    "Imposible crear el usuario con dni " + dni +
                            ". El cliente no puede ser menor de edad (Edad indicada: " + edad + ")"
            );
        }

        this.edad = edad;
        this.dni = dni;
    }
}