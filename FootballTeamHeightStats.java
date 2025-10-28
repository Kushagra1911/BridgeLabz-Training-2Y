import java.util.Random;

public class FootballTeamHeightStats {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // Random height between 150 and 250
        }

        int sum = getSum(heights);
        double mean = getMean(sum, heights.length);
        int shortest = getShortest(heights);
        int tallest = getTallest(heights);

        System.out.println("Player Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\n\nShortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cm");
    }

    static int getSum(int[] arr) {
        int total = 0;
        for (int h : arr) total += h;
        return total;
    }

    static double getMean(int sum, int count) {
        return (double) sum / count;
    }

    static int getShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    static int getTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }
}