package ImportDemo;

import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double a = 9, b = 2;
        System.out.println("sqrt(9): " + sqrt(a));
        System.out.println("pow(2,3): " + pow(b, 3));
        System.out.println("max(9,2): " + max(a, b));
        System.out.println("min(9,2): " + min(a, b));
        System.out.println("abs(-9): " + abs(-9));
    }
}

