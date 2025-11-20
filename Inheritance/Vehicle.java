class Vehicle {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println("Vehicle Info");
    }
}

class Car extends Vehicle {
    int seatCapacity;
    void displayInfo() {
        System.out.println("Car | Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;
    void displayInfo() {
        System.out.println("Truck | Load: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;
    void displayInfo() {
        System.out.println("Motorcycle | Gear: " + hasGear);
    }
}

class Test {
    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[3];

        Car c = new Car(); c.seatCapacity = 5;
        Truck t = new Truck(); t.loadCapacity = 10;
        Motorcycle m = new Motorcycle(); m.hasGear = true;

        v[0] = c; v[1] = t; v[2] = m;

        for (Vehicle x : v) x.displayInfo();
    }
}
