package mm.U6.Tarea3;

public class Main {

    public static void main(String[] args) {

        try {

            Cliente c1 = new Cliente(15);
            System.out.println("Cliente creado con edad: " + c1.getEdad());

        } catch (EdadFueraDeRangoException e) {

            System.out.println("Error de rango: " + e.getMessage());

        } catch (MenorDeEdadException e) {

            System.out.println("Error: " + e.getMessage());

        }

        try {

            Cliente c2 = new Cliente(25);
            System.out.println("Cliente creado con edad: " + c2.getEdad());

        } catch (EdadFueraDeRangoException | MenorDeEdadException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }
}

