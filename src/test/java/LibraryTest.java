import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library();
        borrower = new Borrower();
        book = new Book("backwards", "Rob Grant", "Sci-Fi");
    }

    @Test
    public void canCountInventory() {
        assertEquals(0, library.inventoryCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.inventoryCount());
        assertEquals(10, library.capacityCount());
    }

    @Test
    public void canCountCapacity() {
        assertEquals(10, library.capacityCount());
    }

    @Test
    public void canCheckIfStockIsFullBeforeAddingBook() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.inventoryCount());
        assertEquals(0, library.capacityCount());
    }

    @Test
    public void canLetBorrowerCheckOutBook() {
        library.addBook(book);
        borrower.addBookToCollection(book);
        assertEquals(0, library.inventoryCount());
        assertEquals(1, borrower.collectionCount());
    }

}