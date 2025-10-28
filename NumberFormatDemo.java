import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Number: " + num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
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
