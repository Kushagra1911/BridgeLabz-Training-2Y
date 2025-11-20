import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> highTemp = temp -> temp > 35.0;

        double currentTemp = 37.5;
        if (highTemp.test(currentTemp))
            System.out.println("Alert: High temperature!");
        else
            System.out.println("Temperature normal.");
    }
}
