package mm.U4.Entregables.Pizzeria;

public class Pizza {

    private Size size;
    private Ingrediente[] ingredientes;
    private int numIngredientes;

    public Pizza() {
        this.size = Size.FAMILIAR;
        this.ingredientes = new Ingrediente[3];
        this.numIngredientes = 0;
    }

    public Pizza(Size size) {
        this.size = size;
        this.ingredientes = new Ingrediente[3];
        this.numIngredientes = 0;
    }

    public static void mostrarTamanosDisponibles() {
        for (Size s : Size.values()) {
            System.out.println(s);
        }
    }

    public int getNumeroIngredientes() {
        return numIngredientes;
    }

    public boolean addIngrediente(Ingrediente ingrediente) {
        if (numIngredientes < 3) {
            ingredientes[numIngredientes++] = ingrediente;
            return true;
        }
        return false;
    }

    public void mostrarInformacion() {
        System.out.println("Tamaño: " + size);
        System.out.println("Ingredientes:");
        for (int i = 0; i < numIngredientes; i++) {
            System.out.println(" - " + ingredientes[i]);
        }
    }
}

