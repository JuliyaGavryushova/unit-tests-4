package seminars.fourth.book;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    BookRepository bookRepository;
    BookService bookService;
    Book book;
    Book book1;
    List<Book> books;

    @BeforeEach
    void setup() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
        book = new Book("1", "12 стульев", "Ильф, Петров");
        book1 = new Book("2", "Евгений Онегин", "Пушкин");
        books = Arrays.asList(book, book1);
        when(bookRepository.findById("1")).thenReturn(book);
        when(bookRepository.findAll()).thenReturn(books);
    }

    @Test
    void findBookByIdTest() {
        Book result = bookService.findBookById("1");
        assertEquals(book, result);
        verify(bookRepository, times(1)).findById("1");
    }

    @Test
    void findAllBooksTest() {
        List<Book> res = bookService.findAllBooks();
        assertEquals(books, res);
        verify(bookRepository, times(1)).findAll();
    }
}