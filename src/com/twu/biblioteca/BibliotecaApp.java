package com.twu.biblioteca;



public class BibliotecaApp {


    public static String welcomeGreeting() {
        return "Hello, welcome to Biblioteca!!";
    }


    public static void main(String[] args) {
        // greet user
        System.out.println(welcomeGreeting());

        // prompt user to choose a main option
        MainMenu.initMenu();
    }
}
