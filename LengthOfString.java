import java.util.*;

public class LengthOfString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = sc.nextLine();
            int count = 0;
            for (char c : text.toCharArray()) {
                count++;
            }
            System.out.println("Length of the string: " + count);
        }
    }
}
