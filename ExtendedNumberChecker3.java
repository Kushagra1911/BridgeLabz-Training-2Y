public class ExtendedNumberChecker3 {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, prod = 1;
        while (num > 0) {
            int d = num % 10;
            sum += d;
            prod *= d;
            num /= 10;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        int number = 27; // You can change this to test other numbers

        boolean prime = isPrime(number);
        boolean neon = isNeon(number);
        boolean spy = isSpy(number);
        boolean automorphic = isAutomorphic(number);
        boolean buzz = isBuzz(number);

        System.out.println("Number: " + number);
        System.out.println("Prime Number: " + prime);
        System.out.println("Neon Number: " + neon);
        System.out.println("Spy Number: " + spy);
        System.out.println("Automorphic Number: " + automorphic);
        System.out.println("Buzz Number: " + buzz);
    }
}
