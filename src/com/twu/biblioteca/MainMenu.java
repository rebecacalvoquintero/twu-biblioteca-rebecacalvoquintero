package com.twu.biblioteca;
import com.twu.biblioteca.items.Book;
import com.twu.biblioteca.items.Movie;

import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;



public class MainMenu {
    private static final String OPTION_INVALID = "Select a valid option!";
    private static final String EXIT = "You are exiting BibliotecaApp";
    private static final String INITIAL_MENU = "Choose an option:\n" +
            "1 - List of Books\n" + "" +
            "2 - Checkout a book\n" + "" +
            "3 - Return a book\n" + "" +
            "4 - List of Movies\n" + "" +
            "5 - Checkout a Movie\n" + "" +
            "6 - Return a Movie\n" + "" +
            "0 - Quit\n" + "";

    private static final String checkoutBookMessage = "Choose the id of the book you want to checkout:\n";
    private static final String checkoutBookSuccessfulMessage = "Thank you! Enjoy the book";
    private static final String checkoutBookFailMessage = "Sorry, that book is not available.";
    private static final String checkoutMovieMessage = "Choose the id of the movie you want to checkout:\n";
    private static final String checkoutMovieSuccessfulMessage = "Thank you! Enjoy the movie";
    private static final String checkoutMovieFailMessage = "Sorry, that movie is not available.";

    private static final String returnBookMessage = "Choose the id of the book you want to return:\n";
    private static final String returnBookSuccessfulMessage = "Thank you for returning the book.";
    private static final String returnBookFailMessage = "That is not a valid book to return.";

    private static final String returnMovieMessage = "Choose the id of the movie you want to return:\n";
    private static final String returnMovieSuccessfulMessage = "Thank you for returning the movie.";
    private static final String returnMovieFailMessage = "That is not a valid movie to return.";

    private static List <Book> books = List.of(
            new Book("Eloquent Javascript", "Marijn Haverbeke", 2011, 10),
            new Book("Head First Java", "Kathy  Sierra & Bert Bates", 2003, 11),
            new Book("Programming Phoenix", "Chris McCord, Bruce Tate and Jose Valim", 2016, 12)
    );

    private static List <Movie> movies = List.of(
            new Movie("Grand Hotel Budapest", 2014, "Wes Anderson",  9, 15),
            new Movie("Match Point", 2005, "Woody Allen", 7, 16),
            new Movie("Amelie", 2001, "Jean-Pierre Jeunet", 10, 17)
    );


    public static int readUserInput(String message)
    {
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);

        int chosenOption = Integer.parseInt(scanner.next());

        return chosenOption;

    }


    public static List getListOfBooks() {
        return books.stream().filter(book -> book.getCheckedOut() == false).collect(Collectors.toList());
    }

    public static List getListOfMovies() {
        return movies.stream().filter(movie -> movie.getCheckedOut() == false).collect(Collectors.toList());
    }


    public static void checkoutItem(String checkoutMessage, String checkoutSuccessfulMessage, String checkoutFailMessage, List items) {

        int option = readUserInput(checkoutMessage);
        if (items == books){
            isBookCheckedOut(option, checkoutSuccessfulMessage, checkoutFailMessage);
        } else if (items == movies) {
            isMovieCheckedOut(option, checkoutSuccessfulMessage, checkoutFailMessage);
        }

    }

    public static void returnItem(String checkoutMessage, String checkoutSuccessfulMessage, String checkoutFailMessage, List items) {

        int option = readUserInput(checkoutMessage);
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

    public static void menuOptions(int option) {
        String message = "";
        if (option == 1 ) {
            message += getListOfBooks();

        } else if (option == 2) {
            checkoutItem(checkoutBookMessage, checkoutBookSuccessfulMessage, checkoutBookFailMessage, books);

        } else if (option == 3) {
            returnItem(returnBookMessage, returnBookSuccessfulMessage, returnBookFailMessage, books);

        } else if (option == 4) {
            message += getListOfMovies();

        } else if (option == 5) {
            checkoutItem(checkoutMovieMessage, checkoutMovieSuccessfulMessage, checkoutMovieFailMessage, movies);

        } else if (option == 6) {
            returnItem(returnMovieMessage, returnMovieSuccessfulMessage, returnMovieFailMessage, movies);

        } else if (option == 0) {
            message += EXIT;
            System.out.println(message);
            System.exit(1);

        } else {
            message += OPTION_INVALID;
        }

        System.out.println(message);
        initMenu();

    };


    public static void initMenu() {
        menuOptions(readUserInput(INITIAL_MENU));

    }

}







