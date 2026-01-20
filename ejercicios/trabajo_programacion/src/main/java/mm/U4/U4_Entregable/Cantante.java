package mm.U4.U4_Entregable;

import java.util.Arrays;

public class Cantante {
    private String nombreReal;
    private String nombreArtistico;
    private int edad;
    private String ciudad;
    private Cancion[] listaCanciones;

    public Cantante(String nombreReal, String nombreArtistico, int edad, String ciudad) {
        this.nombreReal = nombreReal;
        this.nombreArtistico = nombreArtistico;
        this.edad = edad;
        this.ciudad = ciudad;
        this.listaCanciones = new Cancion[0];
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Cancion[] getListaCanciones() {
        return listaCanciones;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setListaCanciones(Cancion[] listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    public void insertarCancion(Cancion agregar) {
        listaCanciones = Arrays.copyOf(listaCanciones, listaCanciones.length + 1);
        listaCanciones[listaCanciones.length - 1] = agregar;
    }

    public void mostrarListaCanciones() {
        System.out.print("La lista de las canciones es: ");
        for (int i = 0; i < listaCanciones.length; i++) {
            System.out.println(listaCanciones[i].getTitulo());

        }
    }

    public void eliminarCancionPorTitulo(String titulo) {
        listaCanciones = Arrays.stream(listaCanciones)
                .filter(c -> !c.getTitulo().equalsIgnoreCase(titulo))
                .toArray(Cancion[]::new);
    }


    public void datosPersonales() {
        System.out.println("Nombre real: " + nombreReal);
        System.out.println("Nombre artistico: " + nombreArtistico);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
    }

    public void mostrar_informacion() {
        System.out.println("    Nombre artístico: " + nombreArtistico);
        System.out.println("    Nombre real: " + nombreReal);
        System.out.println("    Edad: " + edad);
        System.out.println("    Ciudad: " + ciudad);
        System.out.println("    Canciones:");
        for (Cancion c : listaCanciones) {
            c.mostrar_informacion();
        }
    }


}
