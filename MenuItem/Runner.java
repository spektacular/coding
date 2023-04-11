package MenuItem;

public class Runner {
    public static void main(String[] args) {
        Trio t1 = new Trio(
                new Sandwich("Italian Sandwich", 6.30),
                new Salad("Ceasar Salad", 2.25),
                new Drink("Iced Tea", 2.00));
        Trio t2 = new Trio(
                new Sandwich("Club Sandwich", 7.25),
                new Salad("Coleslaw", 1.25),
                new Drink("Orange Soda", 1.35));
        Trio t3 = new Trio(
                new Sandwich("Sandwich", 5.25),
                new Salad("Salad", 1.10),
                new Drink("Drink", 3.99));

        System.out.println(t1.getName());
        System.out.println(t1.getPrice());
        System.out.println(t2.getName());
        System.out.println(t2.getPrice());
        System.out.println(t3.getName());
        System.out.println(t3.getPrice());

    }
}
