package com.twu.biblioteca;

import java.util.Scanner;


public class MainMenu {

    public static User currentUser;


    public static String readUserInput(String message) {
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);

        String chosenOption = scanner.next();
        return chosenOption;

    };

    public static boolean hasUserLoggedIn() {
        return currentUser != null && currentUser.isLogged == true;
    }

    public static void userLogin(String message) {
        System.out.println(message);
        String libraryNumber = readUserInput(MessagesHelper.LibraryNumber);
        String password = readUserInput(MessagesHelper.Password);
        boolean userIsLogged = Biblioteca.login(libraryNumber, password);

        if (userIsLogged) {
            currentUser = Biblioteca.getUserLogged();
            message = String.format(MessagesHelper.loginSuccessful, currentUser.getName());
        } else {
            message = MessagesHelper.loginFailed;
        }

        System.out.println(message);
    }

    public static void menuOptions(String option) {
        String message = "";
        if (Integer.parseInt(option) == 1) {
            message += Biblioteca.getListOfBooks();

        } else if (Integer.parseInt(option) == 2) {
            if (!hasUserLoggedIn()) {
                userLogin(MessagesHelper.loginIsNecessary);
            } else {
                Biblioteca.checkoutItem(MessagesHelper.checkoutBookMessage,
                        MessagesHelper.checkoutBookSuccessfulMessage,
                        MessagesHelper.checkoutBookFailMessage,
                        Biblioteca.books);
            }


        } else if (Integer.parseInt(option) == 3) {
            if (!hasUserLoggedIn()) {
                userLogin(MessagesHelper.loginIsNecessary);
            } else {
                Biblioteca.returnItem(MessagesHelper.returnBookMessage,
                        MessagesHelper.returnBookSuccessfulMessage,
                        MessagesHelper.returnBookFailMessage,
                        Biblioteca.books);
            }

        } else if (Integer.parseInt(option) == 4) {
            message += Biblioteca.getListOfMovies();

        } else if (Integer.parseInt(option) == 5) {
            Biblioteca.checkoutItem(MessagesHelper.checkoutMovieMessage,
                    MessagesHelper.checkoutMovieSuccessfulMessage,
                    MessagesHelper.checkoutMovieFailMessage, Biblioteca.movies);

        } else if (Integer.parseInt(option) == 6) {
            Biblioteca.returnItem(MessagesHelper.returnMovieMessage,
                    MessagesHelper.returnMovieSuccessfulMessage,
                    MessagesHelper.returnMovieFailMessage, Biblioteca.movies);

        } else if (Integer.parseInt(option) == 7) {
            userLogin(MessagesHelper.loginIsNecessary);

        } else if (Integer.parseInt(option) == 8) {
                message += Biblioteca.getUserLoggedDetails();

        } else if (Integer.parseInt(option) == 0) {
            message += MessagesHelper.EXIT;
            System.out.println(message);
            System.exit(1);

        } else {
            message += MessagesHelper.OPTION_INVALID;
        }

        System.out.println(message);
        initMenu();

    }

    ;


    public static void initMenu() {
        menuOptions(readUserInput(MessagesHelper.INITIAL_MENU));

    }

}







