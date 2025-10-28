import java.util.Scanner;

public class ArrayIndexDemo {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]); // Out of bounds
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of names: ");
            int n = sc.nextInt();
            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter name " + (i + 1) + ": ");
                names[i] = sc.next();
            }

            System.out.println("Generating Exception:");
            try {
                generateException(names);
            } catch (Exception e) {
                System.out.println("Exception occurred!");
            }

            System.out.println("\nHandling Exception:");
            handleException(names);
        }
    }
}
