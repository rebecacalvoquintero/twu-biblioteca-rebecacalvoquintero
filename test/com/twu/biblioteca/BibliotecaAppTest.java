package com.twu.biblioteca;
import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.MainMenu;
import com.twu.biblioteca.items.Book;

import java.util.List;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.stream.Collectors;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BibliotecaAppTest {
    private Book book;

    @Test
    public void getListOfBooksTest() {
        List <String> result = List.of("Eloquent Javascript", "Head First Java", "Programming Phoenix");
        List <Book> listOfBooks = new MainMenu().getListOfBooks();
        List <String> listOfNames = listOfBooks.stream().map(Book -> Book.getName()).collect(Collectors.toList());
        System.out.println("listOfNames");
        System.out.println(listOfNames);
        assertEquals(result, listOfNames);
    }

}
