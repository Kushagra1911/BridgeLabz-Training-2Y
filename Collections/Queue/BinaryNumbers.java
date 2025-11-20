import java.util.*;

public class BinaryNumbers {
    public static void main(String[] args) {
        generateBinary(5);
    }

    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String s = q.remove();
            System.out.println(s);

            q.add(s + "0");
            q.add(s + "1");
        }
    }
}
