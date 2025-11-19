package exceptionsdemo;

public class GradeParser {
    public static void main(String[] args) {

        String[] grades = {"90", "A+", "85"};

        for (String grade : grades) {
            try {
                int number = Integer.parseInt(grade);
                System.out.println("Converted: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}
