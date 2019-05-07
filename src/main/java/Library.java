import java.util.ArrayList;

public class Library {
    private ArrayList<Book> inventory;
    private int capacity;

    public Library() {
        this.inventory = new ArrayList<>();
        this.capacity = 3;
    }

    public void addBook(Book book) {
        if (checkAvailableSpace()) {
            inventory.add(book);
            capacity --;
        }
    }

    public Book removeBook() {
        return inventory.remove(0);
    }

    public int inventoryCount() {
        return inventory.size();
    }

    public int capacityCount() {
        return capacity;
    }

    public boolean checkAvailableSpace() {
        return capacity > 0;
    }
}


