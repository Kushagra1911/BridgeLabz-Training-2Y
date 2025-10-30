public class Student {
    static String universityName = "National University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display() {
        if (this instanceof Student) {
            System.out.println(name + " " + rollNumber + " " + grade + " " + universityName);
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Kunal", 21, "A");
        s.display();
        Student.displayTotalStudents();
    }
}

