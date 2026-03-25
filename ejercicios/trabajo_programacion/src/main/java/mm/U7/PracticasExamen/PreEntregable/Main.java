package mm.U7.PracticasExamen.PreEntregable;

public class Main {
    public static void main(String[] args) {

        Coordenadas coord = new Coordenadas(36, -5);
        EstacionMeteorologica estacion = new EstacionMeteorologica("datos.dat", coord);

        estacion.addMedicion(new Medicion(25, 60, 1010));
        estacion.addMedicion(new Medicion(30, 50, 1005));
        estacion.addMedicion(new Medicion(20, 80, 1020));

        System.out.println("Lista original:");
        estacion.mostrar();

        estacion.ordenaTemperaturasAsc();
        System.out.println("\nOrdenadas por temperatura:");
        estacion.mostrar();

        estacion.ordenaHumedadesDesc();
        System.out.println("\nOrdenadas por humedad descendente:");
        estacion.mostrar();

        System.out.println("\nPresión máxima:");
        System.out.println(estacion.presionMaxima());

        Medicion buscada = new Medicion(25, 60, 1010);
        System.out.println("\n¿Existe medición? " + estacion.buscaMedicion(buscada));

        estacion.guardarFichero("datos.dat");
    }
}