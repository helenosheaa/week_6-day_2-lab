import java.util.ArrayList;

public class Library {

    private ArrayList<String> books;

    public Library(ArrayList<String> books){
        this.books = books;
    }


    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(String book){
        this.books.add(book);
    }
}
