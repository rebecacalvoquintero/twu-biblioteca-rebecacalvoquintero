package com.twu.biblioteca;
import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.items.Book;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BibliotecaAppTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void getListOfBooksTest() {
        List <String> result = List.of("Eloquent Javascript", "Head First Java", "Programming Phoenix");
        List <Book> listOfBooks = new BibliotecaApp().getListOfBooks();
        List <String> listOfNames = listOfBooks.stream().map(Book -> Book.getName()).collect(Collectors.toList());
        System.out.println("listOfNames");
        System.out.println(listOfNames);
        assertEquals(result, listOfNames);
    }
}
