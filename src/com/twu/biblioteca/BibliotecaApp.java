package com.twu.biblioteca;
import com.twu.biblioteca.items.Book;
import com.twu.biblioteca.MainMenu;

import java.util.List;


public class BibliotecaApp {


    public static void welcomeGreeting() {
        System.out.println("Hello, welcome to Biblioteca!!");
    }

    public static List getListOfBooks() {
        List <Book> listOfBooks = List.of(
                new Book("Eloquent Javascript", "Marijn Haverbeke", 2011),
                new Book("Head First Java", "Kathy  Sierra & Bert Bates", 2003),
                new Book("Programming Phoenix", "Chris McCord, Bruce Tate and Jose Valim", 2016)
        );

        System.out.println(listOfBooks);
        return listOfBooks;


    }

    public static void main(String[] args) {
        // greet user
        welcomeGreeting();

        // prompt user to choose an option
        MainMenu.initMenu();


    }
}
