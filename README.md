## Welcome to Biblioteca!!

A library management system where as a User I would like to see the following:

- [x] The Welcome Message: "Welcome to Biblioteca!!" when I start the application, so that I feel welcome and know that Biblioteca is available.
- [x] After the welcome message appears I would like to see a list of all library books, so that I can browse for books I might want to check-out. Assume that there is a pre-existing list of books. You don't need to support adding or removing books from the library.
- [x] A list of all books to include each books Author and Year Published, so that I can be confident that I have found the book I am looking for. 
- [x] Main Menu  - As a customer, instead of automatically seeing the book list, I would like to see a list of options and be able to choose one. For now, the only option should be 'List Books'. All future options should be added to this menu also.
- [x] Invalid Menu Option - As a customer, I would like to be notified when I choose an invalid option with the message “Select a valid option!”, so that I can know when I need to re-enter my choice.
- [x] Quit - As a customer, I would like to continue choosing options until I choose to 'Quit'.
- [x] Checkout Book - As a librarian, I would like customers to be able to check-out a book. Checked out books should not appear in the list of all library books.
- [x] Successful Checkout - As a customer, I would like to know that a book has been checked out by seeing the message “Thank you! Enjoy the book”.
- [x] Unsuccessful Checkout - As a customer, I would like to be notified if the book I tried to check-out is not available by seeing the message, “That book is not available.”, so that I know that I need to select a different book or fix my spelling error.
- [x] As a librarian, I would like customers to be able to return a book, so that other customers can check that book out. Returned books should appear in the list of library books.
- [x] I would like to be notified if the book I am returning belongs to this library by seeing the message, “Thank you for returning the book.”, so that I know I returned the book to the right library.
- [x] I would like to be notified if the book I am returning has not been added to this library by seeing the message, “That is not a valid book to return.”, so that I can return it to the correct library or fix my spelling error.
- [x] I would like to see a list of available movies, so that I can browse for a movie that I might check-out. Movies have a name, year, director and movie rating (from 1-10 or unrated).
- [x] I would like to check out a movie from the library, so I can enjoy it at home.
- [x] User Accounts - Login - As a librarian, I want to know who has checked out a book, so that I can hold them accountable for returning it. Users must now login using their library number (which is in the format xxx-xxxx) and a password in order to check-out and return books. User credentials are predefined, so registering new users is not part of this story.
- [x] I want to be able to see my user information (name, email address and phone number), so that I know that the library can contact me. This option should only be available when the customer is logged in and should only display that customer’s information.

## How?

Biblioteca, is an application written in java, using a TDD approach.

## Installation instructions

- Clone the respo
``` git clone https://github.com/rebecacalvoquintero/twu-biblioteca-rebecacalvoquintero.git```

- Go to the directory where the repo has been downloaded

``` cd twu-biblioteca-rebecacalvoquintero```

- Open it with your Intellij editor, and go to the file BibliotecaApp within the src directory. Click on the play icon within the Biblioteca Class and click on 'Run 'BibliotecaApp.main()''.

![](https://i.imgur.com/VTkJpQj.png)

![](https://i.imgur.com/Y0C9DBX.png)

- Startenjoying the bibliotecaApp!

## Running tests

- Go to the test directory and right click it.
- Select the option 'Run all tests'

![](https://i.imgur.com/I1JBvg0.png)


![](https://i.imgur.com/6cgsvN2.png)



