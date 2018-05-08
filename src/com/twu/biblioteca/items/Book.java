package com.twu.biblioteca.items;


public class Book {

    String name;
    String author;
    int yearPublished;
    int id;
    boolean checkedOut = false;

    public Book (String name, String author, int yearPublished, int id){
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.id = id;
    }

    @Override public String toString() {
        return "Book: { name:'" + name + "', Author:'" + author + "', Year of Publication:" + yearPublished + "', Id:" + id + "', checkedOut:" + checkedOut + "}\n";
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

    public int getId() {
       return id;
   }

    public void setCheckedOut(boolean checkedOut) {
         this.checkedOut = checkedOut;
    }

    public boolean getCheckedOut() {
        return checkedOut;
    }

}
