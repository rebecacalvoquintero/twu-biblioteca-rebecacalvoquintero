package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class UserTest {

    private User user;

    @Before
    public void beforeEach() {
        user = new User("Felipe", "felipe@gmail.com",
                "076598125643", "767-9898", "6666");
    }

    @Test
    public void getNameTest() {
        assertEquals("Felipe", user.getName());
    }


    @Test
    public void checkValidCredentials( ) {
        assertEquals(true, user.checkCredentials("767-9898", "6666"));
    }

    @Test
    public void checkWrongLibraryNumber() {
        assertEquals(false, user.checkCredentials("876", "6666"));
    }

    @Test
    public void checkWrongPassword() {
        assertEquals(false, user.checkCredentials("767-9898", "6696"));
    }

    @Test
    public void getUserDetails() {
        String result = "User Informations:\n\n"+
                "Name:         " + "Felipe" +  "\n" +
                "Email:        " + "felipe@gmail.com" + "\n" +
                "Phone number: " + "076598125643" + "\n";

        assertEquals(result, user.getUserDetails());
    }

};

