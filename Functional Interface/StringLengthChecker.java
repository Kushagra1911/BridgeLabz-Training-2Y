import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunc = str -> str.length();

        String message = "Hello Interface World!";
        int len = lengthFunc.apply(message);

        System.out.println("Message length: " + len);
        System.out.println(len > 20 ? "⚠️ Exceeds character limit" : "Within limit");
    }
}
