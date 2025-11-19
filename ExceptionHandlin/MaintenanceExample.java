package exceptionsdemo;

class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String message) {
        super(message);
    }
}

class InvalidMileageException extends Exception {
    public InvalidMileageException(String message) {
        super(message);
    }
}

class Vehicle {
    void checkMaintenance(int mileage, boolean overdue)
            throws InvalidMileageException, ServiceOverdueException {

        if (mileage < 0)
            throw new InvalidMileageException("Mileage cannot be negative.");

        if (overdue)
            throw new ServiceOverdueException("Service is overdue.");

        System.out.println("Vehicle is OK.");
    }
}

public class MaintenanceExample {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        try {
            v.checkMaintenance(-50, true);
        } catch (InvalidMileageException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ServiceOverdueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
