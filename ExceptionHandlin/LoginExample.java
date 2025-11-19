package exceptionsdemo;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

class LoginSystem {
    void validate(String username, String password) throws InvalidCredentialsException {
        if (!username.equals("admin") || !password.equals("1234")) {
            throw new InvalidCredentialsException("Username or Password is incorrect.");
        }
    }
}

public class LoginExample {
    public static void main(String[] args) {
        LoginSystem login = new LoginSystem();

        try {
            login.validate("admin", "0000"); // wrong password
        } catch (InvalidCredentialsException e) {
            System.out.println("Login Failed: " + e.getMessage());
            System.out.println("Try again!");
        }
    }
}

