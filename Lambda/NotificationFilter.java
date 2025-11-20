import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("High BP", "Low Sugar", "Normal Report", "Emergency Code Red");

        Predicate<String> urgentOnly = msg -> msg.contains("High") || msg.contains("Emergency");

        alerts.stream().filter(urgentOnly).forEach(System.out::println);
    }
}
