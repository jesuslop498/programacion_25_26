package mm.U4.Entregables.U4_Entregable;

import java.util.Arrays;

public class Escenario {
    private String nombre;
    private String ubicacion;
    private int capacidad;
    private Cantante[] listaCantante;

    public Escenario(String nombre, String ubicacion, int capacidad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.listaCantante = new Cantante[0];
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Cantante[] getListaCantante() {
        return listaCantante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setListaCantante(Cantante[] listaCantante) {
        this.listaCantante = listaCantante;
    }

    public void agregarCantante(Cantante nombre) {
        listaCantante = Arrays.copyOf(listaCantante, listaCantante.length + 1);
        listaCantante[listaCantante.length - 1] = nombre;
    }

    public void mostrarListaCantantes() {
        System.out.print("Cartelera cantantes: ");
        for (int i = 0; i < listaCantante.length; i++) {
            System.out.println(listaCantante[i].getNombreArtistico());
        }
    }

    public void datosEscenario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Capacidad: " + capacidad);
    }


    public void mostrar_informacion() {
        System.out.println("  Escenario: " + nombre);
        System.out.println("  Ubicación: " + ubicacion);
        System.out.println("  Capacidad: " + capacidad);
        System.out.println("  Cantantes:");
        for (Cantante c : listaCantante) {
            c.mostrar_informacion();
        }
    }

}
