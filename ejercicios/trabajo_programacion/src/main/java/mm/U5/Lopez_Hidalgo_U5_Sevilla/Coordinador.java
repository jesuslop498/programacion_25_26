package mm.U5.Lopez_Hidalgo_U5_Sevilla;

public class Coordinador {
    private String nombre;
    private String apellidos;
    private int identifiador;

    public Coordinador(String nombre, String apellidos, int identifiador) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identifiador = identifiador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getIdentifiador() {
        return identifiador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setIdentifiador(int identifiador) {
        this.identifiador = identifiador;
    }

    @Override
    public String toString() {
        return "Coordinador{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", identifiador=" + identifiador +
                '}';
    }
}
