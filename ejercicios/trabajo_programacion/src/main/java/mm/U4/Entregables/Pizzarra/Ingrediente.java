package mm.U4.Entregables.Pizzarra;

public class Ingrediente {
    private String nombre;
    private Integer calorias_por_100;

    public Ingrediente() {
        this.nombre = "Queso";
        this.calorias_por_100 = 250;
    }

    public Ingrediente(String nombre, Integer calorias_por_100) {
        this.nombre = nombre;
        this.calorias_por_100 = calorias_por_100;
    }
}
