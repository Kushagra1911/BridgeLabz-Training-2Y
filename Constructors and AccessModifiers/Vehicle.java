class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType + " " + registrationFee);
    }


    public static void main(String[] args) {
        Vehicle v = new Vehicle("Sanjay", "Bike");
        v.displayVehicleDetails();
    }
}
