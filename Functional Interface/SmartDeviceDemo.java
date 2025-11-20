interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light is ON"); }
    public void turnOff() { System.out.println("Light is OFF"); }
}

class AirConditioner implements SmartDevice {
    public void turnOn() { System.out.println("AC is ON"); }
    public void turnOff() { System.out.println("AC is OFF"); }
}

class Television implements SmartDevice {
    public void turnOn() { System.out.println("TV is ON"); }
    public void turnOff() { System.out.println("TV is OFF"); }
}

public class SmartDeviceDemo {
    public static void main(String[] args) {
        SmartDevice[] devices = { new Light(), new AirConditioner(), new Television() };
        for (SmartDevice d : devices) {
            d.turnOn();
            d.turnOff();
        }
    }
}
