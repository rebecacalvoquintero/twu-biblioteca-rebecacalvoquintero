package com.twu.biblioteca;

import com.twu.biblioteca.items.Book;


import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void beforeEach() {
        book = new Book("The Alchemist", "Paolo Coello", 1985, 285);
    }

    @Test
    public void getNameTest() {
        assertEquals("The Alchemist", book.getName());
    }

    @Test
    public void getAuthorTest() {
        assertEquals("Paolo Coello", book.getAuthor());
    }

    @Test
    public void getYearTest() {
        assertEquals(1985, book.getYearPublished());
    }

    @Test
    public void getIdTest() {
        assertEquals(285, book.getId());
    }
}
