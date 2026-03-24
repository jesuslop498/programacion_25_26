package mm.U7.PracticasExamen.ConcursoCanino;

public class Main {
    public static void main(String[] args) {

        Concurso concurso = new Concurso("World Dog Show", "Madrid");

        // Propietarios
        Propietario p1 = new Propietario("Juan", "Perez", 1, "España");
        Propietario p2 = new Propietario("Anna", "Smith", 2, "USA");
        Propietario p3 = new Propietario("Luis", "Garcia", 3, "México");

        // Perros (10)
        concurso.addDog("Labrador", new Perro("Max", 5, 30, true, p1, "Labrador"));
        concurso.addDog("Labrador", new Perro("Rocky", 3, 28, true, p2, "Labrador"));
        concurso.addDog("Pastor", new Perro("Rex", 6, 35, true, p3, "Pastor"));
        concurso.addDog("Pastor", new Perro("Thor", 4, 32, true, p1, "Pastor"));
        concurso.addDog("Bulldog", new Perro("Bruno", 2, 20, false, p2, "Bulldog"));
        concurso.addDog("Bulldog", new Perro("Toby", 5, 22, true, p3, "Bulldog"));
        concurso.addDog("Labrador", new Perro("Buddy", 7, 33, true, p1, "Labrador"));
        concurso.addDog("Pastor", new Perro("Zeus", 1, 25, true, p2, "Pastor"));
        concurso.addDog("Bulldog", new Perro("Leo", 3, 21, true, p3, "Bulldog"));
        concurso.addDog("Labrador", new Perro("Simba", 4, 29, true, p2, "Labrador"));

        // Mostrar perros de un dueño
        System.out.println("\nPerros del socio 1:");
        concurso.ownerDogs(1);

        // Ordenados por peso
        System.out.println("\nLabradores por peso:");
        concurso.perrosPorPeso("Labrador");

        // Ordenados por edad
        System.out.println("\nPastores por edad:");
        concurso.perrosPorEdad("Pastor");

        // Guardar
        concurso.guardarPerros();

        // Cargar (ejemplo)
        Concurso concurso2 = new Concurso("Otro", "Sevilla");
        concurso2.cargarPerros();

        System.out.println("\nPerros cargados:");
        concurso2.perrosPorPeso("Labrador");
    }
}