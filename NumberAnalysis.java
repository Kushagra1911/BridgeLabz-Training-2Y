import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        int[] nums = new int[5];

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                nums[i] = sc.nextInt();
            }
        }

        for (int num : nums) {
            if (num > 0) {
                System.out.println(num + " is positive and " + (num % 2 == 0 ? "even." : "odd."));
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println("Zero detected.");
            }
        }

        int first = nums[0], last = nums[nums.length - 1];
        if (first == last) {
            System.out.println("First and last elements are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than last.");
        } else {
            System.out.println("First element is less than last.");
        }
    }
}