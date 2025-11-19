package exceptionsdemo;

import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) {
        super(msg);
    }
}

class InvalidReturnException extends Exception {
    public InvalidReturnException(String msg) {
        super(msg);
    }
}

class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String msg) {
        super(msg);
    }
}

class Library {

    Map<String, Boolean> books = new HashMap<>();
    List<String> borrowed = new ArrayList<>();

    Library() {
        books.put("Java", true);
        books.put("Python", false);
        books.put("C++", true);
    }

    void borrowBook(String book)
            throws BookNotAvailableException, UserLimitExceededException {

        if (!books.containsKey(book) || !books.get(book))
            throw new BookNotAvailableException("Book not available.");

        if (borrowed.size() >= 5)
            throw new UserLimitExceededException("Borrow limit reached.");

        borrowed.add(book);
        books.put(book, false);
        System.out.println("Book borrowed: " + book);
    }

    void returnBook(String book) throws InvalidReturnException {
        if (!borrowed.contains(book))
            throw new InvalidReturnException("You never borrowed this book.");
        borrowed.remove(book);
        books.put(book, true);
        System.out.println("Book returned: " + book);
    }
}

public class LibraryExample {
    public static void main(String[] args) {
        Library library = new Library();

        try {
            library.borrowBook("Python");
        } catch (Exception e) {
            System.out.println("Library Error: " + e.getMessage());
        }
    }
}
