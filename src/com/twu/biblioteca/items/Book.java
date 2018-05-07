package com.twu.biblioteca.items;


public class Book {

    String name;
    String author;
    int yearPublished;

    public Book (String name, String author, int yearPublished){
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override public String toString() {
        return "Book: Name='" + name + "', Author=" + author + "', Year of Publication=" + yearPublished;
    }

    public String getName() {
        return name;
    }

   public String getAuthor(){
       return author;
   }

   public int getYearPublished() {
       return yearPublished;
   }

}
