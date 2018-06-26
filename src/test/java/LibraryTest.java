import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library books;

    @Before
    public void before(){
        ArrayList<String> testBooks = new ArrayList<>();
        testBooks.add("book1");
        testBooks.add("book2");
        testBooks.add("book3");
        testBooks.add("book4");

        books = new Library(testBooks);
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(4, books.getBookCount());
    }

    @Test
    public void canAddBook(){
        books.addBook("book5");
        assertEquals(5, books.getBookCount());
    }
}
