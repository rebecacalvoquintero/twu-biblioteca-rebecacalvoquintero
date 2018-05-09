package com.twu.biblioteca;

import com.twu.biblioteca.items.Book;
import com.twu.biblioteca.items.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {

//     contains the books, movies and the users details

    public static List <Book> books = List.of(
            new Book("Eloquent Javascript", "Marijn Haverbeke", 2011, 10),
            new Book("Head First Java", "Kathy  Sierra & Bert Bates", 2003, 11),
            new Book("Programming Phoenix", "Chris McCord, Bruce Tate and Jose Valim", 2016, 12)
    );

    public static List <Movie> movies = List.of(
            new Movie("Grand Hotel Budapest", 2014, "Wes Anderson",  9, 15),
            new Movie("Match Point", 2005, "Woody Allen", 7, 16),
            new Movie("Amelie", 2001, "Jean-Pierre Jeunet", 10, 17)
    );

    public static List <User> users = List.of(
            new User("Rebeca", "rebecacalvoquintero@hotmail.es", "+44 7593114428",  "777-7777", "4444"),
            new User("Rory", "roryo@hotmail.com", "+44 7583234447",  "555-5555", "1111"),
            new User("Conor", "conor@gmail.com", "+44 7666666666",  "333-3333", "6666")
    );

    public static User userLogged;


    public static List getListOfBooks() {
        return books.stream().filter(book -> book.getCheckedOut() == false).collect(Collectors.toList());
    }

    public static List getListOfMovies() {
        return movies.stream().filter(movie -> movie.getCheckedOut() == false).collect(Collectors.toList());
    }


    public static void checkoutItem(String checkoutMessage, String checkoutSuccessfulMessage, String checkoutFailMessage, List items) {

        int option = Integer.parseInt(MainMenu.readUserInput(checkoutMessage));
        if (items == books){
            isBookCheckedOut(option, checkoutSuccessfulMessage, checkoutFailMessage);
        } else if (items == movies) {
            isMovieCheckedOut(option, checkoutSuccessfulMessage, checkoutFailMessage);
        }

    }

    public static void returnItem(String checkoutMessage, String checkoutSuccessfulMessage, String checkoutFailMessage, List items) {

        int option = Integer.parseInt(MainMenu.readUserInput(checkoutMessage));
        if (items == books){
            isBookReturned(option, checkoutSuccessfulMessage, checkoutFailMessage);
        } else if (items == movies) {
            isMovieReturned(option, checkoutSuccessfulMessage, checkoutFailMessage);
        }

    }

    public static void isBookCheckedOut(int option, String successfulMessage, String failMessage) {
        for(int i = 0; i < books.size(); i ++){
            Book book = books.get(i);
            System.out.println(book);
            if(book.getId() == option && !book.getCheckedOut()){
                book.setCheckedOut(true);
                System.out.println(successfulMessage);
                return;

            }  else if(book.getId() != option){
                System.out.println(failMessage);
                return;

            }
        }
    }
    public static void isMovieCheckedOut(int option, String successfulMessage, String failMessage) {
        for(int i = 0; i < movies.size(); i ++){
            Movie movie = movies.get(i);
            System.out.println(movie);
            if(movie.getId() == option && !movie.getCheckedOut()){
                movie.setCheckedOut(true);
                System.out.println(successfulMessage);
                return;

            }  else if(movie.getId() != option){
                System.out.println(failMessage);
                return;

            }
        }
    }

    public static void isBookReturned(int option, String successfulMessage, String failMessage) {
        for(int i = 0; i < books.size(); i ++){
            Book book = books.get(i);
            System.out.println(book);
            if(book.getId() == option && book.getCheckedOut()){
                book.setCheckedOut(false);
                System.out.println(successfulMessage);
                return;

            } else if(book.getId() != option){
                System.out.println(failMessage);
                return;

            }
        }
    }
    public static void isMovieReturned(int option, String successfulMessage, String failMessage) {
        for(int i = 0; i < movies.size(); i ++){
            Movie movie = movies.get(i);
            if(movie.getId() == option && movie.getCheckedOut()){
                movie.setCheckedOut(false);
                System.out.println(successfulMessage);
                return;

            } else if(movie.getId() != option){
                System.out.println(failMessage);
                return;
            }
        }
    }

    public static boolean login(String libraryNumber, String password) {
        User isUserFound = findUsersByLibraryNumberAndPassword(libraryNumber, password);
        userLogged = isUserFound;
        if (isUserFound != null) {
            return true;
        }
        return false;
    }

    public static User getUserLogged() {
        return userLogged;
    }

    public static String getUserLoggedDetails() {
        return userLogged.getUserDetails();
    }

    public static User findUsersByLibraryNumberAndPassword(String userLibraryNumber, String userPassword){
        List <User> usersFound = users.stream()
                .filter(u -> u.checkCredentials(userLibraryNumber, userPassword))
                .collect(Collectors.toList());
        if(usersFound.size() > 0){
            return usersFound.get(0);
        }
        return null;
    };

}


