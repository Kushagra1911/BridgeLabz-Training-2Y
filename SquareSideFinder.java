import java.util.Scanner;

public class SquareSideFinder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the perimeter of the square: ");
            float perimeter = scanner.nextFloat();

            float side = perimeter / 4;

            System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        }
    }
}