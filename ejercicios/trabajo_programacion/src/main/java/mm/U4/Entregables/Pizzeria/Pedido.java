package mm.U4.Entregables.Pizzeria;

import java.util.Calendar;

public class Pedido {

    private Pizza pizza;
    private Calendar momento;

    public Pedido(Pizza pizza) {
        this.pizza = pizza;
        this.momento = Calendar.getInstance();
    }

    public static Pedido pedidoEstrella() {
        Pizza pizza = new Pizza(Size.FAMILIAR);
        pizza.addIngrediente(new Ingrediente("Jamón ibérico", 300));
        pizza.addIngrediente(new Ingrediente()); // Queso por defecto
        return new Pedido(pizza);
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Calendar getMomento() {
        return momento;
    }

    public void mostrarPedido() {
        System.out.println("Pedido realizado el: " + momento.getTime());
        pizza.mostrarInformacion();
    }
}

