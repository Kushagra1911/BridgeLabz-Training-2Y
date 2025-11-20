import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30));
        System.out.println(reverse(q));
    }

    public static Queue<Integer> reverse(Queue<Integer> q) {
        if (q.isEmpty()) return q;
        int element = q.remove();
        q = reverse(q);
        q.add(element);
        return q;
    }
}
