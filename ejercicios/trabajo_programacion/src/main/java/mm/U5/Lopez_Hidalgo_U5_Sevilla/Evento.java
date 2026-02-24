package mm.U5.Lopez_Hidalgo_U5_Sevilla;

public abstract class Evento {
    private String codigoIdn;
    private String fechaCelebracion;
    private String nombre;
    private Coordinador coordinador;

    public Evento(String codigoIdn, String fechaCelebracion, String nombre, Coordinador coordinador) {
        this.codigoIdn = codigoIdn;
        this.fechaCelebracion = fechaCelebracion;
        this.nombre = nombre;
        this.coordinador = coordinador;
    }

    public abstract void celebrar();

    @Override
    public String toString() {
        return "Evento{" +
                "codigoIdn='" + codigoIdn + '\'' +
                ", fechaCelebracion='" + fechaCelebracion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", coordinador='" + coordinador + '\'' +
                '}';
    }

}
