import java.util.Arrays;

public class ExtendedNumberChecker2 {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] digits) {
        return arraysEqual(digits, reverseArray(digits));
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) if (digits[i] == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int number = 1221; // You can change this to test other numbers
        int count = countDigits(number);
        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);
        boolean equal = arraysEqual(digits, reversed);
        boolean palindrome = isPalindrome(digits);
        boolean duck = isDuckNumber(digits);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + count);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.print("\nReversed: ");
        for (int r : reversed) System.out.print(r + " ");
        System.out.println("\nArrays Equal: " + equal);
        System.out.println("Palindrome: " + palindrome);
        System.out.println("Duck Number: " + duck);
    }
}