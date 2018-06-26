import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library() {
        this.books = new ArrayList<>();
        this.capacity = 6;
    }

    public void addBook(Book book) {
        if (this.capacity > this.books.size()) {
            this.books.add(book);
        }
    }

    public Book removeBook() {
        return this.books.remove(0);
    }


    public int getBookCount() {
        return this.books.size();
    }


    public int getCapacity() {
        return this.capacity;
    }
}
