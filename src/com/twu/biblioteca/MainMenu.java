package com.twu.biblioteca;
import com.twu.biblioteca.items.Book;
import com.twu.biblioteca.MainMenu;

import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collection;



public class MainMenu {
    private static final String MAIN_MENU_MSG = "MAIN MENU";
    private static final String OPTION_INVALID = "Select a valid option!";
    private static final String EXIT = "You are exiting BibliotecaApp";
    private static final String INITIAL_MENU = "Choose an option:\n" +
            "1 - List of Books\n" + "" +
            "2 - Checkout a book\n" + "" +
            "3 - Return a book\n" + "" +
            "0 - Quit\n" + "";

    public static List <Book> books = List.of(
            new Book("Eloquent Javascript", "Marijn Haverbeke", 2011, 10),
            new Book("Head First Java", "Kathy  Sierra & Bert Bates", 2003, 11),
            new Book("Programming Phoenix", "Chris McCord, Bruce Tate and Jose Valim", 2016, 12)
    );


    public static int readUserInput(String message)
    {
        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        System.out.print(message);

        // get their input as a String
        int chosenOption = Integer.parseInt(scanner.next());

        return chosenOption;

    }


    public static List getListOfBooks() {
        return books.stream().filter(book -> book.getCheckedOut() == false).collect(Collectors.toList());
    }

    public static void checkoutBook() {

        List <Book> listOfBooks = getListOfBooks();

        String message = "Choose the id of the book you want to checkout:\n" + listOfBooks.toString();

        int option = readUserInput(message);

        for(int i = 0; i < books.size(); i ++){
            Book book = books.get(i);
            if(book.getId() == option && !book.getCheckedOut()){
                book.setCheckedOut(true);
                System.out.println("Thank you! Enjoy the book");
                return;

            } else if(book.getId() != option){
                System.out.println("That book is not available.");
                return;
            }
        }

    }

    public static void returnABook() {
        List <Book> listOfBooks = getListOfBooks();

        String message = "Choose the id of the book you want to return:\n" + listOfBooks.toString();

        int option = readUserInput(message);

        for(int i = 0; i < books.size(); i ++){
            Book book = books.get(i);
            if(book.getId() == option && book.getCheckedOut()){
                book.setCheckedOut(false);
                System.out.println("Thank you for returning the book.");
                return;

            } else if(book.getId() != option){
                System.out.println("That is not a valid book to return.");
                return;
            }
        }
    }


    public static void menuOptions(int option) {
        String message = "";
        if (option == 1 ) {
            message += getListOfBooks();

        } else if (option == 2) {
            checkoutBook();

        } else if (option == 3) {
            returnABook();

        } else if (option == 0) {
            message += EXIT;
            System.exit(1);

        } else {
            message += OPTION_INVALID;
        }

        System.out.println(message);
        initMenu();
    }


    public static void initMenu() {
        menuOptions(readUserInput(INITIAL_MENU));

    }

}







