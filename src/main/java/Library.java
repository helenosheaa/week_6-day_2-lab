import java.util.ArrayList;

public class Library {
    private int capacity;

    private ArrayList<String> books;

    public Library(ArrayList<String> books){
        this.books = books;
        this.capacity = 6;
    }


    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(String book) {
        if (this.capacity > this.books.size()) {
            this.books.add(book);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }
}
