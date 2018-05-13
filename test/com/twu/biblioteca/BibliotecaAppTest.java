package com.twu.biblioteca;
import com.twu.biblioteca.items.Book;
import com.twu.biblioteca.items.Movie;

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
        List <String> listOfBookNames = listOfBooks.stream().map(Book -> Book.getName()).collect(Collectors.toList());
        System.out.println("listOfBookNames");
        System.out.println(listOfBookNames);
        assertEquals(result, listOfBookNames);
    }

    @Test
    public void getListOfMovies() {
        List <String> result = List.of("Grand Hotel Budapest", "Match Point", "Amelie");
        List <Movie> listOfMovies = Biblioteca.getListOfMovies();
        List <String> listOfMovieNames = listOfMovies.stream().map(Movie -> Movie.getName()).collect(Collectors.toList());
        System.out.println("listOfMovieNames");
        System.out.println(listOfMovieNames);
        assertEquals(result, listOfMovieNames);
    }

    @Test
    public void successfulLoginTest() {
        Boolean result = true;
        Boolean loginMethod = Biblioteca.login("777-7777", "4444");
        assertEquals(result, loginMethod);
    }

    @Test
    public void failLoginTest() {
        Boolean result = false;
        Boolean loginMethod = Biblioteca.login("777-7777", "3333");
        assertEquals(result, loginMethod);
    }

    @Test
    public void getUserDetailsTest() {
        Boolean loggedUser = Biblioteca.login("777-7777", "4444");
        String result = "User Informations:\n\n"+
                "Name:         " + "Rebeca" +  "\n" +
                "Email:        " + "rebecacalvoquintero@hotmail.es" + "\n" +
                "Phone number: " + "+44 7593114428" + "\n";

        assertEquals(result, Biblioteca.getUserLoggedDetails());
    }



}
