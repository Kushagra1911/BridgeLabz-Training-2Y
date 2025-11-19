package exceptionsdemo;

class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}

class TemperatureConverter {
    void convert(double value, char unit) throws InvalidTemperatureException {

        if (unit == 'C' && value < -273.15)
            throw new InvalidTemperatureException("Temperature below absolute zero.");
        if (unit == 'F' && value < -459.67)
            throw new InvalidTemperatureException("Temperature below absolute zero.");

        if (unit == 'C') {
            double f = (value * 9 / 5) + 32;
            System.out.println("Fahrenheit: " + f);
        } else if (unit == 'F') {
            double c = (value - 32) * 5 / 9;
            System.out.println("Celsius: " + c);
        } else {
            System.out.println("Invalid unit.");
        }
    }
}

public class TemperatureExample {
    public static void main(String[] args) {
        TemperatureConverter t = new TemperatureConverter();

        try {
            t.convert(-300, 'C');
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
