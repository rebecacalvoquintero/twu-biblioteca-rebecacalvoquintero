package com.twu.biblioteca;

public class MessagesHelper {

    public static String OPTION_INVALID = "Select a valid option!";
    public static String EXIT = "You are exiting BibliotecaApp";
    public static String INITIAL_MENU = "Choose an option:\n" +
            "1 - List of Books\n" + "" +
            "2 - Checkout a book\n" + "" +
            "3 - Return a book\n" + "" +
            "4 - List of Movies\n" + "" +
            "5 - Checkout a Movie\n" + "" +
            "6 - Return a Movie\n" + "" +
            "7 - Login\n" +
            "8 - User information\n" +
            "0 - Quit\n" + "";

    public static String checkoutBookMessage = "Choose the id of the book you want to checkout:\n";
    public static String checkoutBookSuccessfulMessage = "Thank you! Enjoy the book";
    public static String checkoutBookFailMessage = "Sorry, that book is not available.";
    public static String checkoutMovieMessage = "Choose the id of the movie you want to checkout:\n";
    public static String checkoutMovieSuccessfulMessage = "Thank you! Enjoy the movie";
    public static String checkoutMovieFailMessage = "Sorry, that movie is not available.";

    public static String returnBookMessage = "Choose the id of the book you want to return:\n";
    public static String returnBookSuccessfulMessage = "Thank you for returning the book.";
    public static String returnBookFailMessage = "That is not a valid book to return.";

    public static String returnMovieMessage = "Choose the id of the movie you want to return:\n";
    public static String returnMovieSuccessfulMessage = "Thank you for returning the movie.";
    public static String returnMovieFailMessage = "That is not a valid movie to return.";

    public static String loginIsNecessary = "Please login to continue";
    public static String loginSuccessful = "Login Successful";
    public static String loginFailed = "Sorry, the details are not correct. Please try again";

    public static String LibraryNumber = "Library number: ";
    public static String Password = "Password: ";
}
