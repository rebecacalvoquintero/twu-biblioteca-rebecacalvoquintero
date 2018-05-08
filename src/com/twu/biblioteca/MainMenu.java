package com.twu.biblioteca;
import com.twu.biblioteca.items.Book;
import com.twu.biblioteca.items.Movie;

import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;



public class MainMenu {

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
            checkoutItem(MessagesHelper.checkoutBookMessage,
                    MessagesHelper.checkoutBookSuccessfulMessage,
                    MessagesHelper.checkoutBookFailMessage,
                    books);

        } else if (option == 3) {
            returnItem(MessagesHelper.returnBookMessage,
                    MessagesHelper.returnBookSuccessfulMessage,
                    MessagesHelper.returnBookFailMessage,
                    books);

        } else if (option == 4) {
            message += getListOfMovies();

        } else if (option == 5) {
            checkoutItem(MessagesHelper.checkoutMovieMessage,
                    MessagesHelper.checkoutMovieSuccessfulMessage,
                    MessagesHelper.checkoutMovieFailMessage, movies);

        } else if (option == 6) {
            returnItem(MessagesHelper.returnMovieMessage,
                    MessagesHelper.returnMovieSuccessfulMessage,
                    MessagesHelper.returnMovieFailMessage, movies);

        } else if (option == 0) {
            message += MessagesHelper.EXIT;
            System.out.println(message);
            System.exit(1);

        } else {
            message += MessagesHelper.OPTION_INVALID;
        }

        System.out.println(message);
        initMenu();

    };


    public static void initMenu() {
        menuOptions(readUserInput(MessagesHelper.INITIAL_MENU));

    }

}







