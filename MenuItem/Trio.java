package MenuItem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Trio implements MenuItem {
    private String name;
    private double price;
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;

        this.name = String.format("%s/%s/%s", sandwich.getName(), salad.getName(), drink.getName());
        List<MenuItem> items = Arrays.stream(new MenuItem[] { sandwich, salad, drink })
                .sorted((a, b) -> (int) (b.getPrice() - a.getPrice())).collect(Collectors.toList());
        this.price = items.get(0).getPrice() + items.get(1).getPrice();
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.getName();
    }

    public double getPrice() {
        return this.price;
    }

    public Sandwich getSandwich() {
        return this.sandwich;
    }

    public Salad getSalad() {
        return this.salad;
    }

    public Drink Drink() {
        return this.drink;
    }

}
