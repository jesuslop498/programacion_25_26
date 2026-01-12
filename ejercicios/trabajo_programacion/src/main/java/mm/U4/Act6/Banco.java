package mm.U4.Act6;

public class Banco {
    private final String nombre;
    private double capital;
    private String direccion;

    public Banco(String nombre, String direccion) {
        this.nombre = nombre;
        this.capital = 5.2;
        this.direccion = direccion;
    }

    public Banco(String nombre,  String direccion, double capital) {
        this.capital = capital;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCapital() {
        return capital;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void mostrarInfo() {
        System.out.println("Banco: " + nombre);
        System.out.println("Capital: " + capital + " millones de euros");
        System.out.println("Dirección: " + direccion);
    }
}
