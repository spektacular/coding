public class LunchItem {
    private String name;
    private String price;

    public LunchItem(String n, String p) {
        name = n;
        price = p;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String toString() {
        return name + " " + price;
    }
}