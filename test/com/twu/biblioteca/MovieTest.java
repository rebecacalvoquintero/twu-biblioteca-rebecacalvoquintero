package com.twu.biblioteca;
import com.twu.biblioteca.items.Movie;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class MovieTest {

    private Movie movie;

    @Before
    public void beforeEach() {
        movie = new Movie("EX Machina", 2015, "Alex Garland", 9, 13);
    }

    @Test
    public void getNameTest() {
        assertEquals("EX Machina", movie.getName());
    }

    @Test
    public void getDirectorTest() {
        assertEquals("Alex Garland", movie.getDirector());
    }

    @Test
    public void getYearTest() {
        assertEquals(2015, movie.getYear());
    }

    @Test
    public void getMovieRatingTest() {
        assertEquals(9, movie.getMovieRating());
    }

    @Test
    public void getIdTest() {
        assertEquals(13, movie.getId());
    }
}
