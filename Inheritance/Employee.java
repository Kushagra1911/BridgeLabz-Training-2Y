class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println(name + " | ID: " + id + " | Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    void displayDetails() {
        System.out.println("Manager: " + name + " | Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void displayDetails() {
        System.out.println("Developer: " + name + " | Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String duration;

    void displayDetails() {
        System.out.println("Intern: " + name + " | Duration: " + duration);
    }
}
class Main {
    public static void main(String[] args) {
        Employee e;

        e = new Manager(); e.name="Ravi"; ((Manager)e).teamSize=5; e.displayDetails();
        e = new Developer(); e.name="Sita"; ((Developer)e).programmingLanguage="Java"; e.displayDetails();
        e = new Intern(); e.name="Arjun"; ((Intern)e).duration="6 Months"; e.displayDetails();
    }
}
