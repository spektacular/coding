public class LibraryCard {
    private Student student;
    private Book book;

    public LibraryCard(Student s, Book b) {
        student = s;
        book = b;
    }

    public Student getStudent() {
        return student;
    }

    public Book getBook() {
        return book;
    }

    public String toString() {
        return student.toString() + " has " + book.toString();
    }

    public boolean compare(LibraryCard card) {
        return book.getTitle().equals(card.book.getTitle());
    }

}
