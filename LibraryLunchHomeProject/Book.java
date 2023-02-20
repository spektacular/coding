public class Book {
    private String title;
    private String serial;

    public Book(String t, String s) {
        title = t;
        serial = s;
    }

    public String getTitle() {
        return title;
    }

    public String getSerial() {
        return serial;
    }

    public String toString() {
        return title + " " + serial;
    }
}
