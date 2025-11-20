import java.util.*;

public class NameUpperCase {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("arjun", "sakshi", "neha");
        employees.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
