import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

public Borrower(){
    this.collection = new ArrayList<>();
}

public void borrow(Library library, String book){
    String book = library.removeBook();
    this.collection.add(book);
}

    public int bookCount() {
    return this.collection.size();
    }
}