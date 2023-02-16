public class StudentTester {
    public static void main(String[] args) {
        var s1 = new Student("Dan Webster", 45519);
        var s2 = new Student("Chris Murphy", 84938);
        var s3 = new Student("Default", 0);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
