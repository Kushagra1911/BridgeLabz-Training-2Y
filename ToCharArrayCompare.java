import java.util.Scanner;

public class ToCharArrayCompare {
    public static char[] getChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String text = sc.next();

            char[] userArray = getChars(text);
            char[] builtInArray = text.toCharArray();

            boolean result = compareCharArrays(userArray, builtInArray);
            System.out.println("Comparison result: " + result);
        }
    }
}
