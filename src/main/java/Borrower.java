import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<>();
    }

    public int collectionCount() {
        return collection.size();
    }

    public void addBookToCollection(Book book) {
        collection.add(book);
    }

    public void checkOutBook(Library library) {
        Book book = library.removeBook();
        addBookToCollection(book);
    }
 }