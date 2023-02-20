public class LibraryCardTester {
    public static void main(String[] args) {
        LibraryCard micheal = new LibraryCard(
                new Student("Michael", "32432"),
                new Book("Gone With the Wind", "283992"));
        LibraryCard jake = new LibraryCard(
                new Student("Jake", "83992"),
                new Book("The Hunger Games", "389283"));
        System.out.println(micheal.toString());
        System.out.println(jake.toString());
        System.out.println(micheal.compare(jake));
    }
}
