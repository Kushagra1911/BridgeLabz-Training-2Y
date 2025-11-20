public class BackgroundJob {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Background task started...");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("Background task finished!");
        };

        Thread t = new Thread(task);
        t.start();
    }
}
