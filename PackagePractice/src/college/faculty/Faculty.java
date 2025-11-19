package college.faculty;

public class Faculty {
    private String name;
    private String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void display() {
        System.out.println("Faculty Name: " + name + ", Subject: " + subject);
    }

    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Mehta", "Mathematics");
        Faculty f2 = new Faculty("Dr. Sharma", "Physics");
        f1.display();
        f2.display();
    }
}
