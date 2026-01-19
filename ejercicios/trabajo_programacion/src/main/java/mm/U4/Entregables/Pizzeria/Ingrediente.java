package mm.U4.Entregables.Pizzeria;

public class Ingrediente {

    private String nombre;
    private int caloriasPor100g;

    public Ingrediente() {
        this.nombre = "Queso";
        this.caloriasPor100g = 250;
    }

    public Ingrediente(String nombre, int caloriasPor100g) {
        this.nombre = nombre;
        this.caloriasPor100g = caloriasPor100g;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCaloriasPor100g() {
        return caloriasPor100g;
    }

    @Override
    public String toString() {
        return nombre + " (" + caloriasPor100g + " cal/100g)";
    }
}

