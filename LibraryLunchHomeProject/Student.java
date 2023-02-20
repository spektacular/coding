public class Student {
    private String name, id;

    public Student(String n, String i) {
        name = n;
        id = i;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return name + " " + id;
    }
}
