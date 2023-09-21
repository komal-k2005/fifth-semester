public class Book {
    private String title;
    private String author;
    private String isbn;
    // other attributes, constructor, getters, setters
}
public class Member {
    private String name;
    private int id;
    private String contact;
    // other attributes, constructor, getters, setters
}
public class Member {
    private String name;
    private int id;
    private String contact;
    // other attributes, constructor, getters, setters
}
public class Transaction {
    private Book book;
    private Member member;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    // other attributes, constructor, getters, setters
}
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    // Methods to add, remove, search books and members
    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    // Methods for borrowing and returning books
    public void borrowBook(Book book, Member member) {
        // Create a new transaction and update book availability
    }

    public void returnBook(Book book, Member member) {
        // Update the transaction and book availability
    }

    // Other methods for searching books, listing transactions, etc.
}
