import java.util.Scanner;

public class StringIndexDemo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // Invalid index
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String text = sc.next();

            System.out.println("Generating Exception:");
            try {
                generateException(text);
            } catch (Exception e) {
                System.out.println("Exception occurred!");
            }

            System.out.println("\nHandling Exception:");
            handleException(text);
        }
    }
}
