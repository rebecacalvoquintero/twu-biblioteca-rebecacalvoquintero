package com.twu.biblioteca;
import com.twu.biblioteca.items.Book;

import java.util.List;
import java.util.stream.Collectors;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BibliotecaAppTest {

    @Test
    public void welcomeGreetingTest() {
        String result = "Hello, welcome to Biblioteca!!";
        assertEquals(result, BibliotecaApp.welcomeGreeting());

    }


    @Test
    public void getListOfBooksTest() {
        List <String> result = List.of("Eloquent Javascript", "Head First Java", "Programming Phoenix");
        List <Book> listOfBooks = Biblioteca.getListOfBooks();
        List <String> listOfNames = listOfBooks.stream().map(Book -> Book.getName()).collect(Collectors.toList());
        System.out.println("listOfNames");
        System.out.println(listOfNames);
        assertEquals(result, listOfNames);
    }

}
