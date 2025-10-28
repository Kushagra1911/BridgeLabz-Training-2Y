public class ExtendedNumberChecker4 {

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum == num;
    }

    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == num;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        int number = 145; // You can change this to test other numbers

        boolean perfect = isPerfect(number);
        boolean abundant = isAbundant(number);
        boolean deficient = isDeficient(number);
        boolean strong = isStrong(number);

        System.out.println("Number: " + number);
        System.out.println("Perfect Number: " + perfect);
        System.out.println("Abundant Number: " + abundant);
        System.out.println("Deficient Number: " + deficient);
        System.out.println("Strong Number: " + strong);
    }
}