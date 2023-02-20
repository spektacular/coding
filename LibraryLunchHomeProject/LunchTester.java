public class LunchTester {
    public static void main(String[] args) {
        LunchCard collins = new LunchCard(
                new Student("Collins", "38472"),
                new LunchItem("Cheese Sandwich", "$5.50"));
        LunchCard susan = new LunchCard(
                new Student("Susan", "83091"),
                new LunchItem("Combo Salad", "$7.45"));
        System.out.println(collins.toString());
        System.out.println(susan.toString());
        System.out.println(collins.compare(susan));
    }
}
