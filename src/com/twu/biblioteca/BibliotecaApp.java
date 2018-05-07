package com.twu.biblioteca;

import java.util.List;

public class BibliotecaApp {

    List<String> books = List.of("Harry Potter", "Eloquent Javascript", "TWU", "Cinderella");


    public static void greeting() {
        System.out.println("Hello, welcome to Biblioteca!!");
    }

    public static void getListOfBooks(books) {
        System.out.println(books.get())
    }

    public static void main(String[] args) {
        greeting();
    }
}
