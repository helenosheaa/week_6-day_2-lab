import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("The Jungle Book", GenreType.CHILDREN);
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(6, library.getCapacity());
    }

    @Test
    public void unableToAddBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.getBookCount());
    }

    @Test
    public void canGetBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.getBookCount());

    }

}
