package com.twu.biblioteca;

public class User {

        private String name;
        private String email;
        private String phone;

        private String libraryNumber;
        private String password;
        public boolean isLogged;

        public User(String name, String email, String phone, String libraryNumber, String password) {
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.libraryNumber = libraryNumber;
            this.password = password;
            this.isLogged = false;
        }

        public String getName() {
            return name;
        }

        public boolean checkCredentials ( String userLibraryNumber, String userPassword) {
            return (libraryNumber.equals(userLibraryNumber) && password.equals(userPassword));
        }

        public String getUserDetails(){

            return  "User Informations:\n\n"+
                    "Name:         " + name +  "\n" +
                    "Email:        " + email + "\n" +
                    "Phone number: " + phone + "\n";

        }

    }
