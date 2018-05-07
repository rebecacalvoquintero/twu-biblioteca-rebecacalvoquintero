package com.twu.biblioteca;
import com.twu.biblioteca.items.Book;
import com.twu.biblioteca.MainMenu;

import java.util.Scanner;
import java.util.List;


public class MainMenu {
    private static final String MAIN_MENU_MSG = "MAIN MENU";
    private static final String OPTION_INVALID = "Select a valid option!";
    private static final String EXIT = "You are exiting BibliotecaApp";

    public static void readUserInput()
    {
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose an option:\n" +
                "1 - Books List\n" + "" +
                "0 - Quit\n" + "");

        // get their input as a String
        String chosenOption = scanner.next();

         menuOptions(chosenOption);

    }

    public static List getListOfBooks() {
        List <Book> listOfBooks = List.of(
                new Book("Eloquent Javascript", "Marijn Haverbeke", 2011),
                new Book("Head First Java", "Kathy  Sierra & Bert Bates", 2003),
                new Book("Programming Phoenix", "Chris McCord, Bruce Tate and Jose Valim", 2016)
        );

        return listOfBooks;

    }

    public static void menuOptions(String option) {
        String message = "";
        switch (option) {
            case "1":
                message += getListOfBooks();
                break;

            case "0":
                message += EXIT;
                break;

            default:
                message += OPTION_INVALID;
        }

        System.out.println(message);

        if (option == "0") {
            System.exit(1);
        }
    }

    public static void initMenu() {
        readUserInput();
    }

}







