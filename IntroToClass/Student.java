public class Student {
    private String name;
    private int id;

    public Student(String sName, int sId) {
        name = sName;
        id = sId;
    }

    public String toString() {
        return String.format("%s %d", name, id);
    }
}
