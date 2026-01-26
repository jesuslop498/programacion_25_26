package mm.U4.Entregables.Pizzarra;

import java.util.Calendar;

public class Pedido {
    private Pizza pizza;
    private Calendar fecha;

    public Pedido() {
        this.pizza = new Pizza();
        this.pizza.addIngredientes(new Ingrediente());
        this.pizza.addIngredientes(new Ingrediente("Jamon Iberico", 100));
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Calendar getFecha() {
        return fecha;
    }


}
