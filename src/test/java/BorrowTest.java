import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowTest {
    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library();
        book = new Book("The Jungle Book");
        library.addBook(book);
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.bookCount());
    }
}


