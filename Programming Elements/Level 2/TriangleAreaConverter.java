import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {

        System.out.print("Enter the base of the triangle in cm: ");
        float base = scanner.nextFloat();

        System.out.print("Enter the height of the triangle in cm: ");
        float height = scanner.nextFloat();

        float areaCm = 0.5f * base * height;
        float areaIn = areaCm / (2.54f * 2.54f);

        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);

        scanner.close();
    }
}

}