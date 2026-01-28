package mm.U4.Entregables.U4_Entregable;

import java.util.Arrays;

public class Concierto {
    private String nombre;
    private String fecha;
    private Escenario[] listaEscenaraios;

    public Concierto(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.listaEscenaraios = new Escenario[0];
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public Escenario[] getListaEscenaraios() {
        return listaEscenaraios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setListaEscenaraios(Escenario[] listaEscenaraios) {
        this.listaEscenaraios = listaEscenaraios;
    }

    public void agregarEscenario(Escenario insertar) {
        listaEscenaraios = Arrays.copyOf(listaEscenaraios, listaEscenaraios.length + 1);
        listaEscenaraios[listaEscenaraios.length - 1] = insertar;
    }

    public void programarConcierto(String fecha) {
        this.fecha = fecha;
    }

    public void mostrarCartelera() {
        for (Escenario e : listaEscenaraios) {
            System.out.println("Escenario: " + e.getNombre());
            e.mostrarListaCantantes();
        }
    }

    @Override
    public String toString() {
        return "Concierto: " + nombre + " | Fecha: " + fecha;
    }

    public void mostrar_informacion() {
        System.out.println("Concierto: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Escenarios:");
        for (Escenario e : listaEscenaraios) {
            e.mostrar_informacion();
        }
    }



}
