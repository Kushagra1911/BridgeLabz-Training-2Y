public class ExtendedNumberChecker {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        int sum = sumOfDigits(digits);
        return sum != 0 && num % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int number = 243; // You can change this to test other numbers
        int count = countDigits(number);
        int[] digits = getDigits(number);
        int sum = sumOfDigits(digits);
        int squareSum = sumOfSquares(digits);
        boolean harshad = isHarshad(number, digits);
        int[][] freq = digitFrequency(digits);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + count);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println("\nSum of Digits: " + sum);
        System.out.println("Sum of Squares: " + squareSum);
        System.out.println("Harshad Number: " + harshad);
        System.out.println("Digit Frequencies:");
        for (int[] f : freq) {
            if (f[1] > 0) System.out.println("Digit " + f[0] + ": " + f[1] + " time(s)");
        }
    }
}