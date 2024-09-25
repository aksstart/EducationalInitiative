import java.util.*;

// Define the interface for the iterator
interface PizzaIterator {
    boolean hasNext();

    Pizza next();
}

// Define the class for the iterator
class DominosIterator implements PizzaIterator {
    private List<Pizza> pizzas;
    private int position = 0;

    public DominosIterator(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public boolean hasNext() {
        return position < pizzas.size() && pizzas.get(position) != null;
    }

    public Pizza next() {
        Pizza pizza = pizzas.get(position);
        position++;
        return pizza;
    }
}

// Define the class for the collection
class DominosMenu {
    private List<Pizza> pizzas;

    public DominosMenu() {
        pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public PizzaIterator createIterator() {
        return new DominosIterator(pizzas);
    }
}

// Define the main function to test the iterator
public class iterhw {
    public static void main(String[] args) {
        DominosMenu menu = new DominosMenu();
        menu.addPizza(new Pizza("Pepperoni"));
        menu.addPizza(new Pizza("Cheese"));
        menu.addPizza(new Pizza("Veggie"));

        PizzaIterator iterator = menu.createIterator();
        while (iterator.hasNext()) {
            Pizza pizza = iterator.next();
            System.out.println("Pizza: " + pizza.getName());
        }
    }
}

// Define the class for the pizza
class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
