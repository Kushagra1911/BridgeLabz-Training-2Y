import java.util.Scanner;

public class ToUpperCaseCompare {
    public static String toUpperUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') c = (char) (c - 32);
            result.append(c);
        }
        return result.toString();
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();

            String userUpper = toUpperUsingCharAt(text);
            String builtInUpper = text.toUpperCase();

            boolean result = compareUsingCharAt(userUpper, builtInUpper);

            System.out.println("User-defined uppercase: " + userUpper);
            System.out.println("Built-in uppercase: " + builtInUpper);
            System.out.println("Comparison: " + result);
        }
    }
}
