import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int temp = number, count = 0;
            while (temp != 0) {
                temp /= 10;
                count++;
            }

            int[] digits = new int[count];
            int[] frequency = new int[10];

            for (int i = 0; i < count; i++) {
                digits[i] = number % 10;
                number /= 10;
            }

            for (int digit : digits) {
                frequency[digit]++;
            }

            System.out.println("Digit Frequencies:");
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] > 0) {
                    System.out.println("Digit " + i + ": " + frequency[i]);
                }
            }
        }
    }
}