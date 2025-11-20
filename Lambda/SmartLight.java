interface LightAction {
    void activate();
}

public class SmartLight {
    public static void main(String[] args) {
        LightAction motion = () -> System.out.println("Light ON with soft brightness.");
        LightAction nightTime = () -> System.out.println("Light ON dim during night.");
        LightAction voiceCommand = () -> System.out.println("Light color changed to warm white.");

        motion.activate();
        nightTime.activate();
        voiceCommand.activate();
    }
}
