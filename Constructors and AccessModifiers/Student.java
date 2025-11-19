class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int r, String n, double c) {
        super(r, n, c);
    }

    void show() {
        System.out.println(name);
    }
}
