class Vehicle {
    static double registrationFee = 1000;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double f) {
        registrationFee = f;
    }

    void display() {
        if (this instanceof Vehicle) {
            System.out.println(ownerName + " " + vehicleType + " " + registrationNumber + " " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Ramesh", "Car", "REG1023");
        v.display();
        Vehicle.updateRegistrationFee(1500);
        v.display();
    }
}
