package com.twu.biblioteca.items;

public class Movie {

    String name;
    int year;
    String director;
    //        form 1-10 rating
    int movieRating;
    int id;

    boolean checkedOut = false;

    public Movie(String name, int year, String director, int movieRating, int id) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Movie: { name=:'" + name + "', " +
                "Year:'" + year + "', " +
                "Director:'" + director + "', " +
                "Movie Rating:'" + movieRating + "', " +
                "Id:" + id + "', checkedOut:" + checkedOut + "}\n";
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public int getMovieRating() {
        return movieRating;
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

