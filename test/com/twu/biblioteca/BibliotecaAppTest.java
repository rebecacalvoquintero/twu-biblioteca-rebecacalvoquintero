package com.twu.biblioteca;
import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.MainMenu;
import com.twu.biblioteca.items.Book;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BibliotecaAppTest {

    @Test
    public void getListOfBooksTest() {
        List <String> result = List.of("Eloquent Javascript", "Head First Java", "Programming Phoenix");
        List <Book> listOfBooks = new MainMenu().getListOfBooks();
        List <String> listOfNames = listOfBooks.stream().map(Book -> Book.getName()).collect(Collectors.toList());
        System.out.println("listOfNames");
        System.out.println(listOfNames);
        assertEquals(result, listOfNames);
    }

    @Test

    public void readUserInputTest(String message) {

    }
//    public void menuOptionsTest() {
//       List <Book> books = List.of(
//                new Book("Eloquent Javascript", "Marijn Haverbeke", 2011, 10),
//                new Book("Head First Java", "Kathy  Sierra & Bert Bates", 2003, 11),
//                new Book("Programming Phoenix", "Chris McCord, Bruce Tate and Jose Valim", 2016, 12)
//        );
//
//       assertEquals(books, new MainMenu().menuOptions(1));
//
//    }
}
