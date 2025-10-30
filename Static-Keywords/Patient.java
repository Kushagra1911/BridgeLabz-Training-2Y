class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display() {
        if (this instanceof Patient) {
            System.out.println(name + " " + age + " " + ailment + " " + hospitalName + " " + patientID);
        }
    }

    public static void main(String[] args) {
        Patient p = new Patient(501, "Sita", 30, "Fever");
        p.display();
        Patient.getTotalPatients();
    }
}
